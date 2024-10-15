import java.util.Scanner;

public class MidExam {
    //컴퓨터공학과
    //편의점 pos 기기 구현
    //현재 구현 기능: 상품세팅,상품 보기,
    //구현 예정 기능: 담은 상품 삭제,담은 내역 확인, (현금 결제시)거스름 지폐계산,
    // 통합계산,멤버십 할인 및 기프티콘,결제(결제 실패까지), 영수증 재발행(로그화),환불,현재 매출확인,
    // 상품명 및 가격 변경(권한 설정 및 암호 입력),
    Scanner scanner = new Scanner(System.in);
    int listCount = 20;
    String[] pickListName = new String[listCount];
    int[][] pickListPrice = new int[listCount][2];//가격 갯수
    boolean[] useListLine = new boolean[listCount];

    int productCount = 30;
    String[] productList = new String[productCount];
    int[] productPrice = new int[productCount];
    //메인 실행 메서드
    public void run() {
        setProductList();
        while (true) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. 상품 목록 보기 2. 상품 선택 3. 담은 내역 확인 및 수정 4. 결제 5. 직전 영수증 재발행");
            System.out.println("6. 환불 및 반품 7. 금일 매출 조회 8. 상품명 밎 가격 변경(추가 권한 필요)");
            System.out.print("수행을 원하는 작업의 번호를 입력하세요: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> showProductList();
                case "2"-> chooseProducts();
                case "3"-> showPickList();
                case "4"->showProductList();
                case "5"->showProductList();
                case "6"->showProductList();
                case "7"->showProductList();
                case "8"->showProductList();
                default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    // 메뉴 세팅 메서드
    private void setProductList() {
        String[] brandName={"해태","오리온","롯데","CJ","농심"};
        String[] productType={"탄산","주스","과자","조미료","냉동","신선"};
        for (int i = 0; i < productType.length; i++) {
            for (int j = 0; j < brandName.length; j++) {
                productList[i*brandName.length+j]=brandName[j] + productType[i];
            }
        }
        int temp = 1000;
        int tempPlus = 100;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                productPrice[5 * i + j] = temp + tempPlus * j;
            }
            temp += 1000;
        }
    }

    // 1번 옵션 상품 종류 보기 메서드
    private void showProductList() {
        for (int i = 0; i < productCount; i++) {
            System.out.printf("%d. %s(%d) ", i + 1, productList[i],productPrice[i]);
            if (i % 5 == 4 && i + 1 != productCount) {
                System.out.println();
            }
        }
        System.out.println();
    }
    // 2번 옵션 상품 담기
    private void chooseProducts() {
        while (true) {
            System.out.println("원하시는 제품의 번호와 수량을 띄어쓰기로 구분하여 입력해주세요.(담기 중단을 원하면 q를 입력하세요.)");
            System.out.print("요청을 입력하세요(예) 3 4 8 2)");
            String wantBye = scanner.nextLine();
            if (wantBye.equals("q") || wantBye.equals("Q")) {
                System.out.println("담기를 종료하고 메뉴로 돌아갑니다.");
                break;
            }
            if (wantBye.charAt(0) == ' ') {
                System.out.println("첫 시작이 공백으로 잘못된 입력입니다.");
                continue;
            }
            String[] proAndCou = wantBye.split(" ");
            int[] validNumbers = new int[proAndCou.length]; // 유효한 숫자를 저장할 배열
            int index = 0;
            boolean re = false;
            for (String s : proAndCou) {
                // 문자열이 숫자로만 이루어졌는지 확인
                boolean isNumber = true;
                for (int i = 0; i < s.length(); i++) {
                    if (!Character.isDigit(s.charAt(i))) {
                        isNumber = false; // 숫자가 아닌 문자가 있으면 false로 설정
                        break;
                    }
                }

                if (isNumber) {
                    // 숫자로 변환하여 배열에 추가
                    if (Integer.parseInt(s) >= productCount) {
                        re = true;
                        System.out.println("상품 범위를 초과하거나 비정상적인 값이 있습니다. 다시 입력해주세요.");
                        break;
                    }
                    validNumbers[index++] = Integer.parseInt(s);
                } else {
                    System.out.println("숫자가 아닌 값이 있습니다: " + s);
                    System.out.println("다시 입력해주세요.");
                    re = true;
                }
            }
            if (re) {
                continue;
            }

            if (proAndCou.length % 2 != 0 ) {
                System.out.println("제품과 개수가 올바르지 않습니다. 다시 입력해주세요.");
                continue;
            }
            //여기까지 값이 유효한지 검사

            for (int i = 0; i < proAndCou.length; i += 2) {
                int holeNum = -1;
                for (int j = 0; j < listCount; j++) {
                    if (!useListLine[j]) {
                        holeNum = j;
                        useListLine[j] = true;
                        break;
                    }
                }//몇 번재 라인에 상품을 담을 것인지, 앞에 라인부터 검색

                // 초기값이 그대로라는 것은 모든 공간을 사용했다는 의미이다.
                if (holeNum == -1) {
                    System.out.println("남은 저장 공간이 없습니다. 메뉴로 돌아갑니다.");
                    return;
                }
                for (int j = 0; j < listCount; j++) {
                    if (productList[validNumbers[i]-1].equals(pickListName[j])) {
                        useListLine[holeNum] = false;
                        holeNum = j;
                        break;
                    }
                }//중복값이 있을 경우 해당 값에 추가
                pickListName[holeNum] = productList[validNumbers[i] - 1];
                pickListPrice[holeNum][0] = productPrice[validNumbers[i] - 1];//가격 입력
                pickListPrice[holeNum][1] += validNumbers[i + 1];//개수 입력
            }
        }
    }

    // 3번 옵션 선택 메서드
    private void showPickList() {
        System.out.println("==== 현재 담긴 목록 ====");
        int totalPrice = 0;
        for (int i = 0; i < listCount; i++) {
            if (useListLine[i]) {
                System.out.printf("%-7s %6d원 %3d개\n", pickListName[i], pickListPrice[i][0], pickListPrice[i][1]);
                totalPrice += pickListPrice[i][0] * pickListPrice[i][1];
            }
        }
        System.out.printf("\t\t합계: %8d원\n", totalPrice);
    }
    private void optionSelect(String[] options) {
    }

    // 주문내역 확인
    private void checkOrder() {
    }

    // 결제 진행 메서드
    private void payProducts() {
        //멤버십 및 기프티콘 할인
        //결제수단(통합,카드(한 번 실패),현금(거스름 돈 계산))
    }
    private boolean checkOut() {

        return true; // 임시
    }

    // 메인
    public static void main(String[] args) {
        MidExam convenienceStorePos = new MidExam();
        convenienceStorePos.run();
    }
}

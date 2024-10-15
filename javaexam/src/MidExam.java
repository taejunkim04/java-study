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
    int[][] pickListPrice = new int[listCount][2];
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
            String choice = scanner.next();
            switch (choice) {
                case "1" -> showProductList();
                case "2"->chooseProducts();
                case "3"->showProductList();
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

    // 메뉴 보기 메서드
    private void showProductList() {
        for (int i = 0; i < productCount; i++) {
            System.out.printf("%d. %s(%d) ", i + 1, productList[i],productPrice[i]);
            if (i % 5 == 4 && i + 1 != productCount) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private void chooseProducts() {

    }

    // 옵션 선택 메서드
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

import java.util.Scanner;

public class MidExam {
    //컴퓨터공학과
    //편의점 pos 기기 구현
    //현재 구현 기능: 상품세팅,상품 보기,담은 내역 확인,현재 매출확인,담은 상품 삭제,상품명 및 가격 변경,유효성 체크 메서드화
    //구현 예정 기능:  (현금 결제시)거스름 지폐계산,
    // 통합계산,멤버십 할인,결제(결제 실패까지), 영수증 재발행(로그화),환불,,
    //
    Scanner scanner = new Scanner(System.in);
    boolean endButton = false;
    String masterKeyValue = "4356";//관리자 권한 값(가상구현이므로 제시)
    int memberDisCount = 10;//멤버십 할인 시 적용되는 %

    int listCount = 20;
    String[] pickListName = new String[listCount];
    int[][] pickListPrice = new int[listCount][2];//가격 갯수
    boolean[] useListLine = new boolean[listCount];//사용중인 라인 확인

    //등록된 제품 수와 이름 가격을 정의하는 값과 배열
    int productCount = 30;
    String[] productList = new String[productCount];
    int[] productPrice = new int[productCount];

    int logStoreCount = 10;
    String[] payLog = new String[logStoreCount];
    int[] payLogPrice = new int[logStoreCount];
    int logPoint = 0;
    String lastPayResult="";
    int todaySalesTotal = 0;//금일 매출 조회를 위해 선언
    //메인 실행 메서드
    public void run() {
        setProductList();
        while (true) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. 상품 목록 보기 2. 상품 선택 3. 담은 내역 확인 및 수정 4. 결제 5. 직전 영수증 재발행");
            System.out.println("관리자 권한 필요: 6. 금일 매출 조회 7. 환불 8. 판매 상품명 밎 판매 가격 변경 9. 종료");
            System.out.print("수행을 원하는 작업의 번호를 입력하세요: ");
            String choice = scanner.nextLine();
            switch (choice) {
                //7 미구현
                case "1" -> showProductList();
                case "2"-> chooseProducts();
                case "3"-> showAndModifyPickList();
                case "4"-> pickListPay();
                case "5"-> printLastReceipt();
                case "6"-> getTodaySales();
                case "7"-> refundAndReturn();
                case "8"-> updateProductNameAndPrice();
                case "9"-> end();
                default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
            if (endButton) {
                System.out.print("서비스를 종료합니다.");
                return;
            }
        }
    }

    // 메뉴 세팅 메서드(임의로 상품 리스트 생성)
    private void setProductList() {
        String[] brandName={"해태","삼양","롯데","삼립","농심"};
        String[] productType={"탄산","주스","과자","우유","냉동","신선"};
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
    // 한 줄에 5개씩 상품 출력
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
    // 1. 명령 입력받기
    // 2. 담기 종료 명령인지 확인
    // 3. 입력값이 유효한지 타당성 검사, 타당하지 않다면 1로
    // 4. 앞에서부터 빈공간을 찾아 제품 등록, 빈 공간이 없다면 메뉴로 이동
    // 5. 이미 등록된 제품이면 기존 라인에 갯수만 추가, 신규면 새로 추가
    // 6. 입력값이 동시에 여러개라면 4로
    private void chooseProducts() {
        while (true) {
            System.out.println("원하시는 제품의 번호와 수량을 띄어쓰기로 구분하여 입력해주세요.(담기 중단을 원하면 q를 입력하세요.)");
            System.out.print("요청을 입력하세요(예) 3 4 8 2)");
            String wantBye = scanner.nextLine();
            if (wantBye.equals("q") || wantBye.equals("Q")) {
                System.out.println("담기를 종료하고 메뉴로 돌아갑니다.");
                return;
            }
            if (wantBye.isEmpty()) {
                continue;
            }
            if (wantBye.charAt(0) == ' ') {
                System.out.println("첫 시작이 공백으로, 잘못된 입력입니다.");
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
                    if (Integer.parseInt(s) > productCount) {
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

    // 3번 옵션 담은 내역 확인 및 수정 메서드
    private void showAndModifyPickList() {
        while (true) {
            System.out.println("1. 담은 상품 확인 2. 담은 상품 수정 3. 메뉴로 이동");
            System.out.print("몇 번 명령을 수행할까요?");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                showPickList();
            } else if (choice.equals("2")) {
                modifyPickList();
                break;
            } else if (choice.equals("3")) {
                return;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
    //3_1 담은 상품 출력
    private void showPickList() {
        System.out.println("==== 현재 담긴 목록 ====");
        int totalPrice = 0;
        int totalCount = 0;
        for (int i = 0; i < listCount; i++) {
            if (useListLine[i]) {
                System.out.printf("%-7s %6d원 %3d개\n", pickListName[i], pickListPrice[i][0], pickListPrice[i][1]);
                totalPrice += pickListPrice[i][0] * pickListPrice[i][1];
                totalCount += pickListPrice[i][1];
            }
        }
        System.out.printf("\t\t 수량: %8d개\n", totalCount);
        System.out.printf("\t\t 합계: %8d원\n", totalPrice);
    }
    //3_2 담은 상품 수정
    private void modifyPickList() {
        while (true) {
            System.out.println("수정하고자 하는 상품명과 변경할 개수만을 띄어쓰기로 구분하여 입력하세요.(취소는 q를 입력하세요.)");
            System.out.println("하나씩만 수정할 수 있습니다.,  입력 예시) 삼겹살 5");
            String choice = scanner.nextLine();
            if (choice.equals("q") || choice.equals("Q")) {
                System.out.println("메뉴로 돌아갑니다.");
                return;
            }
            String[] nameAndCount = choice.split(" ");

            if (haveWords(nameAndCount[1])) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요. 입력 예시) 삼겹살 5)");
                continue;
            }
            int changeCount = Integer.parseInt(nameAndCount[1]);
            boolean found = false;
            for (int i = 0; i < listCount; i++) {
                if (useListLine[i]) {
                    if (pickListName[i].equals(nameAndCount[0])) {
                        if (changeCount == 0) {
                            useListLine[i] = false;
                            found = true;
                            System.out.println("상품이 목록에서 삭제 되었습니다.");
                            break;
                        } else {
                            pickListPrice[i][1] = changeCount;
                            found = true;
                            System.out.println("개수가 변경되었습니다.");
                            break;
                        }
                    }
                }
            }
            if (!found) {
                System.out.println("해당되는 상품이 없습니다.");
                continue;
            }
            while (true) {
                System.out.println("1. 계속 변경 2. 목록 확인 3. 메뉴로 이동");
                System.out.print("몇 번 명령을 수행할까요?");
                String again = scanner.nextLine();
                if (again.equals("1")) {
                    break;
                } else if (again.equals("2")) {
                    showPickList();
                } else if (again.equals("3")) {
                    return;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                }
            }
        }
    }
    // 4번 옵션 결제 메서드
    //멤버십 할인,결제수단(통합,카드(한 번 실패),현금(거스름 돈 계산))
    private void pickListPay() {
        System.out.println("담은 내역을 출력합니다.");
        showPickList();
        while (true) {
            System.out.println("1. 결제 2. 메뉴로 돌아가기");
            System.out.print("몇 번 명령을 수행할까요?");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                break;
            } else if (choice.equals("2")) {
                return;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        int totalPrice = 0;
        for (int i = 0; i < listCount; i++) {
            if (useListLine[i]) {
                totalPrice += pickListPrice[i][0] * pickListPrice[i][1];
            }
        }
        boolean memberUse = false;
        //결제 진행
        while (true) {
            System.out.println("1. 멤버십 할인 및 기프티콘 사용 2. 바로 결제 3. 메뉴로 돌아가기");
            System.out.print("몇 번 명령을 수행할까요?");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                memberUse = true;
                totalPrice = memberShipAndGift(totalPrice);
                realPickListPay(totalPrice);
                break;
            } else if (choice.equals("2")) {
                realPickListPay(totalPrice);
                break;
            } else if (choice.equals("3")) {
                return;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        todaySalesTotal += totalPrice;
        System.out.println("=== 영수증을 출력합니다. ===");
        madeLastLog(totalPrice, memberUse);
        System.out.println(lastPayResult);
        System.out.println("결제가 종료되어 메뉴로 돌아갑니다.");
        endPay(totalPrice);
    }
    //결제 후 결제내역 관리 메서드
    private void endPay(int totalPr) {
        //장바구니 초기화
        for (int i = 0; i < listCount; i++) {
            if (useListLine[i]) {
                pickListName[i] = "";//이름 초기화
                pickListPrice[i][1] = 0;//개수 초기화
            }
        }
        for (int i = 0; i < listCount; i++) {
            useListLine[i] = false;
        }
        payLog[logPoint] = lastPayResult;
        payLogPrice[logPoint] = totalPr;
        logPoint++;
        if (logPoint == logStoreCount) {
            logPoint = 0;
        }
    }
    //영수증 생성 메서드
    private void madeLastLog(int totalPrice, boolean disCount) {
        lastPayResult = "";
        int totalCount = 0;
        for (int i = 0; i < listCount; i++) {
            if (useListLine[i]) {
                String itemResult = pickListName[i] + "\t\t  " + pickListPrice[i][0] + "원 " + pickListPrice[i][1] + "개\n";
                lastPayResult += itemResult;
                totalCount += pickListPrice[i][1];
            }
        }
        String totalCountStr = "\t\t\t 수량:    " + totalCount + "개\n";
        lastPayResult += totalCountStr;

        String totalPriceStr = "\t\t\t 합계: " + totalPrice + "원\n";
        lastPayResult += totalPriceStr;

        if (disCount) {
            String discountStr = "할인 " + memberDisCount + "%가 적용된 금액입니다\n";
            lastPayResult += discountStr;
        }
    }

    // 4_1 멤버십 할인 및 기프티콘 사용 적용
    private int memberShipAndGift(int originalPrice) {
        System.out.println("멤버십 내역을 확인합니다.");
        System.out.println("확인 되었습니다. " + memberDisCount + "% 할인이 적용 되었습니다.");
        int changePrice = originalPrice * (100 - memberDisCount) / 100;
        System.out.printf("%d원에서 할인이 적용되어 %d원입니다.\n", originalPrice, changePrice);
        return changePrice;
    }

    // 4_2 실제 결제 메서드
    private void realPickListPay(int totalPrice) {
        while (true) {
            System.out.println("결제 수단을 선택해주세요.");
            System.out.println("1. 카드 2. 현금 3. 통합결제");
            System.out.print("몇 번 명령을 수행할까요?");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                cardPay(totalPrice);
                break;
            } else if (choice.equals("2")) {
                totalPrice = cashPay(totalPrice, true);
                break;
            } else if (choice.equals("3")) {
                totalPrice = cashPay(totalPrice, false);
                if (totalPrice != 0) {
                    cardPay(totalPrice);
                }
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    // 4_2_1 카드결제
    private void cardPay(int totalPrice) {
        boolean online = false;
        while (true) {
            System.out.println("결제를 진행합니다.");
            if (online) {
                System.out.printf("카드로 %d원이 결제 되었습니다.\n", totalPrice);
                break;
            } else {
                System.out.println("통신이 불안정하여 다시 시도합니다.");
                online = true;
            }
        }
    }
    // 4_2_2 현금결제
    private int cashPay(int totalPrice,boolean onlyCash) {
        while (true) {
            System.out.println("결제를 진행합니다.");
            System.out.printf("금액은 %d입니다.\n", totalPrice);
            System.out.println("지불할 금액을 입력해주세요.");
            String getMoney = scanner.nextLine();
            if (haveWords(getMoney)) {
                System.out.println("금액이 아닙니다. 다시 입력해주세요.");
                continue;
            }
            int getMoneyInt = Integer.parseInt(getMoney);
            if (onlyCash) {
                if (getMoneyInt < totalPrice) {
                    System.out.println("금액이 모자랍니다. 다시 입력해주세요.");//루프
                } else {
                    System.out.println("결제가 완료되었습니다.");
                    System.out.printf("거스름 돈은 %d입니다.\n", getMoneyInt - totalPrice);
                    return 0;
                }
            } else {
                if (getMoneyInt < totalPrice) {
                    System.out.printf("현금으로 %d원 결제되었습니다.\n", getMoneyInt);
                    System.out.printf("추가 결제하실 금액은 %d입니다.\n", totalPrice - getMoneyInt);
                    return totalPrice - getMoneyInt;
                } else {
                    System.out.println("결제가 완료되었습니다.");
                    System.out.printf("거스름 돈은 %d입니다.\n", getMoneyInt - totalPrice);
                    return 0;
                }
            }
        }
    }
    // 5번 옵션 직전 영수증 발행 메서드
    private void printLastReceipt() {
        if (lastPayResult.isEmpty()) {
            System.out.println("결제한 내역이 없어 메뉴로 돌아갑니다.");
        } else {
            System.out.println("직전 영수증을 발행합니다.");
            System.out.println(lastPayResult);
        }
    }
    // 6번 옵션 금일 매출 조회 메서드
    private void getTodaySales() {
        if (!checkMaster()) {
            System.out.println("권한이 없어 메뉴로 돌아갑니다.");
            return;
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("금일 판매된 금액은: 총 %d원 입니다.", todaySalesTotal);
        System.out.println();
    }

    // 7번 옵션 환불 및 반품 메서드
    private void refundAndReturn() {
        if (!checkMaster()) {
            System.out.println("권한이 없어 메뉴로 돌아갑니다.");
            return;
        }
        while (true) {
            for (int i = 0; i < logStoreCount; i++) {
                if (payLog[i] != null && !payLog[i].isEmpty()) {
                    System.out.print("항목 " + (i + 1) + ": \n" + payLog[i]);
                }
            }
            System.out.print("몇 번째 항목을 환불 하시겠습니까?(취소는 q를 입력해주세요.) ");
            String choice = scanner.nextLine();
            if (choice.equals("q") || choice.equals("Q")) {
                System.out.println("메뉴로 돌아갑니다.");
                return;
            }
            if (haveWords(choice)) {
                System.out.println("잘못된 입력입니다.번호를 확인 후 다시 입력해주세요.");
                continue;
            }

        }
    }

    // 8번 옵션 판매 상품명 및 가격 변경 메서드
    private void updateProductNameAndPrice() {
        for (boolean b : useListLine) {
            if (b) {
                System.out.println("제품이 담긴 상태에서는 수정이 불가합니다.");
                System.out.println("결제 진행 후나 제품을 비우고 시도해주세요.");
                return;
            }
        }
        if (!checkMaster()) {
            System.out.println("권한이 없어 메뉴로 돌아갑니다.");
            return;
        }
        System.out.println("변경을 위해 상품 목록을 출력합니다.");
        showProductList();
        while (true) {
            System.out.print("어떤 상품을 수정하시겠습니까?(취소는 q를 입력하세요.)");
            String choice = scanner.nextLine();
            if (choice.equals("q") || choice.equals("Q")) {
                System.out.println("메뉴로 돌아갑니다.");
                return;
            }

            if (haveWords(choice)) {
                System.out.println("잘못된 입력입니다.제품의 번호를 다시 입력해주세요.");
                continue;
            }
            int choiceNum = Integer.parseInt(choice);
            if (choiceNum < 1 && choiceNum > productCount) {
                System.out.println("해당 번호의 상품이 존재하지 않습니다. 제품의 번호를 다시 입력해주세요.");
                continue;
            }

            int optionInt=-1;
            while (optionInt == -1) {
                System.out.println("1. 상품명 수정, 2. 가격 수정, 3. 상품명과 가격 수정 4. 메뉴로 이동");
                System.out.print("옵션을 선택해주세요.");
                String option = scanner.nextLine();
                switch (option) {
                    case "1" -> optionInt = 1;
                    case "2" -> optionInt = 2;
                    case "3" -> optionInt = 3;
                    case "4" -> {
                        System.out.println("메뉴로 돌아갑니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
            if (optionInt == 1) {
                System.out.printf("현재 %d의 상품명은 %s 입니다.\n", choiceNum, productList[choiceNum - 1]);
                changeTheName(choiceNum);
                System.out.printf("현재 %d의 상품명은 %s로 변경되었습니다.\n", choiceNum, productList[choiceNum - 1]);
            } else if (optionInt == 2) {
                System.out.printf("현재 %d의 상품명은 %s, 가격은 %d 입니다.\n", choiceNum, productList[choiceNum - 1], productPrice[choiceNum - 1]);
                changeThePrice(choiceNum);
                System.out.printf("현재 %d의 상품명 %s의 가격이 %d로 변경되었습니다.\n", choiceNum, productList[choiceNum - 1], productPrice[choiceNum - 1]);
            } else {
                //3일 때
                System.out.printf("현재 %d의 상품명은 %s, 가격은 %d 입니다.\n", choiceNum, productList[choiceNum - 1], productPrice[choiceNum - 1]);
                changeTheName(choiceNum);
                changeThePrice(choiceNum);
                System.out.printf("현재 %d의 상품명 %s의 가격이 %d로 변경되었습니다.\n", choiceNum, productList[choiceNum - 1], productPrice[choiceNum - 1]);
            }
        }
    }
    //8번 옵션 가격을 변경하는 부분이 중복되어 메서드처리
    private void changeThePrice(int choiceNum) {
        while (true) {
            System.out.print("변경할 가격을 입력해주세요.");
            String tempPrice = scanner.nextLine();
            if (haveWords(tempPrice)) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            productPrice[choiceNum - 1] = Integer.parseInt(tempPrice);
            break;
        }
    }
    private void changeTheName(int choiceNum) {
        while (true) {
            System.out.print("변경할 상품명을 입력해주세요.");
            String tempName = scanner.nextLine();
            if (tempName.isEmpty()) {
                System.out.println("공백으로 잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            productList[choiceNum - 1] = tempName;
            break;
        }
    }


    // 9번 옵션 종료 메서드
    private void end() {
        if (!checkMaster()) {
            System.out.println("권한이 없어 메뉴로 돌아갑니다.");
            return;
        }
        endButton = true;
    }
    //문자열에 int 값으로 변환될 수 있는 값 외에 다른 값이 있는지 확인
    private boolean haveWords(String string) {
        boolean isNotNumber = false;
        if (string.isEmpty()) {
            System.out.println("공백입니다. 다시 입력해주세요.");
            isNotNumber = true;
            return isNotNumber;
        }
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                isNotNumber = true;
                break;
            }
        }
        return isNotNumber;
    }
    //관리자 권한이 있는지 확인하는 메서드
    private boolean checkMaster() {
        System.out.println("관리자 권한이 있는지 확인합니다.");
        System.out.printf("암호를 입력해주세요.(암호는 %s 입니다.)", masterKeyValue);
        String inputPass = scanner.nextLine();
        if (inputPass.equals(masterKeyValue)) {
            System.out.println("관리자 권한이 확인되었습니다.");
            return true;
        } else {
            System.out.println("암호가 일치하지 않습니다.");
            return false;
        }
    }

    // 메인
    public static void main(String[] args) {
        MidExam convenienceStorePos = new MidExam();
        convenienceStorePos.run();
    }
}

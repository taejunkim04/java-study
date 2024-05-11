package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productOrders[i] = createProduct(name, price, quantity);
        }
        printOrder(productOrders);
        getTotalamount(productOrders);
    }
    static ProductOrder createProduct(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
        }
    }

    static void getTotalamount(ProductOrder[] productOrders) {
        int totalamount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalamount += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 가격은: "+totalamount);
    }
}

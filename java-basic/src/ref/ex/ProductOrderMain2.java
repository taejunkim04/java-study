package ref.ex;


public class ProductOrderMain2 {

    public static void main(String[] args) {
        ref.ex.ProductOrder dobu = createProduct("두부", 2000, 2);
        ref.ex.ProductOrder kimch = createProduct("김치", 5000, 1);
        ref.ex.ProductOrder coala = createProduct("콜라", 1500, 2);
        ref.ex.ProductOrder[] productOrders = {dobu, kimch, coala};

        printOrder(productOrders);
        getTotalamount(productOrders);
    }
    static ref.ex.ProductOrder createProduct(String name, int price, int quantity) {
        ref.ex.ProductOrder order = new ref.ex.ProductOrder();
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

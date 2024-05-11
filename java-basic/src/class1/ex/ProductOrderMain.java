package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder dobu = new ProductOrder();
        ProductOrder kimch = new ProductOrder();
        ProductOrder coala = new ProductOrder();
        ProductOrder[] productOrders = {dobu, kimch, coala};
        dobu.productName = "두부";
        dobu.price = 2000;
        dobu.quantity = 2;

        kimch.productName = "김치";
        kimch.price = 5000;
        kimch.quantity = 1;

        coala.productName = "콜라";
        coala.price = 1500;
        coala.quantity = 2;
        int totalamount = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: "+productOrder.productName+" 가격: "+productOrder.price+" 수량: "+productOrder.quantity);
            totalamount+= productOrder.price* productOrder.quantity;
        }
        System.out.println("총 가격은: "+totalamount);
    }
}

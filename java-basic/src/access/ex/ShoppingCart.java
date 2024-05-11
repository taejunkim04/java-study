package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;
    public void addItem(Item item) {
        if (count < 10) {
            items[count] = item;
            count++;
        } else {
            System.out.println("최대 상품 수를 초과하였습니다.");
        }

    }

    public void displayItems() {
        for (int i = 0; i < count; i++) {
            System.out.println("장바구니 상품 출력");
            System.out.println("상품명" + items[i].getName() + ", 합계:" + items[i].getTotal());
        }
        System.out.println("전체 가격은: "+getTotalPrice());
    }

    private int getTotalPrice() {
        int amount = 0;
        for (int i = 0; i < count; i++) {
            amount += items[i].getTotal();
        }
        return amount;
    }
}

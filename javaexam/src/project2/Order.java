package project2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private MenuItem menuItem;
    private List<Option> selOptions = new ArrayList<>();

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public List<Option> getSelOptions() {
        return selOptions;
    }

    public void setSelOptions(List<Option> selOptions) {
        this.selOptions = selOptions;
    }
}

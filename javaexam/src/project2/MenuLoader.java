package project2;

import java.util.List;

public interface MenuLoader {
    List<MenuItem> loadMenu() throws LoadMenuException;
}

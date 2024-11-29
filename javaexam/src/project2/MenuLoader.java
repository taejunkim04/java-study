package project2;

import java.io.IOException;
import java.util.List;

public interface MenuLoader {
    List<MenuItem> loadMenu() throws LoadMenuException, IOException;
}

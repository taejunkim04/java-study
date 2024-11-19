package project2;

import java.util.List;

public class JsonMenuLoader implements MenuLoader{

    @Override
    public List<MenuItem> loadMenu() throws LoadMenuException {
        throw new LoadMenuException("JSON 메뉴 로딩은 현재 지원하지 않습니다.");
    }
}

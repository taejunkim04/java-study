package project2;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonMenuLoader implements MenuLoader{
    @Override
    public List<MenuItem> loadMenu() throws IOException, LoadMenuException {
        File file = new File("menu.json");
        BufferedReader br = new BufferedReader(new FileReader(file));

        Gson gson = new Gson();
        JsonObject json = gson.fromJson(br, JsonObject.class);

        Type menuType = new TypeToken<List<MenuItem>>() {}.getType();
        List<MenuItem> menuList = gson.fromJson(json.get("menu"), menuType);

        if (menuList == null || menuList.isEmpty()) {
            throw new LoadMenuException("메뉴가 비어 있거나 로드되지 않았습니다.");
        }

        return menuList;
//        List<MenuItem> menu = new ArrayList<>();
//        Gson gson = new Gson();
//        try {
//            Reader reader = new FileReader("menu.json");
//            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
//            menu = gson.fromJson(jsonObject.get("menu"), new TypeToken<List<MenuItem>>(){}.getType());
//        } catch (Exception e) {
//            throw new LoadMenuException("메뉴 로딩에 실패 했습니다!!");
//        }
//        return menu;
    }
}

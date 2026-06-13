package DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils {

    public static Object[][] getJsonData(String filePath) {

        Object[][] data = null;

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            JSONArray jsonArray = new JSONArray(content);

            data = new Object[jsonArray.length()][2];

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject obj = jsonArray.getJSONObject(i);

                data[i][0] = obj.getString("username");
                data[i][1] = obj.getString("password");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
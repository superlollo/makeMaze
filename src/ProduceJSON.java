
public class ProduceJSON {
    Gson g
    String message;
    JSON
    JSONObject json = new JSONObject();
    json.put("name", "student");

    JSONArray array = new JSONArray();
    JSONObject item = new JSONObject();
item.put("information", "test");
item.put("id", 3);
item.put("name", "course1");
array.add(item);

json.put("course", array);

    message = json.toString();
}

// { autofold
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSON {

public static void main(String[] args) throws Exception {
// }

String json = "{\"name\": \"Bob\", \"id\": \"123\"}";

// Method 1: parsing into a JSON element
JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
System.out.println(jsonObject.get("name").getAsString());

// Method 2: parsing into a Java Object
User user = new Gson().fromJson(json, User.class);
System.out.println(user.id);

// { autofold
}

}
// }

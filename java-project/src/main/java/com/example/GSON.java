// { autofold
package com.example;

import com.google.gson.*;
// }

class User {
    int id;
    String name;
}

// autofold
public class GSON {

public static void main(String[] args) throws Exception {
// }

String json = "{\"name\": \"Bob\", \"id\": \"123\"}";

// Method 1: parsing into a JSON tree
JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
System.out.println(jsonObject.get("name").getAsString());

// Method 2: parsing into a Java Object
User user = new Gson().fromJson(json, User.class);
System.out.println(user.name);

// { autofold
}

}
// }

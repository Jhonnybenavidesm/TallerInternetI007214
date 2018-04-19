package com.example.asus_pc.tallerinterneti007214.Parser;

import com.example.asus_pc.tallerinterneti007214.Model.Post;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus-PC on 17/04/2018.
 */

public class Json {
    public static List<Post> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);
        List<Post> postList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            Post post = new Post();
            post.setCodigo(item.getInt("codigo"));
            post.setNombre(item.getString("nombre"));
            post.setEdad(item.getInt("edad"));
            post.setCorreo(item.getString("correo"));
            post.setPass(item.getInt("pass"));

            postList.add(post);

        }

        return postList;
    }
}

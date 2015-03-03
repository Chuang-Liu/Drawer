package com.example.lenovo.drawer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lenovo on 2015/3/3.
 */
public class MessageData {

    List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
    HashMap<String, Object> map;

    public MessageData() {
        map = new HashMap<>();
        map.put("author", "Tom");
        map.put("content", "Hello!");
        map.put("pic", null);
        list.add(map);


        map = new HashMap<>();
        map.put("author", "Jack");
        map.put("content", "Goodbye!");
        map.put("pic", null);
        list.add(map);
    }

    public List<HashMap<String, Object>> getMessageList() {return list;}
}

package com.example.lenovo.drawer;

import android.media.Image;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by lenovo on 2015/3/3.
 */
public class MemberData {

    List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
    HashMap<String, Object> map;

    public List getMemberDataList() {
        return list;
    }

    public MemberData() {
        map = new HashMap<>();
        map.put("name", "Tom");
        map.put("pic", null);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "Jack");
        map.put("pic", null);
        list.add(map);

        map = new HashMap<>();
        map.put("name", "Rose");
        map.put("pic", null);
        list.add(map);
    }
}

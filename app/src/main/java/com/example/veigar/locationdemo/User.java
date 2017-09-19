package com.example.veigar.locationdemo;

import java.io.Serializable;

/**
 * Created by veigar on 2017/9/18.
 */

public class User implements Serializable{

    private String name;
    private String age;
    public User(String name,String age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

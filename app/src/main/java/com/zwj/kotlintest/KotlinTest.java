package com.zwj.kotlintest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KotlinTest {

    public static void main(String[] args) {
//
//        String str = "asddffffffddddd";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(i);
//
//        }

        //创建集合
        Collection coll = new ArrayList();
        ((ArrayList) coll).add("a");
        ((ArrayList) coll).add(1);
        ((ArrayList) coll).add(false);

//        List<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add("a");
//        list.add(true);



        for(Object s:coll){
            System.out.println(s);
        }

    }

}

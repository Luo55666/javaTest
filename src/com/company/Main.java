package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//      User user1=new User();
//      user1.setId(1);
//      user1.setName("hehe");
//      User user2=new User();
//      user2.setId(2);
//      user2.setName("haha");
//
//        List<User> userLists=new ArrayList<>();
//        userLists.add(user1);
//        userLists.add(user2);
//        userLists.forEach(user ->{
//                    user.setName("lala");
//                    System.out.println(user.getName());
//                }
//                );
//
        ThreadTest t1=new ThreadTest("Station1");
        ThreadTest t2=new ThreadTest("Station2");
        ThreadTest t3=new ThreadTest("Station3");
        t1.start();
        t2.start();
        t3.start();







    }
}

package com.purge.demo;

import com.purge.demo.entity.User;

/**
 * @author purgeyao
 * @since 1.0
 */
public class Test {

  public static void main(String[] args) {
    User user = new User(null, 1);
    if (user.getAge() == null) {
      System.out.println("123");
    }
    User user1 = null;
    if (user1 == null || user1.getAge() == null) {
      System.out.println("456");
    }
    boolean equals = user.getAge().equals(1);
    System.out.println(equals);

//    boolean equals1 = user1.getAge().equals(1);
//    System.out.println(equals1);

    if (user.getAge() == null) {
      System.out.println("123");
    }
    "123".equals(user.getName());
  }
}

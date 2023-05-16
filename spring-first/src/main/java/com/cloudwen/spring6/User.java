package com.cloudwen.spring6;

/**
 * ClassName: User
 * Description:
 *
 * @Author wzy
 * @Create 2023/5/16 11:36
 * @Version 1.0
 */
public class User {

    public void add() {
        System.out.println("add.....");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}

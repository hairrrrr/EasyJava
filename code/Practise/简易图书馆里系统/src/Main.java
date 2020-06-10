/*
 *  Description:
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:19
 */

import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户姓名");
        String name = scan.nextLine();
        System.out.println("请输入选择：0 -> 管理员 1 -> 用户");
        int choice = scan.nextInt();

        if(choice == 0){
            // 向上转型
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        // 书单
        BookList bookList = new BookList();
        while(true) {
            // 用户：
            User user = login();
            // 应用运行时绑定，父类引用会使用子类的 menu 方法
            int choice = user.menu();

            user.doOperation(bookList, choice);
        }

    }
}










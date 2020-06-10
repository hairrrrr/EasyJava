package user;

/*
 *  Description: 普通用户
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:19
 */

import book.BookList;
import operation.*;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name){
        super(name);
        this.operations = new IOperation[]{
                null,
                new FindBook(),
                new BorrowBook(),
                new ReturnBook(),
                new DisplayBooks(),
                new Exit(),
        };
    }

    @Override
    public int menu() {
        System.out.println("Hello, " + this.name);
        System.out.println("***********************************");
        System.out.println("**********  1. 查找图书  ************");
        System.out.println("**********  2. 借阅图书  ************");
        System.out.println("**********  3. 归还图书  ************");
        System.out.println("**********  4. 打印图书  ************");
        System.out.println("**********  5.   退出    ************");
        System.out.println("***********************************");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        return choice;
    }

    @Override
    public void doOperation(BookList bookList, int choice) {
        this.operations[choice].work(bookList);
    }
}




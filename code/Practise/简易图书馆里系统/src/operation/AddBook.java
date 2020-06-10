package operation;

/*
 *  Description: 新增图书
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:15
 */

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddBook implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("=========  新增图书  =========");

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入：书名");
        String name = scan.nextLine();
        System.out.println("请输入：作者");
        String author = scan.nextLine();
        System.out.println("请输入：书籍类型");
        String type = scan.nextLine();
        // 书单是否借出就不用单独的初始化了，不初始化默认为 false

        int size = bookList.getUsedSize();

        bookList.getBooks()[size] = new Book(name, author, type);
        bookList.setUsedSize(size + 1); // 不能写 size++ ！

        System.out.println("=========  成功！  =========");
    }
}

package operation;

/*
 *  Description:
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:16
 */

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindBook implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("=========  查询图书  =========");

        System.out.println("请输入：书名");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        for(int i = 0; i < bookList.getUsedSize(); i++){
            Book book = bookList.getBooks()[i];
            if(book.getName().equals(name)){
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("抱歉，未能找到 " + "《" + name + "》");
    }
}

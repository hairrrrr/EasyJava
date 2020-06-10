package operation;

/*
 *  Description:
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:15
 */

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowBook implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("=========  借阅图书  =========");
        System.out.println("请输入：书名");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int i;
        Book book = null;
        for(i = 0; i < bookList.getUsedSize(); i++){
            book = bookList.getBooks()[i];
            if(book.getName().equals(name)){
               break;
            }
        }

        if(i == bookList.getUsedSize()) {
            System.out.println("抱歉，未能找到 " + "《" + name + "》");
            return;
        }

        if(book.isBorrowed()){
            System.out.println("抱歉，" + "《" + name + "》" + "已经借出，过两天再来看看吧");
        }
        else {
            book.setBorrowed(true);
            System.out.println("=========  借书成功！ =========");
        }
    }
}

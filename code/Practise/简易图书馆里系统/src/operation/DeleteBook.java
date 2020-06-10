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

public class DeleteBook implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("=========  删除图书  =========");
        System.out.println("请输入：书名");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int i;
        Book book = null;
        int usedSize = bookList.getUsedSize();

        for(i = 0; i < usedSize; i++){
            book = bookList.getBooks()[i];
            if(book.getName().equals(name)){
                break;
            }
        }

        if(i == usedSize) {
            System.out.println("抱歉，未能找到 " + "《" + name + "》");
            return;
        }

        for(; i < usedSize - 1; i++){
            bookList.getBooks()[i] = bookList.getBooks()[i + 1];
        }
        // 如果是尾删，我们只是简单的将数组已经使用的大小减一；对象依然被数组引用，会造成内存泄漏
        bookList.getBooks()[usedSize - 1] = null;
        bookList.setUsedSize(usedSize - 1);

        System.out.println("=========  删除成功  =========");
    }
}








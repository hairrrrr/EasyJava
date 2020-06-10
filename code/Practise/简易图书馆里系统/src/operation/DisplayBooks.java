package operation;

/*
 *  Description:
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:16
 */

import book.Book;
import book.BookList;

public class DisplayBooks implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("=========  展示图书  =========");

        for(int i = 0; i < bookList.getUsedSize(); i++){
            System.out.println(bookList.getBooks()[i].toString());
            /*上面的语句等价于下面的：
            Book[] books = bookList.getBooks();
            Book book = books[i];
            System.out.println(book.toString());*/
        }
    }
}

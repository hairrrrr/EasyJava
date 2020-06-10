package operation;

/*
 *  Description:
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:17
 */

import book.BookList;

public class Exit implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("=========  退出系统  =========");
        System.exit(0);
    }
}

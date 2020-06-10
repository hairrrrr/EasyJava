package user;

/*
 *  Description: 用户的父类
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 19:28
 */

import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name){
        this.name = name;
    }

    public abstract int menu();

    public abstract void doOperation(BookList bookList, int choice);
}

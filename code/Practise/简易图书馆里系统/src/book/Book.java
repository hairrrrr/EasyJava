package book;

/*
 *  Description: 图书类
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 18:52
 */

public class Book{
    private String name;
    private String author;
    private String type;
    private boolean isBorrowed;

    public Book(String name, String author, String type) {
        this.name = name;
        this.author = author;
        this.type = type;
    }

    // 注：alt + insert 建可以快速生成
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}

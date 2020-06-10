package book;

/*
 *  Description: 书单
 *  User: Shepard Wang
 *  Date: 2020 -06 -10
 *  Time: 18:57
 */

public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    // 初始化三本书
    public BookList(){
        books[0] = new Book("挪威的森林", "村上春树", "小说");
        books[1] = new Book("海边的卡夫卡", "村上春树", "小说");
        books[2] = new Book("不能承受的生命之轻", "米兰·昆德拉", "小说");
        this.usedSize = 3;
    }
}

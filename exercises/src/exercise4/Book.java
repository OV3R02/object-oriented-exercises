package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<Book> books = new ArrayList<>();
    private String author;
    private String title;
    private long ISBN;

    public Book(String author, String title, long iSBN) {
        this.author = author;
        this.title = title;
        ISBN = hashCode();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long iSBN) {
        ISBN = iSBN;
    }

    @Override
    public int hashCode() {
        double numRandom = Math.random();
        double numd = numRandom * 30;
        int num = (int) numd;
        final int prime = 31 + num;
        int result = 1;
        result = prime * result + ((books == null) ? 0 : books.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + (int) (ISBN ^ (ISBN >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (books == null) {
            if (other.books != null)
                return false;
        } else if (!books.equals(other.books))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (ISBN != other.ISBN)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [books=" + books + ", author=" + author + ", title=" + title + ", ISBN=" + ISBN + "]";
    }

    public void addBook(Book book) {
        books.add(book);
    }

    

    public void rmBook(Book book) {
        books.remove(book);
    }
}

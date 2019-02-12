import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if (getCapacityRemaining() > 0) {
            this.collection.add(book);
            this.capacity -= 1;
        }
    }

    public int getCapacityRemaining(){
        return this.capacity;
    }
}

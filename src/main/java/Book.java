public class Book {

    private String name;
    private String author;
    private String genre;

    public Book(String name, String author, String genre){
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

//    name getter
    public String getName(){
        return this.name;
    }
//    author getter
    public String getAuthor(){
        return this.author;
    }
//    genre getter
    public String getGenre(){
        return this.genre;
    }
}

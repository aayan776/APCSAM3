import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Item{
    private String name;
    private String id;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String name, String id, LocalDate publicationDate, int maxCheckoutDays){
        this.name = name;
        this.id = id;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }

    public String getName(){return name;}
    public String getId(){return id;}
    public LocalDate getPublicationDate(){return publicationDate;}
    public int getMaxCheckoutDays(){return maxCheckoutDays;}
}
class Book extends Item{
    private String author;
    private int pages;
    public Book(String author, int pages, String name, String id, LocalDate publicationDate){
        super(name, id, publicationDate, 21);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor(){return author;}
    public int getPages(){return pages;}
}
class CD extends Item{
    private String artist;
    private int tracks;
    public CD(String artist, int tracks, String name, String id, LocalDate publicationDate){
        super(name, id, publicationDate, 14);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist(){return artist;}
    public int getTracks(){return tracks;}
}
class DVD extends Item{
    private String director;
    private int runningTime;
    public DVD(String director, int runningTime, String name, String id, LocalDate publicationDate){
        super(name, id, publicationDate, 7);
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector(){return director;}
    public int getRunningTime(){return runningTime;}
}
class Patron{
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name, int id){
        this.name = name;
        this.id = id;
        this.checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(Item item){
        if (checkedOutItems.size() < 10){
            checkedOutItems.add(item);
        }
    }
    public void returnItem(Item item){
        checkedOutItems.remove(item);
    }
    public int getNumItems(){
        return checkedOutItems.size();
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public List<Item> getCheckedOutItems(){
        return checkedOutItems;
    }
}

class Library{
    public static void main(String[] args) {
        Book book = new Book("Christopher Paolini", 764, "Brisingr", "B00K", LocalDate.of(2008, 9, 20));
        DVD dvd = new DVD("Christopher Nolan", 148, "Inception", "D&D", LocalDate.of(2010, 7, 16));
        CD cd = new CD("Michael Jackson", 9, "Thriller", "C*D", LocalDate.of(1982, 11, 30));

        Patron bob = new Patron("Bob", 4321);
        bob.checkOutItem(book);
        bob.checkOutItem(cd);
        System.out.println("Bob's checked out items: " + bob.getNumItems());

        bob.returnItem(cd);
        System.out.println("Bob's checked out items after returning CD: " + bob.getNumItems());

        bob.checkOutItem(dvd);
        System.out.println("Bob's checked out items after buying DVD: " + bob.getNumItems());

        System.out.println("Bob's checked out items: " + bob.getCheckedOutItems());
    }
}
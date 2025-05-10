/*Class Initialization through Constructor Create a class Book with attributes title and author. 
Initialize them using a constructor, and print the details using a method showBook(). */



public class Book {
    
    public String title;
    public String author;

    public Book(String ti, String au){
    this.title = ti;
    this.author = au;
    }
    public void showDetails(){
     System.out.println("Title :" + this.title);
     System.out.println("Author :" + this.author);


    }
    public static void main(String[] args) {
        Book book1 = new Book("Game of Thrones", "George R.R.Martin");
        Book book2 = new Book("Harry Potter","mandip");


book1.showDetails();
book2.showDetails();

    }
}



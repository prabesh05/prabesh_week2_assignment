  /*Book Library (Manual Objects) Create a Book class with attributes: title, author, ISBN. In the main() method, 
  create 5 different Book objects manually and display their details using a method showDetails().

 */
  
  
  
  
  public class Book {
    public String title;
    public String author;
    public int ISBN;

    public Book(String ti, String au, int IS){
    this.title = ti;
    this.author = au;
    this.ISBN = IS;
    }
    public void showDetails(){
     System.out.println("Title :" + this.title);
     System.out.println("Author :" + this.author);
     System.out.println("ISBN :" + this.ISBN);

    }
    public static void main(String[] args) {
        Book book1 = new Book("Game of Thrones", "George R.R.Martin", 34567);
        Book book2 = new Book("Harry Potter","mandip", 1234);
        Book book3 = new Book("The Subtle Art Of Not Giving A Fu*k","Mark Manson",334455);
        Book book4 = new Book("Rich Dad Poor Dad","Robert Kiyosaki",223344);
        Book book5 = new Book("Mythology: Timeless Tales of Gods and Heroes","Edith Hamilton",65465);


book1.showDetails();
book2.showDetails();
book3.showDetails();
book4.showDetails();
book5.showDetails();

    }
}

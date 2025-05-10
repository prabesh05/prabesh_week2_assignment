/*Simple Contact Management Create a class Contact with fields: name, phoneNumber, emailAddress. Create 3 Contact objects.
 Print the contact details only if the emailAddress is not empty (use if condition). */


public class Contact {
    public String name;
    public int phoneNumber;
    public String email;
    
    public Contact(String name, int phoneNumber,String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void displayDetails() {
 if(!email.isEmpty()){
    System.out.println("Name"+name);
    System.out.println("Phone number:"+phoneNumber);
    System.out.println("Email:"+email);

 }
         
    }
    public static void main(String[] args) {
        Contact c1 = new Contact("Jon Snow",984380604,"jonsnow44@gmail.com");
            Contact c2 = new Contact("Travis Scott",984155689,"jackcactus90210@gmail.com");
            Contact c3 = new Contact("Eminem ", 982303168,"slimshady51@gmail.com");

            c1.displayDetails();
            c2.displayDetails();
            c3.displayDetails();
    }

}

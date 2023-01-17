package Library_Managment;
import java.util.Scanner;

public class first{
    /**
     * @param args
     */
    public static void main(String[] args){
    //initialisation of library instance
     Library_Management_System library=new  Library_Management_System();
    String T="";
    //start listening to the user commands
    while(T!= "exit"){
    System.out.println("--List of commands--");
    System.out.println("1- To register a new user tape :r");
    System.out.println("2- To create a new book tape :b");
    System.out.println("3- To show all available books tape : books");
    System.out.println("4- To show all user tape : users");
    System.out.println("5- To close tape : exit");
    
    Scanner TappedValue= new Scanner(System.in);//cretae a Scanner;
    String value =TappedValue.nextLine(); //read user input
    switch(value){
    case"r":
    // create a new user block
    System.out.println("Enter username");
    String username=TappedValue.nextLine();
    
    System.out.println("Enter password");
    String password=TappedValue.nextLine();
    
    //call registration method to register the new user
    library.Register(username,password);break;
    case"b":
    // create a new book block 
    System.out.println("create a new book");
    library.libDatabase.add();
    break;
    case"books":
    // show all books
    System.out.println("show all books");
    library.show_all_books();
    break;
    case"users":
    // show all users
    System.out.println(" show all users ");
    library.show_all_users();break;
    case"exit":
    //close 
    System.out.println("closing ....");
    break;
    default:
    System.out.println("Error: Invalid command try again "); break;}
    System.out.println("----------------------------------");
    }}}
    
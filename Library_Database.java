package Library_Managment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library_Database {

    public class Library_Database {
 
        List<book> list_of_books= new ArrayList<>();
          public Library_Database () {}
      
          public void add() {
               Scanner TappedValue=new Scanner(System.in); // create Scanner ;
               System.out.println("Enter book title :");
               String title=TappedValue.nextLine();//Read title input
               System.out.println("Enter book auther :");
               String auther=TappedValue.nextLine();// Read auther input
               System.out.println("Enter book ISBN :"); 
               String ISBN=TappedValue.nextLine();// Read ISBN input
               System.out.println("Enter book publisher ");
               String publisher=TappedValue.nextLine();// Read publisher input
             // create book object
              book book=new book(title,auther,ISBN,publisher);
            // insert book object
              list_of_books.add(book);
              System.out.println("Add book successfully ");
          }
      
          public void delete() {
      
          }
      
          public void update() {
      
          }
      
      
          public void search(String booktitle) {
              // search bu book name
              for(int i=0;i<list_of_books.size();i++){
                 if( list_of_books.get(i).getTitle()==booktitle){
                   System.out.println("Search result :");
                   list_of_books.get(i).show_bookInfos();}
                   else{ System.out.println("not found !");}}
          }}
      
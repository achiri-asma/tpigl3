package Library_Managment;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Library_Management_System {

	List<user> users= new ArrayList<>();
        Library_Database libDatabase= new Library_Database();
	public void Librari_Management_System() {
        } // <----- To add

	public void Login(String username, String password) {
            for(int i=0;i<users.size();i++){
                if(users.get(i).getUsername() == username & users.get(i).getpassword()==password){
                System.out.println(" successful login welcome  Mr:"+ username); }}
	}

	public void Register(String username, String password) {
           // generate a random user id
          Random rand= new Random();
          int id= rand.nextInt(10000);
          // create new user object
          user usr=new user(id,username,password);
          // register a new user
             users.add(usr);
          // declare registration
          System.out.println(" successfulcreation of user" + username);
	}

	public void show_all_users() {
        if(users.size()>0){
           for(int i=0;i<users.size();i++){
           System.out.println("user number :"+i);
           users.get(i).show_userInfos(); }}
        else{System.out.println("There is no registered user ");}
	}

	public void show_all_books() {
         List<book> booklist=libDatabase.list_of_books;
         if(booklist.size()>0){
           for(int i=0;i<booklist.size();i++){
           System.out.println("book number :"+i); 
           booklist.get(i).show_bookInfos();}}
          else{ System.out.println("there is no saved book");}}
        
	
        public void Logout() {
        System.out.println("by by");
	}
}

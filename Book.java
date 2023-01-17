package Library_Managment;

public class Book {

        private String title;
    
        private String auther;
    
        private String ISBN;
    
        private String publisher;
    
        public book() {
    
        }
    
        public book(String title, String auther, String ISBN, String publisher) {
              this.title=title;
              this.auther=auther;
              this.ISBN=ISBN;
              this.publisher=publisher;
        }
        public void Reservation_status() {
        }
    
        public void feedback() {
        }
    
        public void book_request() {
        }
    
        public String getTitle() {
        return title;
        }
    
        public void show_bookInfos() {
             System.out.println("Book Title:"+title);
             System.out.println("Book Auther:"+auther);
             System.out.println(" Book ISBN :"+ISBN);
             System.out.println(" Book Publisher:"+publisher);
        }
    
    }
    



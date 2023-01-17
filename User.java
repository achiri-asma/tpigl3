package Library_Managment;

public class user {

	private int id;

	private String username;

	private String password;

	public user() {

	}

	public user(int id, String username, String password) {
           this.id=id;
           this.username=username;
           this.password=password;
	}

	public void verify() {

	}

	public void checkAccount() {

	}

	public void get_book_info() {

	}

	public void show_userInfos() {
         System.out.println("username :"+username+"password:"+password);
	}

	public String getUsername() {
		return username;
	}

	public String getpassword() {
		return password;
	}

}


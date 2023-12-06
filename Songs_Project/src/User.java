
public class User {
	int user_id;
	String user_name;
	
	User(int user_id, String user_name){
		this.user_id = user_id;
		this.user_name = user_name;
		
	}
	public int getuser_id() {
		return user_id;
	}
	
	public String getuser_name() {
		return user_name;
	}
	
	public String toString() {
		return user_id+" "+user_name;
	}

}

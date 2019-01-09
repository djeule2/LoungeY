package lounge.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

import java.util.ArrayList;

@Entity
public class User extends BasicDO {

	private String username;
	private String password;
	private String email;

	private boolean isAdmin;

	private ArrayList<ObjectId> friendsList;

	public User() {}

	public User(String email, String username, String password) {
		this.setId(new ObjectId());
		this.email = email;
		this.username = username;
		this.password = password;
		this.isAdmin = false;

		friendsList = new ArrayList<>();
	}

	public ArrayList<ObjectId> getFriendsList() {
		return friendsList;
	}

	public void setFriendsList(ArrayList<ObjectId> friendsList) {
		this.friendsList = friendsList;
	}

	public void addFriendinvite(User other){
		this.friendsList.add(other.getId());
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean admin) {
		isAdmin = admin;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

package onetoonemappingbidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class User {

 

	@Id

	@GeneratedValue

	private int uid;

	private String uname;

	private int upwd;

	

	@OneToOne

	private Role role;

 

	public int getUid() {

		return uid;

	}

 

	public void setUid(int uid) {

		this.uid = uid;

	}

 

	public String getUname() {

		return uname;

	}

 

	public void setUname(String uname) {

		this.uname = uname;

	}

 

	public int getUpwd() {

		return upwd;

	}

 

	public void setUpwd(int upwd) {

		this.upwd = upwd;

	}

 

	public Role getRole() {

		return role;

	}

 

	public void setRole(Role role) {

		this.role = role;

	}

 

	public User(int uid, String uname, int upwd, Role role) {

		super();

		this.uid = uid;

		this.uname = uname;

		this.upwd = upwd;

		this.role = role;

	}

 

	public User() {

		super();

		// TODO Auto-generated constructor stub

	}
}

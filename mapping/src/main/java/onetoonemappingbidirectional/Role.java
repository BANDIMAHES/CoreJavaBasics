package onetoonemappingbidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Role {

	@Id

	private int rid;

	private String rname;

	

	@OneToOne(mappedBy = "role")

	private User user;

 

	public int getRid() {

		return rid;

	}

 

	public void setRid(int rid) {

		this.rid = rid;

	}

 

	public String getRname() {

		return rname;

	}

 

	public void setRname(String rname) {

		this.rname = rname;

	}

 

	public User getUser() {

		return user;

	}

 

	public void setUser(User user) {

		this.user = user;

	}

 

	public Role(int rid, String rname) {

		super();

		this.rid = rid;

		this.rname = rname;

	}

 

	public Role() {

		super();

		// TODO Auto-generated constructor stub

	}

}

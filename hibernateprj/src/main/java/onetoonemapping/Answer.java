package onetoonemapping;
import javax.persistence.Entity;

import javax.persistence.Id;

 

@Entity

public class Answer {

	@Id

	private int aid;

	private String aname;

	public int getAid() {

		return aid;

	}

	public void setAid(int aid) {

		this.aid = aid;

	}

	public String getAname() {

		return aname;

	}

	public void setAname(String aname) {

		this.aname = aname;

	}

	public Answer(int aid, String aname) {

		super();

		this.aid = aid;

		this.aname = aname;

	}

	

 



}

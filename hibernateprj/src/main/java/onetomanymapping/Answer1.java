package onetomanymapping;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import onetoonemapping.Question;

public class Answer1 {
	@Id

	private int aid;

	private String aname;

	@ManyToOne

	private Question que;

	

public Question getQue() {

		return que;

	}

	public void setQue(Question que) {

		this.que = que;

	}

	

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

	public Answer1(int aid, String aname) {

		super();

		this.aid = aid;

		this.aname = aname;

	}

	



}



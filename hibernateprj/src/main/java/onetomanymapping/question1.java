package onetomanymapping;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import onetoonemapping.Answer;

public class question1 {
	@Id

	private int qid;

	private String qname;

	@OneToMany

	//@JoinColumn(name="aid")//new colume added in question table

	private  List<Answer> ls ;

	

 

	public List<Answer> getLs() {

		return ls;

	}

	public void setLs(List<Answer> ls) {

		this.ls = ls;

	}

	public int getQid() {

		return qid;

	}

	public void setQid(int qid) {

		this.qid = qid;

	}

	public String getQname() {

		return qname;

	}

	public void setQname(String qname) {

		this.qname = qname;

	}

	public question1(int qid, String qname) {

		super();

		this.qid = qid;

		this.qname = qname;

	}

	public question1() {

		super();

		// TODO Auto-generated constructor stub

	}

	}



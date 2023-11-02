package manytomanymapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table(name = "q123")

public class Question2 {

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

private int qid;

@Column(name = "q_name")

private String qname;

@ManyToMany

private List<Answer2> ans;

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

public List<Answer2> getAns() {

return ans;

}

public void setAns(List<Answer2> ans) {

this.ans = ans;

}

 

 

 

}



package manytomanymapping;

import java.util.List;
import javax.persistence.JoinColumn;





import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table(name = "a123")

public class Answer2<qn> {

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

private int aid;

@Column(name = "a_name")

private String aname;

//@ManyToMany
//
//private List<Answer2> qn;
//
//public int getAid() {
//
//return aid;

//}
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
@JoinTable(
name = "Answer_Question",
joinColumns = { @JoinColumn(name = "AID") },
inverseJoinColumns = { @JoinColumn(name = "QID") }
)
private List<Question2> que2;

public void setAid(int aid) {

this.aid = aid;

}

public String getAname() {

return aname;

}

public void setAname(String aname) {

this.aname = aname;

}

public List<Question2> getQue2() {
	return que2;
}

public void setQue2(List<Question2> que2) {
	this.que2 = que2;
}

public int getAid() {
	return aid;
}


 

 

 

 

}



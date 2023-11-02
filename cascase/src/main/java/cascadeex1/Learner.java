package cascadeex1;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Learner {
	
	@Id
	private int lid;
	private String lname;
	
	
	@OneToMany(mappedBy = "l", cascade = CascadeType.REMOVE)
	private List<Mobile> li=new ArrayList<Mobile>();
	
	public void addMobileNumber(Mobile mob) {
		
		this.li.add(mob);
		mob.setL(this);
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Mobile> getLi() {
		return li;
	}

	public void setLi(List<Mobile> li) {
		this.li = li;
	}
	
	
	
}




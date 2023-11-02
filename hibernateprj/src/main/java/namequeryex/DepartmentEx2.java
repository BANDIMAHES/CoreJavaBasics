package namequeryex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name="findDepartmentByName",query="from Department d where d.dname=:name")
})
@Entity
public class DepartmentEx2 {
	
	@Id
private int id;
	private String d2name;
	private String d2location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getD2name() {
		return d2name;
	}
	public void setD2name(String d2name) {
		this.d2name = d2name;
	}
	public String getD2location() {
		return d2location;
	}
	public void setD2location(String d2location) {
		this.d2location = d2location;
	}
	

	
		

	}



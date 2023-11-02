package namequeryex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
	@NamedQuery(name="findDepartmentByName",query="from Department d where d.dname=:name")
})
@Entity
public class Department {
	
	@Id
	private int id;
	private String dname;
	private String dlocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDlocation() {
		return dlocation;
	}
	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}
	public Department(int id, String dname, String dlocation) {
		super();
		this.id = id;
		this.dname = dname;
		this.dlocation = dlocation;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", dlocation=" + dlocation + "]";
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

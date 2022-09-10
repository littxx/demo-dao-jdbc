package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer id;
	private String email;
	private Date birthDate;
	private Double salary;
	
	private Departament departament;
	
	public Seller() {
		
	}

	public Seller(String name, Integer id, String email, Date birthDate, Double salary, Departament departament) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.birthDate = birthDate;
		this.salary = salary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [name=" + name + ", id=" + id + ", email=" + email + ", birthDate=" + birthDate + ", salary="
				+ salary + ", departament=" + departament + "]";
	}
	
	
	
}

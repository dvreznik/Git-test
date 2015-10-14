import java.io.Serializable;


public class Profile implements Serializable {
	
	private String name,surname;
	
	public Profile(String name,String surname){
		this.surname = surname;
		this.name = name;
	}
	
	public Profile() {
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

package ace.bind;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity 
@Table(name = "users")
public class users {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
	private String Full_Name;
	private String Email;
	
//	public users() {  }
//	
//	 public users(String Full_Name, String Email) {
//	        this.setFull_Name(Full_Name);
//	        this.setEmail(Email);
//	    }
//
//	    public users(int ID, String Full_Name, String Email) {
//	        this.setID(ID);
//	        this.setFull_Name(Full_Name);
//	        this.setEmail(Email);
//	    }
//	    
//	    public int getID() {
//	        return ID;
//	    }
//
//	    public void setID(int ID) {
//	        this.ID = ID;
//	    }
//
//	    public String getFull_Name() {
//	        return Full_Name;
//	    }
//
//	    public void setFull_Name(String Full_Name) {
//	        this.Full_Name = Full_Name;
//	    }
//
//	    public String getEmail() {
//	        return Email;
//	    }
//
//	    public void setEmail(String Email) {
//	        this.Email = Email;
//	    }
	    
	    
	    
}

import java.util.ArrayList;
import java.util.HashMap;

public class child {

	private String gender = "";
	HashMap<String, Object> hash = new HashMap<String, Object>();
	private ArrayList<String> Parents = new ArrayList<String>();
	
	//Passing in family tree because it will be updated in this class also.	
	public child(HashMap<String, Object> hash) {
		this.hash = hash;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public HashMap<String, Object> setParents(String parent) {
		this.Parents.add(parent);
		return hash;
	}
	
	public ArrayList<String> getParents(){
		return this.Parents;
	}
	
	public int getParentsLength(){
		return this.Parents.size();
	}
	
}

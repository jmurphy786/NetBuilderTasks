import java.util.ArrayList;
import java.util.HashMap;

public class Family {


	//List to track all children as key and their parents and gender details as Objects
	private HashMap<String, Object> famTree = new HashMap<String, Object>();

	
	
	public Boolean setParentOf(String child, String Parent) {
		
		//New instance of the childs' relevant data
		child Child = new child(famTree);
		
		
		if(child == Parent) 
		{
			System.out.println("A child cannot be their own parent!");
			return false;
		}
		
		//If the child already exists in map add onto their existing parents
		else if(famTree.containsKey(child)) {
			
			Child = (child) famTree.get(child);
			Child.setParents(Parent);

			famTree.put(child, Child);
			
			if(!(famTree.containsKey(Parent))) 
			{
				child newChild = new child(famTree);
				famTree.put(Parent, newChild);
			}
			
			if(Child.getParentsLength() == 2) {
				String strMale = Child.getParents().get(0);
				String strFemale = Child.getParents().get(1);
				Child = (child) famTree.get(strMale);
				Child.setGender("Male");
				famTree.put(strMale, Child);
				Child = (child) famTree.get(strFemale);
				Child.setGender("Female");
				famTree.put(strFemale, Child);
			}
			
			return true;			
		}
		else 
		{   				
			child newChild = new child(famTree);
			famTree.put(Parent, newChild);
			Child.setParents(Parent);
			famTree.put(child, Child);
			return true;
		}

	}
	//Check the name of child in the hashmap and use the object to determine their gender
	public Boolean isMale(String name) {
		child Child = new child(famTree);
		Child = (child) famTree.get(name);
		String str = Child.getGender();
		if(str == "Male") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean isFemale(String name) {
		child Child = new child(famTree);
		Child = (child) famTree.get(name);
		String str = Child.getGender();
		if(str == "Female") {
			return true;
		}
		else {
			return false;
		}
	}

}


public class main {

	public static void main(String[] args) {
		
		Family fam = new Family();
		
		fam.setParentOf("Steven", "Andy");
		fam.setParentOf("Andy", "Bryan");
		fam.setParentOf("Andy", "Margaret");
		fam.setParentOf("Steven", "Ruth");
		fam.setParentOf("Max", "Ruth");
		

		System.out.println(fam.getChildren("Ruth"));
		System.out.println("\n");
		System.out.println(fam.isMale("Bryan"));
		System.out.println("\n");
		fam.getParents("Andy");

	}
}

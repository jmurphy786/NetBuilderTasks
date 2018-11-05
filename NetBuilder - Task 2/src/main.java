
public class main {

	public static void main(String[] args) {
		
		Family fam = new Family();
		
		fam.setParentOf("Steven", "Andy");
		fam.setParentOf("Steven", "Steven");
		fam.setParentOf("Steven", "Annie");
		
		System.out.println(fam.isMale("Andy"));
		System.out.println(fam.isFemale("Annie"));
		System.out.println(fam.isMale("Annie"));
	}
}

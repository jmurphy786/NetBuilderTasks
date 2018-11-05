
public class alphaClass {
	
	public alphaClass() {}

	public String replaceLettersWithPosition(String input) 
	{
		input = input.toLowerCase();
		String returnString = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			if((int)input.charAt(i) <97 || (int)input.charAt(i) > 122) //Anything that isnt lowercase ascii is continued
			{
				continue;
			}
			
			else
			{
				int num = (int) input.charAt(i) - 96; //Lower Case ascii starts from 97
				returnString += num + " "; 
			}
		}
		return returnString;
	}
}

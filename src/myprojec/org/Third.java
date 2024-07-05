package myprojec.org;

public class Third {
	    public static String getConsonants(String input) {
	        StringBuilder consonants = new StringBuilder();
	        String vowels = "AEIOUaeiou";
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
	                consonants.append(ch);
	            }
	        }
	        
	        return consonants.toString();
	    }

	    public static void main(String[] args) {
	        // Example usage
	        String input = "Hello World!";
	        String consonants = getConsonants(input);
	        System.out.println("Consonants: " + consonants);
	    }
	


}
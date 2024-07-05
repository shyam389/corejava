package myprojec.org;

public class Other {
static void consonant(String s) {
	String v = "aeiou";
	StringBuilder ans  =new StringBuilder();
	for(int i =0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(Character.isLetter(ch)&&v.indexOf(ch) == -1) {
			ans.append(ch);
		}
	}
	System.out.println(ans.toString());
}
	public static void main(String []args) {
//		consonant("this is a string");
		String s = "this is another string";
		String a ="thi";
		s.indexOf('s',0,5);
		s.compareTo(s);
		double d = 23.534;
		int c = (int) d;
		
	}
}

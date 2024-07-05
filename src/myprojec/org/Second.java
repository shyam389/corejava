package myprojec.org;

public class Second {

	public static void main(String []args) {
		StringBuffer obj = new StringBuffer();
		String s = "this is a string";
		System.out.println(obj.append(true));
		System.out.println(obj.toString());
		System.out.println(obj.indexOf(s));
		System.out.println(obj.isEmpty());
		System.out.println(obj.append(true));
		System.out.println(obj.append(true));
		System.out.println(obj.append(true));
		System.out.println(obj.append(true));
		System.out.println(obj.capacity());
		StringBuilder obj2 = new StringBuilder();	
	}
}

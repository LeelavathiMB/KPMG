package StaticFinal;

public class StringExample {
	public static void main(String[] args) {
		String temp="My name is Leelavathi";
		System.out.println(temp.length());
		System.out.println(temp.substring(4));
		System.out.println(temp.substring(2,9));
		System.out.println(temp.charAt(3));
		System.out.println(temp.indexOf(4));
		System.out.println(temp.compareTo("leela"));
		System.out.println(temp.compareToIgnoreCase("lee"));
		System.out.println(temp.equals("leela"));
		System.out.println(temp.toCharArray());
		System.out.println(temp.replace(temp, temp));
		System.out.println(temp.toLowerCase());
		System.out.println(temp.equalsIgnoreCase("leelavathi"));
		System.out.println(temp.startsWith("Iam", 1));
		String[] names= {"virat","Rohith","Siraj","Tim Devid"};
		System.out.println(String.join(" ", names));
		
		
	}

}

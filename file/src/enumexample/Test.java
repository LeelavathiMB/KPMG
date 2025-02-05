package enumexample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Day day=Day.THRUSDAY;
 switch (day) {
 case MONDAY :
	 System.out.println("working day");
	 break;
 case TUESDAY :
	 System.out.println("2nd working day");
	 break;
 case WEDNESDAY :
	 System.out.println("3rd working day");
	 break;
 case THRUSDAY :
	 System.out.println("4rth working day");
	 break;
 case FRIDAY :
	 System.out.println("5th working day");
	 break;
 case SATURDAY :
	 System.out.println("weekend start");
	 break;
 case SUNDAY :
	 System.out.println("party day");
	 break;
	 default :
		 System.out.println("not valid");
 }
 
 
	}

}

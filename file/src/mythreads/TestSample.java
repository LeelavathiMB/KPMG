package mythreads;

public class TestSample {
	
	public static void main(String[] args) {
		PrintEven obj=new PrintEven ();
		Sample sam1=new Sample(obj);
		Sample sam2=new Sample(obj);
		sam1.start();
		sam2.start();
		
		
	}

}

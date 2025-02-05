package mythreads;

public class PrintEven {
	static int i=0;
	public synchronized void getValue() {
		 for(int i=0; i<=20; i=i+2) {
			 System.out.println(i);
		 try {
			 Thread.sleep(2000);
		 }
		 catch (InterruptedException e){
			 e.printStackTrace();
			 
		 }
	}
	
	}
}

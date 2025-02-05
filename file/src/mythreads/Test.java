package mythreads;

public class Test {
	public static void main(String[] args) {
		MyThreads t1=new MyThreads();
		t1.start();//calls the run method
		
		MyTask task=new MyTask();
		Thread t2=new Thread (task);
		t2.start();
		
	}

}

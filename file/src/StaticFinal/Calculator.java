package StaticFinal;

public class Calculator {
	int x=10;
	int y=30;
	
	public int sum() {
		return x+y;
	}
	public int sum1(int a,int b) {
		return a+b;
	}
	public float sum2(float a,float b) {
		return a+b;
	}
	public float sum3(int a,float b) {
		return a+b;
	}
		public double sum4(double a,int b) {
			return a+b;
		}
		
	}
//overriding
//we can have two or more methods with the same name provided they differ in
//number of args
//data type args
//order of arge
//Note:- return type is not considerd


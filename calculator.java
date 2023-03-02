package week2day3;

public class calculator {
	int l,c;
	double f;
	float i;
	
	public void additionTwoNumbers(int j,int k) {
		int l=j+k;
		System.out.println(l);
	
	}
	public void subtractTwoNumbers(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multiplicationOfTwoNumbers (double d,double e) {
	
		double f=d*e;
		System.out.println(f);
		
	}
	public void divisonTwoNumbers(float g,float h) {

		float i=g/h;
		System.out.println(i);
		
	}
			public static void main(String[]args) {
			calculator Mycalc=new calculator();
			Mycalc.subtractTwoNumbers(2,9);
			Mycalc.multiplicationOfTwoNumbers(8,7);
			Mycalc.divisonTwoNumbers(10,9);
			Mycalc.subtractTwoNumbers(9, 20);
			Mycalc.additionTwoNumbers(20, 30);


		}
	}

package interviewques;

public class Factorialnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("the factorial number is " +num +" is: " +fact);
	}

}

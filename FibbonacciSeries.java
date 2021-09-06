package Week1.assignments;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber, secondNumber, result;
		firstNumber = 0;
		secondNumber = 1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i = 1 ; i < 8 ; i ++) {
			
			result = firstNumber +secondNumber;		
			firstNumber = secondNumber;
			secondNumber =result;
			System.out.println(result);
		}
			
			
		
		

	}

}

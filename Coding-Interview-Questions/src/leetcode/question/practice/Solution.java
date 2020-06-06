package leetcode.question.practice;

public class Solution {

	public static void main(String[] args) {
		System.out.println("1. printEven ##############################");
		printEven(100);
		System.out.println("############################################################");
		System.out.println("2. printOdd ##############################");
		printOdd(100);
		System.out.println("############################################################");
		System.out.println("3. printisEveneOrOdd ##############################");
		printEvenOrOdd(3);
		printEvenOrOdd(10);
		System.out.println("4. printisPositiveOrNegative ##############################");
		printisPositiveOrNegative(3);
		printisPositiveOrNegative(-10);
		System.out.println("5. printisPositiveOrNegative ##############################");
		MultiplicationTable(3);
		MultiplicationTable(10);
		System.out.println("6. printSquare x=a*a+b*b ##############################");
		printSquare(3, 4);
		printSquare(5, 6);

		System.out.println("7. printPower ##############################");
		printPower(3, 4); // 3 power 4
		printPower(5, 6); // 5 power 6

		System.out.println("8. printFactorization 3!=3*281 ##############################");
		printFactorization(3); // 3 power 4
		printFactorization(5); // 5 power 6

		System.out.println("9. isPrimeNumber ##############################");
		isPrimeNumber(3); //
		isPrimeNumber(25); //

		System.out.println("10. NestedLoop ##############################");
		nestedLoop(10); //
		// nestedLoop(25); //

		System.out.println("11. decimalToBinary ##############################");
		decimalToBinary(5); //

		System.out.println("12. printFactorization by Recursion 3!=3*281 ##############################");
		System.out.println(printFactorizationRecursive(3));
		System.out.println(printFactorizationRecursive(5));

		System.out.println("13. printSum  ##############################");
		printSum(3);
		printSum(5);

		System.out.println("14. array Example  ##############################");
		arrayExample();
		
		System.out.println("15. printAvarage  ##############################");
		printAvarage();
		
		System.out.println("16. Math -- abs  ##############################");
		printMathAbs();
		
		System.out.println("17. Math -- pow  ##############################");
		printMathPow();
		
		System.out.println("18. Math -- sqrt  ##############################");
		printMathSqrt();
		
		System.out.println("19. Math -- sqrt  ##############################");
		printMathRound();
		
		System.out.println("20. Math -- max and min  ##############################");
		printMathMaxMin();



	}
	
	public static void printMathMaxMin() {
		System.out.println(Math.max(6,10));
		System.out.println(Math.min(10,6));
	}
	
	public static void printMathRound() {
		System.out.println(Math.round(09.123));
		System.out.println(Math.round(081.99));
	}
	
	public static void printMathSqrt() {
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(81));
	}
	
	public static void printMathPow() {
		System.out.println(Math.pow(3,2));
		System.out.println(Math.pow(3,3));
	}
	public static void printMathAbs() {
		System.out.println(Math.abs(0001.1));
		System.out.println(Math.abs(-11.0001));
	}
	
	public static void printAvarage() {
		int[] array = new int[5]; // array declaration
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		int sum =0;
		for (int i = 0; i < array.length - 1; i++) {
			sum=sum+(array[i]);
		}
		System.out.println("Average is " + sum/array.length);
	}
	
	public static void arrayExample() {
		int[] array = new int[5]; // array declaration
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}
	}

	public static void printEven(int limit) {
		for (int i = 0; i < limit; i = i + 2) {
			System.out.println(i);
		}
	}

	public static void printOdd(int limit) {
		for (int i = 1; i < limit; i = i + 2) {
			System.out.println(i);
		}
	}

	public static void printEvenOrOdd(int num) {
		String output = num % 2 == 0 ? "Even" : "Odd";
		System.out.println(num + " is " + output);
	}

	public static void printisPositiveOrNegative(int num) {
		String output = num > 0 ? "Positive" : "Negative";
		System.out.println(num + " is " + output);
	}

	public static void MultiplicationTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}
	}

	public static void printSquare(int a, int b) {
		System.out.println(a * a + b * b);
	}

	public static void printPower(int num, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = result * num;
		}
		System.out.println(result);
	}

	public static void printFactorization(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static int printFactorizationRecursive(int num) {
		if (num == 1)
			return 1;
		return num * printFactorizationRecursive(num - 1);
	}

	public static void isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "Prime" : "is Not Prime");

	}

	public static void nestedLoop(int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}

	}

	public static void decimalToBinary(int deci_num) {
		int rem;
		String bin_num = "";
		while (deci_num > 0) {
			rem = deci_num % 2;
			deci_num = deci_num / 2;
			bin_num = bin_num + rem;
		}
		System.out.println(bin_num);
	}

	public static void printSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

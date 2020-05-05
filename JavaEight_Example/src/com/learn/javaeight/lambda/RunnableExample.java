package com.learn.javaeight.lambda;

public class RunnableExample {

	public static void main(String[] args) {

		// Old Way
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += i;
				}
				System.out.println("Sum Old Way " + sum);
			}
		};
		
		new Thread(runnable).start();
		
		// Using Lambda
		
		Runnable runnable1 = ()->{
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += i;
			}
			System.out.println("Sum Lamdba Way " + sum);
		};
		
		new Thread(runnable1).start();
		
		// Implement Thread inside landba
		
		new Thread(()->{
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += i;
			}
			System.out.println("Sum Inside Lamdba Way " + sum);
			
		}).start();
	}

}

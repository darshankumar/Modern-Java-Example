package com.learn.java_thirteen.MultiLineTextBlock;

public class MultiLineTextBlockExample {

	public static void main(String[] args) {
		String str = """
				Hello
				All
				TextBlocl!!!
				""";
		System.out.println(str);

		String pharse = """
				{
				employee: "Mike",
				employeeID: 1001,
				employeeAge: 26
				}
				""";
		System.out.println(pharse);

		String html = """
				<html>
				<body>
				<p>Java Programming</p>
				</body>
				</html>
				""";
		System.out.println(html);
		
		String str1 = str.concat("This is my first text Block");
		System.out.println(str1);
	}

}

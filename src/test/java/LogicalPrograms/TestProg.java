package LogicalPrograms;

public class TestProg {

	public void CharCount() {

		String Str = "Hello Google";
		Str = Str.toLowerCase();
		System.out.println(Str);

		for (int i = 0; i < Str.length(); i++) {
			char ch = Str.charAt(i);
			int count = 0;

			if (ch == ' ' || Str.indexOf(ch) < i) {
				continue;
			}

			for (int j = 0; j < Str.length(); j++) {
				if (ch == Str.charAt(j)) {
					count++;
				}

			}
			System.out.println(ch + " is " + count);
		}
		System.out.println("");

	}

	public void charOccurance() {
		String str = "My Name is Rahul208 Kumar@$%";
		str = str.toLowerCase();

		int letterCount = 0;
		int digitCount = 0;
		int splCharCount = 0;
		int spaceCount = 0;

		char[] cha = str.toCharArray();

		for (Character c : cha) {

			if (Character.isLetter(c)) {
				letterCount++;
			} else if (Character.isDigit(c)) {
				digitCount++;
			} else if (Character.isSpaceChar(c)) {
				spaceCount++;
			} else {
				splCharCount++;
			}
		}
		System.out.println("LetterCount is " + letterCount);
		System.out.println("digitCount is " + digitCount);
		System.out.println("spaceCount is " + spaceCount);
		System.out.println("splCharCount is " + splCharCount);
		System.out.println("");

	}

	public void charCountAgain() {
		String S = "Count 2 times Please!";
		S = S.toLowerCase();
		int lettCount = 0;
		int digiCount = 0;
		int spcCount = 0;
		int others = 0;

		char[] d = S.toCharArray();

		for (Character c : d) {
			// System.out.println(c);

			if (Character.isLetter(c)) {
				lettCount++;
			} else if (Character.isDigit(c)) {
				digiCount++;
			} else if (Character.isSpaceChar(c)) {
				spcCount++;
			} else {
				others++;
			}
		}
		System.out.println("LetterCount is " + lettCount);
		System.out.println("digitCount is " + digiCount);
		System.out.println("spaceCount is " + spcCount);
		System.out.println("splCharCount is " + others);
		System.out.println("");
	}

	public void ArrayInitialization() {
		int ar[] = new int[4];
		ar[0] = 1;
		ar[1] = 5;

		System.out.println(ar[1]);
		System.out.println("");
	}

	public void pattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++)
				System.out.print("*");
			System.out.println();

		}
	}

	public void patternReverse() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();

		}
	}

	public void reverseString() {
		String str = "Rahul Kumar";

		StringBuffer strRev = new StringBuffer(str);
		strRev = strRev.reverse();
		System.out.println(strRev);

		StringBuilder strRev1 = new StringBuilder(str);
		strRev1 = strRev1.reverse();
		System.out.println(strRev1);
	}
	
	public void swapTwoNumbers() {
		int a =5;
		int b=10;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap - Value of a= " +a);
		System.out.println("After Swap - Value of b= " +b);
	}

	public static void main(String[] args) {

		TestProg obj = new TestProg();
		System.out.println("Char Count");
		obj.CharCount();

		System.out.println("Char occurance");
		obj.charOccurance();

		System.out.println("Char Count Again");
		obj.charCountAgain();

		System.out.println("Array Initialization");
		obj.ArrayInitialization();

		System.out.println("Star Pattern");
		obj.pattern();

		System.out.println("Reverse the Star Pattern");
		obj.patternReverse();

		System.out.println("Reverse the String" + "\n");
		obj.reverseString();
		
		System.out.println("\n Swap the Number \n");
		obj.swapTwoNumbers();

	}
}

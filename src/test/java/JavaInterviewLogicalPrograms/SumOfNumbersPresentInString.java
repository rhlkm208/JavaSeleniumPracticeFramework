package JavaInterviewLogicalPrograms;

public class SumOfNumbersPresentInString {

	public static void main(String[] args) {

		String str = "123Welcome2Tesco123";

		String number = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				number = number + c;
			} else {
				if (!number.equals("")) {
					sum = sum + Integer.parseInt(number);
					number = "";
				}
			}
		}

		if (!number.equals("")) {
			sum = sum + Integer.parseInt(number);
		}
		System.out.println(sum);

	}

}

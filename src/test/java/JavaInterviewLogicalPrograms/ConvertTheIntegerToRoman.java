package JavaInterviewLogicalPrograms;

public class ConvertTheIntegerToRoman {

    public static String intToRoman(int num) {

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] +
               hundreds[(num % 1000) / 100] +
               tens[(num % 100) / 10] +
               ones[num % 10];
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749)); // MMMDCCXLIX
        System.out.println(3749/1000);
        System.out.println(3749%1000);
    }
}

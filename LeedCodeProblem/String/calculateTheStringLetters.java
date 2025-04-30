package LeedCodeProblem.String;

public class calculateTheStringLetters {
    public void main(String[] args) {
//        calculateTheStringLetters obj = new calculateTheStringLetters();
     String str = "How are you";
        System.out.println(countTheWords(str));
    }
    static int countTheWords(String str) {
        if (str.length() == 0) {
            return 0;
        }
//        str = "";
        int count = 1;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == ' ') {
                count ++;
            }
        }
        return count;
    }
}

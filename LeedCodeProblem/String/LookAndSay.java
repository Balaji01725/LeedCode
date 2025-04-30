package LeedCodeProblem.String;

public class LookAndSay {
    public static void main(String[] args) {
        String str = "1";
        System.out.println(str);
        for (int i = 1; i < 5; i++) {
            str = generate(str);
            System.out.println(str);
        }
    }
    static String generate(String str) {
        char currentChar = str.charAt(0);
        int count = 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            char nextChar = str.charAt(i);
            if (currentChar == nextChar) {
                count++;
            }
            else {
                ans.append(count).append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
        }
        ans.append(count).append(currentChar);
        return ans.toString();
    }
}

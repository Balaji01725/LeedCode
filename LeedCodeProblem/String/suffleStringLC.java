package LeedCodeProblem.String;

public class suffleStringLC {
    public static void main(String[] args) {
        String s="rockslife";
        int[] indices={4,5,6,7,8,0,1,2,3};
        System.out.println(suffleChar(s,indices));
    }
    static String suffleChar(String s,int[] indices){
        char[] str=new char[s.length()];

        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
        }
        return String.valueOf(str);

    }
}

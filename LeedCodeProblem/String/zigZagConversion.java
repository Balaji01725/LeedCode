package LeedCodeProblem.String;

public class zigZagConversion {
    public static void main(String[] args) {
        String str="iwanttosettle";
        int noOfRows=3;
        System.out.println(findConversion(str,noOfRows));
    }
    static String findConversion(String str,int noOfRows){
        StringBuilder[] rows=new StringBuilder[noOfRows];

        for(int i=0;i<noOfRows;i++) {
            rows[i] = new StringBuilder();
        }
            int currentRow = 0;
            boolean down = false;

            for (char c : str.toCharArray()) {
                rows[currentRow].append(c);

                if (currentRow == 0 || currentRow == noOfRows - 1) {
                    down = !down;
                }
                currentRow = down == true ? currentRow + 1 : currentRow - 1;
            }
            StringBuilder ans=new StringBuilder();
            for(StringBuilder row:rows){
                ans.append(row);
            }
        return ans.toString();
        }

    }


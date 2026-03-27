public class LT_6ZigZagConversion {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        String ans=convert(s,3);
        System.out.println(ans);
    }
    public static String convert(String s, int numRows) {
        int index=0;
        StringBuilder string=new StringBuilder();
        for(int i=0;i<numRows;i++){
            index=i;
            while(index<s.length()){
                string.append(s.charAt(index));
                index+=2*(numRows-2);
            }
        }
        return string.toString();
    }
}

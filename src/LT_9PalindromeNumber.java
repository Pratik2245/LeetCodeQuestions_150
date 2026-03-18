public class LT_9PalindromeNumber {
    public static void main(String[] args) {
     int nuk=121;
        System.out.println(isPalindrome(nuk));
    }
    public static boolean isPalindrome(int x) {
        int temp=x;
        if(x<0){
            return false;
        }
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        return temp== sum;
    }
}

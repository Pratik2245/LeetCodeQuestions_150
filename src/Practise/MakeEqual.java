package Practise;

public class MakeEqual {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 6; // change input here

        int result = makeEqual(a, b, c);
        System.out.println(result);
    }
    public static int makeEqual(int a,int b,int c){
        int steps=0;
        while(steps!=100){
            if(a==b && b==c){
                return steps;
            }

            if(a>=b && a>=c){
                a--;
                b++;
                c++;
            }else if(b>=a && b>=c){
                b--;
                a++;
                c++;
            }else if(c>=a && c>=b){
                c--;
                a++;
                b++;
            }
            steps++;
        }
        return -1;
    }
}

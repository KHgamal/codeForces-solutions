import java.util.Scanner;

class Problem4A {
  public  static void main(String[] args){
        Scanner num=new Scanner(System.in);
       int n= num.nextInt();
       if(n%2==0&&n!=2){
           System.out.println("YES");
       }
       else {
           System.out.println("No");
       }
    }

        }
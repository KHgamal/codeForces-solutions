import java.util.Scanner;

public class Problem_231A {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int nOfSolutions=0;
        for(int i = 0; i <=n; i++){
            String str=input.nextLine();
            int  nOfOnes=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)=='1'){
                    nOfOnes++;
                }
                if (j==str.length()-1){
                    if (nOfOnes>1){
                        nOfSolutions++;
                    }
                }
            }

        }
        System.out.println(nOfSolutions);
    }

}

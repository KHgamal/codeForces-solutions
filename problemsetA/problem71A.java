
import java.util.Scanner;

public class problem71A{
public static void main (String[] args){

    Scanner input= new Scanner(System.in);

    int n=input.nextInt();
    String[] list = new String[n];
    for(int i=0;i<n;i++){
        String word=input.next();
        if(word.length()>10){
            String newWord=String.valueOf(word.charAt(0))
                    +(word.length()-2)
                    + word.charAt(word.length()-1);

            list[i]=newWord;
        }
        else{
            list[i]=word;
        }
    }
    for (int i = 0; i < list.length; i++) {
        System.out.println(list[i]);
    }

}
}
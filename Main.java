
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Are you Converting or Reverting");
        String ans = in.nextLine().toLowerCase();
        
        if(ans.equals("convert")){
            System.out.println("Please enter the statment that you wish to convert.");
            Converter x = new Converter();
            String sentence = in.nextLine();
            String[] newOutput = x.convert(sentence);
            for(int i = 0; i<newOutput.length; ++i){
                System.out.print(newOutput[i]+" ");
            }
        }
        else if(ans.equals("revert")){
            System.out.println("Please enter the statment that you wish to revert.");
            String revertString = in.nextLine();
            Reverter y = new Reverter();
            String[] newOutput = y.Revert(revertString);
            for(int i = 0; i<newOutput.length; ++i){
                System.out.print(newOutput[i]);
            }
        }
        else{
            System.out.println("Please use a valid answer");
        }
    }
}

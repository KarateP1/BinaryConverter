
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
            x.convert(sentence);

        }
        else if(ans.equals("revert")){
            System.out.println("Please enter the statment that you wish to revert.");
        }
        else{
            System.out.println("Please use a valid answer");
        }
    }
}

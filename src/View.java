import java.io.InputStream;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.ArrayList;


public class View {
    private Scanner in;

    private PrintStream out;

    public View(PrintStream out, InputStream in){
        this.in = new Scanner(in);
        this.out = out;
    }

    public void storyline(String stl){
        out.println(stl);
    }

    public String[] actionInput(ArrayList<String> verbs,ArrayList<String> nouns){
        Boolean truth = true;
        while(truth){
            out.println("What will you do?");
            for(int i=0;i<verbs.size();i++){
                out.println((i+1)+ verbs.get(i) +" "+ nouns.get(i));
            }
            String input;
            input = in.nextLine().toLowerCase();
            String[] parts = input.split("\\s+");
            if (parts.length == 2) {

                if(verbs.contains(parts[0].toLowerCase())){
                    truth = false;
                    return parts;
                }
                else{
                    out.println("Invalid command, Check for the following things: verb and noun order/ pronunciation of the words/ make sure there are no more than 2 words/ or the verb is not available at the moment");
                }
            }
            else{
                out.println("Invalid command, Check for the following things: verb and noun order/ pronunciation of the words/ make sure there are no more than 2 words/ or the verb is not available at the moment");
            }
        }
        return null;
    }

    public void error(){
        out.println("Not a valid action try again!!!");
    }

}

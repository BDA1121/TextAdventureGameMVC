import java.util.ArrayList;
/**
 * the controller code revolves around doctor Dym's sample code
 * for example the while loop and things
 * the if condition was introduced for the initial and final conditions and to grab enum
 *
 * the interface and functions enum syntax was referred from here https://www.tutorialspoint.com/can-enum-implements-an-interface-in-java#:~:text=Yes%2C%20Enum%20implements%20an%20interface,a%20given%20object%20or%20class.
 *
 * the implementation of list<objects> and arraylists was referred from here https://www.geeksforgeeks.org/difference-between-list-and-arraylist-in-java/
 * */
public class Controller {

    private Model model;
    private View view;



    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void letsGo(){

        while(this.model.getExitGame()){
            if(this.model.getStatus()==null){
                this.model.setStoryLine("Welcome to the adventure!\n" +
                        "\n" +
                        "After a hearty dinner, you tread the familiar path to your room. Another typical day fades behind, with books awaiting your attention. Yet, a veil of weariness weighs upon you.");
            }
            else{
                Object storyLine = this.model.getGameFlow().get(1);

                this.model.setStoryLine((String) storyLine);
            }
            this.view.storyline(this.model.getStoryLine());
            Object verbs = this.model.getGameFlow().get(3);
            Object status = this.model.getGameFlow().get(2);
            Object noun = this.model.getGameFlow().get(5);

            this.model.setStatus((String) status);
            String[] input = view.actionInput((ArrayList<String>) verbs,(ArrayList<String>) noun);
            try {
                Location location = Location.valueOf(this.model.getStatus());
                this.model.setGameFlow(location.execute(this.model.getGameFlow(), input));
            } catch (IllegalArgumentException e){
                this.view.error();
            }
            if(!this.model.getExitGame()){
                Object storyLine = this.model.getGameFlow().get(1);
                this.view.storyline((String) storyLine);
            }

        }
    }
}

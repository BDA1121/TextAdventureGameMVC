import java.util.*;
/**
 * the controller code revolves around doctor Dym's sample code
 * for example the while loop and things
 * the if condition was introduced for the initial and final conditions and to grab enum
 *
 * the interface and functions enum syntax was referred from here https://www.tutorialspoint.com/can-enum-implements-an-interface-in-java#:~:text=Yes%2C%20Enum%20implements%20an%20interface,a%20given%20object%20or%20class.
 *
 * the implementation of list<objects> and arraylists was referred from here https://www.geeksforgeeks.org/difference-between-list-and-arraylist-in-java/
 * */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(System.out, System.in);
        Controller controller = new Controller(model, view);
        controller.letsGo();
    }
}
import java.util.List;

public enum Location {
    START(new StartLocation()),
    HOGWARTS(new Hogwarts()),
    CHAMBERS(new Chambers()),
//    PRISON(new Prison()),
    ENDZONE(new Endzone());
    private final Action action;

    Location(Action action){
        this.action = action;
    }
    public List<Object> execute(List<Object> gameFlow,String[] input){
        return action.execute(gameFlow,input);

    }
}

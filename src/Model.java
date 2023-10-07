import java.util.*;
public class Model {
    private String storyLine;
    private List<Object> gameFlow = new ArrayList<>(){{
        add(Boolean.TRUE);
        add("SampleString");
        add("START");
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("sleep");
        stringList.add("study");
        add(stringList);
        add(Boolean.FALSE);
        ArrayList<String> nounList = new ArrayList<>();
        nounList.add("first");
        nounList.add("first");
        add(nounList);
    }};

    private String Status;
    private  Boolean exitGame = Boolean.TRUE;


    public Boolean getExitGame(){
        return this.exitGame;
    }

    public String getStoryLine(){
        return this.storyLine;
    }

    public void setStoryLine(String story){
        this.storyLine = story;
    }

    public String getStatus(){
        return this.Status;
    }

    public void setStatus(String status){
        this.Status = status;
    }

    public List<Object> getGameFlow(){return this.gameFlow;}

    public void setGameFlow(List<Object> updateFlow){
        this.gameFlow = updateFlow;
        Object obj = this.getGameFlow().get(0);
        this.exitGame = (Boolean) obj;
    }

}

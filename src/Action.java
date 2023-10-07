import java.util.List;

public interface Action {
    List<Object> execute(List<Object> gameFlow,String[] input);
}


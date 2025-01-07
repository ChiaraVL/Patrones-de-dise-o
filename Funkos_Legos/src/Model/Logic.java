package Model;

public class Logic {
    private Director d = Director.getInstance();

    public Director call(){
        return d;
    }
}

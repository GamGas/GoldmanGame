package goldman.controller;

public class MoveHandler {
    private static MoveHandler INSTANCE = null;
    private MoveHandler(){}
    public static  MoveHandler getInstance(){
        if(INSTANCE == null){
            INSTANCE = new MoveHandler();
        }
        return INSTANCE;
    }
}

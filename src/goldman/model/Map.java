package goldman.model;

import java.io.File;

public class Map {

    private static Map INSTANCE = null;
    private Coordinate[][] gameArea = null;


    private Map(){}
    public static synchronized Map getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new Map();
            return INSTANCE;
        }else {
            return INSTANCE;
        }
    }

    public boolean parseMap(File fileToParse){
        return false;
        //Этот метод будет парсить карту из файла, и инициализирует gameArea. Вернёт True
        //Если gameArea уже задана, вернёт False
    }

}

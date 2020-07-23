package goldman;

import goldman.controller.GuiHandler;
import goldman.controller.MapParser;
import goldman.model.Coordinate;
import goldman.view.MenuGUI;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Goldman {
    public static void main(String[] args) throws IOException {
        GuiHandler handler = GuiHandler.getInstance();
        handler.displayMainMenu();

//        MapParser parser = new MapParser();
//        Coordinate[][] coords = parser.parseMap();
//
//        for (Coordinate[] coord : coords) {
//            for (Coordinate coordinate : coord) {
//                System.out.print(coordinate);
//            }
//            System.out.println();
//        }

    }

}

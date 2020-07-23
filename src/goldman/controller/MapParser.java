package goldman.controller;

import goldman.model.Coordinate;
import goldman.model.Item;
import goldman.model.ItemTypes;
import goldman.model.Player;

import java.io.*;
import java.util.ArrayList;

public class MapParser {
    File map;
    BufferedReader bufferedReader;

    public MapParser() throws FileNotFoundException {
        map = new File("src\\goldman\\assets\\map\\map.txt");
        bufferedReader = new BufferedReader(new FileReader(map));
    }

    public Coordinate[][] parseMap() throws IOException {
        ArrayList <String[]> nonParsedCoordinates = new ArrayList();
        String[] rowsArray;
        int rowsCounter = 0,
                colsCounter = 0;

        while (bufferedReader.ready()){
            rowsArray = bufferedReader.readLine().split(",");
            colsCounter = rowsArray.length;
            nonParsedCoordinates.add(rowsArray);
            rowsCounter++;
        }
        bufferedReader.close();
        Coordinate[][] coordinates = new Coordinate[rowsCounter][colsCounter];
        int i = 0;
        for (String[] nonParsedCoordinate : nonParsedCoordinates) {
            int j = 0;
            for (String s : nonParsedCoordinate) {
                Item item = ItemFactory.getInstance().getItem(ItemTypes.valueOf(s));
                coordinates[i][j] = new Coordinate(item);
                j++;
            }
            i++;
        }
        return coordinates;
    }
}

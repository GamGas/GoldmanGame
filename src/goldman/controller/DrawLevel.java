package goldman.controller;

import goldman.controller.MapParser;
import goldman.model.Coordinate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DrawLevel {
    public static void drawLevel(DefaultTableModel tModel) throws IOException {
        MapParser parser = new MapParser();
        Coordinate[][] map = parser.parseMap();
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                Icon icon = map[row][col].getIcon();
                tModel.setValueAt(icon, row, col);
            }
        }
    }
}

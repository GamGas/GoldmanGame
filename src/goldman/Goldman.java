package goldman;

import goldman.controller.ItemFactory;
import goldman.controller.MotionHandler;
import goldman.model.Coordinate;
import goldman.model.ItemTypes;
import goldman.view.GameGUI;
import goldman.view.MenuGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Goldman {
    public static void main(String[] args) {
//        MenuGUI menuGUI = new MenuGUI();
//        menuGUI.setVisible(true);
        GameGUI gameGUI = new GameGUI();
        gameGUI.setVisible(true);
    }

}

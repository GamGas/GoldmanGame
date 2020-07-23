package goldman.controller;

import goldman.view.GameGUI;
import goldman.view.MenuGUI;

import javax.swing.*;
import java.io.IOException;

public class GuiHandler {

    /**
     * GuiHandler it is a Java singleton class that controls
     * the display of windows in an application, calling functions
     * to set the visibility, or calling dispose when the window is no longer needed.
     */

    private static GuiHandler INSTANCE = null;
    private JFrame gameGui, menuGui;

    public static GuiHandler getInstance() {
        if (INSTANCE == null)
            INSTANCE = new GuiHandler();
        return INSTANCE;
    }


    public void displayGameMenu(JFrame previousGui) throws IOException {
        if (gameGui == null)
            gameGui = new GameGUI();
        previousGui.setVisible(false);
        gameGui.setVisible(true);
    }

    /**
     * displayMainMenu () is an overridden Java method that
     * is triggered when the application is initialized,
     * or when switching between application windows
     */

    public void displayMainMenu() {
        if (menuGui == null)
            menuGui = new MenuGUI();
        menuGui.setVisible(true);
    }

    public void displayMainMenu(JFrame previousGui) {
        if (menuGui == null)
            menuGui = new MenuGUI();
        previousGui.dispose();
        menuGui.setVisible(true);
    }
}

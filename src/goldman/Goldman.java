package goldman;

import goldman.controller.GuiHandler;
import goldman.view.MenuGUI;

public class Goldman {
    public static void main(String[] args) {
        GuiHandler handler = GuiHandler.getInstance();
        handler.displayMainMenu();

    }

}

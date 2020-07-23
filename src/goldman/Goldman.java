package goldman;

import goldman.controller.GuiHandler;

public class Goldman {
    public static void main(String[] args) {
        GuiHandler handler = GuiHandler.getInstance();
        handler.displayMainMenu();

    }

}

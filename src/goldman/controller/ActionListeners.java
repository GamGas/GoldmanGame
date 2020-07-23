package goldman.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListeners {

    public  ActionListeners(){}

    public static class QuitAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }


}

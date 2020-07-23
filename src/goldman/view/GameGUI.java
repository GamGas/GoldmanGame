package goldman.view;

import javax.swing.*;

public class GameGUI extends JFrame{
    private JPanel contentPane;
    private JButton save_button;
    private JButton exit_button;
    private JPanel panel_main;
    private JPanel panel_controls;
    private JPanel panel_statistic;
    private JPanel panel_actions;
    private JPanel panel_game;
    private JTable game_area;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel_move;

    public GameGUI(){
        setContentPane(contentPane);
        setTitle("Goldman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

}

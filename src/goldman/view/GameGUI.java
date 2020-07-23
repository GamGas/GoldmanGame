package goldman.view;

import goldman.controller.GuiHandler;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

public class GameGUI extends JFrame {
    private JPanel contentPane;
    private JButton game_save;
    private JButton game_quit;
    private JButton move_up;
    private JButton move_stay;
    private JButton move_right;
    private JButton move_left;
    private JButton move_down;
    private JTable game_area;
    private JLabel counter_score;
    private JLabel counter_steps;

    public GameGUI() {
        setContentPane(contentPane);             // Установить панель, которую надо отображать
        setTitle("Goldman");                     // Задаёт текст заголовка окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Устанавливает остановку приложения при нажатии на крестик окна
        setResizable(false);                     // Запрещает изменять размер окна
        pack();                                  // Устанавливает размер окна достаточный для всех компонентов
        setLocationRelativeTo(null);             // Устанавливает положение окна по центру экрана
        game_quit.addActionListener(e -> GuiHandler.getInstance().displayMainMenu(this));
    }


    public static void main(String[] args) {
        GameGUI dialog = new GameGUI();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        game_area = new JTable(12 ,11);
        game_area.setCellSelectionEnabled(false);
        game_area.setRowSelectionAllowed(false);
        game_area.setCellSelectionEnabled(false);
        game_area.setEnabled(false);
        game_area.setRowMargin(0);
        game_area.setRowHeight(20);
        game_area.setSize(new Dimension(220, 240));
        Enumeration <TableColumn> gameAreaColumns = game_area.getColumnModel().getColumns();
        while (gameAreaColumns.hasMoreElements()){
            TableColumn areaColumn = gameAreaColumns.nextElement();
            areaColumn.setPreferredWidth(20);
//            areaColumn.setCellRenderer(null);
        }

    }
}

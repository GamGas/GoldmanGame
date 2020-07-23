package goldman.view;

import goldman.controller.GuiHandler;
import goldman.controller.DrawLevel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.IOException;
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
    private JPanel tablePane;

    static class ImageRenderer extends DefaultTableCellRenderer{
        JLabel lbl = new JLabel();
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            lbl.setIcon((ImageIcon)value);
            lbl.setOpaque(true);
            lbl.setBackground(new Color(0, 0,0, 129));
            return lbl;
        }
    }

    public GameGUI() throws IOException {
        setContentPane(contentPane);
        // Установить панель, которую надо отображать
        setTitle("Goldman");
        // Задаёт текст заголовка окна
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        // Устанавливает отсутствие действия при нажатии на крестик окна
        setResizable(false);
        // Запрещает изменять размер окна
        setLocationRelativeTo(null);
        // Устанавливает положение окна по центру экрана


        game_quit.addActionListener(e -> GuiHandler.getInstance().displayMainMenu(this));
        ImageRenderer renderer = new ImageRenderer();
        Enumeration <TableColumn> gameAreaColumns = game_area.getColumnModel().getColumns();
        while (gameAreaColumns.hasMoreElements()){
            TableColumn areaColumn = gameAreaColumns.nextElement();
            areaColumn.setPreferredWidth(20);
            areaColumn.setCellRenderer(renderer);
        }
        DefaultTableModel tModel = (DefaultTableModel) game_area.getModel();
        DrawLevel.drawLevel(tModel);

        pack();
        // Устанавливает размер окна достаточный для всех компонентов
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


    }

}

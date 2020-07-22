package goldman.view;

import javax.swing.*;

public class MenuGUI extends JFrame {
    private JPanel contentPane;
    private JButton button_start;
    private JButton button_quit;
    private JButton button_load;
    private JButton button_records;

    /**
     * Параметры JButton заданы в одноименном файле с расширением .form
     * IDEA создала его сама, и дизайн рисовался через Swing Gui editor.
     * */

    public MenuGUI() {
        setContentPane(contentPane);             // Установить панель, которую надо отображать
        setTitle("Goldman");                     // Задаёт текст заголовка окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Устанавливает остановку приложения при нажатии на крестик окна
        setResizable(false);                     // Запрещает изменять размер окна
        pack();                                  // Устанавливает размер окна достаточный для всех компонентов
        setLocationRelativeTo(null);             // Устанавливает положение окна по центру экрана
    }

    /**
    * Обращаем внимание на то, что в IDEA, параметры окна вводить отдельным методом
     * не обязательно, все нужные настройки можно прописать в конструкторе.
    * */

    public static void main(String[] args) {
        MenuGUI gui = new MenuGUI();
        gui.setVisible(true);
    }
}

package GUI;


import Main.Main;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private JButton edit = new JButton("Edytuj nową mapę");
    private JButton readMap = new JButton("Wczytaj mapę");
    private final JButton exit = new JButton("Wyjście");
    private final Dimension buttonsSize = new Dimension(200, 50);

    public Panel(int width, int height) {
        setLayout(null);
        //    private JComboBox algoritms =new JComboBox();
        edit.setBounds((width - buttonsSize.width / 2) / 2, height * 1 / 5, buttonsSize.width, buttonsSize.height);
        readMap.setBounds((width - buttonsSize.width / 2) / 2, height * 2 / 5, buttonsSize.width, buttonsSize.height);
        exit.setBounds((width - buttonsSize.width / 2) / 2, height * 3 / 5, buttonsSize.width, buttonsSize.height);

        edit.setBackground(new Color(255, 255, 230));
        readMap.setBackground(new Color(255, 255, 230));
        exit.setBackground(new Color(255, 255, 230));


        add(edit);
        add(readMap);
        add(exit);


        exit.addActionListener(e -> System.exit(0));


    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}

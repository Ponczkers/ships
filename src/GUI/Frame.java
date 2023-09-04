package GUI;

import GUI.Panel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Frame extends JFrame {
    private static Panel startPanel;


    public Frame() {

//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setUndecorated(true);
        setSize(500, 400);
        setAlwaysOnTop(true);


        setVisible(true);
        setLayout(new GridLayout());

        startPanel = new Panel(getWidth(), getHeight());

        setContentPane(startPanel);

    }


    public void refresh() {
        getContentPane().repaint();
    }
}

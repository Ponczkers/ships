package Main;

import GUI.Frame;

import javax.swing.*;

public class Main {
    private static Frame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new Frame();
            }
        });
    }



}

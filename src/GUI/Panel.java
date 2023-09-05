package GUI;


import Main.Main;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private Dimension screenSize;
    private int cellSize = 70;

    private int firstBoardX;
    private int firstBoardY = 100;

    private int secondBoardX;
    private int secondBoardY= 100;

    private JButton start = new JButton("Zacznij grę");
    private JLabel readMap = new JLabel("Twoja kolej");
    private JButton accept = new JButton("Zaakceptuj ruch");
    private final JButton exit = new JButton("Wyjście");
    private final Dimension buttonsSize = new Dimension(200, 50);

    public Panel(int width, int height) {
        setLayout(null);

        screenSize = new Dimension(width, height);
        int gap = (width-4*buttonsSize.width)/3;
        firstBoardX = (width - 2 * cellSize * 10)/3;
        secondBoardX = firstBoardX * 2 + cellSize * 10;

        //    private JComboBox algoritms =new JComboBox();
        start.setBounds(0, 0, buttonsSize.width, buttonsSize.height);
        readMap.setBounds(buttonsSize.width+gap, 0, buttonsSize.width, buttonsSize.height);
        accept.setBounds(2*(buttonsSize.width+gap),0, buttonsSize.width, buttonsSize.height);
        exit.setBounds(3*(buttonsSize.width+gap), 0, buttonsSize.width, buttonsSize.height);

        start.setBackground(new Color(255, 255, 230));
//        readMap.setBackground(new Color(255, 255, 230));
        accept.setBackground(new Color(255, 255, 230));
        exit.setBackground(new Color(255, 255, 230));


        add(start);
        add(readMap);
        add(accept);
        add(exit);


        exit.addActionListener(e -> System.exit(0));


    }


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(new Color(0,0,255));

        g.fillRect(firstBoardX,firstBoardY,10*cellSize,10*cellSize);
        g.fillRect(secondBoardX,secondBoardY,10*cellSize,10*cellSize);

        int boardUp = firstBoardY;
        int boardDown = firstBoardY +10 * cellSize;

        g.setColor(new Color(0,0,0));
        for(int i=0; i <=10; i++){
            //pionowe na lewej planszy
            g.drawLine(firstBoardX + i*cellSize, boardUp, firstBoardX + i*cellSize, boardDown);
            //pionowe na prawej planszy
            g.drawLine(secondBoardX + i*cellSize, boardUp, secondBoardX + i*cellSize, boardDown);

            //poziome na lewej planszy
            g.drawLine(firstBoardX, boardUp + i*cellSize, firstBoardX + 10*cellSize, boardUp + i*cellSize);
            //poziome na prawej planszy
            g.drawLine(secondBoardX, boardUp + i*cellSize, secondBoardX + 10*cellSize, boardUp + i*cellSize);

        }


    }
}

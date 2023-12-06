package MouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myJPanel extends JPanel {
    public Color randomColor(){
        int red= (int) (Math.random()*256);
        int green= (int) (Math.random()*256);
        int blue= (int) (Math.random()*256);
        return new Color(red,green,blue);
    }

public myJPanel(){
        setBackground(randomColor());
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setBackground(randomColor());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(randomColor());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(randomColor());
            }
        });
}

public static void main(String[] arg){
        JFrame jf= new JFrame("Colorful Worlds");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane= jf.getContentPane();
        pane.setLayout( new GridLayout(5,5));
        jf.setSize(300,300);
        jf.setVisible(true);
        for(int i=0;i<25;i++){
            pane.add(new myJPanel());
        }


}

}

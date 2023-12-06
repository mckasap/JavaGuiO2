package MouseEvents;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdaptor extends MouseAdapter {

    myJPanel jp;

 public    MyMouseAdaptor(myJPanel jp){
     this.jp=jp;
     jp.addMouseMotionListener(this);
 }
    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        jp.setBackground(jp.randomColor());
    }
}

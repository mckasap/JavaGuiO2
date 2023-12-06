import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGuiWithLogo extends JFrame {
    private JLabel lbl;
    private JRadioButton rbCelcius;
    private JRadioButton rbFahren;
    private ButtonGroup btngrp;
    private JTextField tfInput;
    private JButton btn;

private ImageIcon icon;

public  class myTiklandi implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

                if(rbCelcius.isSelected()){


                    try {
                        double Fahren= Double.parseDouble(tfInput.getText());
                        lbl.setText(""+((Fahren -32)/1.8));
                    }catch (Exception ex){


                    }



                }else{

                    try {
                        double Cel = Double.parseDouble(tfInput.getText());
                        lbl.setText("" + (Cel * 1.8 + 32));
                    }
                    catch(Exception ex){


                    }
                }


            }
        }




    public MyGuiWithLogo(String title)  {
   btngrp= new ButtonGroup();
        setTitle(title);
        icon = new ImageIcon(getClass().getResource("logo.png"));
        btn= new JButton("Click me my Friend");
        rbCelcius= new JRadioButton("Celcius");
        rbFahren= new JRadioButton("Fahrenheit");

        lbl= new JLabel(icon);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout( new FlowLayout());
        myTiklandi t= new myTiklandi();
        btn.addActionListener(t);
        rbCelcius.addActionListener(t);
        rbFahren.addActionListener(t);

        tfInput= new JTextField(5);

        btngrp.add(rbCelcius);
        btngrp.add(rbFahren);
        rbCelcius.setSelected(true);
        add(lbl);
        add(tfInput);

        add(btn);

        add(rbCelcius);
        add(rbFahren);

    }

}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SSample1_1 extends JFrame{
  public static void main(String args[]){
    SSample1_1 frame = new SSample1_1("タイトル");
    frame.setVisible(true);
  }

  SSample1_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //パネルの端の色を設定
    JPanel p1 = new JPanel();
    p1.setBackground(Color.BLUE);

    JPanel p2 = new JPanel();
    p2.setBackground(Color.ORANGE);
    
    JPanel p3 = new JPanel();
    p3.setBackground(Color.RED);
    
    JPanel p4 = new JPanel();
    p4.setBackground(Color.GREEN);
    
    //設定した色を好きな方角に指定
    Container contentPane = getContentPane();
    contentPane.add(p1, BorderLayout.NORTH);
    contentPane.add(p2, BorderLayout.SOUTH);
    contentPane.add(p3, BorderLayout.EAST);
    contentPane.add(p4, BorderLayout.WEST);
  }
}
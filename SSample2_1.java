import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

class SSample2_1 extends JFrame{
  public static void main(String args[]){
    SSample2_1 frame = new SSample2_1("タイトル");
    frame.setVisible(true);
  }

  SSample2_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new FlowLayout());

    //パネルのサイズ設定
    JPanel p1 = new JPanel();
    p1.setPreferredSize(new Dimension(200, 50));
    p1.setBackground(Color.BLUE);

    JPanel p2 = new JPanel();
    p2.setPreferredSize(new Dimension(50, 200));
    p2.setBackground(Color.ORANGE);
    p2.setOpaque(false);

    //枠線の設定
    BevelBorder border1 = new BevelBorder(BevelBorder.RAISED);
    p1.setBorder(border1);
    
    BevelBorder border = new BevelBorder(BevelBorder.RAISED);
    p2.setBorder(border);

    Container contentPane = getContentPane();
    contentPane.add(p1);
    contentPane.add(p2);
  }
}
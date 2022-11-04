import java.awt.*;
import javax.swing.*;
class ColorDemo extends JFrame
{
Button b1,b2;
ColorDemo()
{
b1=new Button("first");
b2=new Button("secound");
b1.setBackground(Color.red);
b2.setBackground(Color.blue);
b1.setForeground(Color.white);
b2.setForeground(Color.green);
add(b1);
add(b2);
getContentPane().setBackground(Color.cyan);
setLayout(new FlowLayout());
setVisible(true);
setSize(400,400);
}
public static void main(String[] args)
{
new  ColorDemo();
}
}

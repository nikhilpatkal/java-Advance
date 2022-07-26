import java.awt.*;
import java.awt.event.*;
class calculator implements ActionListener
{
	
Frame f;
Label L1,L2,L3;
TextField T1,T2,T3;
Button b1,b2,b3,b4;
calculator()
{
f=new Frame();
L1=new Label("enter 1 no");
L2=new Label("enter 2 no");
L3=new Label("result");
T1=new TextField(10);
T2=new TextField(10);
T3=new TextField(10);
b1=new Button("+");
b2=new Button("-");
b3=new Button("*");
b4=new Button("/");
f.add(L1);f.add(T1);
f.add(L2);f.add(T2);
f.add(L3);f.add(T3);
f.add(b1);f.add(b2);
f.add(b3);
f.add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
f.setLayout(new FlowLayout());
f.setSize(200,200);
f.setLocation(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
int a=Integer.parseInt(T1.getText());
int b=Integer.parseInt(T2.getText());
int c=0;
if(ae.getSource()==b1)
{
c=a+b;
}
if(ae.getSource()==b2)
{
c=a-b;
}
if(ae.getSource()==b3)
{
c=a*b;
}
if(ae.getSource()==b4)
{
c=a/b;
}
T3.setText(""+c);
}
public static void main(String [] args)
{
new calculator();
}
}


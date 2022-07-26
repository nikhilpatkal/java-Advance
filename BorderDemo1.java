import java.awt.*;
class BorderDemo1
{
BorderDemo1()
{
	Frame f=new Frame();
//f.setLayout(new BorderLayout());
f.add(new Button("top"),"North");
f.add(new Button("bottom"),"South");
 f.add(new Button("left"),"West");
f.add(new Button("right"),"East");
f.setVisible(true);
f.setLocation(400,400);
f.setSize(300,300);
f.setTitle("borderlayout");
}
public static void main(String[] args)
{
new BorderDemo1();
}
}

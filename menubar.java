import java.awt.*;
import java.awt.event.*;

class nikhil extends Frame
{

MenuBar b1;
Menu m1,m2,m3,m4,m5;
Choice subject;
Checkbox c1,c2,c3,c4,c5,c6;
TextField t1,t2;
TextArea a1;
Label l1;
nikhil()
{
t1=new TextField(20);
t2=new TextField(20);
t2.setBackground(Color.pink);
l1=new Label("type here");

a1=new TextArea();
a1.setBackground(Color.red);
t1.setBounds(100,100,300,300);
b1=new  MenuBar();
m1=new Menu("file");

m2=new Menu("View");
m3=new Menu("Encoding");
m4=new  Menu("Window");
m5=new Menu("Run");
subject=new Choice();
MenuItem newItem=new MenuItem("new");
MenuItem saveItem=new MenuItem("save");
MenuItem SaveASItem=new MenuItem("SaveAS");
MenuItem SearchItem=new MenuItem("Search");
MenuItem DeletItem=new MenuItem("Delet");
MenuItem ToolsItem=new MenuItem("Tools");
MenuItem OpenItem=new MenuItem("Open");
MenuItem StyleItem=new MenuItem("Style");
MenuItem ExitsItem=new MenuItem("Exsit");

MenuItem ANSIItem=new MenuItem("ANSI");
MenuItem UTFItem=new MenuItem("UTF");
MenuItem CharcterItem=new MenuItem("Charcter");
MenuItem ConvertASNIItem=new MenuItem("ConvertASNI");

MenuItem clientItem=new MenuItem("client.java");
MenuItem asciiItem=new MenuItem("ascii.java");
MenuItem matrixItem=new MenuItem("matrix.java");

MenuItem helpItem=new MenuItem("help");
MenuItem RunAnyWayItem=new MenuItem("RunAnyWay");
MenuItem xyzItem=new MenuItem("xyz");

subject.add("java");

subject.add("c-lanuage");
subject.add("PHP");
subject.add("R-lanuage");
subject.add("javaScript");
subject.add("AdvJava");
subject.add("DSA");
subject.add("Python");

c1=new Checkbox("nikhil");

c1.setBackground(Color.orange);
c2=new Checkbox("kanifnath");

c3=new Checkbox("Aniket");
c3.setBackground(Color.green);

c4=new Checkbox("anirudha");
c5=new Checkbox("umesh");

c5.setBackground(Color.pink);
c6=new Checkbox("Akil");


m1.add(newItem);
m1.add(saveItem);
m1.add(SaveASItem);
m1.add(SearchItem);
m1.add(DeletItem);
m2.add(ToolsItem);
m2.add(OpenItem);
m2.add(StyleItem);
m2.add( ExitsItem);
m3.add(ANSIItem);
m3.add(UTFItem);
m3.add(CharcterItem);
m3.add(ConvertASNIItem);

m4.add(clientItem);
m4.add(asciiItem);
m4.add(matrixItem);
m5.add(helpItem);
m5.add(RunAnyWayItem);
m5.add(xyzItem);

b1.add(m1);
b1.add(m2);
b1.add(m3);
b1.add(m5);
b1.add(m4);


setMenuBar(b1);
add(c1);
add(c2);
add(c3);
add(c4);
add(c5);
add(c6);
add(t1);
add(t2);
add(subject);
add(l1);
add(a1);
//getContentPane().setBackground(Color.black);
setLayout(new FlowLayout());
setVisible(true);
setSize(400,400);
//setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args)
{
	new nikhil();
}
}




import java.awt.*;
import java.awt.event.*;
class ListDemo extends Frame implements ActionListener
{
	Label l;
	List L;
	TextField T;
	Button B;
	ListDemo()
	{
    setLayout(new FlowLayout());
	L=new List();
	T=new TextField(10);
	B=new Button("add");
	add(L);
	add(T);
	add(B);
	
	B.addActionListener(this);
	setSize(400,400);
	setVisible(true);
	setTitle("List_TextField");
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(T.getText().length()>0)
			L.add(T.getText());
		T.setText("");
	}
	public static void main(String[] args)
	{
		new ListDemo();
	}
}

	
		
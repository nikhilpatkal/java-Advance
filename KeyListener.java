import java.awt.*;
import java.awt.event.*;
class KeyListenerDemo extends Frame implements KeyListener
{
	Label l1;
	TextField t1;
	KeyListenerDemo()
	{
		super("key listener");
		//creating memory for label
		l1=new Label("hi");
		
		//creating memory for Textfield
		t1=new TextField(10);
		add(l1);
		add(t1);
		t1.addKeyListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		
	}
	public void keyRelesed(KeyEvent ke)
	{
		l1.setText("key relesed");
	}
	public void keyTyped(KeyEvent ke)
	{
		l1.setText("key type");
	}
	public void keyPressed(KeyEvent ke)
	{
		l1.setText("key pressed");
	}
	public static void main(String [] args)
	{
		new KeyListenerDemo();
	}
}

	
	
		
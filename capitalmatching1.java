import java.awt.*;
import java.awt.event.*;
class Capitalmatching1 extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	Label L1;
	Capitalmatching1()
	{
		super("checkbox");
		
		CheckboxGroup cg1=new CheckboxGroup();
		CheckboxGroup cg2=new CheckboxGroup();
		
		
		c1=new Checkbox("mumbai",cg1,false);
		c2=new Checkbox("Amravati",cg1,false);
		c3=new Checkbox("patna",cg1,false);
		c4=new Checkbox("jaipur",cg1,false);
		
		//creating memory for secound colum 
		c5=new Checkbox("Andrapradesh",cg2,false);
		c6=new Checkbox("Bihar",cg2,false);
		c7=new Checkbox("maharastra",cg2,false);
		c8=new Checkbox("rajastan",cg2,false);
		
		 //creating seprat panel for first group
		 Panel p1=new Panel();
		 p1.setLayout(new GridLayout(4,1));
		 p1.add(c1);
		 p1.add(c2);
		 p1.add(c3);
		 p1.add(c4);
		 add(p1);
		 
		 //creating panel for secund group
		 Panel p2=new Panel();
		 p2.setLayout(new GridLayout(4,1));
		 p2.add(c5);
		 p2.add(c6);
		 p2.add(c7);
		 p2.add(c8);
		 add(p2);
		 
		 //creating memory for seprat panel
		 Panel p3=new Panel();
		 p3.add(p1);
		 p3.add(p2);
		 add(p3);
		 
		 //creating panel for caption panel
		 Panel p4=new Panel();
		 L1=new Label("stat capital");
		 p4.add(L1);
		 add(p4,BorderLayout.NORTH);
		 
		 c1.addItemListener(this);
		 c2.addItemListener(this);
		 c3.addItemListener(this);
		 c4.addItemListener(this);
         c5.addItemListener(this);
		 c6.addItemListener(this);
		 c7.addItemListener(this);
		 c8.addItemListener(this);		 
		 setVisible(true);
		 setSize(400,400);
		 setLocatioion(200,200);
		 
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
			c7.setState(true);
		if(ie.getSource()==c2)
			c5.setState(true);
		if(ie.getSource()==c3)
			c6.setState(true);
		if(ie.getSource()==c4)
			c7.setState(true);
	}
	public static void main(String[] args)
	{
		new Capitalmatching1();
	}
}

		 
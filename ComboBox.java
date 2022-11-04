import java.awt.*;
import java.awt.event.*;
import java.awt.Choice;
class ComboBox extends Frame implements ItemListener
{
	Choice subject;
	TextField txt;
	ComboBox()
	{
		super("combobox program");
		//creating memory for choise mens combobox
		subject=new Choice();
		//creating memory for text 
		txt=new TextField(20);
		
		subject.add("math");
		subject.add("English");
		subject.add("science");
		subject.add("marathi");
		subject.add("social sciance");
		subject.add("Hindi");
		add(subject);
		add(txt);
		subject.addItemListener(this);
		setLayout(new FlowLayout());
		set.Size(400,400);
		set.Visible(true);
	}
	public void itemStatChanged(ItemEvent ie)
	{
		txt.setText(subject.getSelectedItem());
	}
	public static void main(String[] args)
	{
		new ComboBox();
	}
}
		
		
		
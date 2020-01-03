package model;


import javax.swing.*;
import java.awt.*;
public class GraphicTest extends JFrame{
	
	private JLabel item1;
	public GraphicTest(String message) {
		super(message);
		setLayout(new GridBagLayout());
	}
	public JLabel getItem1() {
		return item1;
	}
	public void setItem1(JLabel item1) {
		this.item1 = item1;
		
	}
	
}

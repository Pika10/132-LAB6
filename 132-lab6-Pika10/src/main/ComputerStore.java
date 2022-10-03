package main;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;

import computer.Computer;

public class ComputerStore extends JFrame{
	
	
	
	private ArrayList<Computer> computers;
	
	private final JTextField textField1;
	private final JLabel jLabel1;
	public ComputerStore() {
		super();
		setLayout(new FlowLayout());
		computers = new ArrayList<Computer>();
		jLabel1=new JLabel("Please press Enter after you write the filter name (wearable or portable");
		add(jLabel1);
		textField1=new JTextField(20);
		add(textField1);
		this.setSize(500,100 );
		this.setVisible(true);
		
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
	
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public void listComputers() {
		for(Computer computer: computers) {
			System.out.println(computer);
		}
	}
private class TextFieldHandler implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		
		if (event.getSource()==textField1)
		{	
			String x=textField1.getText();
		
			if (x.equals("wearable"))
			{
				System.out.println("Wearable computers:");
				for (Computer computer: computers)
				{
					if (computer.isWearable())
					{
						System.out.println(computer);
					}
				}
				event.getActionCommand();
				}
			else if (x.equals("portable"))
			{
				System.out.println("Portable computers:");
				for (Computer computer: computers)
				{
					if (computer.isPortable())
					{
						System.out.println(computer);
					}
				}
				event.getActionCommand();
			}
			
		}
	}
	
}
}

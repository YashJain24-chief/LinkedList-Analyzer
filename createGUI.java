import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/*
 Started on 29th Dec 2020.
 
 Author: Yash Jain, doing 5th SEM in Computer Engineering(with Data Science specialization) at Presidency University.
 
 Built an interface using java AWT and Swing wherein users can give their inputs in interface and perform various 
 LinkedList data structure operations on button clicks
 */

class MyFrame extends Frame implements ActionListener
{
	LinkedList<Integer> llist=new LinkedList<Integer>();
	JButton button[]=new JButton[12];
	JLabel label[]=new JLabel[6];
	JTextField textfield[]=new JTextField[6];
	
	//Method to clear inputs from the TextFields
	void reset()
	{
		textfield[0].setText("");
		textfield[1].setText("");
		textfield[2].setText("");
		textfield[3].setText("");
		textfield[4].setText("");
		textfield[5].setText("");
	}
	
	//Constructor
	MyFrame()
	{
		super("LinkedList Analyzer");
		
		//Instantiating all JButton
		button[0]=new JButton("Insert");
		button[1]=new JButton("Insert at Position");
		button[2]=new JButton("Display");
		button[3]=new JButton("Display from a Position");
		button[4]=new JButton("Display in Reverse");
		button[5]=new JButton("Swap Two Elements");
		button[6]=new JButton("Remove given Element");
		button[7]=new JButton("Position of Elements");
		button[8]=new JButton("Search");
		button[9]=new JButton("Clear");
		button[10]=new JButton("Insert Front");
		button[11]=new JButton("Remove Front");
		
		//Instantiating all JLabel
		label[0]=new JLabel("    1. Enter an element");
		label[1]=new JLabel("    2. Enter the position");
		label[2]=new JLabel("    3. Enter 1st position to swap");
		label[3]=new JLabel("    4. Enter 2nd position to swap");
		label[4]=new JLabel("    5. Enter an element to remove");
		label[5]=new JLabel("    6. Enter the Search element");
		
		//Instantiating all JTextField
		textfield[0]=new JTextField();
		textfield[1]=new JTextField();
		textfield[2]=new JTextField();
		textfield[3]=new JTextField();
		textfield[4]=new JTextField();
		textfield[5]=new JTextField();
		
		//Setting a layout for the frame
		setLayout(new GridLayout(12,2));
		
		//Adding the components to Frame
		add(label[0]);
		add(textfield[0]);
		
		add(label[1]);
		add(textfield[1]);
		
		add(label[2]);
		add(textfield[2]);
		
		add(label[3]);
		add(textfield[3]);
		
		add(label[4]);
		add(textfield[4]);
		
		add(label[5]);
		add(textfield[5]);
		
		add(button[0]);
		add(button[10]);
		add(button[1]);
		add(button[2]);
		add(button[3]);
		add(button[4]);
		add(button[5]);
		add(button[11]);
		add(button[6]);
		add(button[7]);
		add(button[8]);
		add(button[9]);
		
		//Adding ActionListener to the button, to make to respond when a Button event is generated
		button[0].addActionListener(this);
		button[1].addActionListener(this);
		button[2].addActionListener(this);
		button[3].addActionListener(this);
		button[4].addActionListener(this);
		button[5].addActionListener(this);
		button[6].addActionListener(this);
		button[7].addActionListener(this);
		button[8].addActionListener(this);
		button[9].addActionListener(this);
		button[10].addActionListener(this);
		button[11].addActionListener(this);
		
		//Setting Font style and Size of JLabel
		label[0].setFont(new Font("Serif", Font.BOLD, 16));
		label[1].setFont(new Font("Serif", Font.BOLD, 16));
		label[2].setFont(new Font("Serif", Font.BOLD, 16));
		label[3].setFont(new Font("Serif", Font.BOLD, 16));
		label[4].setFont(new Font("Serif", Font.BOLD, 16));
		label[5].setFont(new Font("Serif", Font.BOLD, 16));
		
		//Setting Font Style and Size of JButton 
		button[0].setFont(new Font("Serif", Font.BOLD, 16));
		button[1].setFont(new Font("Serif", Font.BOLD, 16));
		button[2].setFont(new Font("Serif", Font.BOLD, 16));
		button[3].setFont(new Font("Serif", Font.BOLD, 16));
		button[4].setFont(new Font("Serif", Font.BOLD, 16));
		button[5].setFont(new Font("Serif", Font.BOLD, 16));
		button[6].setFont(new Font("Serif", Font.BOLD, 16));
		button[7].setFont(new Font("Serif", Font.BOLD, 16));
		button[8].setFont(new Font("Serif", Font.BOLD, 16));
		button[9].setFont(new Font("Serif", Font.BOLD, 16));
		button[10].setFont(new Font("Serif", Font.BOLD, 16));
		button[11].setFont(new Font("Serif", Font.BOLD, 16));
		
		//Adding a WindowListener to close the frame when "Close" button is clicked
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
	}
	
	//Performing Actions on each JButton
	@Override
	public void actionPerformed(ActionEvent e) 
	{
			//Insertion
			if(e.getSource()==button[0])
			{
				if(textfield[0].getText().isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Enter your element into TextField 1");
				}
				else
				{
				int number=Integer.parseInt(textfield[0].getText());
				llist.add(number);
				JOptionPane.showMessageDialog(this,"Sucessfully added to list");
				}
				reset();
			}
	
		//Inserting at a particular position
		else if(e.getSource()==button[1])
		{
			if(textfield[0].getText().isEmpty()||textfield[1].getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Check if you have entered the element and the position");
			}
			else
			{
				int number1=Integer.parseInt(textfield[0].getText());
				int position1=Integer.parseInt(textfield[1].getText());
				if(position1>llist.size()||position1<0)
				{
					JOptionPane.showMessageDialog(this,"Enter a Valid Position");
				}
				else
				{
					llist.add(position1, number1);
					JOptionPane.showMessageDialog(this,"Sucessfully added to list at a particular position");
				}
			}
			reset();
		}
			
		//Dispalying the list
		else if(e.getSource()==button[2])
		{
			JOptionPane.showMessageDialog(this,"Your Updated List is: "+llist);
		}
		else if(e.getSource()==button[3])
		{
			if(textfield[1].getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Check if a position is given ");
			}
			else
			{
				int position2=Integer.parseInt(textfield[1].getText());
				if(position2>llist.size()-1)
				{
					JOptionPane.showMessageDialog(this,"Enter a position less than: "+ llist.size());
				}
				else
				{
					String str1="";
					for(int i=position2;i<llist.size();i++)
					{
						str1=str1+llist.get(i)+" ";
					}
			JOptionPane.showMessageDialog(this,"Your List from a specific position is: "+str1);
				}
			}
			reset();
		}
			
		//Displaying list in Reverse order
		else if(e.getSource()==button[4])
		{
			String str2="";
			for(int i=llist.size()-1;i>=0;i--)
			{
				str2=str2+llist.get(i)+" ";
			}
			JOptionPane.showMessageDialog(this,"Your List in Reverse Order is: "+str2);
		}
			
		//Swapping two Elements
		else if(e.getSource()==button[5])
		{
			if(textfield[2].getText().isEmpty()||textfield[3].getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Check if you have given Both the position in Textfield 3 and TextField 4 ");
			}
			else
			{
				int position3=Integer.parseInt(textfield[2].getText());
				int position4=Integer.parseInt(textfield[3].getText());
				if(position3> llist.size()-1 || position4> llist.size()-1 || position3<=-1 || position4<= -1)
				{
					JOptionPane.showMessageDialog(this,"Enter a valid Number");
				}
				else
				{
					Collections.swap(llist,position3,position4);
					JOptionPane.showMessageDialog(this,"Your List After Swapping: "+llist);
				}
			}
			reset();
		}
			
		//Removing a Particular element
		else if(e.getSource()==button[6])
		{
			if(textfield[4].getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Enter an Element into"+" TextField 5");
			}
			else
			{
				int remove=Integer.parseInt(textfield[4].getText());
				for(int rem=0;rem<llist.size();rem++)
				{
					if(llist.get(rem)==remove)
					{
						llist.remove(rem);
						JOptionPane.showMessageDialog(this,"Your List After Removing a specific Element "+llist);
					}
//					else if(llist.get(rem)!=remove)
//					{
//						JOptionPane.showMessageDialog(this,"Enter a Valid Element");
//					}
				}
			}
			reset();
		}
			
		//Displaying the position of elements in list
		else if(e.getSource()==button[7])
		{
				String str3="";
				for(int i = 0; i<llist.size();i++)
				{
					str3 =str3+llist.get(i)+"  at position "+i+"\n";
				}
				JOptionPane.showMessageDialog(this,str3);	
		}
			
		//Searching an element 
		else if(e.getSource()==button[8])
		{
			if(textfield[5].getText().isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Enter your Search element into TextField 6");
			}
			else
			{
				int searchElement=Integer.parseInt(textfield[5].getText());
				for(int i=0;i<llist.size();i++)
				{
					if(llist.get(i)==searchElement)
					{
						JOptionPane.showMessageDialog(this,"Your element "+textfield[5].getText()+" is present at position "+i);
						
					}
	//				else
	//				{
	//					JOptionPane.showMessageDialog(this,"Element not present in the List");
	//				}
				}
			}
			reset();
		}
			
		//Clearing the inputs from the TextFields
		else if(e.getSource()==button[9])
		{
			textfield[0].setText("");
			textfield[1].setText("");
			textfield[2].setText("");
			textfield[3].setText("");
			textfield[4].setText("");
			textfield[5].setText("");
		}
			
		//Insertion at Front
		else if(e.getSource()==button[10])
		{
				if(textfield[0].getText().isEmpty())
				{
					JOptionPane.showMessageDialog(this,"Enter your element into 1st TextField");
				}
				else
				{
				int number4=Integer.parseInt(textfield[0].getText());
				llist.addFirst(number4);
				JOptionPane.showMessageDialog(this,"Sucessfully added to the List at Front");
				}
				reset();
		}
			
		//Remove at Front
		else if(e.getSource()==button[11])
		{
			if(llist.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"List is Empty");
			}
			else
			{
						llist.removeFirst();
						JOptionPane.showMessageDialog(this,"Sucessfully removed an element from front");
			}
			reset();
		}
	}
}

//Main Class
public class createGUI {
	public static void main(String args[])
	{
		//Instantiating the Frame class
		MyFrame myframe=new MyFrame();
		
		//Setting size of your Frame
		myframe.setSize(650,500);
		
		//Disabling the "Maximize" button of the Frame 
		myframe.setResizable(false);
		
		//Setting the Frame to be visible on execution
		myframe.setVisible(true);
	}
}

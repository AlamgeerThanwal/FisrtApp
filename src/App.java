import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;


public class App extends JFrame implements ActionListener
{
	JButton b1;
	JPanel newPanel;
	JLabel userLabel, passLabel;
	final JTextField  textField1,textField2;
	
	App()
	{
		userLabel=new JLabel();
		userLabel.setText("Name"); 
		
		textField1=new JTextField(15);
		
		passLabel=new JLabel();
		passLabel.setText("Password"); 
		
		textField2=new JTextField(15); 
		
		b1=new JButton("SUBMIT");
		
		newPanel=new JPanel(new GridLayout(3,1));
		newPanel.add(userLabel);
		newPanel.add(textField1); 
		newPanel.add(passLabel);
		newPanel.add(textField2);
		newPanel.add(b1);
		
		add(newPanel, BorderLayout.CENTER);
		
		b1.addActionListener(this);
		setTitle("LOGIN FORM");	
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userValue =textField1.getText();
		String passValue=textField2.getText();
		
	if(userValue.equals("abc@gmail.com")&& passValue.equals("123")) {
		
		
		NewPage page=new NewPage();
		
		page.setVisible(true);
		JLabel wel_label=new JLabel("Welcom:" + userValue);
		page.getContentPane().add(wel_label);
	}
	else{
		System.out.println("Please Enter Valid UserName And Password");
	}
	}
    }
    class LoginFormDemo
    {
    	
	public static void main(String[] args) {
		try
		{
			App form =new App();
			form.setSize(300,100);
			form.setVisible(true);
			}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

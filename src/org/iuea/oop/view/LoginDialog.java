package org.iuea.oop.view;

/*THE ELLITES
 *  MUGALAASI NAJIIB 18/UG/496/BSSE-S
 * RUGENDABANGA MIREILLE SIFA 18/879/BIT
 * MIREMBE CAROLYNE SANDRA 18/UG/467/BIT-S
 * MUGABI MARK MARVIN 18/UG/487/BIT-S
 *INGABIRE RACHAEL 18/UG/899/BIT-S*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.iuea.oop.model.Authenticate;

public class LoginDialog extends JDialog {

    private JTextField userTxtrField;
    private JPasswordField PwdField;
    private JLabel userLabel;
    private JLabel pwdLabel;
    
    public boolean succeeded;
 
    public LoginDialog(JFrame orignal) {
    	 super(orignal, "Login", true);
        JPanel FieldPanel = new JPanel(new GridBagLayout());
        // Create a GridBagConstraints Object
        GridBagConstraints gBagCts = new GridBagConstraints();

       /* Add a fill property of GridBagConstraints which resolve whether and how to resize
        the component when the components display region is larger than the components requested size*/
        gBagCts.fill = GridBagConstraints.HORIZONTAL;
 
        userLabel = new JLabel("Username: ");
        userLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
        gBagCts .gridx = 0; //specify the rows and columns from top to bottom 
        gBagCts .gridy = 0;//specify the rows and columns from left to right
        gBagCts .gridwidth = 1; //specify the numer of rows to which a component can span
        FieldPanel.add(userLabel,gBagCts ); //Add userLabel as a component to a container using GridBagConstraints Object 
 
        userTxtrField = new JTextField(20);
        gBagCts .gridx = 1;
        gBagCts .gridy = 0;
        gBagCts .gridwidth = 1;
        FieldPanel.add(userTxtrField,gBagCts );//Add userTxtrField as a component to a container using GridBagConstraints Object 
 
        pwdLabel = new JLabel("Password: ");
        pwdLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
        gBagCts .gridx = 0;
        gBagCts .gridy = 1;
        gBagCts .gridwidth = 1;
        FieldPanel.add(pwdLabel,gBagCts );//Add pwdLabel as a component to a container using GridBagConstraints Object 
 
        PwdField = new JPasswordField(20);
        gBagCts .gridx = 1;
        gBagCts .gridy = 1;
        gBagCts .gridwidth = 2;
        FieldPanel.add(PwdField,gBagCts );//Add PwdField as a component to a container using GridBagConstraints Object 
        FieldPanel.setBorder(new LineBorder(Color.GRAY));
        
       JButton btnLogin = new JButton("Login");// Creates Button Cancel
       btnLogin.setFont(new Font("SansSerif", Font.BOLD, 14));
       btnLogin.addActionListener(//ADDs an actionListener to the button when its Clicked
    		   new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//Gives the button a specific action when its clicked
					if(Authenticate.authenticate(getUsername(), getPwd())) {
						Ellites_Main menu = new Ellites_Main();
						orignal.setVisible(false);
						JOptionPane.showMessageDialog(LoginDialog.this,"YOU ARE SUCCESSFULLY LOGGED IN",
								"LOGIN SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
						succeeded = true;
						dispose();
					}else {
						JOptionPane.showMessageDialog(LoginDialog.this,"Invalid Username or Password",
						"ERROR", JOptionPane.ERROR_MESSAGE);
						succeeded = false;
						dispose();
					}
				}
       });
       JButton btnCancel = new JButton("Cancel");// Creates Button Cancel
       btnCancel.setFont(new Font("SansSerif", Font.BOLD, 14));
       btnCancel.addActionListener( 
    		   new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { 
					// TODO Auto-generated method stub
					dispose();
				}
       });
        
        //Create another JPanel to hold these buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnLogin);//ADDS the button btnLogin to the JPanel
        buttonPanel.add(btnCancel);//ADDS the button btnCancel to the JPanel
 
        getContentPane().add(FieldPanel, BorderLayout.CENTER); // Adds the JPanel called FieldPanel to the container
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);//Adds the JPanel called buttonPanel to the container
        pack();
        setResizable(false); //To restrict resizing a login window
        setLocationRelativeTo(orignal); //Relatively locate the login Menu to the Jframe.
       
        
    }
	public String getUsername() {
		return userTxtrField.getText().trim();
	}
	public String getPwd() {
		return new String(PwdField.getPassword());
	}
	public boolean isSucceeded() {
		return succeeded;
	}
    
}


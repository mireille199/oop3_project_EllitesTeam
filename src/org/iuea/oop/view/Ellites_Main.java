package org.iuea.oop.view;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ellites_Main {
	private JFrame inforWindow;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField course;
	private JTextField reg;
	private JPanel mainPane;
	private JButton btnStudents,btnCourse,btnCourseUnits,btnLectures, 
					btnSubmit,btnDelete,btnUpdate,btnCancel,btnAdd,btnEdit;
	private JLabel lblFirstName,lblLastName,lblSex,lblCourse,lblRegister,footer;
	private JComboBox gender;
	
	public Ellites_Main() {
		 inforWindow = new JFrame("THE ELLITES INFORMATION SYSTEM");
		 inforWindow.setBounds(400, 200, 720, 520 );
		 inforWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 inforWindow.setLocationRelativeTo(null);
		 inforWindow.getContentPane().setLayout(null);
		 inforWindow.getContentPane().setBackground(Color.WHITE);//Sets the Background Color to Gray
		 inforWindow.setVisible(true);//Sets the aWindow to be seen
		
		footer = new JLabel("\"CopyRighted By: The_ELLITES_TEAM\"");
		footer.setFont(new Font("SansSerif", Font.BOLD, 13));
		footer.setHorizontalAlignment(SwingConstants.CENTER);
		footer.setBounds(0, 424, 697, 27);
		
		btnStudents = new JButton("Students");
		btnStudents.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnStudents.setBounds(-5, -3, 115, 40);
		
		btnCourse = new JButton("Course");
		btnCourse.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnCourse.setBounds(-5, 32, 115, 40);
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnCourse.hasFocus()) {
					btnStudents.setBackground(UIManager.getColor("menu"));
					btnStudents.setForeground(null);
				} else {					
				}      
			}
		});
		btnCourseUnits = new JButton("Course Units");
		btnCourseUnits.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnCourseUnits.setBounds(-5, 67, 115, 40);
		
		btnLectures = new JButton("Lectures");
		btnLectures.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnLectures.setBounds(-5, 102, 115, 40);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(0, 424, 697, 2);
		
		mainPane = new JPanel();
		mainPane.setBackground(Color.WHITE);
		mainPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		mainPane.setBounds(109, 13, 581, 413);
		
		mainPane.setLayout(null);
		
		pageLoad();
		
		 
		Container content =  inforWindow.getContentPane(); // Get content pane
		content.add(btnStudents);
		content.add(btnCourse);
		content.add(btnCourseUnits);
		content.add(footer);
		content.add(separator_2);
		content.add(mainPane);
		content.add(btnLectures);
	}

	private void pageLoad() {
		JPanel regPane = new JPanel();
		regPane.setBackground(SystemColor.text);
		regPane.setVisible(false);
		regPane.setBounds(1, 1, 578, 410);
		regPane.setForeground(Color.WHITE);
		mainPane.add(regPane);
		regPane.setLayout(null);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnSubmit.setBackground(SystemColor.textHighlight);
		btnSubmit.setBounds(144, 327, 99, 40);
		regPane.add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnCancel.setBackground(SystemColor.textHighlight);
		btnCancel.setBounds(334, 327, 99, 40);
		regPane.add(btnCancel);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setVisible(false);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 13));
		btnUpdate.setBackground(new Color(0, 153, 51));
		btnUpdate.setBounds(144, 327, 99, 40);
		regPane.add(btnUpdate);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFirstName.setBounds(32, 48, 85, 22);
		regPane.add(lblFirstName);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setBounds(32, 100, 85, 22);
		regPane.add(lblLastName);
		
		lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSex.setBounds(32, 149, 85, 22);
		regPane.add(lblSex);
		
		lblCourse = new JLabel("Course:");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCourse.setBounds(32, 195, 85, 22);
		regPane.add(lblCourse);
		
		lblRegister = new JLabel("Registration:");
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRegister.setBounds(32, 248, 85, 22);
		regPane.add(lblRegister);
		
		firstname = new JTextField();
		firstname.setFont(new Font("SansSerif", Font.BOLD, 13));
		firstname.setBounds(118, 45, 408, 30);
		regPane.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setFont(new Font("SansSerif", Font.BOLD, 13));
		lastname.setColumns(10);
		lastname.setBounds(118, 97, 408, 30);
		regPane.add(lastname);
		
		gender = new JComboBox();
		gender.setFont(new Font("SansSerif", Font.BOLD, 13));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		gender.setBackground(SystemColor.text);
		gender.setBounds(118, 146, 408, 30);
		regPane.add(gender);
		
		course = new JTextField();
		course.setFont(new Font("SansSerif", Font.BOLD, 13));
		course.setColumns(10);
		course.setBounds(118, 192, 408, 30);
		regPane.add(course);
		
		reg = new JTextField();
		reg.setFont(new Font("SansSerif", Font.BOLD, 13));
		reg.setColumns(10);
		reg.setBounds(118, 245, 408, 30);
		regPane.add(reg);
		
		JPanel students = new JPanel();
		students.setBackground(SystemColor.text);
		students.setVisible(false);
		students.setLayout(null);
		students.setBounds(1, 1, 578, 350);
		mainPane.add(students);
		
		
	}
}

package com.aizoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// saya buatnya tidak pakai windowbuilder bu, jadi ngoding langsung tanpa drag and drop
class Window extends JFrame implements ActionListener {
	JButton redBtn;
	JButton yellowBtn;
	JButton greenBtn;
	
	Window(String title) {
		super(title);
		setLayout(new FlowLayout());
		setResizable(true);
		setSize(250, 60);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		redBtn = new JButton("Red");
		redBtn.setActionCommand("red");
		redBtn.addActionListener(this);
		add(redBtn);
		
		yellowBtn = new JButton("Yellow");
		yellowBtn.setActionCommand("yellow");
		yellowBtn.addActionListener(this);
		add(yellowBtn);
		
		greenBtn = new JButton("Green");
		greenBtn.setActionCommand("green");
		greenBtn.addActionListener(this);
		add(greenBtn);
	}

	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("red")) {
			getContentPane().setBackground(Color.red);
		} else if(evt.getActionCommand().equals("yellow")){
			getContentPane().setBackground(Color.yellow);
		} else {
			getContentPane().setBackground(Color.green);
		}
		
		repaint();
	}
}

public class GUI {
	public static void main(String[] args) {
		Window frame = new Window("Color Changer");
		
		frame.setVisible(true);
	}
}













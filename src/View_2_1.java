/*Written by Simon Jäggi
 * I tried to keep everything in english.
 * Names for panels, labels, and so on:
 * {WhatIsIt}{OnWhichPanel}{NumberOnPanel}
 * 	-> Label1_1_1 is a label, sits on Panel 1_1 and has the number 1. 
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
public class View_2_1 extends JFrame implements ActionListener  {


	JPanel Panel1 = new JPanel();
	JLabel Label1_1 = new JLabel("PIZZA.NEARYOU.ch View 2.1");
	JPanel Panel2 = new JPanel();
	JPanel Panel2_1 = new JPanel();
	JLabel Label2_1_1 = new JLabel("Unsere Vertragspartner:");
	JTextField Txt2_1_1 = new JTextField(" Pizzakönig");
	JTextField Txt2_1_2 = new JTextField(" ------");
	JTextField Txt2_1_3 = new JTextField(" ------");

	JPanel Panel2_2 = new JPanel();
	JPanel Panel2_2_1 = new JPanel();
	JLabel Label2_2_1_1 = new JLabel("<html><U><font color=\"#232E78\">Vertragspartner werden</font></U></html>");

	ImageIcon Image2_2_1_1 = new ImageIcon("back.png");
	JLabel Label2_2_1_2 = new JLabel(Image2_2_1_1);
	
	public View_2_1(){
		setLayout(new BorderLayout());
		setTitle("PIZZA.NEARYOU.ch View 2.1");
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		add(Panel1, BorderLayout.NORTH);
		add(Panel2, BorderLayout.CENTER);



		Panel1.setLayout(new BorderLayout());
		Panel1.setPreferredSize(new Dimension(400, 70));	//sets size, so the upper "title" (label1_1) has its own space

		

		Label1_1.setHorizontalAlignment(JLabel.CENTER);
		Panel1.add(Label1_1, BorderLayout.CENTER);
		Panel1.setBorder(BorderFactory.createLineBorder(Color.black)); //Creates a visible border-line
		
		
		
		Panel2.setLayout(new BorderLayout());
		
		Panel2.add(Panel2_1, BorderLayout.CENTER);
		Panel2.add(Panel2_2, BorderLayout.SOUTH);
		
		Panel2_1.setLayout(new GridLayout(4,0,0,-2)); //gridlayout with negative gap so the borders of the txtfields look a bit nicer 
		Panel2_1.setBorder(BorderFactory.createEmptyBorder(10, 50, 50, 50)); //empty border to center the elements in the panel and adjust their position
		
		Panel2_1.add(Label2_1_1);
		Panel2_1.add(Txt2_1_1);
		Panel2_1.add(Txt2_1_2);
		Panel2_1.add(Txt2_1_3);


		Txt2_1_1.setEditable(false);
		Txt2_1_1.setBorder(BorderFactory.createLineBorder(Color.black)); //disabling the txtfields changes their color to blue. this changes it back to black.
		Txt2_1_2.setEditable(false);
		Txt2_1_2.setBorder(BorderFactory.createLineBorder(Color.black));
		Txt2_1_3.setEditable(false);
		Txt2_1_3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		Panel2_2.setPreferredSize(new Dimension(400,90));
		Panel2_2.setLayout(new BorderLayout());
		Panel2_2.add(Panel2_2_1, BorderLayout.SOUTH);
		
		Panel2_2_1.setLayout(new BorderLayout());
		Panel2_2_1.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 75)); //Creates empty border to move the Button to the right and the label to the left
		Panel2_2_1.add(Label2_2_1_1);
		Label2_2_1_1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				View_3_1 V3_1 = new View_3_1();

	
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
			
		});
		Panel2_2_1.add(Label2_2_1_2, BorderLayout.WEST);
		Label2_2_1_2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				dispose();

	
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
			
		});
		Label2_2_1_1.setHorizontalAlignment(JLabel.CENTER);
		Label2_2_1_1.setVerticalAlignment(JLabel.CENTER);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View_2_1 V2_1 = new View_2_1();
	}

	public void actionPerformed(ActionEvent ae){

		}

	}




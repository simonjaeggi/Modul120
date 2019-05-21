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
public class View_3_1 extends JFrame implements ActionListener  {


	JPanel Panel1 = new JPanel();
	JLabel Label1_1 = new JLabel("PIZZA.NEARYOU.ch");
	JPanel Panel2 = new JPanel();
	JPanel Panel2_1 = new JPanel();
	JLabel Label2_1_1= new JLabel("Vertragspartner werden:");
	JPanel Panel2_1_1 = new JPanel();
	JLabel Label2_1_1_1 = new JLabel("Firmenname:");
	JLabel Label2_1_1_2 = new JLabel("Online-Shop:");
	JLabel Label2_1_1_3 = new JLabel("Gerichte:");
	JLabel Label2_1_1_4 = new JLabel();
	JPanel Panel2_1_2 = new JPanel();
	JPanel Panel2_1_2_1 = new JPanel();
	JTextField Txt2_1_2_1 = new JTextField();
	JTextField Txt2_1_2_2 = new JTextField();
	JTextField Txt2_1_2_3 = new JTextField();
	JButton Button2_1_2_1 = new JButton("Hinzufügen");
	JButton Button2_1_2_2 = new JButton("Entfernen");
	JList List2_1_2_1 = new JList();
	JScrollPane scrollPane2_1_2_1 = new JScrollPane(); //This will add a scrollbar to the jlist
	DefaultListModel model = new DefaultListModel();
	
	JPanel Panel2_2 = new JPanel();
	JPanel Panel2_2_1 = new JPanel();
	
	ImageIcon Image2_2_1_1 = new ImageIcon("back.png");
	JLabel Label2_2_1_1 = new JLabel(Image2_2_1_1);
	

	ImageIcon Image2_2_1_2 = new ImageIcon("Abschicken.png");
	JLabel Label2_2_1_2 = new JLabel(Image2_2_1_2);
	
	public View_3_1(){
		setLayout(new BorderLayout());
		setTitle("PIZZA.NEARYOU.ch View 3.1");
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(Panel1, BorderLayout.NORTH);
		add(Panel2, BorderLayout.CENTER);



		Panel1.setLayout(new BorderLayout());
		Panel1.setPreferredSize(new Dimension(400, 70));	//sets size, so the upper "title" (label1_1_1) has its own space

		

		Label1_1.setHorizontalAlignment(JLabel.CENTER);
		Panel1.add(Label1_1, BorderLayout.CENTER);
		Panel1.setBorder(BorderFactory.createLineBorder(Color.black));//Creates a visible border-line
		
		
		Panel2.setLayout(new BorderLayout());
		Panel2.add(Panel2_1, BorderLayout.CENTER);
		Panel2.add(Panel2_2, BorderLayout.SOUTH);
		
		Panel2_1.setLayout(new BorderLayout());
		Panel2_1.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
		Panel2_1.add(Label2_1_1, BorderLayout.NORTH);
		Panel2_1.add(Panel2_1_1, BorderLayout.WEST);
		Panel2_1.add(Panel2_1_2, BorderLayout.EAST);
		
		Label2_1_1.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		Panel2_1_1.setLayout(new GridLayout(5,0,0,2));
		Panel2_1_1.add(Label2_1_1_1);
		Panel2_1_1.add(Label2_1_1_2);
		Panel2_1_1.add(Label2_1_1_4);
		Panel2_1_1.add(Label2_1_1_3);
		
		Panel2_1_2.setLayout(new GridLayout(5,0));
		Panel2_1_2.setPreferredSize(new Dimension(180,90));
		Panel2_1_2.add(Txt2_1_2_1);
		Panel2_1_2.add(Txt2_1_2_2);
		Panel2_1_2.add(scrollPane2_1_2_1);
		Panel2_1_2.add(Txt2_1_2_3);
		Panel2_1_2.add(Panel2_1_2_1);
		
		Panel2_1_2_1.setLayout(new GridLayout(0,2,2,2));
		Panel2_1_2_1.setBorder(BorderFactory.createEmptyBorder(3, 20, 3, 20));

		Panel2_1_2_1.add(Button2_1_2_1);
		Panel2_1_2_1.add(Button2_1_2_2);
		scrollPane2_1_2_1.setViewportView(List2_1_2_1);
		scrollPane2_1_2_1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		List2_1_2_1.setModel(model);
		Button2_1_2_1.addActionListener(this);
		Button2_1_2_1.setMargin(new Insets(0, 0, 0, 0));
	
		
		Button2_1_2_2.addActionListener(this);
		Button2_1_2_2.setMargin(new Insets(0, 0, 0, 0));
		
		
		Panel2_2.setPreferredSize(new Dimension(400,90));
		Panel2_2.setLayout(new BorderLayout());
		Panel2_2.add(Panel2_2_1, BorderLayout.SOUTH);
		
		Panel2_2_1.setLayout(new BorderLayout());
		Panel2_2_1.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0)); //Creates empty border to move the left button to the right 
		
		Panel2_2_1.add(Label2_2_1_1, BorderLayout.WEST);
		Label2_2_1_1.addMouseListener(new MouseListener() {
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
		Panel2_2_1.add(Label2_2_1_2, BorderLayout.EAST);
		Label2_2_1_2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Ihre Eingaben wurden erfolgreich versendet!");
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

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View_3_1 V3_1 = new View_3_1();
	}

	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == Button2_1_2_1){
			model.addElement(Txt2_1_2_3.getText());
			Txt2_1_2_3.setText("");
		}
		if (ae.getSource() == Button2_1_2_2){
			model.removeElement(List2_1_2_1.getSelectedValue());
		}
		}

	}


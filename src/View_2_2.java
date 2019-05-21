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
public class View_2_2 extends JFrame implements ActionListener  {


	JPanel Panel1 = new JPanel();
	JLabel Label1_1 = new JLabel("PIZZA.NEARYOU.ch");
	JPanel Panel2 = new JPanel();
	JPanel Panel2_1 = new JPanel();
	JPanel Panel2_1_1 = new JPanel();
	JLabel Label2_1_1_1 = new JLabel("<html>Lieferanten in der Nähe <br> (Im Umkreis von 15 km):</html>");
	String[] String2_1_1_1 = {"1. Pizzakönig, 4Km                   4/5 Sternen", "-------"};
	JComboBox<String> DropDown2_1_1_1 = new JComboBox<String>(String2_1_1_1);

	JPanel Panel2_1_2 = new JPanel();
	JLabel Label2_1_2_1 = new JLabel("Kanton:");
	JLabel Label2_1_2_2 = new JLabel("Ort:");
	JLabel Label2_1_2_3 = new JLabel("Gewähltes Gericht:");

	JPanel Panel2_1_3 = new JPanel();
	JTextField Txt2_1_3_1 = new JTextField();
	JTextField Txt2_1_3_2 = new JTextField();
	JTextField Txt2_1_3_3 = new JTextField();

	JPanel Panel2_2 = new JPanel();
	JPanel Panel2_2_1 = new JPanel();

	ImageIcon Image2_2_1_1 = new ImageIcon("back.png");
	JLabel Label2_2_1_1 = new JLabel(Image2_2_1_1);


	ImageIcon Image2_2_1_2 = new ImageIcon("ZumOnlineShop.png");
	JLabel Label2_2_1_2 = new JLabel(Image2_2_1_2);

	public void View_2_2(Object Kanton, Object Ort, Object Gericht){
		setLayout(new BorderLayout());
		setTitle("PIZZA.NEARYOU.ch View 2.2");
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

		Panel2_1.setLayout(new BorderLayout());
		Panel2_1.add(Panel2_1_1, BorderLayout.NORTH);
		Panel2_1.add(Panel2_1_2, BorderLayout.WEST);
		Panel2_1.add(Panel2_1_3, BorderLayout.EAST);
		Panel2_1.setBorder(BorderFactory.createEmptyBorder(20, 50, 0, 50));

		Panel2_1_1.setLayout(new GridLayout(2,0));
		Panel2_1_1.add(Label2_1_1_1);
		Panel2_1_1.add(DropDown2_1_1_1);
		DropDown2_1_1_1.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));


		Panel2_1_2.setLayout(new GridLayout(3,0));
		Panel2_1_2.add(Label2_1_2_1);
		Panel2_1_2.add(Label2_1_2_2);
		Panel2_1_2.add(Label2_1_2_3);
		Panel2_1_2.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

		Panel2_1_3.setLayout(new GridLayout(3,0,0,2)); //gridlayout with additional vertical gap
		Panel2_1_3.setPreferredSize(new Dimension(150,50));
		Panel2_1_3.add(Txt2_1_3_1);
		Panel2_1_3.add(Txt2_1_3_2);
		Panel2_1_3.add(Txt2_1_3_3);
		Panel2_1_3.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));


		Txt2_1_3_1.setEditable(false);
		Txt2_1_3_1.setBorder(BorderFactory.createLineBorder(Color.black));
		Txt2_1_3_1.setText(" "+(String) Kanton);

		Txt2_1_3_2.setEditable(false);
		Txt2_1_3_2.setBorder(BorderFactory.createLineBorder(Color.black));
		Txt2_1_3_2.setText(" "+(String) Ort);

		Txt2_1_3_3.setEditable(false);
		Txt2_1_3_3.setBorder(BorderFactory.createLineBorder(Color.black));
		Txt2_1_3_3.setText(" "+(String) Gericht);



		Panel2_2.setPreferredSize(new Dimension(400,90));
		Panel2_2.setLayout(new BorderLayout());
		Panel2_2.add(Panel2_2_1, BorderLayout.SOUTH);

		Panel2_2_1.setLayout(new BorderLayout());
		Panel2_2_1.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5)); //Creates empty border to move the left button to the right and the right button to the left

		Panel2_2_1.add(Label2_2_1_1, BorderLayout.WEST);
		Panel2_2_1.add(Label2_2_1_2, BorderLayout.EAST);
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
		Label2_2_1_2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				 try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.theuselessweb.com/"));
					JOptionPane.showMessageDialog(null, "Sie wurden erfolgreich weitergeleitet, das Programm kann nun geschlossen werden.");

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Es gab einen Fehler. Bitte wenden Sie sich an den Systemadministrator.");

				}


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
		View_2_2 V2_2 = new View_2_2();
	}

	public void actionPerformed(ActionEvent ae){

		}

	}




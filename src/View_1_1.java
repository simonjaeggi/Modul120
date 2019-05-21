/*Written by Simon Jäggi
 * I tried to keep my comments for the code in a understandable English.
 * Names for panels, labels, and so on:
 * {WhatIsIt}{OnWhichPanel}{NumberOnPanel}
 * 	-> Label1_1_1 is a label, sits on Panel 1_1 and has the number 1.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class View_1_1 extends JFrame implements ActionListener  {

	View_2_2 V2_2 = new View_2_2();
	JPanel Panel1 = new JPanel();
	JLabel Label1_1 = new JLabel("<html>Suchen Sie Pizza in Ihrer Nähe? Dann ist <br> PIZZA.NEARYOU.ch genau das richtige für Sie! <br> <br> Starten Sie indem Sie Ihren Aufenhaltsort und <br> Ihr Wunschgericht wählen:</html>");
	JPanel Panel1_1 = new JPanel();
	JLabel Label1_1_1 = new JLabel("PIZZA.NEARYOU.ch");
	JPanel Panel2 = new JPanel();
	JPanel Panel2_1 = new JPanel();
	JLabel Label2_1_1 = new JLabel("Kanton: ");
	JLabel Label2_1_2 = new JLabel("Ort:    ");
	JLabel Label2_1_3 = new JLabel("Gericht:");
	JPanel Panel2_2 = new JPanel();
	String[] String2_2_1 = {"Aargau", "Appen. Ausserrhoden ", "Appen. Innerrhoden", "Basel-Land", "Basel-Stadt", "Bern", "Freiburg", "Genf", "Glarus", "Graubünden", "Jura", "Luzern", "Neuenburg", "Nidwalden", "Obwalden", "St.Gallen", "Schaffhausen", "Schwyz", "Solothurn", "Thurgau", "Tessin", "Uri", "Waadt", "Wallis", "Zug", "Zürich"};
	String[] String2_2 = {"Aarau", "Aarburg","Abtwil","Ammerswil","Aristau","Arni","Attelwil","Auenstein                       "}; //places in Aargau
	String[] String2_2_3 = {"Pizza Margherita","Pizza Prosciutto","Pizza Hawaii","Pizza Funghi","Pizza Tonno","Pizza Diavolo","Pizza Frutti di Mare      "}; //the spaces after "Frutti di Mare" will streth the dropdown box to the same size as the others
	JComboBox<String> DropDown2_2_1 = new JComboBox<String>(String2_2_1);
	JComboBox<String> DropDown2_2_2 = new JComboBox<String>(String2_2);
	JComboBox<String> DropDown2_2_3 = new JComboBox<String>(String2_2_3);
	JPanel Panel2_3 = new JPanel();
	JPanel Panel2_3_1 = new JPanel();

	JLabel Label2_3_1_1 = new JLabel("<html><U><font color=\"#232E78\">Unsere Vertragspartner</font></U></html>");

	ImageIcon Image2_3_1_1 = new ImageIcon("next.png");
	JLabel Label2_3_1_2 = new JLabel(Image2_3_1_1);



	public View_1_1(){
		setLayout(new GridLayout(2,0));
		setTitle("PIZZA.NEARYOU.ch View 1.1");
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Panel1.setLayout(new BorderLayout());
		Panel1.add(Panel1_1, BorderLayout.NORTH);
		Panel1.add(Label1_1, BorderLayout.CENTER);

		Panel1_1.setLayout(new BorderLayout());
		Panel1_1.setPreferredSize(new Dimension(400, 70));	//sets size, so the upper "title" (label1_1_1) has its own space

		Label1_1.setHorizontalAlignment(JLabel.CENTER);


		Label1_1_1.setHorizontalAlignment(JLabel.CENTER);
		Panel1_1.add(Label1_1_1, BorderLayout.CENTER);
		Panel1_1.setBorder(BorderFactory.createLineBorder(Color.black)); //Creates a visible border-line
		Panel2.setLayout(new BorderLayout());
		Panel2.add(Panel2_1, BorderLayout.WEST);
		Panel2.add(Panel2_2, BorderLayout.EAST);
		Panel2.add(Panel2_3, BorderLayout.SOUTH);


		Panel2_1.setPreferredSize(new Dimension(120, 50));

		Panel2_1.setBorder(BorderFactory.createRaisedBevelBorder()); //Creates a visible border-line
		//Panel2_1.setLayout(new FlowLayout(FlowLayout.LEFT));
		Panel2_1.setLayout(new GridLayout(3,0));
		Panel2_1.setBorder(BorderFactory.createEmptyBorder(0, 62, 0, 0)); //Creates empty border to move the labels to the right

		Panel2_1.add(Label2_1_1);
		Panel2_1.add(Label2_1_2);
		Panel2_1.add(Label2_1_3);





		Panel2_2.setPreferredSize(new Dimension(240, 160));

		Panel2_2.setLayout(new FlowLayout(FlowLayout.LEFT));
		Panel2_2.setBorder(BorderFactory.createEmptyBorder(0, 23, 0, 0)); //Creates empty border to move the dropdowns to the right
		Panel2_2.add(DropDown2_2_1);
		Panel2_2.add(DropDown2_2_2);
		Panel2_2.add(DropDown2_2_3);

		Panel2_3.setPreferredSize(new Dimension(400,90));
		Panel2_3.setLayout(new BorderLayout());
		Panel2_3.add(Panel2_3_1, BorderLayout.SOUTH);
		Panel2_3_1.setLayout(new BorderLayout());
		Panel2_3_1.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 5)); //Creates empty border to move the Button to the left and the label to the right
		Panel2_3_1.add(Label2_3_1_1);
		Label2_3_1_1.setHorizontalAlignment(JLabel.CENTER);
		Label2_3_1_1.setVerticalAlignment(JLabel.CENTER);

		Label2_3_1_1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				View_2_1 V2_1 = new View_2_1();
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
		Panel2_3_1.add(Label2_3_1_2, BorderLayout.EAST);
		Label2_3_1_2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				V2_2.View_2_2(DropDown2_2_1.getSelectedItem(),DropDown2_2_2.getSelectedItem(),DropDown2_2_3.getSelectedItem());

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



		add(Panel1);
		add(Panel2);



		DropDown2_2_1.addActionListener(this);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View_1_1 V1_1 = new View_1_1();
	}

	public void actionPerformed(ActionEvent ae){ //I was too lazy to actually write down places of every region :) the ones I didn't do still have the "Aargau" Array.
		if (ae.getSource() == DropDown2_2_1){
			Object value = DropDown2_2_1.getSelectedItem();
			if (value.equals("Appen. Ausserrhoden ")){
				String[] String2_2AppenAusserhoden = {"Heiden","Lutzenberg","Grub                                 "};

				DropDown2_2_2.setModel(new DefaultComboBoxModel<String>(String2_2AppenAusserhoden));

			}
			if (value.equals("Basel-Stadt")){
				String[] string2_2Basel_Stadt = {"Basel","Bettingen","Riehen                             "};

				DropDown2_2_2.setModel(new DefaultComboBoxModel<String>(string2_2Basel_Stadt));

			}
			if (value.equals("Basel-Land")){
				String[] string2_2Basel_Stadt = {"Biel-Benken","Bottmingen","Binningen                             "};

				DropDown2_2_2.setModel(new DefaultComboBoxModel<String>(string2_2Basel_Stadt));

			}
		}

	}


}

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.*;


public class Partlist extends JFrame implements ActionListener{

	JList list = new JList();
	DefaultListModel model = new DefaultListModel();
	JButton AddButton = new JButton("Add");
	JButton RemoveButton = new JButton("Remove");
	JPanel Panel1 = new JPanel();
	JTextField TextField1 = new JTextField();

	public Partlist(){
		setLayout(new BorderLayout());
		setTitle("Part list");
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		list.setModel(model);
		add(list, BorderLayout.CENTER);
		add(Panel1, BorderLayout.SOUTH);
		Panel1.setLayout(new GridLayout(3,0));


		Panel1.add(TextField1);
		Panel1.add(AddButton);
		Panel1.add(RemoveButton);
		AddButton.addActionListener(this);
		RemoveButton.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == AddButton){
			model.addElement(TextField1.getText());
			TextField1.setText("");
		}
		if (ae.getSource() == RemoveButton){
			model.removeElement(list.getSelectedValue());
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partlist P = new Partlist();
	}

}
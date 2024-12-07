package league_token;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	JPanel panel = new JPanel();
	ArrayList<String> names = new ArrayList<String>();
	void setup() {
		frame.setTitle("Guest Book");
		frame.setVisible(true);
		panel.add(viewNames);
	addName.setBounds(100, 25, 0, 0);
		viewNames.setText("View Names");
		addName.setText("Add Name");
		panel.add(addName);
		panel.setPreferredSize(new Dimension(300,50));
		frame.add(panel);
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.pack();
		
		
		
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		GuestBook runner = new GuestBook();
		runner.setup();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

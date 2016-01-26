import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;


public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		
		//Canvas canvas = new Canvas();
		//frame.setContentPane(canvas);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel my_panel = new JPanel();
		frame.getContentPane().add(my_panel, BorderLayout.CENTER);
		my_panel.setLayout(new BorderLayout());
		
		Canvas my_canvas = new Canvas();		
		my_panel.add(my_canvas, BorderLayout.CENTER);

		//my_canvas.setBounds(163, 7, 859, 674);
		//my_panel.add(my_canvas);		

		/*
		JLabel lblNewLabel = new JLabel("Canadaball");
		lblNewLabel.setBounds(34, 7, 117, 15);
		panel.add(lblNewLabel);

		JButton btnButton = new JButton("Button");
		btnButton.setBounds(34, 95, 117, 25);
		panel.add(btnButton);
		
		JLabel lblRidesAMoose = new JLabel("I'm SORRY !!!");
		lblRidesAMoose.setBounds(34, 54, 117, 15);
		panel.add(lblRidesAMoose);
		*/
	}
}

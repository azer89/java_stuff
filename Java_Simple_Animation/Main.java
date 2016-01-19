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
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Canadaball");
		lblNewLabel.setBounds(34, 7, 117, 15);
		panel.add(lblNewLabel);
		
		/*JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(163, 7, 859, 674);
		panel.add(panel_1);
		*/
		
		Canvas panel_1 = new Canvas();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(163, 7, 859, 674);
		panel.add(panel_1);
		
		JButton btnButton = new JButton("Button");
		btnButton.setBounds(34, 95, 117, 25);
		panel.add(btnButton);
		
		JLabel lblRidesAMoose = new JLabel("I'm SORRY !!!");
		lblRidesAMoose.setBounds(34, 54, 117, 15);
		panel.add(lblRidesAMoose);
		
		//Canvas canvas = new Canvas();
		//panel_1.add(canvas);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
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
		
		JPanel top_panel = new JPanel();
		frame.getContentPane().add(top_panel, BorderLayout.CENTER);
		top_panel.setLayout(new BorderLayout());
		
		Canvas my_canvas = new Canvas();		
		top_panel.add(my_canvas, BorderLayout.CENTER);

		JPanel side_panel = new JPanel();
		//side_panel.setLayout(new GridLayout(3, 1));
		side_panel.setLayout(new BoxLayout(side_panel, BoxLayout.Y_AXIS));
		top_panel.add(side_panel, BorderLayout.WEST);

		//my_canvas.setBounds(163, 7, 859, 674);
		//my_panel.add(my_canvas);		

		JLabel label1 = new JLabel("Canadaball");
		side_panel.add(label1);

		JLabel label2 = new JLabel("I'm sorry !!!");
		side_panel.add(label2);

		JLabel label3 = new JLabel("I love Tim Horton");
		side_panel.add(label3);
		
		/*
		JButton btnButton = new JButton("Button");
		my_panel.add(btnButton, BorderLayout.WEST);
		
		JLabel lblRidesAMoose = new JLabel("I'm SORRY !!!");
		lblRidesAMoose.setBounds(34, 54, 117, 15);
		panel.add(lblRidesAMoose);
		*/
	}
}

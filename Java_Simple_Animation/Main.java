//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
//import javax.swing.JSplitPane;
//import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;




public class Main extends JFrame implements ActionListener, KeyListener
{

	//private JFrame frame;
	private JPanel splash_panel;
	private JPanel top_panel;
	private Canvas my_canvas;

	public void keyPressed(KeyEvent e) 
	{
        System.out.println("keyPressed");
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) 
    {
        System.out.println("keyTyped");
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		// EventQueue.invokeLater(new Runnable() 
		// {
		// 	public void run() 
		// 	{
		// 		try 
		// 		{
		Main window = new Main();
		//window.frame.setVisible(true);
		window.setVisible(true);

		// 		} 
		// 		catch (Exception e) 
		// 		{
		// 			e.printStackTrace();
		// 		}
		// 	}
		// });
	}

	/**
	 * Create the application.
	 */
	public Main() 
	{
		initialize();
	}

	public void actionPerformed(ActionEvent ae) 
	{
    	System.out.println("click !");

    	//
    	getContentPane().remove(splash_panel);
		getContentPane().add(top_panel, BorderLayout.CENTER);		
		revalidate();
        repaint();
        pack();
        setBounds(100, 100, 1024, 768);
  	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		//addKeyListener(this);
	
		addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

		//frame = new JFrame();
		setBounds(100, 100, 1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* SPLASH SCREEN */
		splash_panel = new JPanel();
		splash_panel.setLayout(new BorderLayout(100, 100));
		JButton canada_button = new JButton("Show me Canadaball");
		splash_panel.add(canada_button, BorderLayout.NORTH);
		canada_button.addActionListener(this);

		/* ANIMATION CANVAS */
		top_panel = new JPanel();
		top_panel.setLayout(new BorderLayout());

		getContentPane().add(splash_panel, BorderLayout.CENTER);
		my_canvas = new Canvas();		
		top_panel.add(my_canvas, BorderLayout.CENTER);

		JPanel side_panel = new JPanel();
		side_panel.setLayout(new BoxLayout(side_panel, BoxLayout.Y_AXIS));
		
		top_panel.add(side_panel, BorderLayout.WEST);


		JLabel label1 = new JLabel("Canadaball");
		side_panel.add(label1);

		JLabel label2 = new JLabel("I'm sorry !!!");
		side_panel.add(label2);

		JLabel label3 = new JLabel("I love Tim Horton");
		side_panel.add(label3);
	}
}

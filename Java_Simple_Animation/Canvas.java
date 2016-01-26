//package java_graphics_pkg;

//import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.geom.Point2D;

import java.awt.geom.AffineTransform;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.image.BufferedImage;

import java.awt.Image;

import javax.swing.Timer;

/*
need to implement this:

http://stackoverflow.com/questions/21075552/detect-mouse-hover-on-graphics2d-string
*/

public class Canvas extends JComponent implements ActionListener/*, MouseListener*/
{
	ImageIcon _imgIcon;
	
	Timer my_timer;
	
	double radValue = 0;    
    Point2D.Double finalPos = new Point2D.Double();

    // for double buffering
    Image buffer = null;

    Boolean enableDB = true;

    long previousTime;

	
	public Canvas()
	{	
		this._imgIcon = new ImageIcon("canadaball.png");

		repaint();
		my_timer = new Timer(30, this);
		my_timer.start();	    
	}
	
	public void paintComponent(Graphics g) 
	{
		//System.out.println("PAINT");
		long currentTime = System.nanoTime();
		long deltaTime = (currentTime - previousTime) / 1000000;
		System.out.println(deltaTime);

		Graphics screengc = null;
		if(enableDB)
		{
			buffer = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
			screengc  = g;
    		g = buffer.getGraphics();
    	}
		

		//Graphics2D g2 = (Graphics2D) g;
		//super.paintComponent(g2);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		g.setColor(new Color(255, 50, 50));
		g.fillRect(100, 100, this.getWidth() - 200, this.getHeight() - 200);
		
		g.drawImage(_imgIcon.getImage(), (int)finalPos.x, (int)finalPos.y, null);

		if(enableDB)
		{
			screengc.drawImage(buffer, 0, 0, null);
		}

		previousTime = System.nanoTime();
	}
	
	public void actionPerformed(ActionEvent e) 
	{				
		Point2D.Double centerPos = new Point2D.Double(this.getWidth() / 2 - _imgIcon.getIconWidth() / 2,
                                       this.getHeight() / 2 - _imgIcon.getIconHeight() / 2); 
		
		Point2D.Double oriPos = new Point2D.Double(centerPos.x + 100, centerPos.y);
		
		AffineTransform aTrans = new AffineTransform();
		aTrans.rotate(radValue, centerPos.x, centerPos.y);
		
		
		aTrans.transform(oriPos, finalPos);
		
		radValue += 0.05;
		
		repaint();
	}

	/*
	public void mousePressed(MouseEvent e) 
	{       
    }

    public void mouseReleased(MouseEvent e) 
    {
    }

    public void mouseEntered(MouseEvent e) 
    {
    }

    public void mouseExited(MouseEvent e) 
    {
    }

    public void mouseClicked(MouseEvent e) 
    {
    }
	*/
}
	

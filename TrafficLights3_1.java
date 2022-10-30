package stepic3BasicsJava3;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrafficLights3_1 {

	public static void main(String[] args) {
		JFrame jFrame = getFrame();
		MyComponent MC = new MyComponent();
		//jFrame.add(new MyComponent());
		jFrame.add(MC);
	}
	
	static class MyComponent extends JComponent {
		@Override
		protected void paintComponent(Graphics g) {
			Font font = new Font("MV Boli",Font.BOLD,20);	
			Graphics2D g2 = (Graphics2D)g;
			g2.setFont(font);
			g2.drawString("hello world!!abracadabrrrra!!",50,50);
			Point2D p1 = new Point2D.Double(55,55);
			Point2D p2 = new Point2D.Double(170,170);
			Line2D l2 = new Line2D.Double(p1,p2);
			g2.draw(l2);
			//Ellipse2D ell = new Ellipse2D.Double(55,55,150,150);
			Ellipse2D ell = new Ellipse2D.Double();
			ell.setFrameFromDiagonal(p1,p2);
			g2.setPaint(Color.blue);
			g2.draw(ell);
			//Rectangle2D r2 = new Rectangle2D.Double(55,55,150,150);
			Rectangle2D r2 = new Rectangle2D.Double();
			r2.setFrameFromDiagonal(p1,p2);
			g2.draw(r2);			
		}
	}//для гита)
	
	static JFrame getFrame() {
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
	    jFrame.setBounds(dimension.width/2-250, dimension.height/2-150, 500, 300);
		
		//jFrame.setSize(700,300);
		//jFrame.setLocation(500,300);
		jFrame.setTitle("this is my study!!!))");
		return jFrame;
		}

}

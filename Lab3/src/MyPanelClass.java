import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;


public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                       
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height);
                        //Draw a second border
                        //g.setColor(Color.DARK_GRAY);
                        //g.drawRect(x1+4, y1+4, getWidth()-9,getHeight()-9);
                        
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x2,y1,x1,y2);
                        
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval((getWidth()-55) / 2 , (getHeight()-55) /2,55, 55);
                        
                        
                        //Polygon p = new Polygon();
                        //p.addPoint(x1 + 5, y1 + 25);
                        //p.addPoint(x1 + 20, y1 + 10);
                        //p.addPoint(x1 + 35, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 25);
                        //g.setColor(Color.YELLOW);
                        //g.fillPolygon(p);
                        
                         //Paint the background red
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Paint the stripes white
                        Polygon rectangle1 = new Polygon();
                        rectangle1.addPoint(x1,getHeight()/5);
                        rectangle1.addPoint(x1,getHeight()/5*2);
                        rectangle1.addPoint(x2,getHeight()/5*2);
                        rectangle1.addPoint(x2,getHeight()/5);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(rectangle1);
                        
                        Polygon rectangle2 = new Polygon();
                        rectangle2.addPoint(x1,getHeight()/5*3);
                        rectangle2.addPoint(x1,getHeight()/5*4);
                        rectangle2.addPoint(x2,getHeight()/5*4);
                        rectangle2.addPoint(x2,getHeight()/5*3);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(rectangle2);
                        
                        //Paint the triangle
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1,y1);
                        triangle.addPoint(x1,y2);
                        triangle.addPoint(getWidth()/2,getHeight()/2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        
                        //paint the star
                        //star.addPoint(x1+getWidth()/5,getHeight()/2);   CENTER
                        Polygon star = new Polygon();
                        star.addPoint(x1+getWidth()/11,getHeight()/2);
                        star.addPoint(x1+getWidth()/8,getHeight()/2);
                        star.addPoint(x1+getWidth()/7,(getHeight()/2)-getHeight()/20);
                        star.addPoint(x1+getWidth()/6,getHeight()/2);
                        star.addPoint(x1+getWidth()/5,getHeight()/2);
                        star.addPoint(x1+(getWidth()*10)/(55),(getHeight()/2)+getHeight()/22);
                        star.addPoint(x1+getWidth()/5,(getHeight()/2)+getHeight()/10);
                        star.addPoint(x1+getWidth()/7,(getHeight()/2)+getHeight()/17);
                        star.addPoint(x1+getWidth()/11,(getHeight()/2)+getHeight()/10);
                        star.addPoint(x1+(getWidth()/9),(getHeight()/2)+getHeight()/22);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(star);
                        
                        
                        
			}
}
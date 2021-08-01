/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InOut;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ayseguleyrice
 */
public class InOut extends JFrame implements MouseListener {
    
    int x,y,i;
    JLabel label =new JLabel();


    public void SetLayout(int x, int y, int w, int l, Component c){
        c.setLocation(x, y);
        c.setSize(w, l);
    }
    
    public InOut()
	{   
            Container con = getContentPane();
            setLayout(null);
            SetLayout(10, 10, 70, 20, label);
            con.add(label); 
            this.setSize(1000,500);
            this.setResizable(false);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addMouseListener(this);	
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1000, 1000);
		g.setColor(Color.BLACK);
		g.drawLine(0, 250, 1000, 250);
		g.drawLine(500, 0, 500, 500);
		g.drawString("(0,0)",501,265);
		g.drawString("1",601,265); 
		g.drawString("-1",401,265); 
		g.drawString("2",701,265); 
		g.drawString("-2",301,265); 
		g.drawString("3",801,265); 
		g.drawString("-3",201,265); 
		g.drawString("1",503,165);
		g.drawString("-1",503,365);
		g.drawString("2",503,65);
		g.drawString("-2",503,465);
                
		g.drawOval(x-2,y-2,4,4);
		
		g.drawRect(300,50,400,200);

		g.setColor(Color.cyan);
                
		for (i = 2 ; i < 400 ; i += 5){
                    g.drawLine(300+i,50 , 300+i, 250);
		}
                
		g.setColor(Color.BLACK);	
                label.setText( ((double)x-500)/100+"  "+((double)y-250)/-100 );
             
	}
    @Override
	public void mouseClicked (MouseEvent e) {
		x = e.getX();
		y = e.getY();		
		
		if ((y >= 50 && y <= 250 && x >= 300) & x <= 700){
                    JOptionPane.showMessageDialog(null, "Inside");
                }    
                else{
                    JOptionPane.showMessageDialog(null, "Outside");
                }
                    
                repaint();
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InOut();
	}
        
    @Override
	public void mouseEntered(MouseEvent arg0) {	
        }
	@Override
	public void mouseExited(MouseEvent arg0)  {	
        }
	@Override
	public void mousePressed(MouseEvent arg0) {
	}
	@Override
	public void mouseReleased(MouseEvent arg0){ 
        }
}
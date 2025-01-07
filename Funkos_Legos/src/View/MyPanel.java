package View;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Model.Body;
import Model.Head;
import Model.Legs;

public class MyPanel extends JPanel{
	private Head cabeza;
    private Body cuerpo;
    private Legs piernas;

    public MyPanel(Head cabeza, Body cuerpo, Legs piernas) {
        this.cabeza = cabeza;
        this.cuerpo = cuerpo;
        this.piernas = piernas;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        ImageIcon cabezaImage = cabeza.getImage();
        g.drawImage(cabezaImage.getImage(), 50, 50, this);

        ImageIcon BodyImage = cuerpo.getImage();
        g.drawImage(BodyImage.getImage(), 75, 50, this);

        ImageIcon LegsImage = piernas.getImage();
        g.drawImage(LegsImage.getImage(), 75, 50, this);
        
    }
}

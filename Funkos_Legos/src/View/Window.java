package View;

import Controller.Events;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Model.Head;
import Model.Body;
import Model.Legs;

public class Window extends JFrame{


    private Events ev;
	public MyPanel mp ;
	public JLabel label, labelP, labelH, labelC, labelL;
    public JButton button1, buttonM, buttonF, buttonO, buttonO2, buttonH, buttonB, buttonL, buttonGG;
    
    public Window(Events e) {
        super("Mi ventana");
		this.ev=e;
        initComponents();
    }

    public void initComponents() {
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		addButtons();
		this.setVisible(true);
	}

    private void addButtons() {
        this.button1=new JButton("Iniciar");
		this.button1.setBounds(225,450,100,50);
		this.button1.addActionListener(ev);
		
		this.buttonM=new JButton("Marvel");
		this.buttonM.setBounds(100,450,100,50);
		this.buttonM.addActionListener(ev);
		this.buttonM.setVisible(false);
		
		this.buttonF=new JButton("Dc");
		this.buttonF.setBounds(400,450,100,50);
		this.buttonF.addActionListener(ev);
		this.buttonF.setVisible(false);
		
		this.buttonO=new JButton("Funko");
		this.buttonO.setBounds(100,450,100,50);
		this.buttonO.addActionListener(ev);
		this.buttonO.setVisible(false);
		
		this.buttonO2=new JButton("Lego");
		this.buttonO2.setBounds(400,450,100,50);
		this.buttonO2.addActionListener(ev);
		this.buttonO2.setVisible(false);
		
		this.buttonH=new JButton("Cabeza");
		this.buttonH.setBounds(100,450,100,50);
		this.buttonH.addActionListener(ev);
		this.buttonH.setVisible(false);

        this.buttonB=new JButton("Cuerpo");
		this.buttonB.setBounds(250,450,100,50);
		this.buttonB.addActionListener(ev);
		this.buttonB.setVisible(false);

        this.buttonL=new JButton("Piernas");
		this.buttonL.setBounds(400,450,100,50);
		this.buttonL.addActionListener(ev);
		this.buttonL.setVisible(false);
		
		this.buttonGG=new JButton("Guardar");
		this.buttonGG.setBounds(400,490,100,50);
		this.buttonGG.addActionListener(ev);
		this.buttonGG.setVisible(false);
		
		this.add(button1);
		this.add(buttonM);
		this.add(buttonF);
		this.add(buttonO);
		this.add(buttonO2);
		this.add(buttonH);
        this.add(buttonB);
        this.add(buttonL);
		this.add(buttonGG);
	}
	
	public void botoneGen() {
		this.buttonF.setVisible(true);
		this.buttonM.setVisible(true);
	}
	
	public void botoneOpt() {
		this.buttonO.setVisible(true);
		this.buttonO2.setVisible(true);
	}

    public void botoneMod(){
        this.buttonH.setVisible(true);
        this.buttonB.setVisible(true);
        this.buttonL.setVisible(true);
    }

    public void crearCanva(Head cabeza, Body cuerpo, Legs piernas) {
		this.mp = new MyPanel(cabeza, cuerpo, piernas);
		this.mp.setBounds(20, 20, 300, 500);
		this.add(mp);
	
	}

    public void guardar() {
		BufferedImage bufferedImage = new BufferedImage(mp.getWidth(), mp.getHeight(), BufferedImage.TYPE_INT_RGB);
        mp.paint(bufferedImage.getGraphics());
		try {
            File output = new File("panel_image.jpg");
            ImageIO.write(bufferedImage, "jpg", output);
            System.out.println("Imagen guardada en: " + output.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
    
}

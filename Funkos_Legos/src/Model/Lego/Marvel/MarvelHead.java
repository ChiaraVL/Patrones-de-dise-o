package Model.Lego.Marvel;

import javax.swing.ImageIcon;
import java.util.ArrayList;

import Model.Head;
import Model.Parte;

public class MarvelHead implements Head{

    private ArrayList<ImageIcon> Marvel;
    private int imagenActualIndex = 0;

    public MarvelHead(){
        Marvel = new ArrayList<>();
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Cabeza/1.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Cabeza/2.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Cabeza/3.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Cabeza/4.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Cabeza/5.jpg"));
        Marvel.add(new ImageIcon("Imagenes/Lego/Marvel/Cabeza/6.jpg"));
    }

    @Override
    public ImageIcon getImage() {
        return Marvel.get(imagenActualIndex);}

    @Override
    public void changeImage() {
        imagenActualIndex = (imagenActualIndex + 1) % Marvel.size();
    }

    @Override
    public Parte clonar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clonar'");
    }

}

package Model.Lego.Dc;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import Model.Body;
import Model.Parte;

public class DcBody implements Body {

    private ArrayList<ImageIcon> DC;
    private int imagenActualIndex = 0;

    public DcBody(){
        DC = new ArrayList<>();
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Tronco/1.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Tronco/2.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Tronco/3.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Tronco/4.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Tronco/5.jpg"));
        DC.add(new ImageIcon("Imagenes/Lego/Dc/Tronco/6.jpg"));
    }

    @Override
    public ImageIcon getImage() {
        return DC.get(imagenActualIndex);
    }

    @Override
    public void changeImage() {
        imagenActualIndex = (imagenActualIndex + 1) % DC.size();
    }

    @Override
    public Parte clonar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clonar'");
    }

}

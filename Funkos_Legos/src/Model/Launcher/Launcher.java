package Model.Launcher;

import View.Window;
import Controller.Events;
import Model.Logic;

public class Launcher {
    public static void main(String[] args) throws Exception {
        Logic l =  new Logic();
        Events e = new Events(l);
        Window w =  new Window(e);

        e.setV(w);
    }
}

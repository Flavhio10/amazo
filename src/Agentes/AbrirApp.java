
package Agentes;
import Visao.Principal;
import jade.core.behaviours.Behaviour;
import jade.core.Agent;

public class AbrirApp extends Behaviour {

    public AbrirApp(Agent a) {
        super(a);
    }

    @Override
    public void action() {

        Principal frame = new Principal();
        frame.setVisible(true);
    }

    @Override
    public boolean done() {
        return true;
    }
}

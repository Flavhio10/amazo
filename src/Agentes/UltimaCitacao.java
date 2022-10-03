/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;
import Modelo.Citacao;
import Modelo.persistencia.CitacaoDao;
import jade.core.behaviours.Behaviour;
import jade.core.Agent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UltimaCitacao extends Behaviour {

    public UltimaCitacao(Agent a) {
        super(a);
    }

    @Override
    public void action() {

        ArrayList<Citacao> listaCitacao = new ArrayList<>();
        listaCitacao.addAll(new CitacaoDao().listarTodos());
        ArrayList<Citacao> temp = new ArrayList<>();
        temp.add(listaCitacao.get(listaCitacao.size() -1));
        
        String msn = "Última citação cadastrada!\n";
       
        msn += temp.toString();
        JOptionPane.showMessageDialog(null, msn.replaceAll("^.*\\[|\\].*$", ""));
    }

    @Override
    public boolean done() {
        return true;
    }
}

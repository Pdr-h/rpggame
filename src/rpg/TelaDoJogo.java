
package rpg;

import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;

public class TelaDoJogo extends JFrame {
    public TelaDoJogo(){
        //configurando frame
        setTitle("RPG");
        setVisible(true);
        setSize(1080,720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // painel principal
        JPanel PainelMain = new JPanel();
        PainelMain.setLayout(new BoxLayout(PainelMain, BoxLayout.X_AXIS));
        // painel da metade esquerda
        JPanel PainelEsq = new JPanel();
        PainelEsq.setLayout(new BoxLayout(PainelEsq, BoxLayout.Y_AXIS));
        // superior esquerdo
        JPanel PainelEsqCima = new JPanel();
        PainelEsqCima.setBackground(Color.GRAY);
        // inferior esquerdo dividido em 4
        JPanel PaineisEsqInf = new JPanel();
        PaineisEsqInf.setLayout(new GridLayout(2, 2));
        // teste p mostrar as divisoes
        for (int i = 0; i < 4; i++) {
            JButton button = new JButton("Botão " + (i + 1));
            PaineisEsqInf.add(button);
        }

        // Add painéis lado esquerdo
        PainelEsq.add(PainelEsqCima);
        PainelEsq.add(PaineisEsqInf);

        // painel metade direita
        JPanel PainelDir = new JPanel();
        PainelDir.setBackground(Color.RED);

        // Add painéis ao painel principal
        PainelMain.add(PainelEsq);
        PainelMain.add(PainelDir);

        // Add o painel principal no frame
        add(PainelMain);
    }
}

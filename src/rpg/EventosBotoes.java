package rpg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

    public class EventosBotoes {
        private MenuBotoes.Frame frame;

        public EventosBotoes(MenuBotoes.Frame frame) {
            this.frame = frame;
        }

        public class EventoJogar implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaDoJogo();
                frame.dispose();
            }
        }

        public class EventoOpcoes implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "OPCOES");
            }
        }

        public class EventoSair implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        }
    }


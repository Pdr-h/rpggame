package rpg;

import javax.swing.SwingUtilities;

public class MainRpg {
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(TelaMenu::new);
        //TelaDoJogo telaDoJogo = new TelaDoJogo();
        SwingUtilities.invokeLater(MenuBotoes::new);
    }
}



package rpg;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MenuBotoes {
    private static final JButton jogar = new JButton("Jogar");
    private static final JButton opcoes = new JButton("Opcoes");
    private static final JButton sair = new JButton("Sair");
    private static final JLabel label = new JLabel();

    public MenuBotoes() {
        new Frame();
    }

    public static class Frame extends JFrame {
        public Frame() {
            BufferedImage img = null;

            try {
                img=ImageIO.read(new File("src/assets/MenuRpg.png"));
            }catch (IOException e){
                e.printStackTrace();
            }

            label.setLayout(new GridBagLayout());
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER);

            label.add(jogar);
            label.add(opcoes);
            label.add(sair);

            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(900, 700);
            setTitle("RPG");

            Image dimg=img.getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageIcon=new ImageIcon(dimg);
            label.setIcon(imageIcon);

            setVisible(true);
            add(label);
            ConfigBotao();
        }

        public void ConfigBotao(){

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = GridBagConstraints.RELATIVE;
            gbc.insets = new Insets(10, 0, 10, 0); // Margem superior e inferior
            gbc.anchor = GridBagConstraints.CENTER; // Centraliza os componentes horizontalmente e verticalmente
            gbc.fill = GridBagConstraints.HORIZONTAL; // Preenche horizontalmente

            jogar.setFont(new Font("Serif", Font.BOLD, 40));
            jogar.setPreferredSize(new Dimension(300, 80));
            jogar.setBackground(Color.BLACK);
            jogar.setForeground(Color.GREEN);
            label.add(jogar, gbc);

            opcoes.setFont(new Font("Serif", Font.BOLD, 40));
            opcoes.setPreferredSize(new Dimension(300, 80));
            opcoes.setBackground(Color.BLACK);
            opcoes.setForeground(Color.YELLOW);
            label.add(opcoes, gbc);

            sair.setFont(new Font("Serif", Font.BOLD, 40));
            sair.setPreferredSize(new Dimension(300, 80));
            sair.setBackground(Color.BLACK);
            sair.setForeground(Color.RED);
            label.add(sair, gbc);

            EventosBotoes eventosBotoes = new EventosBotoes(this); // Passa a inst�ncia da janela do menu
            jogar.addActionListener(eventosBotoes.new EventoJogar());
            opcoes.addActionListener(eventosBotoes.new EventoOpcoes());
            sair.addActionListener(eventosBotoes.new EventoSair());

        }

    }
}

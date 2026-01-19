package com.mycompany.visualnoveldemo;

import javax.swing.*;
import java.awt.*;

public class MainMenuUI extends JFrame {

    public MainMenuUI() {
        initUI();
    }
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        if (b) {
            SoundPlayer.playBGM("/audio/bgm_menu.wav", true);
        }
    }

    private void initUI() {
        setTitle("The First Chapter of Love");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 768);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ----- พื้นหลัง -----
        JLabel bg = new JLabel();
        bg.setLayout(new BorderLayout());
        bg.setIcon(new ImageIcon(getClass().getResource("/images/background/mainmenu.png")));
        add(bg, BorderLayout.CENTER);

        // ----- กล่องตรงกลาง -----
        JPanel centerPanel = new JPanel();
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(60, 0, 60, 0));

        JLabel title = new JLabel("The First Chapter of Love", SwingConstants.CENTER);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("SansSerif", Font.BOLD, 32));
        title.setForeground(Color.BLACK);

        JLabel heart = new JLabel("♥", SwingConstants.CENTER);
        heart.setAlignmentX(Component.CENTER_ALIGNMENT);
        heart.setFont(new Font("SansSerif", Font.PLAIN, 48));
        heart.setForeground(Color.PINK);

        centerPanel.add(heart);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(title);
        centerPanel.add(Box.createVerticalStrut(30));

        // -------- ปุ่มเมนู (ไม่มี Setting แล้ว!) --------
        JButton newGameBtn = createMenuButton("New Game");
        JButton continueBtn = createMenuButton("Continue");
        JButton settingBtn  = createMenuButton("Setting");
        JButton creditBtn   = createMenuButton("Credit");
        JButton exitBtn     = createMenuButton("Exit");

        centerPanel.add(newGameBtn);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(continueBtn);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(settingBtn);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(creditBtn);
        centerPanel.add(Box.createVerticalStrut(10));
        centerPanel.add(exitBtn);

        bg.add(centerPanel, BorderLayout.CENTER);

        // ---------- event ปุ่มต่าง ๆ ----------

        newGameBtn.addActionListener(e -> {
               SoundPlayer.playSFX("/audio/click.wav");
               startNewGame();
       });
        continueBtn.addActionListener(e -> {
               SoundPlayer.playSFX("/audio/click.wav");
               continueGame();
        });
        settingBtn.addActionListener(e -> {
               SoundPlayer.playSFX("/audio/click.wav");
               new SettingsDialog(this).setVisible(true);
        });
        exitBtn.addActionListener(e -> {
               SoundPlayer.playSFX("/audio/click.wav");
               System.exit(0);
        });

        creditBtn.addActionListener(e -> {
              SoundPlayer.playSFX("/audio/click.wav");
              JOptionPane.showMessageDialog(this, "The First Charapter of Love \n Natchanon Saileamonpiwat 1670700044  \n Jeerapat Watcharamoon 1670703162 \n Akkarawin Seribuskorn 1670703311 \n Mekin Kantawichai  1670703675 ");
        });
    }

    private JButton createMenuButton(String text) {
        JButton btn = new JButton(text);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setMaximumSize(new Dimension(200, 40));
        btn.setFocusPainted(false);
        return btn;
    }

    private void startNewGame() {
        SoundPlayer.stopBGM();
        GameEngine engine = GameData.createEngine();
        GameUI ui = new GameUI(engine);
        ui.setVisible(true);
        dispose();
    }

    private void continueGame() {
        SoundPlayer.stopBGM();
        // เปิดเกม แล้วให้โหลดเซฟทันที
        GameUI ui = new GameUI();
        ui.setVisible(true);
        ui.loadGame();  // เรียกเมธอดเดียวกับปุ่ม Load ในเกม
        dispose();
    }

    public static void main(String[] args) {
        java.awt.Font thai = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18);
        java.util.Enumeration keys = javax.swing.UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = javax.swing.UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                javax.swing.UIManager.put(key, thai);
            }
        }
        java.awt.EventQueue.invokeLater(() -> new MainMenuUI().setVisible(true));
    }
}

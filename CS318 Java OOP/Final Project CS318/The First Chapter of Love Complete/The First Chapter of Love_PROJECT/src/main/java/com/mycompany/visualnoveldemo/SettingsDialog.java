package com.mycompany.visualnoveldemo;

import javax.swing.*;
import java.awt.*;

public class SettingsDialog extends JDialog {

    public SettingsDialog(JFrame owner) {
        super(owner, "Setting", true);
        initUI();
    }

    private void initUI() {
        setSize(650, 300);
        setLocationRelativeTo(getOwner());
        setResizable(false);

        JPanel root = new JPanel(new BorderLayout(12, 12));
        root.setBorder(BorderFactory.createEmptyBorder(14, 16, 16, 16));
        setContentPane(root);

        JLabel title = new JLabel("Setting");
        title.setFont(new Font("SansSerif", Font.BOLD, 28));
        root.add(title, BorderLayout.NORTH);

        // ----- center: label + slider -----
        JPanel center = new JPanel();
        center.setLayout(new GridBagLayout());
        root.add(center, BorderLayout.CENTER);

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(10, 10, 10, 10);
        gc.anchor = GridBagConstraints.WEST;

        JLabel volLabel = new JLabel("Sound Volume");
        volLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JSlider slider = new JSlider(0, 100, Math.round(SoundPlayer.getVolume() * 100));
        slider.setPreferredSize(new Dimension(380, 40));
        slider.addChangeListener(e -> {
            float v = slider.getValue() / 100f;
            SoundPlayer.setVolume(v);
        });

        gc.gridx = 0; gc.gridy = 0;
        center.add(volLabel, gc);

        gc.gridx = 1; gc.gridy = 0;
        center.add(slider, gc);

        // ----- bottom: close button -----
        JButton closeBtn = new JButton("Close");
        closeBtn.setPreferredSize(new Dimension(160, 44));
        closeBtn.addActionListener(e -> dispose());

        JPanel bottom = new JPanel();
        bottom.add(closeBtn);
        root.add(bottom, BorderLayout.SOUTH);
    }
}

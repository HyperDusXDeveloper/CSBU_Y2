package com.mycompany.visualnoveldemo;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class RelationshipUI extends JFrame {

    private final GameEngine engine;

    public RelationshipUI(GameEngine engine) {
        this.engine = engine;

        setTitle("ค่าความสัมพันธ์");
        setSize(400, 300);
        setLocationRelativeTo(null); // เปิดกลางจอ
        setLayout(new BorderLayout());

        JPanel listPanel = new JPanel();
        listPanel.setLayout(new GridLayout(0, 1, 5, 5));

        PlayerState state = engine.getPlayerState();
        Map<String, Integer> affection = state.getAffectionMap();

        // ดึงข้อมูลตัวละครทั้งหมดจาก GameEngine
        for (Character c : engine.getAllCharacters()) {

            int value = affection.getOrDefault(c.getId(), 0);

            JPanel row = new JPanel(new BorderLayout(5, 5));

            JLabel nameLabel = new JLabel(c.getName());
            nameLabel.setPreferredSize(new Dimension(100, 30));

            JProgressBar bar = new JProgressBar(0, 100);
            bar.setValue(value);
            bar.setStringPainted(true);

            row.add(nameLabel, BorderLayout.WEST);
            row.add(bar, BorderLayout.CENTER);

            listPanel.add(row);
        }

        add(new JScrollPane(listPanel), BorderLayout.CENTER);

        JButton closeBtn = new JButton("ปิด");
        closeBtn.addActionListener(e -> dispose());

        add(closeBtn, BorderLayout.SOUTH);
    }
}

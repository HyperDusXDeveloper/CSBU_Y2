package com.mycompany.visualnoveldemo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DialogLogUI extends JDialog {

    private final JTextPane textPane = new JTextPane();

    public DialogLogUI(JFrame owner) {
        super(owner, "DIALOG", false); // false = modeless (เปิดค้างได้)
        initUI();
    }

    private void initUI() {
        setSize(650, 420);
        setLocationRelativeTo(getOwner());
        setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        JPanel root = new JPanel(new BorderLayout());
        root.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(root);

        // Top bar: title + close
        JPanel top = new JPanel(new BorderLayout());
        JLabel title = new JLabel("DIALOG");
        title.setFont(new Font("Tahoma", Font.BOLD, 20));
        top.add(title, BorderLayout.WEST);

        JButton close = new JButton("ปิด");
        close.addActionListener(e -> setVisible(false));
        top.add(close, BorderLayout.EAST);

        root.add(top, BorderLayout.NORTH);

        // Log area (เหมือนกล่องสีฟ้า)
        textPane.setEditable(false);
        textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
        textPane.setBackground(new Color(140, 235, 245)); // ฟ้าอ่อน
        textPane.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane sp = new JScrollPane(textPane);
        sp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
        root.add(sp, BorderLayout.CENTER);
    }

    /** เติมข้อความต่อท้าย log */
    public void appendLine(String line) {
        if (line == null) return;
        String cur = textPane.getText();
        if (cur == null) cur = "";
        if (!cur.isEmpty() && !cur.endsWith("\n")) cur += "\n";
        textPane.setText(cur + line);

        // เลื่อนไปท้ายสุด
        SwingUtilities.invokeLater(() -> {
            textPane.setCaretPosition(textPane.getDocument().getLength());
        });
    }

    public void clear() {
        textPane.setText("");
    }

    public void clearLog() {
        textPane.setText("");   // หรือ component ที่คุณใช้เก็บข้อความ
    }
}

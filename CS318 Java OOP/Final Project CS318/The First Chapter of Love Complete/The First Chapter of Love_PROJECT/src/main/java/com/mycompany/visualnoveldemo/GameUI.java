/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visualnoveldemo;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author fung4
 */
public class GameUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameUI.class.getName());
    
    private final GameEngine engine;
    private int dialogueIndex = 0;
    
    private DialogLogUI dialogLog;
    
    private static final String SAVE_FILE = "savegame.dat";

    /**
     * Creates new form GameUI
     */
    public GameUI() {
        this(GameData.createEngine());
    }
    
    public GameUI(GameEngine engine) {
        initComponents();
        
        dialogueArea.setLineWrap(true);        // ตัดบรรทัดอัตโนมัติ
        dialogueArea.setWrapStyleWord(true);   // ไม่ตัดกลางคำ
        dialogueArea.setEditable(false);       // พิมพ์ไม่ได้
        dialogueArea.setFocusable(false);      // ไม่ให้คลิกแล้วกระพริบ
        dialogueArea.setCursor(null);          // ไม่ขึ้น cursor
        //dialogueArea.setOpaque(false);         // พื้นหลังโปร่ง (ถ้าอยากให้เนียน)
        jScrollPane1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );

        dialogLog = new DialogLogUI(this);
        choicesPanel.setLayout(new java.awt.GridLayout(0, 1, 5, 5));
        this.engine = GameData.createEngine();
        updateView();
    }
    
    private void updateView() {
        Scene current = engine.getCurrentScene();
        String bgm = current.getBgmPath();
        if (bgm != null) {
            SoundPlayer.playBGM(bgm, true);
        }

        if (current == null) return;

        dialogueIndex = 0;
        showDialogue();
    }
    
    private void showDialogue() {
        Scene current = engine.getCurrentScene();
        if (current == null) return;

        java.util.List<DialogueLine> lines = current.getDialogues();
        if (dialogueIndex < 0 || dialogueIndex >= lines.size()) return;

        DialogueLine line = lines.get(dialogueIndex);
        Character speaker = line.getSpeaker();

        // ================= รูป + ชื่อคนพูด =================
        characterLabel.setIcon(null);

        String speakerName;

        if (speaker != null) {
            speakerName = speaker.getName();
            speakerLabel.setText(speakerName);

            // ✅ เลือกท่าทางจาก DialogueLine
            String expr = line.getExpressionKey();
            String avatarPath = speaker.getAvatarPath(expr);

            if (avatarPath != null && !avatarPath.isEmpty()) {
                java.net.URL url = getClass().getResource(avatarPath);
                if (url != null) {
                    characterLabel.setIcon(new javax.swing.ImageIcon(url));
                } else {
                    characterLabel.setIcon(null);
                }
            }
        } else {
            speakerName = "บรรยาย";
            speakerLabel.setText(speakerName);
            characterLabel.setIcon(null);
        }

        // ================= ข้อความพูด =================
        dialogueArea.setText(line.getText());

        // 👉 บันทึกเข้า Dialog Log
        if (dialogLog != null) {
            dialogLog.appendLine(speakerName + " : " + line.getText());
        }

        // ================= พื้นหลัง (Dialogue > Scene) =================
        String bgPath = line.getBackgroundPath();   // ✅ 1) เช็คจาก DialogueLine ก่อน
        if (bgPath == null || bgPath.isEmpty()) {
            bgPath = current.getBackgroundPath();  // ✅ 2) fallback ไป Scene
        }

        if (bgPath != null && !bgPath.isEmpty()) {
            java.net.URL bgUrl = getClass().getResource(bgPath);
            if (bgUrl != null) {
                backgroundLabel.setIcon(new javax.swing.ImageIcon(bgUrl));
            }
        }

        choicesPanel.removeAll();
        choicesPanel.revalidate();
        choicesPanel.repaint();
        nextButton.setEnabled(true);
    }





    private void showChoices() {
        choicesPanel.removeAll();

        // 👉 เขียนหัวข้อใน Dialog Log
        if (dialogLog != null) {
            dialogLog.appendLine("ตัวเลือก:");
        }

        for (Choice c : engine.getAvailableChoices()) {
            JButton btn = new JButton(c.getText());

            // 👉 บันทึก choice ลง log ตอนกด
            btn.addActionListener(e -> {
                SoundPlayer.playSFX("/audio/click.wav");
                if (dialogLog != null) {
                    dialogLog.appendLine("ผู้เล่นเลือก : " + c.getText());
                }
                engine.choose(c);
                updateView();
            });

            choicesPanel.add(btn);

            // 👉 แสดง choice ใน log ด้วย
            if (dialogLog != null) {
                dialogLog.appendLine(" - " + c.getText());
            }
        }

        choicesPanel.revalidate();
        choicesPanel.repaint();
        nextButton.setEnabled(false);
    }

    
    private void openRelationshipWindow() {
        RelationshipUI ui = new RelationshipUI(engine);
        ui.setVisible(true);
    }
    
    private void saveGame() {
        try {
            // ขอข้อมูลเซฟจาก engine
            SaveData data = engine.toSaveData(dialogueIndex);

            // เรียกแบบใช้ชื่อคลาส SaveData (static method)
            SaveData.saveToFile(SAVE_FILE, data);

            JOptionPane.showMessageDialog(this, "บันทึกเกมเรียบร้อยแล้ว!");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(
                    this,
                    "บันทึกไม่สำเร็จ: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }


    public void loadGame() {
        try {
            SaveData data = SaveData.loadFromFile(SAVE_FILE);
            if (data == null) {
                JOptionPane.showMessageDialog(this, "ยังไม่มีไฟล์เซฟ");
                return;
            }

            engine.loadFromSaveData(data);
            this.dialogueIndex = data.getDialogueIndex();

            // ✅ กลับไปตำแหน่งเดิมที่เซฟไว้
            dialogueIndex = data.getDialogueIndex();

            // ✅ อย่าเรียก updateView() ถ้ามันรีเซ็ต index
            showDialogue();

            // ✅ อัพเดท DialogLogUI ให้ตรงกับตำแหน่งที่โหลด
            rebuildDialogLog();

            JOptionPane.showMessageDialog(this, "โหลดเกมเรียบร้อยแล้ว!");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(
                    this,
                    "โหลดไม่สำเร็จ: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    private void showGameEndDialog() {
        int result = JOptionPane.showOptionDialog(
                this,
                "เรื่องราวจบลงแล้ว\nขอบคุณที่เล่น!",
                "Game End",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new Object[]{"กลับหน้าหลัก"},
                "กลับหน้าหลัก"
        );

        if (result == 0) {
            goToMainMenu();
        }
    }

    private void goToMainMenu() {
        // หยุด BGM ถ้ามี
        SoundPlayer.stopBGM();

        MainMenuUI menu = new MainMenuUI();
        menu.setVisible(true);
        dispose(); // ปิดหน้าเกม
    }

    private void rebuildDialogLog() {
        if (dialogLog == null) return;

        dialogLog.clearLog();

        Scene current = engine.getCurrentScene();
        if (current == null) return;

        java.util.List<DialogueLine> lines = current.getDialogues();
        if (lines == null || lines.isEmpty()) return;

        int end = Math.max(0, Math.min(dialogueIndex, lines.size() - 1));

        for (int i = 0; i <= end; i++) {
            DialogueLine line = lines.get(i);
            Character sp = line.getSpeaker();
            String name = (sp != null) ? sp.getName() : "บรรยาย";
            dialogLog.appendLine(name + " : " + line.getText());
        }

        // ถ้าโหลดมาอยู่ท้ายฉากและมีช้อยส์ -> ใส่ช้อยส์ลง log ด้วย (ถ้าคุณอยากให้เห็น)
        if (end == lines.size() - 1 && !engine.getAvailableChoices().isEmpty()) {
            dialogLog.appendLine("ตัวเลือก:");
            for (Choice c : engine.getAvailableChoices()) {
                dialogLog.appendLine(" - " + c.getText());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundLabel = new javax.swing.JLabel();
        characterLabel = new javax.swing.JLabel();
        speakerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dialogueArea = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        choicesPanel = new javax.swing.JPanel();
        relationshipButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        backToMenuButton = new javax.swing.JButton();
        dialogButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background/l7.jpg"))); // NOI18N

        characterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charlactor/main_1.png"))); // NOI18N

        speakerLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        speakerLabel.setText("ป้ายชื่อคนพูด");

        dialogueArea.setColumns(20);
        dialogueArea.setRows(5);
        jScrollPane1.setViewportView(dialogueArea);

        nextButton.setText("ต่อไป");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choicesPanelLayout = new javax.swing.GroupLayout(choicesPanel);
        choicesPanel.setLayout(choicesPanelLayout);
        choicesPanelLayout.setHorizontalGroup(
            choicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        choicesPanelLayout.setVerticalGroup(
            choicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        relationshipButton.setText("ความสัมพันธ์");
        relationshipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relationshipButtonActionPerformed(evt);
            }
        });

        saveButton.setText("บันทึก");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setText("โหลด");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        backToMenuButton.setText("กลับเมนูหลัก");
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });

        dialogButton.setText("กล่องข้อความ");
        dialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(characterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(choicesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addComponent(speakerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backToMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relationshipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dialogButton, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(characterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speakerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choicesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relationshipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backToMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        SoundPlayer.playSFX("/audio/click.wav");
        Scene current = engine.getCurrentScene();
        java.util.List<DialogueLine> lines = current.getDialogues();

        if (dialogueIndex < lines.size() - 1) {
            dialogueIndex++;
            showDialogue();
        } else {
            // บทพูดหมดแล้ว
            if (current.isEnding()) {
                showGameEndDialog();
            } else {
                showChoices();
            }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void relationshipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relationshipButtonActionPerformed
        // TODO add your handling code here:
        SoundPlayer.playSFX("/audio/click.wav");
        openRelationshipWindow();
    }//GEN-LAST:event_relationshipButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        SoundPlayer.playSFX("/audio/click.wav");
        saveGame();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        SoundPlayer.playSFX("/audio/click.wav");
        loadGame();
    }//GEN-LAST:event_loadButtonActionPerformed

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        // TODO add your handling code here:
        SoundPlayer.playSFX("/audio/click.wav");
        // ปิด GameUI
        this.dispose();

        // เปิดหน้าเมนูหลักใหม่
        MainMenuUI menu = new MainMenuUI();
        menu.setVisible(true);
    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void dialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogButtonActionPerformed
        // TODO add your handling code here:
        SoundPlayer.playSFX("/audio/click.wav");
        dialogLog.setVisible(true);
    }//GEN-LAST:event_dialogButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.Font thai = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18);
        java.util.Enumeration keys = javax.swing.UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = javax.swing.UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                javax.swing.UIManager.put(key, thai);
            }
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GameUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel characterLabel;
    private javax.swing.JPanel choicesPanel;
    private javax.swing.JButton dialogButton;
    private javax.swing.JTextArea dialogueArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton relationshipButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel speakerLabel;
    // End of variables declaration//GEN-END:variables
}

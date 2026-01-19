package com.mycompany.visualnoveldemo;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class SoundPlayer {

    private static Clip bgmClip;
    private static FloatControl bgmGain;
    private static float volume = 0.8f; // 0.0 - 1.0

    public static void playBGM(String resourcePath, boolean loop) {
        stopBGM();
        try {
            URL url = SoundPlayer.class.getResource(resourcePath);
            if (url == null) {
                System.out.println("BGM not found: " + resourcePath);
                return;
            }

            AudioInputStream ais = AudioSystem.getAudioInputStream(url);
            bgmClip = AudioSystem.getClip();
            bgmClip.open(ais);

            if (bgmClip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                bgmGain = (FloatControl) bgmClip.getControl(FloatControl.Type.MASTER_GAIN);
                applyVolumeToGain();
            } else {
                bgmGain = null;
            }

            if (loop) bgmClip.loop(Clip.LOOP_CONTINUOUSLY);
            bgmClip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }

    public static void stopBGM() {
        if (bgmClip != null) {
            bgmClip.stop();
            bgmClip.close();
            bgmClip = null;
        }
        bgmGain = null;
    }

    public static void setVolume(float v) {
        volume = clamp01(v);
        applyVolumeToGain();
    }

    public static float getVolume() {
        return volume;
    }

    private static void applyVolumeToGain() {
        if (bgmGain == null) return;

        // map 0..1 -> dB (เงียบมาก ~ -60dB ถึง 0dB)
        float min = bgmGain.getMinimum(); // มักเป็น -80
        float max = bgmGain.getMaximum(); // มักเป็น 0
        float db;

        if (volume <= 0.0001f) db = min;
        else {
            // ใช้ log ทำให้ช่วงเสียง “ธรรมชาติ” กว่า linear
            db = (float) (20.0 * Math.log10(volume));
            if (db < min) db = min;
            if (db > max) db = max;
        }

        bgmGain.setValue(db);
    }

    private static float clamp01(float x) {
        return Math.max(0f, Math.min(1f, x));
    }

    // ---------- เล่นเสียงเอฟเฟกต์ (ไม่ loop) ----------
    public static void playSFX(String resourcePath) {
        try {
            URL url = SoundPlayer.class.getResource(resourcePath);
            if (url == null) {
                System.out.println("SFX not found: " + resourcePath);
                return;
            }

            AudioInputStream ais = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);

            // ใช้ volume เดียวกับ BGM
            if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                FloatControl gain =
                        (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                float min = gain.getMinimum();
                float max = gain.getMaximum();
                float db = (float) (20.0 * Math.log10(Math.max(0.0001f, volume)));
                gain.setValue(Math.max(min, Math.min(max, db)));
            }

            clip.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

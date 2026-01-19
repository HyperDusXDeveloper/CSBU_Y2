package com.mycompany.visualnoveldemo;

// import javafx.scene.Scene;

public class GameData {

    public static GameEngine createEngine() {
        GameEngine engine = new GameEngine();

        // ---------- ตัวละคร ----------
        Character main = new Character(
                "main",
                "ตัวเอก"
        );
        // เพิ่มท่าทาง
        main.addExpression("main_basic", "/images/charlactor/main_basic.png");
        main.addExpression("main_ask",  "/images/charlactor/main_ask.png");
        main.addExpression("main_angry",  "/images/charlactor/main_angry.png");
        main.addExpression("main_boring",  "/images/charlactor/main_boring.png");
        main.addExpression("main_collapse",  "/images/charlactor/main_collapse.png");
        main.addExpression("main_collapsekb",  "/images/charlactor/main_collapsekb.png");
        main.addExpression("main_confused",  "/images/charlactor/main_confused.png");
        main.addExpression("main_deepthinking",  "/images/charlactor/main_deepthinking.png");
        main.addExpression("main_depositmoney",  "/images/charlactor/main_depositmoney.png");
        main.addExpression("main_handupshock",  "/images/charlactor/main_handupshock.png");
        main.addExpression("main_laughlittle",  "/images/charlactor/main_laughlittle.png");
        main.addExpression("main_markpoint",  "/images/charlactor/main_markpoint.png");
        main.addExpression("main_sorry",  "/images/charlactor/main_sorry.png");
        main.addExpression("main_sunshade",  "/images/charlactor/main_sunshade.png");
        main.addExpression("main_surprised",  "/images/charlactor/main_surprised.png");
        main.addExpression("main_thinking",  "/images/charlactor/main_thinking.png");
        main.addExpression("main_umm",  "/images/charlactor/main_umm.png");
        main.addExpression("main_usemobile",  "/images/charlactor/main_usemobile.png");
        main.addExpression("main_yawn",  "/images/charlactor/main_yawn.png");
        main.setDefaultExpression("main_basic");

        Character himiko = new Character(
                "himiko",
                "ฮิมิโกะ"
        );
        // เพิ่มท่าทางหลายแบบ
        himiko.addExpression("himiko_eyecontact", "/images/charlactor/himiko_eyecontact.png");
        himiko.addExpression("himiko_yay",  "/images/charlactor/himiko_yay.png");
        himiko.addExpression("himiko_surprised",  "/images/charlactor/himiko_surprised.png");
        himiko.addExpression("himiko_sorry",  "/images/charlactor/himiko_sorry.png");
        himiko.addExpression("himiko_chubbycheeks",  "/images/charlactor/himiko_chubbycheeks.png");
        himiko.addExpression("himiko_boring",  "/images/charlactor/himiko_boring.png");
        himiko.addExpression("himiko_interested",  "/images/charlactor/himiko_interested.png");
        himiko.addExpression("himiko_angry",  "/images/charlactor/himiko_angry.png");
        himiko.addExpression("himiko_jump",  "/images/charlactor/himiko_jump.png");
        himiko.addExpression("himiko_open",  "/images/charlactor/himiko_open.png");
        himiko.addExpression("himiko_scary",  "/images/charlactor/himiko_scary.png");
        himiko.addExpression("himiko_laugh", "/images/charlactor/himiko_laugh.png");
        himiko.addExpression("himiko_comeon",  "/images/charlactor/himiko_comeon.png");
        himiko.addExpression("himiko_hihi",  "/images/charlactor/himiko_hihi.png");
        himiko.addExpression("himiko_gasp",  "/images/charlactor/himiko_gasp.png");
        himiko.addExpression("himiko_shy",  "/images/charlactor/himiko_shy.png");
        himiko.addExpression("himiko_shock",  "/images/charlactor/himiko_shock.png");
        himiko.addExpression("himiko_smile",  "/images/charlactor/himiko_smile.png");
        himiko.addExpression("himiko_nocare",  "/images/charlactor/himiko_nocare.png");
        himiko.addExpression("himiko_point",  "/images/charlactor/himiko_point.png");
        himiko.addExpression("himiko_explain",  "/images/charlactor/himiko_explain.png");
        himiko.addExpression("himiko_ask",  "/images/charlactor/himiko_ask.png");
        himiko.addExpression("himiko_focus_wondersomething",  "/images/charlactor/himiko_focus_wondersomething.png");
        himiko.addExpression("himiko_Panickingloot",  "/images/charlactor/himiko_Panickingloot.png");
        himiko.addExpression("himiko_usemobile",  "/images/charlactor/himiko_usemobile.png");
        himiko.addExpression("himiko_sent",  "/images/charlactor/himiko_sent.png");
        himiko.addExpression("himiko_duck_confused",  "/images/charlactor/himiko_duck_confused.png");
        himiko.addExpression("himiko_duck_ok",  "/images/charlactor/himiko_duck_ok.png");
        himiko.addExpression("himiko_duck_laugh",  "/images/charlactor/himiko_duck_laugh.png");
        himiko.addExpression("himiko_duck_sweeteyes",  "/images/charlactor/himiko_duck_sweeteyes.png");
        himiko.addExpression("himiko_duck_smile",  "/images/charlactor/himiko_duck_smile.png");
        himiko.addExpression("himiko_duck_shy",  "/images/charlactor/himiko_duck_shy.png"); 
        himiko.addExpression("himiko_sexyopen",  "/images/charlactor/himiko_sexyopen.png"); 
        himiko.setDefaultExpression("himiko_eyecontact");

        Character rin = new Character(
                "rin",
                "ริน"
        );
        // เพิ่มท่าทางหลายแบบ
        rin.addExpression("rin_wow", "/images/charlactor/rin_wow.png");
        rin.addExpression("rin_jump", "/images/charlactor/rin_jump.png");
        rin.addExpression("rin_stickouttongue", "/images/charlactor/rin_stickouttongue.png");
        rin.addExpression("rin_boring", "/images/charlactor/rin_boring.png");
        rin.addExpression("rin_shy", "/images/charlactor/rin_shy.png");
        rin.addExpression("rin_smile", "/images/charlactor/rin_smile.png");
        rin.addExpression("rin_yay", "/images/charlactor/rin_yay.png");
        rin.addExpression("rin_ask", "/images/charlactor/rin_ask.png");
        rin.addExpression("rin_surprised", "/images/charlactor/rin_surprised.png");
        rin.addExpression("rin_sorry", "/images/charlactor/rin_sorry.png");
        rin.addExpression("rin_chubbycheeks", "/images/charlactor/rin_chubbycheeks.png");
        rin.setDefaultExpression("rin_smile");

        Character to = new Character(
                "to",
                "โต"
        );
        // เพิ่มท่าทางหลายแบบ
        to.addExpression("to_basic", "/images/charlactor/to_basic.png");
        to.addExpression("to_laugh", "/images/charlactor/to_laugh.png");
        to.addExpression("to_surprised", "/images/charlactor/to_surprised.png");
        to.addExpression("to_sweeteyes", "/images/charlactor/to_sweeteyes.png");
        to.addExpression("to_thinking", "/images/charlactor/to_thinking.png");
        to.setDefaultExpression("to_basic");

        Character j = new Character(
                "j",
                "พี่เจ"
        );
        j.addExpression("J_angry",  "/images/charlactor/J_angry.png");
        j.addExpression("J_angrymuch",  "/images/charlactor/J_angrymuch.png");
        j.addExpression("J_ask",  "/images/charlactor/J_ask.png");
        j.addExpression("J_boring",  "/images/charlactor/J_boring.png");
        j.addExpression("J_deepthinking",  "/images/charlactor/J_deepthinking.png");
        j.addExpression("J_deepthinking2",  "/images/charlactor/J_deepthinking2.png");
        j.addExpression("J_hacking",  "/images/charlactor/J_hacking.png");
        j.addExpression("J_interested",  "/images/charlactor/J_interested.png");
        j.addExpression("J_sad",  "/images/charlactor/J_sad.png");
        j.addExpression("J_sitsad",  "/images/charlactor/J_sitsad.png");
        j.addExpression("J_smile",  "/images/charlactor/J_smile.png");
        j.addExpression("J_sulk",  "/images/charlactor/J_sulk.png");
        j.addExpression("J_thinking",  "/images/charlactor/J_thinking.png");
        j.addExpression("J_yay",  "/images/charlactor/J_yay.png");
        j.setDefaultExpression("J_thinking");

        Character jj = new Character(
                "jj",
                "เจเจ"
        );
        jj.addExpression("main",  "/images/charlactor/unknow_human_female.png");
        jj.setDefaultExpression("main");

        Character mind = new Character(
                "mind",
                "มายด์"
        );
        mind.addExpression("main",  "/images/charlactor/unknow_human_female.png");
        mind.setDefaultExpression("main");

        Character sun = new Character(
                "sun",
                "ซัน"
        );
        sun.addExpression("sun_basic",  "/images/charlactor/sun_basic.png");
        sun.setDefaultExpression("sun_basic");

        Character old_lady = new Character(
                "old_lady",
                "แม่ค้า"
        );
        old_lady.addExpression("main",  "/images/charlactor/unknow_human_female.png");
        old_lady.setDefaultExpression("main");

        Character merchant = new Character(
                "merchant",
                "พ่อค้า"
        );
        merchant.addExpression("main",  "/images/charlactor/unknow_human_male.png");
        merchant.setDefaultExpression("main");

        Character secret = new Character(
                "secret",
                "???"
        );
        secret.addExpression("female",  "/images/charlactor/unknow_human_female.png");
        secret.addExpression("male",  "/images/charlactor/unknow_human_male.png");
        secret.setDefaultExpression("female");

        Character friend_a = new Character(
                "friend_a",
                "เพื่อน A"
        );
        friend_a.addExpression("main",  "/images/charlactor/unknow_human_female.png");
        friend_a.setDefaultExpression("main");

        Character friend_b = new Character(
                "friend_b",
                "เพื่อน B"
        );
        friend_b.addExpression("main",  "/images/charlactor/unknow_human_female.png");
        friend_b.setDefaultExpression("main");

        Character speaker = new Character(
                "speaker",
                "บรรยาย"
        );
        speaker.addExpression("microphone",  "/images/charlactor/microphone.png");
        speaker.addExpression("SFX",  "/images/charlactor/SFX.png");
        speaker.addExpression("sent",  "/images/charlactor/sent.png");
        speaker.addExpression("bobba",  "/images/charlactor/bobba.png");
        speaker.addExpression("line",  "/images/charlactor/line_havemessage.png");
        speaker.addExpression("himiko_scary",  "/images/charlactor/himiko_scary.png");
        speaker.addExpression("himiko_igstory",  "/images/charlactor/himiko_igstory.png");
        speaker.addExpression("himiko_sent",  "/images/charlactor/himiko_sent.png");
        speaker.addExpression("main_usemobile",  "/images/charlactor/main_usemobile.png");
        speaker.addExpression("deep_story",  "/images/charlactor/deep_story.png");
        speaker.setDefaultExpression("microphone");

        // Character narr = null;

        // ---------- Scene: Chapter0_Diamondhall ----------
        Scene Chapter0_Diamondhall = new Scene("intro");
        Chapter0_Diamondhall.setBackgroundPath("/images/background/deep_black.jpg");
        Chapter0_Diamondhall.setBgmPath("/audio/bgm_school.wav");

        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ชีวิตของผมก็มีแค่ while (alive) { code(); eat(); sleep(); }",
                "main_basic"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเคยคิดว่าชีวิตมหาลัยมันจะเหมือนในหนัง... สดใส มีสีสัน และเต็มไปด้วยเรื่องราวความรัก",
                "main_thinking",
                "/images/background/loop_break.png"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : แต่ความจริงสำหรับเด็ก Com Sci ปี 2 อย่างผม... มันคือหน้าจอสีดำ ตัวหนังสือสีขาว และบั๊ก (Bug) ที่แก้ไม่หายมา 3 ชั่วโมงแล้ว",
                "main_thinking"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(ยกมือบังแดด) \"แดดรังสิตนี่มันแรงดีจริงๆ... รู้งี้ไม่น่ารับปากอาจารย์ว่าจะมาช่วยดูซุ้มรับน้องตอนเช้าเลย\"",
                "main_sunshade",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(หาว) \"ง่วงชะมัด... เมื่อคืนกว่าจะรันโปรเจกต์ Java ผ่านก็ตีสาม\"",
                "main_yawn",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมชื่อ ตัวเอก นักศึกษาปี 2 คณะเทคโนโลยีสารสนเทศและนวัตกรรม สาขาวิทยาการคอมพิวเตอร์",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : วันนี้เป็นวันเปิดเทอมวันแรก หรือที่เรียกกันว่า 'First Day' บรรยากาศรอบตัวเลยเต็มไปด้วยพวกเด็กปี 1 เฟรชชี่ที่ใส่ชุดนักศึกษาใหม่เอี่ยม",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "\"เฮ้อ... รีบไปที่คณะดีกว่า เดี๋ยวโดนไอ้พวกเพื่อนเวรมันบ่นเอา\"",
                "main_basic",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ในขณะที่ผมกำลังก้มหน้ากดมือถือเช็กตารางเรียนอยู่นั้น... จู่ๆ ก็มีเงาเล็กๆ วิ่งตัดหน้าผมไป",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(speaker,
                "[SFX: เสียงชนเบาๆ \"ตุบ!\"] [Effect: จอภาพสั่นเล็กน้อย]",
                "SFX",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(secret,
                "\"อะ... โอ๊ย!\" [SFX: เสียงกระดาษ/สมุด หล่นกระจายลงพื้น]",
                "SFX",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! ขอโทษครับ เป็นอะไรไหมครับ?\"",
                "main_sorry",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมรีบเก็บมือถือแล้วก้มลงไปช่วยเก็บของที่หล่นเกลื่อนกลาด... มันคือแผนที่มหาลัย กับตารางเรียนที่ถูกไฮไลท์ไว้เต็มไปหมด",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(himiko,
                "\"มะ... ไม่เป็นไรค่ะ หนูผิดเองที่รีบวิ่ง ไม่ทันดูทาง...\"",
                "himiko_open",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : วินาทีที่เธอเงยหน้าขึ้นมา... โค้ดในหัวผมที่กำลังรันวนลูปอยู่นั้น เหมือนถูกสั่ง break; กะทันหัน",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมสั้นประบ่า ดวงตากลมโต และชื่อที่เขียนบนป้ายห้อยคอใบใหญ่นั่น...",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "(อ่านป้ายชื่อในใจ) ...ฮิมิโกะ?",
                "Main_basic",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(main,
                "\"นี่ครับ ของคุณ... ว่าแต่น้องจะรีบไปไหนเหรอ?\"",
                "Main_basic",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(himiko,
                "\"ขะ... ขอบคุณค่ะพี่! คือ... คือหนูหลงทางค่ะ\"",
                "himiko_sorry",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter0_Diamondhall.addDialogue(new DialogueLine(himiko,
                "\"หนูหาตึก C ไม่เจอ... ในแผนที่บอกว่าอยู่ตรงนี้ แต่หนูเดินวนมา 3 รอบแล้วก็เจอแต่ตึกเพชร\" (ชี้ไปที่ตึกเพชรอย่างงงๆ)",
                "himiko_explain",
                "/images/background/dimandhall_a3_morning.jpg"
        ));

        // ตัวเลือก (เพิ่ม/ลด relationship จริง)
        Choice Chapter0_Diamondhall_choice_01 = new Choice(
                "อ๋อ ตึก C อยู่ด้านหลังนี่เอง เดี๋ยวพี่พาไปส่งครับ",
                "Chapter0_Diamondhall01",
                "himiko",
                +6
        );

        Choice Chapter0_Diamondhall_choice_02 = new Choice(
                "ฮ่าๆ ปกติครับเด็กปี 1 หลงกันทุกคน เอางี้... เดินตามพี่มา",
                "Chapter0_Diamondhall01",
                "himiko",
                +4
        );

        Choice Chapter0_Diamondhall_choice_03 = new Choice(
                "ตึก C อยู่หลังม.นู้นเลยน้อง น้องมาผิดที่แล้วแหละ",
                "Chapter0_Diamondhall02",
                "himiko",
                -3
        );

        Choice Chapter0_Diamondhall_choice_04 = new Choice(
                "หัดใช้สมองหน่อยสิน้อง!!! นี่มันสมัยไหนแล้ว หัดใช้ google map บ้างนะ ใน BU App ก็มีบอกนะ",
                "Chapter0_Diamondhall03",
                "himiko",
                -7
        );

        Chapter0_Diamondhall.addChoice(Chapter0_Diamondhall_choice_01);
        Chapter0_Diamondhall.addChoice(Chapter0_Diamondhall_choice_02);
        Chapter0_Diamondhall.addChoice(Chapter0_Diamondhall_choice_03);
        Chapter0_Diamondhall.addChoice(Chapter0_Diamondhall_choice_04);

        // ---------- Scene: Chapter0_Diamondhall01 ----------
        Scene Chapter0_Diamondhall01 = new Scene("Chapter0_Diamondhall01");
        Chapter0_Diamondhall01.setBackgroundPath("/images/background/bku_tram.png");

        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "น้องชื่อฮิมิโกะเหรอ? ชื่อแปลกดีนะ เป็นลูกครึ่งญี่ปุ่นเหรอ?",
                "main_ask"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "ใช่ค่า! คุณพ่อเป็นญี่ปุ่น คุณแม่เป็นคนไทย... แต่หนูเกิดที่ไทยนะคะ พูดไทยชัดแจ๋วเลย!",
                "himiko_explain"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "พี่อยู่คณะอะไรเหรอคะ? ดูท่าทาง... เอ่อ... ดูฉลาดจัง",
                "himiko_explain"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "คณะ Com Sci ครับ... ที่ดูฉลาดอาจจะเพราะแว่นตา กับขอบตาดำๆ นี่มากกว่ามั้ง",
                "main_laughlittle"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "คิกๆ... พี่ตลกจัง หนูชื่อฮิมิโกะนะคะ อยู่ปี 1 นิเทศฯ... ฝากตัวด้วยนะคะรุ่นพี่!",
                "himiko_laugh"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "รอยยิ้มนั้น... มันสว่างกว่าแดดที่ส่องตึกเพชรซะอีก",
                "main_thinking"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "และนี่คือจุดเริ่มต้น... บทแรกแห่งความรักของผม ได้ถูกเขียนขึ้น (Compile) อย่างสมบูรณ์แล้ว... หรือผมจะคิดไปเองกันนะ",
                "main_thinking"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(speaker,
                "The First Chapter of Love",
                "main",
                "/images/background/the_first_chapter_of_love.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World (การเริ่มต้นใหม่)",
                "main",
                "/images/background/hello_world.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(speaker,
                "[SFX: เสียงเครื่องยนต์รถรางดังหึ่มๆ เบาๆ + เสียงลมพัด + เสียงนักศึกษาคุยกันจอแจ]",
                "SFX"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เพื่อความรวดเร็ว (และประหยัดพลังงานขา) ผมพาฮิมิโกะขึ้นรถรางเพื่อไปตึก C",
                "main_thinking"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ปกติผมนั่งรถรางคนเดียว ใส่หูฟัง ตัดขาดจากโลกภายนอก... แต่วันนี้ ข้างๆ ผมมีสิ่งมีชีวิตที่เรียกว่า 'เฟรชชี่' นั่งตาแป๋วอยู่",
                "main_thinking"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "(มองซ้ายมองขวาตื่นเต้น) \"ลมเย็นจังเลยค่ะพี่! รถรางที่นี่เท่จัง เหมือนสวนสนุกเลย\" ",
                "himiko_nocare"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "\"เดี๋ยวพอต้องเบียดกันตอนแปดโมงเช้า หรือตอนเลิกเรียน น้องจะไม่อยากคิดว่ามันเป็นสวนสนุกหรอกครับ... เชื่อพี่\"",
                "main_basic"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "(หัวเราะคิกคัก) \"พี่นี่มองโลกในแง่ร้ายจัง หรือนี่คือบุคลิกเด็กวิทย์คอมฯ คะ?\"",
                "himiko_laugh"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "\"เรียกว่า... มองโลกตาม Logic มากกว่าครับ\" ",
                "main_basic"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "\"แล้วทำไมเราถึงมาเรียนนิเทศฯ ล่ะ? ดูเหมาะกับบุคลิกดีนะ ร่าเริง พูดเก่ง\"",
                "main_basic"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "(ยิ้มเขิน เกาท้ายทอย) \"แหะๆ จริงๆ หนูชอบดูหนังค่ะ... แล้วก็อยากเป็นคนสร้างรอยยิ้มให้คนอื่น เหมือนที่หนังทำให้หนูยิ้ม\" ",
                "himiko_shy"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "(หันมามองหน้าตัวเอกด้วยแววตามุ่งมั่น) \"หนูอยากเป็น Producer ค่ะ!\"",
                "himiko_smile"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : System.out.println(\"Bright Future\");",
                "main_deepthinking"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : แววตาของเด็กที่มีความฝันนี่มัน... แสบตาชะมัด ต่างกับเราที่แค่อยากเขียนโค้ดให้มัน Error น้อยที่สุดไปวันๆ",
                "main_deepthinking"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "\"เท่ดีนะ... งั้นก็ตั้งใจเรียนล่ะ ตึก C ถึงแล้วครับ\"",
                "main_ask"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "(กระโดดลงจากรถราง) \"ถึงแล้ว! เย้!\"",
                "himiko_jump",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "\"ขอบคุณมากๆ นะคะพี่... เอ่อ พี่ชื่ออะไรนะคะ เมื่อกี้หนูยังไม่ได้ถามเลย\"",
                "himiko_shy",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "\"อ้อ... พี่ชื่อ ตัวเอก ครับ\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "\"พี่ ตัวเอก... โอเคค่ะ เมมโมรี่เรียบร้อย!\"",
                "himiko_ask",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "\"งั้นหนูไปเรียนก่อนนะคะ สายแล้ว เดี๋ยวอาจารย์ดุ!\"",
                "himiko_comeon",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(himiko,
                "(ฮิมิโกะทำท่าชูสองนิ้ว \"สู้ๆ\" แล้ววิ่งตึกตักขึ้นตึกไป)",
                "himiko_comeon",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(มองตาม)...เมมโมรี่งั้นเหรอ?",
                "main_basic",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยืนมองเธอจนลับสายตา ก่อนจะถอนหายใจออกมาเฮือกใหญ่... ไม่ใช่เพราะเหนื่อย แต่เพราะรู้สึกว่าพลังงานชีวิตผมถูกดูดไปใช้กับการรับมือความสดใสนั่นจนหมดหลอด",
                "main_thinking",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(ก้มดูนาฬิกา) \"เอาล่ะ... ภารกิจส่งน้องเสร็จสิ้น ตอนนี้เวลา 09:15 น.\"",
                "main_usemobile",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "\"คาบเช้าอาจารย์ยกคลาส... ว่างยาวถึงบ่ายโมง\"",
                "main_basic",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : if (free_time == true) { what_should_I_do(); }",
                "main_thinking",
                "/images/background/building_c4.png"
        ));
        Chapter0_Diamondhall01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมีเวลาว่างเกือบ 4 ชั่วโมง จะเอายังไงกับชีวิตดี?",
                "main_thinking",
                "/images/background/building_c4.png"
        ));

        // addChoice
        Chapter0_Diamondhall01.addChoice(new Choice(
                "โรงอาหารนิเทศฯ",
                "Chapter1_Scene01"
        ));
        Chapter0_Diamondhall01.addChoice(new Choice(
                "กลับไปห้องแล็บคณะ",
                "Chapter1_Scene06"
        ));
        Chapter0_Diamondhall01.addChoice(new Choice(
                "กลับหอพัก",
                "Chapter1_Scene14"
        ));
        Chapter0_Diamondhall01.addChoice(new Choice(
                "ตลาดนัด",
                "Chapter1_Scene20"
        ));


        // ---------- Scene: Chapter0_Diamondhall ----------
        Scene Chapter0_Diamondhall02 = new Scene("Chapter0_Diamondhall02");
        Chapter0_Diamondhall02.setBackgroundPath("/images/background/dimandhall_a3_morning.jpg");
        Chapter0_Diamondhall02.setEnding(true);

        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(แกล้งทำหน้าตกใจสุดขีด) \"โห น้อง... ใครบอกน้องว่าตึก C อยู่แถวนี้? นี่มันโซนหน้าม.เลยนะ\"",
                "main_surprised"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(ชี้มั่วๆ ไปทางด้านหลังมหาวิทยาลัยที่ไกลลิบ) \"ตึก C นู่นนนน... อยู่เกือบสุดเขตมหาลัยเลย ต้องเดินทะลุโรงอาหารกลางไปอีกไกลเลยครับ เดินไม่ไหวหรอก ต้องรีบไปดักวินมอเตอร์ไซค์เดี๋ยวนี้เลย\"",
                "main_markpoint"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(himiko,
                "หะ... หา!? จริงเหรอคะ!? ตายแล้ว... หนูต้องไปผิดตึกแน่ๆ เลย!",
                "himiko_surprised"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(himiko,
                "(ลนลานเก็บของลงกระเป๋าแบบยัดๆ) \"ขะ... ขอบคุณนะคะพี่ที่บอก! ถ้าพี่ไม่ทัก หนูคงเดินวนอยู่ตรงนี้จนหมดคาบแน่ๆ!\"",
                "himiko_Panickingloot"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "เอ่อ... คือ...",
                "main_1"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(himiko,
                "ไปก่อนนะคะ!!",
                "himiko_hihi"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(speaker,
                "[SFX: เสียงวิ่งออกตัวอย่างรวดเร็ว \"ฟิ้ววว!\"]",
                "SFX"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(speaker,
                "[Character: ฮิมิโกะ - หายวูบไปจากหน้าจอทางด้านซ้าย]"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(ยืนค้าง ยกมือค้างไว้กลางอากาศ) \"เฮ้ย เดี๋ยว... น้อง! \"",
                "main_handupshock"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ... ผมไม่คิดว่าเธอจะเชื่อคนง่ายขนาดนั้น",
                "main_thinking"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ร่างเล็กๆ ของฮิมิโกะวิ่งหายลับไปทางหลังม. ด้วยความเร็วแสง... ซึ่งนั่นมัน ทางไปโรงงานกระดูก ไม่ใช่ตึก C",
                "main_thinking"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : หลังจากวันนั้น... ผมก็พยายามมองหาเธอที่ตึกเพชรและตึก C ทุกวัน แต่ก็ไม่เคยเจอเธออีกเลย ",
                "main_thinking",
                "/images/background/l6.jpg"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ได้ยินข่าวลือแว่วๆ จากกลุ่มเด็กนิเทศปี 1 ว่ามีเฟรชชี่คนนึงหลงทางไปโผล่โรงงานกระดูกจนร้องไห้หนักมาก และขอย้ายเซคเรียนหนีความอายไปแล้ว...",
                "main_thinking",
                "/images/background/l6.jpg"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(main,
                "(ฟุบหน้าลงกับคีย์บอร์ด) \"ไอ้ปากพาซวยเอ๊ย... ไม่น่าแกงน้องมันแรงเลยกู\"",
                "main_collapsekb",
                "/images/background/l6.jpg"
        ));
        Chapter0_Diamondhall02.addDialogue(new DialogueLine(speaker,
                "BAD END : Love Connection Timed Out. Objective Failed: You broke the newbie's heart.",
                "main",
                "/images/background/system_error.png"
        ));

        // ---------- Scene: Chapter0_Diamondhall03 ----------
        Scene Chapter0_Diamondhall03 = new Scene("Chapter0_Diamondhall03");
        Chapter0_Diamondhall03.setBackgroundPath("/images/background/dimandhall_a3_morning.jpg");
        Chapter0_Diamondhall03.setEnding(true);

        Chapter0_Diamondhall03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมถอนหายใจเสียงดังเฮือกใหญ่ ก่อนจะตะคอกใส่หน้ารุ่นน้องคนนั้นเสียงดังลั่นทางเดินตึกเพชร",
                "main_thinking"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(main,
                "หัดใช้สมองหน่อยสิน้อง!!! นี่มันสมัยไหนแล้ว หัดใช้ Google Map บ้างนะ ใน BU App ก็มีบอกนะ!!!",
                "main_angry"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "เสียงของคุณก้องไปทั่วบริเวณ รุ่นน้องคนนั้นสะดุ้งสุดตัว หน้าซีดเผือด น้ำตาเริ่มคลอเบ้าด้วยความอับอายและตกใจ เขาพึมพำคำขอโทษเบาๆ แล้วรีบวิ่งหนีออกไปทันที",
                "himiko_scary"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "แต่เรื่องมันไม่จบแค่นั้น..."
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "คุณลืมไปว่า \"นี่มันสมัยไหนแล้ว\" อย่างที่คุณพูดจริงๆ"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "แชะ! แชะ! เสีย งชัตเตอร์และแสงแฟลชจากมือถือของนักศึกษาไทยมุงรอบๆ ดังขึ้น",
                "SFX",
                "/images/background/deep_black.jpg"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "คนรอบข้างเริ่มซุบซิบและมองคุณด้วยสายตาเหยียดหยาม",
                "microphone",
                "/images/background/deep_black.jpg"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "ภายในเวลาไม่ถึง 10 นาที คลิปวิดีโอตอนที่คุณตะคอกรุ่นน้องถูกโพสต์ลง TikTok และ X พร้อมแคปชั่นเด็ด: \"รุ่นพี่ BU หรือนักเลง? แค่น้องถามทางจำเป็นต้องด่าขนาดนี้ป่ะ #BU #รุ่นพี่ปากแจ๋ว\"",
                "microphone",
                "/images/background/deep_black.jpg"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "ผลลัพธ์ที่ตามมา",
                "microphone",
                "/images/background/deep_black.jpg"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "แจ้งเตือนเด้งรัวๆ: โทรศัพท์คุณสั่นไม่หยุด ไม่ใช่คนทักมาจีบ แต่เป็นทัวร์ลง! คอมเมนต์ด่าทอหลั่งไหลเข้ามาทุกช่องทางโซเชียลของคุณ",
                "SFX",
                "/images/background/system_error.png"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "โดนขุดประวัติ: ชาวเน็ตนักสืบเริ่มขุดรูปหน้าเก่า วีรกรรมเก่าๆ ของคุณออกมาแฉยับ",
                "microphone",
                "/images/background/system_error.png"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "สังคมรังเกียจ: วันต่อมา คุณเดินเข้าโรงอาหารนิเทศฯ ไม่มีใครกล้านั่งใกล้ เพื่อนในกลุ่มเริ่มตีตัวออกห่างเพราะไม่อยากโดนหางเลข",
                "microphone",
                "/images/background/system_error.png"
        ));
        Chapter0_Diamondhall03.addDialogue(new DialogueLine(speaker,
                "BAD END : ฝ่ายกิจการนักศึกษาเรียกพบ: คุณถูกเชิญตัวไปปรับทัศนคติเรื่องมารยาทและการอยู่ร่วมกัน (แถมอาจโดนตัดคะแนนความประพฤติโทษฐานทำลายชื่อเสียงมหาวิทยาลัย)",
                "microphone",
                "/images/background/system_error.png"
        ));

        // ---------- Scene: Chapter1_Scene01 ----------
        Scene Chapter1_Scene01 = new Scene("Chapter1_Scene01");
        Chapter1_Scene01.setBackgroundPath("/images/background/bku_canteen.png");

        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินเข้าสู่เขตแดนของคณะนิเทศฯ... กลิ่นหอมของ 'ข้าวแกงกะหรี่' ร้านดังลอยมาแตะจมูก ผสมกับกลิ่นน้ำหอมนานาชนิดของนักศึกษาที่เดินสวนกัน",
                "main_thinking"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ที่นี่มัน... สว่างจ้าซะเหลือเกิน ไม่ใช่แค่แสงไฟนะ แต่คือออร่าของผู้คนที่นี่ เด็กนิเทศฯ นี่มันแต่งตัวจัดเต็มกันทุกคนจริงๆ ผมก้มมองเสื้อช็อปคณะกับกางเกงยีนส์ย้วยๆ ของตัวเองแล้วรู้สึกเหมือนเป็น NPC ชาวบ้าน A ในดงตัวละครหลัก",
                "main_thinking"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "\"ป้าครับ ข้าวหมูทอดแกงกะหรี่พิเศษครับ... ขอราดน้ำเยอะๆ นะครับ\"",
                "main_ask"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(old_lady,
                "\"ได้จ้าหนุ่ม แหม... หน้าตาดูเพลียๆ นะเรา กินเยอะๆ จะได้มีแรง\"",
                "main"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมรับจานข้าวมา จ่ายเงิน แล้วเริ่มภารกิจที่ยากที่สุดในมหาลัย... นั่นคือ \"การหาโต๊ะว่างตอนเที่ยง\" (ถึงแม้นี่จะยังไม่เที่ยงเป๊ะ แต่คนก็แน่นเอี๊ยด)",
                "main_thinking"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(speaker,
                "[SFX: เสียงหัวเราะสดใสกลุ่มใหญ่ดังมาจากโต๊ะมุมเสา]",
                "SFX"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(secret,
                "\"เฮ้ยแก! จริงปะเนี่ย!?\" ???: \"จริงแก! เดินวนรอบตึกเพชรสามรอบ ขำจะตายแล้ว!\"",
                "main"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(ชะงัก) เสียงคุ้นๆ... ",
                "main_umm"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมหันไปมองต้นเสียงที่โต๊ะยาวมุมหนึ่ง...",
                "main_thinking"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : นั่นไง ฮิมิโกะ กำลังนั่งอยู่กับกลุ่มเพื่อนสาวอีก 3 คน ที่ดูดีกรีความแสบไม่แพ้กัน เธอกำลังเล่าเรื่องวีรกรรมหลงทางของเธออย่างออกรส",
                "main_thinking"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(himiko,
                "(หันมาสบตาพอดี) \"อ๊ะ!...\" ",
                "himiko_open"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(himiko,
                "\"พี่คะ! พี่ตัวเอก!\"",
                "himiko_hihi"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : boolean isSpotted = true; ...ชิบหายแล้ว จะหลบก็ไม่ทัน",
                "main_deepthinking"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(himiko,
                "\"มาทางนี้เลยค่ะพี่! มานั่งด้วยกันสิคะ โต๊ะหนูยังว่างที่นึง!\" (ตบเก้าอี้ว่างข้างๆ ตัวแปะๆ)",
                "himiko_interested"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(friend_a,
                "\"อุ๊ยตาย... นี่เหรอคะ 'พี่ชายใจดี' ที่แกเล่าให้ฟังเมื่อกี้?\"",
                "main_1"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(friend_b,
                "\"รุ่นพี่ Com Sci เหรอคะ? ดูจากเสื้อ... ทรงนี้เขียนโค้ดเก่งชัวร์ หรือไม่ก็ซ่อมคอมเก่งแน่ๆ\"",
                "main_1"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(himiko,
                "\"พี่เขาใจดีมากเลยนะเว้ยแก เขาเดินมาส่งถึงหน้าตึกเลย... พี่คะ มานั่งด้วยกันสิ ยืนถือจานข้าวนานเดี๋ยวเมื่อยนะ\"",
                "himiko_ask"
        ));
        Chapter1_Scene01.addDialogue(new DialogueLine(main,
                "(บรรยาย) : สถานการณ์กลืนไม่เข้าคายไม่ออก... ผมยืนถือจานข้าวหมูทอดแกงกะหรี่ ท่ามกลางสายตากดดัน (และล้อเลียน) ของแก๊งสาวนิเทศฯ",
                "main_thinking"
        ));

        // addChoice
        Chapter1_Scene01.addChoice(new Choice(
                "ยอมไปนั่งด้วย",
                "Chapter1_Scene02"
        ));
        Chapter1_Scene01.addChoice(new Choice(
                "ปฏิเสธอย่างนุ่มนวลและไปนั่งโต๊ะอื่น",
                "Chapter1_Scene04"
        ));
        Chapter1_Scene01.addChoice(new Choice(
                "ซื้อน้ำเลี้ยงน้องๆ แล้วขอตัว",
                "Chapter1_Scene05"
        ));

        // ---------- Scene: Chapter1_Scene02 ----------
        Scene Chapter1_Scene02 = new Scene("Chapter1_Scene02");
        Chapter1_Scene02.setBackgroundPath("/images/background/bku_canteen.jpg");

        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมสูดหายใจเข้าลึกๆ เหมือนกำลังจะกด Enter เพื่อรันโค้ดที่มีความเสี่ยงสูง... แล้วตัดสินใจเดินเข้าไปนั่งที่เก้าอี้ว่างข้างๆ ฮิมิโกะ",
                "main_thinking"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "\"งั้น... ขอรบกวนด้วยนะครับ\"",
                "main_basic"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ทันทีที่ก้นผมแตะเก้าอี้ บรรยากาศรอบโต๊ะก็เปลี่ยนไปเหมือนสปอตไลท์ส่องลงมา เพื่อนๆ ของฮิมิโกะขยับตัวเข้ามาใกล้ด้วยความอยากรู้อยากเห็น",
                "main_thinking"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(friend_a,
                "\"หนูชื่อ 'เจเจ' นะคะ ส่วนสาวแว่นนี่ชื่อ 'มายด์'... ว่าแต่พี่ชื่ออะไรคะเนี่ย? ฮิมิโกะมันเล่าแต่ 'พี่ชายใจดี' ไม่ยอมบอกชื่อสักที\"",
                "main_1"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "\"พี่ชื่อ ตัวเอก ครับ... อยู่ปี 2 Com Sci\"",
                "main_basic"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(jj,
                "\"อุ๊ย Com Sci! คณะนี้เขาว่าผู้ชายงานดีแต่โลกส่วนตัวสูง... พี่เป็นข้อยกเว้นหรือเปล่าคะเนี่ย? ถึงยอมมานั่งกับพวกเราได้\" (ยิ้มแซว)",
                "main_1"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "\"ก็... ปกติพี่กินข้าวคนเดียวน่ะครับ วันนี้ถือว่าเป็นข้อยกเว้นพิเศษ\" ",
                "main_basic"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "\"เห็นไหม! บอกแล้วว่าพี่เขาใจดี... เจเจแกอย่าไปแกล้งพี่เขาเยอะสิ เดี๋ยวพี่เขากินข้าวไม่ลง\"",
                "himiko_ask"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมก้มหน้าตักข้าวแกงกะหรี่เข้าปากเพื่อกลบเกลื่อนความประหม่า รสชาติเผ็ดร้อนของแกงกะหรี่ผสมกับความร้อนผ่าวที่หน้า... System.temp > 40 degrees; ผมรู้สึกว่าตัวเองกำลัง Overheat",
                "main_thinking"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(mind,
                "\"แล้วพี่เรียนยากไหมคะ? เห็นเขาว่าต้องเขียนภาษาต่างดาวทั้งวัน\"",
                "main_1"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "\"ก็... ยากครับ เหมือนคุยกับคนไม่รู้เรื่อง ต้องคุยกับคอมฯ แทน... แต่พอเห็นผลลัพธ์มันออกมาถูกต้อง มันก็หายเหนื่อยครับ\"",
                "main_basic"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(เผลอหันไปมองฮิมิโกะ)\"...เหมือนเวลาแก้ Bug หายนั่นแหละ\"",
                "main_ask"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "(กำลังดูดน้ำปั่นแก้มตุ่ย พอเห็นผมมอง เธอก็ยิ้มตาหยีส่งกลับมา)",
                "himiko_chubbycheeks"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "\"โห เปรียบเทียบซะเห็นภาพเลย... งั้นพี่ก็ต้องเป็นคนใจเย็นมากๆ แน่เลย หนูนะ แค่ตัดต่อคลิปแล้วโปรแกรมค้าง หนูแทบจะทุบคอมทิ้ง!\" (ทุกคนในโต๊ะหัวเราะร่วน บรรยากาศเริ่มผ่อนคลายลง ความเกร็งของผมเริ่มหายไป)",
                "himiko_surprised"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(speaker,
                "หลังจากมื้ออาหารผ่านไปพร้อมกับบทสนทนาสัพเพเหระ (ส่วนใหญ่ผมจะเป็นฝ่ายโดนถามซะมากกว่า) ก็ถึงเวลาที่สาวๆ ต้องไปเตรียมตัวเข้าคลาสบ่าย"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(jj,
                "\"ไปพวกแก! เดี๋ยวไม่ทันจองแถวหน้า... พี่ตัวเอก คะ ไว้เจอกันใหม่นะคะ!\" มายด์: \"ขอบคุณที่มานั่งเป็นเพื่อนนะคะพี่\"",
                "main_1"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(speaker,
                "เพื่อนๆ ลุกออกไปก่อน เหลือฮิมิโกะที่กำลังเก็บกระเป๋าอย่างทุลักทุเล"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "\"พี่คะ...\" (เธอหยุดมือ แล้วหันมามองผม)",
                "himiko_open"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "\"ครับ?\"",
                "main_basic"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "(หยิบสมาร์ตโฟนขึ้นมา เปิดหน้า QR Code) ",
                "himiko_usemobile"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "\"คือ... ถ้าหนูหลงทางอีก หรือคอมพิวเตอร์มีปัญหา... หนูขอทักไปถามพี่ได้ไหมคะ?\"",
                "himiko_usemobile"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "\"แบบว่า... พี่ดูพึ่งพาได้น่ะค่ะ!\"",
                "himiko_ask"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : วินาทีนั้น เสียงรอบข้างในโรงอาหารเหมือนจะเบาลง... นี่มัน Event ปักธงชัดๆ หรือเปล่านะ? หรือแค่ตามมารยาท?",
                "main_thinking"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : แต่สมองผมสั่งการไวกว่าความคิด มือผมหยิบโทรศัพท์ขึ้นมาสแกนทันที",
                "main_thinking"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "\"ได้สิครับ... ทักมาได้ตลอดนะ ถ้าพี่ไม่ติดแล็บ พี่ตอบไวอยู่แล้ว\"",
                "main_thinking"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(himiko,
                "(ยิ้มกว้างจนเห็นลักยิ้ม) \"เย้! ขอบคุณค่ะพี่... งั้นหนูไปก่อนนะ See ya!\"",
                "himiko_smile"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(speaker,
                "เธอโบกมือลาแล้ววิ่งดุ๊กดิ๊กตามเพื่อนๆ ออกไป ทิ้งไว้เพียงแจ้งเตือนในมือถือของผม > 'Himiko_Smile' added you as a friend. > Sticker: น้องหมีโบกมือทักทาย"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินกลับมาที่ตึกเพชร... ตึกรูปทรงเพชรที่ดูทันสมัยและแข็งกระด้างตั้งตระหง่านอยู่ตรงหน้า เหมือนเดิมทุกวัน",
                "main_thinking",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : แต่ความรู้สึกของผมตอนมองมัน... ไม่เหมือนเดิม",
                "main_thinking",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยกมือถือขึ้นมาดูรายชื่อเพื่อนใหม่ในแอปแชท รูปโปรไฟล์ของเธอเป็นรูปที่เธอยิ้มกว้างคู่กับแมวตัวหนึ่ง",
                "main_thinking",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(ยิ้มมุมปาก) \"เฮ้อ... สงสัยเทอมนี้จะไม่ได้มีแค่ Bug ให้แก้แล้วมั้ง\"",
                "main_basic",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเก็บมือถือลงกระเป๋าเสื้อ แล้วเดินเข้าตึกไปด้วยความรู้สึกที่เบากว่าเมื่อเช้ามาก โลกสีขาวดำของเด็ก Com Sci... เริ่มมีสี Pastel แต้มเข้ามาทีละนิด",
                "main_thinking",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene02.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : while (alive) { code(); eat(); sleep(); thinkAbout(Himiko); // New function added }",
                "main_deepthinking",
                "/images/background/dimandhall_a3_evening.png"
        ));

        // addChoice
        Chapter1_Scene02.addChoice(new Choice(
                "หน้าตึกเพชรช่วงบ่าย",
                "Chapter1_Scene03"
        ));

        // ---------- Scene: Chapter1_Scene03 ----------
        Scene Chapter1_Scene03 = new Scene("Chapter1_Scene03");
        Chapter1_Scene03.setBackgroundPath("/images/background/dimandhall_a3_evening.png");

        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินผ่านประตูกระจกเข้ามา สัมผัสได้ถึงความเย็นยะเยือกของแอร์ที่เป็นเอกลักษณ์ของตึกนี้ ปกติแล้วที่นี่จะมีแต่เด็กเนิร์ดใส่เสื้อช็อปเดินก้มหน้าก้มตา แต่ทว่า... วันนี้มี \"Error\" บางอย่างเกิดขึ้นในระบบนิเวศของตึกเพชร",
                "main_thinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ที่หน้าลิฟต์... มีเด็กผู้หญิงคนหนึ่งยืนอยู่ เธอสวม \"ชุดนักเรียน ม.ปลาย ญี่ปุ่น\" ครบชุด ทั้งเสื้อสเวตเตอร์สีขาว โบว์แดง และกระโปรงลายสก๊อต ซึ่งดูขัดแย้งกับบรรยากาศเคร่งขรึมของตึกนี้อย่างสิ้นเชิง",
                "main_thinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอยืนก้มหน้า บิดตัวไปมาด้วยความประหม่า มือสองข้างกุมกันแน่นเหมือนกำลังรวบรวมความกล้าที่จะทำอะไรบางอย่าง ท่าทางดูน่าสงสารเหมือนลูกแมวหลงทาง",
                "main_thinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : เด็กมัธยม? หรือเด็กนิเทศฯ หลงมา? เข้าไปถามหน่อยดีกว่า",
                "main_deepthinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "\"เอ่อ... น้องครับ? มาหาใครหรือเปล่าครับ?\"",
                "main_ask"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "(สะดุ้งโหยง จนโบว์สีแดงเด้งดึ๋ง)",
                "rin_jump"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"ปะ... เปล่าค่ะ! คือ...\"",
                "rin_ask"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอเงยหน้าขึ้นมาสบตาผม แววตาที่ดูขี้อายเมื่อกี้ เปลี่ยนเป็นแข็งกร้าวขึ้นมาในเสี้ยววินาทีเมื่อเห็นว่าผมเป็นใคร (หรืออาจจะแค่ตกใจ)",
                "main_thinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"หนูไม่ได้หลงทางนะ! แค่... แค่ลิฟต์มันไม่ยอมลงมาสักทีต่างหาก!\" (เสียงดังใส่เฉยเลย)",
                "rin_smile"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "\"อ๋อ... ลิฟต์ตัวนั้นมันเสียครับ ต้องใช้อีกฝั่ง\"",
                "main_ask"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "(ชะงัก) \"อ้าว...\" เธอเอานิ้วจิ้มแก้มตัวเอง ทำหน้าครุ่นคิดแบบมึนๆ คิ้วขมวดเข้าหากันเล็กน้อย",
                "rin_ask"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"เสียเหรอคะ? ...มิน่าล่ะ กดยังไงไฟก็ไม่ติด นึกว่าผีหลอกซะอีก\"",
                "rin_ask"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอหันมามองผมพิจารณาตั้งแต่หัวจรดเท้าด้วยสายตาที่เริ่มซุกซนขึ้น",
                "main_thinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"พี่เรียนตึกนี้เหรอคะ? เด็กคอมฯ สินะ... หน้าตาดู...\"",
                "rin_smile"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "\"ดูฉลาด?\"",
                "main_deepthinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "(แสยะยิ้มมุมปาก แลบลิ้นออกมาเล็กน้อย)",
                "rin_stickouttongue"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"ดูจืดชืดสุดๆ ไปเลยค่ะ แบร่! :P\"",
                "rin_stickouttongue"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(สตั้น) \"...\"",
                "main_surprised"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"ล้อเล่นค่ะ! ขอบคุณที่บอกทางนะคะ 'รุ่นพี่หน้าจืด'!\"",
                "rin_smile"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(rin,
                "\"หนูชื่อ 'ริน' เด็กนิเทศฯ ปี 1 ...จำชื่อไว้ให้ดีล่ะ เพราะหนูชอบแวะมาป่วนตึกนี้บ่อยๆ ระวังตัวไว้ด้วยนะคะ!\"",
                "rin_smile"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พูดจบเธอก็สะบัดผมหางม้า เดินดุ่มๆ ไปทางลิฟต์ที่ใช้งานได้ ทิ้งให้ผมยืนงงอยู่หน้าลิฟต์ตัวที่เสีย",
                "main_thinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : อะไรของเด็กนั่นน่ะ... ขี้อาย... ดุ... แล้วก็กวนประสาท ในเวลาไม่ถึง 1 นาที?สงสัยตึกเพชรเทอมนี้... จะวุ่นวายกว่าที่คิดซะแล้ว",
                "main_deepthinking"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(speaker,
                "System Update (อัปเดตระบบ)",
                "main_thinking",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(speaker,
                "[หน้าจอคอมพิวเตอร์ในห้องแล็บ - มี Code ไหลผ่าน]",
                "main_thinking",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมกลับขึ้นมานั่งที่ห้องแล็บประจำตัว เปิดคอมพิวเตอร์เพื่อทำงานต่อ แต่วันนี้สมาธิผมไม่ได้อยู่ที่ Code 100% เหมือนทุกที ในหัวผมมีภาพรอยยิ้มของ ฮิมิโกะ ซ้อนทับด้วยภาพแลบลิ้นกวนๆ ของ น้องริน",
                "main_thinking",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(ยิ้มกับตัวเอง) \"Bug เยอะจริงๆ ปีนี้...\"",
                "main_basic",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเคาะปุ่ม Enter แรงๆ หนึ่งทีเพื่อรันโปรแกรม ชีวิตเด็ก Com Sci ที่เคยวนลูปอยู่แค่ หอพัก-ห้องแล็บ-ร้านข้าว... กำลังถูกเขียนทับด้วย Algorithm ใหม่ที่ชื่อว่า \"ความวุ่นวาย\" และผม... ก็เริ่มจะสนุกกับมันแล้วสิ",
                "main_thinking",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World",
                "main_thinking",
                "/images/background/status_completed"
        ));
        Chapter1_Scene03.addDialogue(new DialogueLine(speaker,
                "Status: COMPLETED\n" + //
                "Relationship (Himiko): Friend (เริ่มต้นด้วยดี)\n" + //
                "Relationship (Rin): Target (โดนหมายหัว)",
                "main",
                "/images/background/status_completed.png"
        ));
         Chapter1_Scene03.addDialogue(new DialogueLine(speaker,
                "โปรดติดตามตอออนต่อไป...............",
                "main_thinking",
                "/images/background/to_be_continued.png"
        ));

        // ---------- Scene: Chapter1_Scene04 ----------
        Scene Chapter1_Scene04 = new Scene("Chapter1_Scene04");
        Chapter1_Scene04.setBackgroundPath("/images/background/bku_canteen.png");

        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมองไปที่โต๊ะนั้น... แสงสว่างจ้าเกินไป สำหรับสิ่งมีชีวิตที่ชอบทำงานตอนกลางคืนอย่างผม การเข้าไปอยู่ในวงล้อมของสาวๆ นิเทศฯ อาจทำให้ระบบผม Crash ได้ ตัวเอก: \"เอ่อ... ไม่เป็นไรครับ พอดีพี่เห็นเพื่อนโบกมือเรียกตรงนู้นแล้ว ขอบใจมากนะที่ชวน\" (ผมโกหกหน้าตาย)",
                "main_thinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(himiko,
                "(หน้าหงอยลงเล็กน้อย เหมือนลูกหมาโดนดุ) \"อ๋อ... งั้นเหรอคะ เสียดายจัง นึกว่าจะได้เลี้ยงตอบแทนพี่สักหน่อย\"",
                "himiko_sorry"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(friend_a,
                "\"ว้า... พี่เขาคิวทองว่ะแก ปล่อยพี่เขาไปเถอะ\"",
                "main_1"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "\"ทานให้อร่อยนะ ไว้เจอกันครับ\" ",
                "main_basic"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยิ้มบางๆ ให้ตามมารยาท ก่อนจะเดินเลี่ยงออกมายังโซนที่ไกลที่สุด เงียบที่สุด และมืดที่สุดเท่าที่จะหาได้ในโรงอาหารนี้",
                "main_thinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : Social_Battery.saveMode(ON); ผมนั่งลงที่โต๊ะตัวเล็กติดเสา วางจานข้าวแกงกะหรี่ลง แล้วถอนหายใจอย่างโล่งอก... พื้นที่ส่วนตัวปลอดภัยแล้ว",
                "main_thinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมตักข้าวเข้าปากพลางมองไปที่โต๊ะนั้นเป็นระยะ... ฮิมิโกะกลับมาร่าเริงอีกครั้ง เธอหัวเราะจนตัวงอเมื่อเพื่อนเล่าเรื่องตลก ",
                "main_thinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : โลกของพวกเรามันต่างกันจริงๆ นั่นแหละ... ทางนั้นคือ UI (User Interface) ที่สวยงาม สดใส ดึงดูดผู้คน ส่วนผมคือ Backend ระบบหลังบ้านที่ทำงานเงียบๆ อยู่ในเงามืด",
                "main_deepthinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : แต่แปลก... ปกติผมจะไม่สนใจโลกภายนอกเวลากินข้าว แต่วันนี้สายตาผมกลับคอยแต่จะโฟกัสไปที่รอยยิ้มนั้น",
                "main_thinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "\"...\" (เผลอยิ้มมุมปากออกมาโดยไม่รู้ตัว)",
                "main_ask"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : อย่างน้อย... วันนี้การตื่นเช้ามาเจอเรื่องวุ่นวาย ก็ไม่ได้แย่ไปซะทีเดียว",
                "main_deepthinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(speaker,
                "หลังจากจัดการมื้อเที่ยงเสร็จ ผมลุกขึ้นเพื่อนำจานไปเก็บที่จุดคืนภาชนะ เตรียมตัวจะกลับไปสิงสถิตที่ห้องแล็บตึกเพชรเหมือนเดิม"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(speaker,
                "[SFX : เสียงฝีเท้าวิ่งตึกตักๆ เข้ามาใกล้]",
                "SFX"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(secret,
                "\"พี่คะ! พี่ ตัวเอก คะ!\"",
                "main_1"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(speaker,
                "ผมหันกลับไป... ฮิมิโกะกำลังวิ่งเหยาะๆ เข้ามาหา มือข้างหนึ่งกำโทรศัพท์แน่น"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "\"อ้าว... ยังทานไม่เสร็จเหรอ?\"",
                "main_basic"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(himiko,
                "(หอบหายใจเล็กน้อย แก้มแดงระเรื่อ) \"เสร็จแล้วค่ะ! พอดีเห็นพี่ลุกออกมา หนูเลยรีบวิ่งตามมา... เพื่อนหนูบอกว่าพี่ดูรีบๆ เลยไม่กล้ากวนตอนกินข้าว\"",
                "himiko_gasp"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "\"คือว่า... หนูรู้ว่าพี่งานยุ่ง แต่หนู...\" (เธอก้มหน้ามองเท้าตัวเองด้วยความเขินนิดๆ)",
                "himiko_eyecontact"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "\"หนูความจำสั้น แถมหลงทิศเก่งมาก... ถ้าเกิดหนูหลงทาง หรือหาตึกเรียนไม่เจออีก... หนูขอทักหาพี่ได้ไหมคะ?\"",
                "himiko_ask"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(speaker,
                "เธอยื่นโทรศัพท์ที่มี QR Code ให้ผม ดวงตากลมโตคู่นั้นมองมาช้อนๆ อย่างมีความหวัง"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ปฏิเสธการนั่งกินข้าวด้วยกันน่ะพอทำได้... แต่ให้ปฏิเสธสายตาแบบนี้ ใครทำได้ก็ใจร้ายเกินไปแล้ว",
                "main_thinking"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "\"เอาสิครับ... ถ้าหลงก็ทักมา หรือถ้ามีปัญหาเรื่องคอมฯ ก็บอกได้\"",
                "main_basic"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "ผมหยิบมือถือขึ้นมาสแกน [System Notification: Added 'Himiko_Smile' as a friend]",
                "main_usemobile"
                
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(himiko,
                "(ยิ้มกว้างจนตาหยี ดีใจเหมือนเด็กได้ขนม) \"ขอบคุณนะคะพี่! สัญญาว่าจะไม่ทักไปกวนเวลาพี่เขียนโค้ดบ่อยๆ ค่ะ!",
                "himiko_smile"
        ));
         Chapter1_Scene04.addDialogue(new DialogueLine(himiko,
                "พี่ไปเรียนเถอะค่ะ สู้ๆ นะคะ!\" (ทำท่าชูสองนิ้วให้)",
                "himiko_comeon"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินกลับมาถึงหน้าตึกเพชร ลมร้อนยามบ่ายพัดผ่านหน้า วันนี้ผมรักษาระยะห่างเอาไว้ได้... ผมยังคงเป็นผม เป็นรุ่นพี่ Com Sci ที่รักความสงบเหมือนเดิม",
                "main_thinking",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(ล้วงมือถือออกมาดูหน้าจอแชทที่ว่างเปล่า มีแค่สติกเกอร์ทักทายตัวเดียวจากเธอ)",
                "main_basic",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : const myWorld = \"Dark Mode\";var newLight = \"Himiko\";// Warning: Expect unexpected runtime errors.",
                "main_deepthinking",
                "/images/background/dimandhall_a3_evening.png"
        ));
        Chapter1_Scene04.addDialogue(new DialogueLine(speaker,
                "ผมเก็บมือถือลงกระเป๋า แล้วเดินเข้าสู่ความเย็นยะเยือกของตึกเพชร ถึงปากจะบอกว่าชอบความมืด... แต่ลึกๆ แล้ว ผมอาจจะกำลังรอให้ใครสักคนเอาไฟฉายมาส่องทางให้อยู่ก็ได้",
                "main_deepthinking",
                "/images/background/dimandhall_a3_evening.png"
        ));

        // addChoice
        Chapter1_Scene04.addChoice(new Choice(
                "หน้าตึกเพชรช่วงบ่าย",
                "Chapter1_Scene03"
        ));

        // ---------- Scene: Chapter1_Scene05 ----------
        Scene Chapter1_Scene05 = new Scene("Chapter1_Scene05");
        Chapter1_Scene05.setBackgroundPath("/images/background/bku_canteen.png");
        Chapter1_Scene05.setEnding(true);

        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ความประหม่าของผมพุ่งทะลุขีดจำกัด (Integer Overflow) ผมเห็นรอยยิ้มของพวกผู้หญิง 3 คนที่จ้องมาเหมือนรอคำตอบ สมองผมประมวลผลทางออกที่ดีที่สุดไม่ได้... เลยเลือกทางออกที่ \"แพง\" ที่สุดแทน",
                "main_thinking"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(ล้วงกระเป๋าตังค์ มือสั่นเล็กน้อย หยิบแบงก์ 500 สีม่วงใบสุดท้ายออกมา)",
                "main_ask"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"คือ... พี่ไม่นั่งนะครับ พอดีรีบ\"",
                "main_basic"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(วางเงินลงบนโต๊ะเสียงดัง แปะ! จนช้อนส้อมกระเทือน)",
                "main_depositmoney"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"มื้อนี้พี่เลี้ยงเอง ถือว่ารับน้องเฟรชชี่... กินกันให้อร่อยนะ ไม่ต้องทอน\"",
                "main_depositmoney"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(himiko,
                "(ตาโต อ้าปากค้าง ขนมปังในมือร่วง) \"หะ... ห๊า!? พี่คะ! เดี๋ยวค่ะ มันเยอะไป!\"",
                "himiko_surprised"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(friend_a,
                "(มองเงินสลับกับหน้าตัวเอก แบบงงๆ) \"เอ่อ... พี่คะ นี่พี่... รำคาญพวกเราหรือเปล่าคะ?\"",
                "main_1"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(หน้าตึง เพราะเกร็งจัด) \"เปล่าครับ... แค่อยากให้เต็มที่น่ะ ไปนะ\"",
                "main_ask"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมหันหลังขวับ ใช้วิชาเดินเร็วระดับนักกีฬาทีมชาติ ฝ่าฝูงชนออกมาโดยไม่หันกลับไปมอง ทิ้งให้สาวๆ นั่งงงเป็นไก่ตาแตกอยู่ตรงนั้น",
                "main_thinking"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(พ่นลมหายใจออกทางปากแรงๆ) \"ฟู่ววว... รอดตาย!\"",
                "main_basic",
                "/images/background/sidewalk_ctoa_noon.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"เมื่อกี้เราเท่ใช้ได้เลยนะเนี่ย ทิ้งเงินไว้แล้วเดินออกมาเหมือนมาเฟียในหนังฮ่องกง... ป่านนี้น้องฮิมิโกะคงกรี๊ดสลบ ปลื้มปริ่มในความป๋าของเราแน่ๆ\"",
                "main_deepthinking",
                "/images/background/sidewalk_ctoa_noon.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(ยิ้มกริ่ม) \"เผลอๆ เย็นนี้อาจจะทักมาขอบคุณ... เดี๋ยวแวะไปซื้อชาไข่มุกกินฉลองความเท่สักแก้วดีกว่า\"",
                "main_ask",
                "/images/background/sidewalk_ctoa_noon.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมหยิบโทรศัพท์ขึ้นมาจะสแกนจ่ายค่าชาไข่มุกราคา 45 บาท [App Notification: Transaction Failed - Insufficient Funds",
                "main_thinking",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"หือ?\"",
                "main_basic",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(old_lady,
                "\"น้องคะ เงินไม่พอนะคะ\"",
                "main_1",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"อ๋อ ขอโทษครับ เดี๋ยวใช้เงินสด...\" (เปิดกระเป๋าตังค์)",
                "main_sorry",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(หน้าซีดเผือด) \"ฉิบ...\"",
                "main_boring",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ความทรงจำไหลย้อนกลับมา... แบงก์ 500 ใบเมื่อกี้ คือเงินก้อนสุดท้ายที่แม่โอนมาให้ใช้สำหรับสัปดาห์นี้",
                "main_thinking",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"ขอโทษครับพี่... ผมไม่เอาแล้วครับ\" (เดินคอตกออกมาจากร้าน)",
                "main_sorry",
                "/images/background/cha_store.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(speaker,
                "ผมกำลังยืนรอลิฟต์ด้วยสภาพอิดโรย (เพราะเมื่อคืนกินแค่น้ำเปล่าประทังชีวิต) ทันใดนั้นประตูลิฟต์เปิดออก ฮิมิโกะเดินออกมาพร้อมกับเพื่อนๆ",
                "main",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(ตาเป็นประกาย) \"ฮิมิโกะ...\" อย่างน้อย... การเสียสละเงิน 500 บาท ก็น่าจะแลกมาด้วยความประทับใจ หรือรอยยิ้มหวานๆ บ้างล่ะวะ",
                "main_ask",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(himiko,
                "(ชะงักเมื่อเห็นหน้าผม) \"อุ๊ย!...\"",
                "himiko_shock",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(himiko,
                "\"ส... สวัสดีค่ะคุณรุ่นพี่! ขอบพระคุณสำหรับอาหารมื้อใหญ่วันก่อนนะคะ!\" (เสียงสั่นๆ)",
                "himiko_sorry",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(jj,
                "(กระซิบ) \"แกๆ รีบไปเถอะ เดี๋ยวเขาหมั่นไส้เอาเงินฟาดหัวอีก\"",
                "main_1",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"ห๊ะ? เดี๋ยวครับ...\"",
                "main_ask",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(himiko,
                "\"พวกหนูขอตัวก่อนนะคะ! ไม่กล้ารบกวนเวลาอันมีค่าของพี่ค่ะ!\" พวกเธอรีบเดินเลี่ยงหนีไปเหมือนหนูเจอกันดั้ม... ทิ้งระยะห่างไว้ประมาณ 10 เมตร",
                "himiko_sorry",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(ยืนงงในดงตึก) อะไรวะเนี่ย? ทำไมมองผมเหมือนเป็น เสี่ยผู้ทรงอิทธิพลที่น่ากลัว แบบนั้น?",
                "main_confused",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(speaker,
                "[\"ไอ้โต\" เพื่อนสนิทตัวเอก นั่งเลื่อนมือถือ]",
                "main",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(to,
                "\"เฮ้ย ตัวเอก... มึงไปทำอะไรไว้วะเนี่ย?\"",
                "to_surprised",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"ทำไรวะ? กูยังไม่ได้ทำไรเลย นอกจากกินแกลบ\"",
                "main_ask",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(to,
                "\"ก็ในเพจ 'Cute Boy & Girl BU' เนี่ย... มีคนโพสต์ถึงมึงแบบไม่ระบุชื่อ\"",
                "to_basic",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(speaker,
                "[Post Content บนหน้าจอ]\n" + //
                "\"เมื่อวานเจอพี่ Com Sci คนนึงที่โรงอาหารนิเทศฯ ท่าทางดุมาก เข้ามาโยนเงิน 500 ใส่โต๊ะพวกเราแล้วบอกว่า 'ไม่ต้องทอน' แล้วเดินหนีเลย... คือพวกเราคุยเสียงดังรบกวนพี่เขาเหรอคะ?\n" + //
                " หรือเขาแค่รวยแล้วอยากอวด? กลัวมากแม่ หน้าพี่เขาเหมือนพร้อมบวกตลอดเวลา\"Hashtag: #วิศวะคอมสายเปย์หรือนักเลง #กลัวแล้วจ้า",
                "main",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(ทรุดลงกับพื้น) \"ม่ายยยยยยยยยย!\"",
                "main_collapse",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(บรรยาย) :\n" + //
                "1.เสียเงิน 500 (อดข้าว)\n" + //
                "2.ไม่ได้คอนแทคน้อง (อดจีบ)\n" + //
                "3.โดนเข้าใจผิดว่าเป็นนักเลงขี้รำคาญ (อดเกิด)\n" + //
                "นี่มัน Runtime Error ที่รุนแรงที่สุดในชีวิตมหาลัยชัดๆ!!",
                "main_thinking",
                "/images/background/comsci_01.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมนั่งมองควันจากชามบะหมี่ที่ลอยขึ้นมาเป็นรูปหน้าฮิมิโกะที่กำลังทำหน้ากลัวผม",
                "main_thinking",
                "/images/background/dobedo_room.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"ถ้าวันนั้น... กูแค่ขอไปนั่งกินข้าวดีๆ... ป่านนี้คงได้คุยไลน์กันแล้ว\"",
                "main_ask",
                "/images/background/dobedo_room.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "\"เงิน 500 ที่หายไป... แลกมาได้แค่ความว่างเปล่า และฉายา 'นักเลงโรงอาหาร'\"",
                "main_confused",
                "/images/background/dobedo_room.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "(เสียงท้องร้องดังโครกคราก แข่งกับเสียงจิ้งหรีดนอกระเบียง)",
                "main_confused",
                "/images/background/dobedo_room.png"
        ));
        Chapter1_Scene05.addDialogue(new DialogueLine(main,
                "Bad End Route: COMPLETEDTitle: The Misunderstood Millionaire (เศรษฐีตกอับผู้ถูกเข้าใจผิด)",
                "main_1",
                "/images/background/system_error.png"
        ));

        // ---------- Scene: Chapter1_Scene06 ----------
        Scene Chapter1_Scene06 = new Scene("Chapter1_Scene06");
        Chapter1_Scene06.setBackgroundPath("/images/background/comsci_01.png");

        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมตัดสินใจเดินเลี่ยงความวุ่นวายที่โรงอาหาร แล้วมุ่งหน้ากลับมาที่ \"Safe Zone\" ของพวกเรา... ห้องปฏิบัติการคอมพิวเตอร์ (Lab) ที่ตึกเพชร",
                "main_thinking"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "(บรรยาย) : แอร์ที่นี่เย็นฉ่ำจนหนาว และเสียงเดียวที่ได้ยินคือเสียงพัดลมระบายความร้อนของ CPU กับเสียงเคาะคีย์บอร์ด",
                "main_thinking"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ที่มุมห้องประจำ ผมเห็น \"โต\" เพื่อนสนิทของผมกำลังนั่งหน้าเครียดอยู่หน้าจอ ถ้าคนนอกมองเข้ามา คงนึกว่ามีสาวน้อยคอสเพลย์ผมสีชมพูหลุดเข้ามานั่งเรียนด้วย...",
                "main_thinking"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "(บรรยาย) :แต่สำหรับพวกผม... มันคือไอ้โต เพื่อนชายคนเดิม เพิ่มเติมคือความ \"Kawaii\" ที่มันชอบแต่งตัวตามใจฉัน (ซึ่งอาจารย์คณะนี้ก็ชิลล์พอที่จะไม่ว่าอะไร ตราบใดที่โค้ดมึงรันผ่าน)",
                "main_thinking"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "(ทุบโต๊ะดังปัง!) \"โอ๊ยยย! บั๊กบ้าอะไรเนี่ย! คอมไพล์ไม่ผ่านสักที!\"",
                "to_basic"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "(หันมาเห็นผม) \"อ้าว! ตัวเอก ! มาพอดีเลยมึง! มาดูโค้ดให้หน่อยดิ๊ แดงเถือกเป็นเลือดเลยเนี่ย!\"",
                "to_basic"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "(วางกระเป๋าลงแล้วขยับเข้าไปดู) \"ไหน... ใจเย็นๆ นะโต อย่าเพิ่งทุบคีย์บอร์ด เดี๋ยวพัง\" ผมกวาดตามองโค้ดบนหน้าจอแค่แวบเดียว ก็รู้สาเหตุ",
                "main_umm"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "\"มึงประกาศตัวแปรซ้ำกันใน Scope เดียวกันไงโต... ลบ int count บรรทัดนี้ออกก็หายแล้ว\"",
                "main_markpoint"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "(ตาโตเป็นประกาย) \"เอ้อว่ะ! กูเบลอได้ไงเนี่ย!\"",
                "to_surprised"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "\"ขอบใจมากเพื่อนรัก! มึงนี่สมเป็นเทพเจ้าแห่งแล็บจริงๆ\" (ทำท่าส่งจูบให้แบบกวนประสาท)",
                "to_basic"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "\"พอเลยๆ ขนลุก... แล้วนี่งานเสร็จยัง?\"",
                "main_boring"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "\"เกือบละๆ... ว่าแต่มึงเถอะ เมื่อเช้ากูเห็นนะเว้ย ตอนเดินลงรถรางมาน่ะ\"",
                "to_basic"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "(ยิ้มกรุ้มกริ่ม เอานิ้วจิ้มแขนผมยิกๆ) \"น้องผู้หญิงคนนั้นใครอะ? น่ารักเชียวนะ สเปกเหรอ? หรือว่าเป็นแฟน? บอกมาซะดีๆ!\"",
                "to_basic"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(main,
                "(ถอนหายใจ) \"ไม่ใช่แฟน... น้องเขาหลงทางเฉยๆ กูเลยไปส่ง ชื่อฮิมิโกะ เด็กนิเทศฯ\"",
                "main_yawn"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(to,
                "\"หูยยยย! เด็กนิเทศฯ! ของดี! กูบอกเลยนะว่าถ้ามึงจีบติดนะ ชีวิตมึงจะมีสีสันมาก ไม่จืดชืดเหมือนนั่งดูหน้าจอ Terminal แบบนี้หรอก เชื่อกู!\"",
                "to_surprised"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(speaker,
                "Sound : เสียงแจ้งเตือน Line ดัง \"ติ๊ง!\"] ผมหยิบโทรศัพท์ขึ้นมาดู... ยังไม่มีอะไรคืบหน้าเรื่องฮิมิโกะ เพราะผมยังไม่มีคอนแทคเธอ โตหันกลับไปรัวคีย์บอร์ดต่ออย่างเมามัน (ด้วยท่าทางที่ดูมุ้งมิ้งขัดกับความเร็วในการพิมพ์)",
                "line"
        ));
        Chapter1_Scene06.addDialogue(new DialogueLine(speaker,
                "ตอนนี้ผมว่างแล้ว... จะเอายังไงต่อดี?"
        ));

        // addChoice
        Chapter1_Scene06.addChoice(new Choice(
                "สืบราชการลับ",
                "Chapter1_Scene07"
        ));
        // addChoice
        Chapter1_Scene06.addChoice(new Choice(
                "อัปเกรดตัวเอง",
                "Chapter1_Scene11"
        ));
        // addChoice
        Chapter1_Scene06.addChoice(new Choice(
                "ให้ \"โต\" ช่วยสืบ",
                "Chapter1_Scene12"
        ));

        // ---------- Scene: Chapter1_Scene07 ----------
        Scene Chapter1_Scene07 = new Scene("Chapter1_Scene07");
        Chapter1_Scene07.setBackgroundPath("/images/background/l6.jpg");

        Chapter1_Scene07.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมหันกลับมาที่หน้าจอคอมพิวเตอร์ตัวเอง... งานเสร็จแล้ว แต่ความสงสัยในใจมันยังไม่เสร็จ ",
                "main_thinking"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : \"ฮิมิโกะ... นิเทศ... ปี 1...\" นิ้วผมพรมลงบนคีย์บอร์ดอย่างคล่องแคล่ว เปิด Browser ขึ้นมา แล้วเริ่มปฏิบัติการค้นหาข้อมูล (แบบเงียบเชียบที่สุด)",
                "main_deepthinking"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(speaker,
                "[Action: Search Query]\n" + //
                "site:facebook.com \"Himiko\" \"Bangkok University\"site:instagram.com \"Himiko\" \"BU\"#BUCuteGirl #FreshyBU",
                "/images/background/himiko_igstory.png"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(main,
                "(บรรยาย): ผลการค้นหาเด้งขึ้นมาเป็นพืด... ฮิมิโกะไม่ใช่ชื่อโหล แต่ก็มีคนใช้ชื่อนี้ในเกมเยอะเหมือนกัน ผมต้องกรองข้อมูลขยะออก (Filter Garbage Data) ตัวเอก: \"เจอแล้ว...\"",
                "main_1"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(speaker,
                "หน้าจอแสดงผล Instagram ของเด็กสาวคนหนึ่ง รูปโปรไฟล์เป็นรูปเดียวกับที่ผมเห็นเมื่อเช้า... รอยยิ้มกว้างๆ ที่ทำให้โลกสดใสขึ้นมาทันตา Username: @Himiko_TheCatLoverBio: Freshy Comm Arts BU 💎 | Cat Slave 🐱 | Filmmaker wannabe 🎬",
                "/images/background/himiko_igstory.png"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(main,
                "(เผลอยิ้มออกมา) \"ทาสแมวซะด้วย...\"",
                "main_usemobile"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(speaker,
                "[SFX : เสียงเก้าอี้เลื่อนครืดดด มาข้างหลัง]",
                "SFX"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(to,
                "\"แหม... แหมมมมมม!\" ตัวเอก: (สะดุ้งโหยง รีบกด Alt+Tab สลับหน้าจอ) \"เฮ้ย! โต! ตกใจหมด!\"",
                "to_basic"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(to,
                "(ยื่นหน้าเข้ามาใกล้ กลิ่นแชมพูหอมฟุ้ง) \"สลับจอไวระดับ Pro Player เลยนะมึง... แต่ไม่ทันสายตาเหยี่ยวของ 'น้องโต' หรอกจ้ะ\"",
                "to_basic"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(to,
                "(ทำหน้าล้อเลียน) \"ไหนบอกว่าแค่บังเอิญเจอ? นี่ถึงขั้นขุด IG น้องเขามาดูเลยเหรอ? อาการหนักนะเนี่ยเพื่อนกู Segmentation Fault ที่หัวใจเหรอครับ?\"",
                "to_thinking"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(main,
                "\"ก็... ก็แค่อยากรู้ว่าน้องเขาเป็นใครเฉยๆ ไม่ได้คิดอะไรโว้ย\" โต: \"จ้าาา เชื่อตายเลยจ้าาา หน้าแดงขนาดนี้ CPU ร้อนจี๋แล้วมั้ง\"",
                "main_laughlittle"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(to,
                "(แย่งเมาส์ไปคลิกกลับมาที่หน้า IG) \"ดูสิ... Follower 2,500 คน! ฮอตอยู่นะเนี่ย... ล่าสุดเพิ่งลง Story เมื่อ 10 นาทีที่แล้วด้วย\"",
                "to_surprised"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(speaker,
                "[Instagram Story: @Himiko_TheCatLover]\n" + //
                "ภาพ: รูปแก้วชานมไข่มุก ร้านดังหน้ามหาลัย (ซอยรังสิตภิรมย์)\n" + //
                "Caption: \"เรียนเสร็จแล้ววว! เติมพลังก่อนกลับหอ \"",
                "bobba"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(to,
                "\"เชรดดด... Real-time Data ว่ะเพื่อน\" โต: \"น้องเขาอยู่หน้ารังสิตภิรมย์ตอนนี้... และมึงว่าง... และมึงหิวข้าว (กูรู้เพราะท้องมึงร้องแข่งกับคอมกูแล้ว)\"",
                "to_surprised"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมองหน้าไอ้โตที่กำลังยิ้มเจ้าเล่ห์ แล้วมองกลับไปที่หน้าจอ... ข้อมูล (Data) อยู่ในมือแล้ว เหลือแค่การตัดสินใจ (Decision Making) ของผม",
                "main_thinking"
        ));
        Chapter1_Scene07.addDialogue(new DialogueLine(to,
                "\"ไปดิรอไร! พรหมลิขิตสร้างได้ด้วยตีนเรานะเว้ย! ไป 'บังเอิญ' เจออีกรอบให้มันเนียนๆ หน่อย\" โต: \"หรือมึงจะนั่งเน่าอยู่ที่นี่ เขียนโค้ดจีบ NPC ในเกมต่อไป?\"",
                "to_basic"
        ));

        // addChoice
        Chapter1_Scene07.addChoice(new Choice(
                "ไปดักรอที่ร้านชานม",
                "Chapter1_Scene08"
        ));
        // addChoice
        Chapter1_Scene07.addChoice(new Choice(
                "กด Follow และทัก DM ไป",
                "Chapter1_Scene09"
        ));
        // addChoice
        Chapter1_Scene07.addChoice(new Choice(
                "ไม่ทำอะไรทั้งนั้น กลับหอนอน",
                "Chapter1_Scene10"
        ));

        // ---------- Scene: Chapter1_Scene08 ----------
        Scene Chapter1_Scene08 = new Scene("Chapter1_Scene08");
        Chapter1_Scene08.setBackgroundPath("/images/background/comsci_01.png");
        Chapter1_Scene08.setEnding(true);

        Chapter1_Scene08.addDialogue(new DialogueLine(speaker,
                "[SFX : เสียงฝีเท้าเดินเร็วๆ + เสียงรถมอเตอร์ไซ ค์รับจ้าง + เสียงจอแจของนักศึกษาเลิกเรียน]",
                "SFX"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"เร็วเข้าไอ้โต! เดี๋ยวตลาดวาย!\"",
                "main_basic"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "(เดินกึ่งวิ่งตามมา มือข้างนึงจับโบว์ผูกผมไม่ให้ปลิว) \"รู้แล้วน่า! รีบไปกู้เซิร์ฟเวอร์รึไง! ขาจะขวิดกันแล้วเนี่ย!!\"",
                "to_basic"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พวกเราเดินลัดเลาะมาจนถึงโซนตลาดนัด BU... สวรรค์ยามเย็นของนักศึกษา ที่นี่เต็มไปด้วยเต็นท์ผ้าใบสีขาวเรียงรายละลานตา กลิ่นลูกชิ้นทอด ยำมะม่วง และเครปหอมๆ ลอยฟุ้งไปทั่ว แต่วันนี้ผมไม่ได้มาล่าของกิน... ผมมาล่า \"จังหวะหัวใจ\"",
                "main_thinking"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "\"คนเยอะชิบหาย... ไหนวะ น้องฮิมิโกะของมึง?\" (โตชะเง้อคอ มองหาเป้าหมายผ่านฝูงชนนักศึกษาที่มาเดินช้อปปิ้งหลังเลิกเรียน)",
                "to_basic"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(กวาดสายตาแบบ Algorithm Binary Search Tree) \"นั่นไง! โซนของกิน... หน้าร้านน้ำปั่น!\"",
                "main_ask"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เป้าหมายล็อก! ฮิมิโกะกำลังยืนต่อแถวซื้อน้ำปั่นผลไม้อยู่ เธอกำลังก้มหน้าเลือกเมนูอย่างตั้งอกตั้งใจ",
                "main_thinking"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"เอาไงดีวะ... เข้าไปเลยไหม? หรือรอให้น้องเขาซื้อเสร็จก่อน?\"",
                "main_basic"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "\"รอพรุ่งนี้เลยไหมล่ะ? ไป! เดี๋ยวนี้!\"",
                "to_basic"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(speaker,
                "โตคว้าแขน ตัวเอก แล้วลากฝ่าดงคนเข้าไปทันที"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! เบาๆ ดิเพื่อน เดี๋ยวชนคนอื่น!\"",
                "main_ask"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(speaker,
                "แรงดึงระดับรถลากของ ไอ้โต ทำให้ผมถลาไปหยุดอยู่ข้างๆ แถวที่ฮิมิโกะยืนอยู่พอดี",
                "main",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "(แกล้งทำเสียงดัง) \"อุ๊ย! ร้านนี้คนเยอะจังเลยนะ ตัวเอก! น่ากินจังเลยเนอะ!\"",
                "to_basic",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(speaker,
                "ฮิมิโกะสะดุ้งเล็กน้อย แล้วหันมาตามเสียง",
                "main",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"อ๊ะ...\"",
                "himiko_surprised",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"พี่ ตัวเอก! บังเอิญจังเลยค่ะ!\"",
                "himiko_shy",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(เกาหัวแก้เขิน พยายามปรับสีหน้าให้ดูธรรมชาติ) \"อ้าว... น้องฮิมิโกะ? มาเดินตลาดนัดเหมือนกันเหรอครับ?\"",
                "main_basic",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"ใช่ค่ะ! เรียนเสร็จท้องก็ร้องเลย... ที่นี่ของกินเยอะมากกกก หนูเลือกไม่ถูกเลยค่ะ\"",
                "himiko_laugh",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "(มองไปข้างๆ ตัวเอก) \"แล้วนี่...\"",
                "himiko_nocare",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "(ฉีกยิ้มการค้า) \"สวัสดีจ้าสาวน้อย! พี่ชื่อ 'โต' นะ เป็นเพื่อนสนิทของไอ้หนุ่มหน้ามนคนนี้นี่แหละ เห็นมันบ่นๆ ว่าอยากกินน้ำปั่น พี่เลยพามา\"",
                "to_basic",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"หูววว... พี่โตน่ารักจังเลยค่ะ! แต่งตัวเก่งมาก!\"",
                "himiko_interested",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "\"แหม... ชมแบบนี้เดี๋ยวเลี้ยงยำมะม่วงเลยนี่ (หัวเราะ) เราก็ปี 1 นิเทศฯ ช่ะ? ได้ยินกิตติศัพท์ความน่ารักมาจากเพื่อนพี่เยอะเลย\"",
                "to_surprised",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(ศอกใส่เอวโตเบาๆ) \"ไอ้โต! พูดมาก!\"",
                "main_umm",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"พี่จะสั่งน้ำด้วยไหมคะ? สั่งพร้อมหนูเลยก็ได้นะ เดี๋ยวหนูเลี้ยงเอง ถือว่าขอบคุณเรื่องเมื่อเช้าด้วย!\"",
                "himiko_ask",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"ไม่เป็นไรครับๆ พี่จ่ายเองดีกว่า... เราเป็นน้องเก็บเงินไว้ซื้อเสื้อผ้าสวยๆ เถอะ\"",
                "main_basic",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(speaker,
                "หลังจากได้แก้วน้ำปั่นมาถือกันคนละแก้ว (ผมสั่งแตงโมปั่นเพื่อดับความร้อนรุ่มในใจ) พวกเราก็เดินเลี่ยงคนออกมาหามุมว่างๆ ยืนคุยกันตรงใกล้ๆ เวทีดนตรีสด",
                "main",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"แล้วนี่... จะกลับยังไงครับ? หออยู่ไกลไหม?\"",
                "main_umm",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"ต้องนั่งรถรางไปหลังมอค่ะ..... จริงๆ หนูเริ่มงงๆ ทางเดินรถรางแล้วเหมือนกัน คนมันเยอะตอนเย็น\"",
                "himiko_ask",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(สบโอกาส) \"งั้น... เดี๋ยวพี่เดินไปส่งที่ท่ารถรางไหม? พอดีพี่กะว่าจะกลับพอดี\"",
                "main_sunshade",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "(พยักหน้าสนับสนุนรัวๆ) \"ใช่ๆ! พวกพี่กำลังจะกลับ... ทางเดียวกัน!",
                "to_basic",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"จริงเหรอคะ? เย้! ดีเลยค่ะ หนูจะได้ไม่ขึ้นผิดคัน\"",
                "himiko_yay",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "(ทำท่าเหมือนนึกอะไรขึ้นได้) \"อ๊ะ! จริงสิ... พี่คะ ขอไลน์พี่ไว้หน่อยได้ไหมคะ?\"",
                "himiko_interested",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"เผื่อหนูหลงทางในตลาดนัด หรือหารถรางไม่เจอ จะได้ SOS หาพี่ได้!\"",
                "himiko_shy",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(บรรยาย) : Target Acquired.",
                "main_thinking",
                "/images/background/bu_market.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"ได้สิครับ\" ผมรีบหยิบมือถือขึ้นมาเปิด QR Code ให้เธอสแกน",
                "main_usemobile",
                "/images/background/himiko_added_friend.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(speaker,
                "ท่ามกลางแสงไฟสลัวๆ และบรรยากาศคึกคักของตลาดนัด ช่วงเวลานี้มันช่าง Perfect",
                "main_usemobile",
                "/images/background/himiko_added_friend.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พวกเราเดินมาส่งฮิมิโกะจนถึงท่ารถรางที่คนเริ่มซาลงแล้ว",
                "main_thinking",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"ขอบคุณพี่ๆ ทั้งสองคนมากนะคะ! วันนี้สนุกมากเลย ไว้เจอกันใหม่นะคะ\"",
                "himiko_eyecontact",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(himiko,
                "\"บ๊ายบายพี่โต! บ๊ายบายพี่ ตัวเอก!\"",
                "himiko_hihi",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(บรรยาย)  : เธอกระโดดขึ้นรถรางไป แล้วหันมาโบกมือให้จนรถเคลื่อนตัวออกไป ผมยืนมองรถรางคันนั้นจนลับสายตา...",
                "main_thinking",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "(กอดคอผม) \"เป็นไงล่ะมึง... แผนตลาดนัดกู สุดยอดปะ?\"",
                "to_basic",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "\"เออ... ขอบใจมากว่ะเพื่อน ถ้าไม่มีมึงกูคงไม่กล้าทักแน่ๆ\"",
                "main_thinking",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "\"ไม่เป็นไรเพื่อนรัก... แต่ตอนนี้กูหิวข้าวของจริงละ เมื่อกี้มัวแต่แอ๊บไม่กล้าซื้อไก่ทอด\"",
                "to_basic",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(to,
                "\"มื้อนี้มึงจ่ายนะ ค่าจ้างพ่อสื่อ!\"",
                "to_basic",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(บรรยาย) : แสงไฟของตลาดนัด BU ข้างหลังค่อยๆ หรี่ลง แต่แสงสว่างในใจผมกลับสว่างจ้าขึ้นมาแทน วันนี้ผมได้เรียนรู้ว่า... บางครั้ง การแก้บั๊กในชีวิตจริง ไม่ต้องใช้ Logic ที่ซับซ้อน แค่ใช้ \"ความกล้า\" และ \"เพื่อนดีๆ\" สักคน ก็เพียงพอแล้ว",
                "main_thinking",
                "/images/background/bu_frontnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(main,
                "(พิมพ์ตอบไลน์สั้นๆ) \"ถึงหอแล้วบอกด้วยนะครับ\"",
                "main_usemobile",
                "/images/background/bu_frontnight.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(null,
                "Chapter 1: Hello World - COMPLETED",
                "main_usemobile",
                "/images/background/to_be_continued.png"
        ));
        Chapter1_Scene08.addDialogue(new DialogueLine(null,
                "Next Time in \"The First Chapter of Love\"  : บทที่ 2: \"Logic Gate & Love Gate\" การแชทไลน์เริ่มขึ้น! แต่กำแพงภาษา (เด็กคอม vs เด็กนิเทศ) จะเป็นอุปสรรคหรือไม่? และความลับของ \"โต\" เพื่อนรัก ที่อาจจะมีบทบาทมากกว่าแค่ตัวประกอบ!? รอติดตามได้เลย!",
                "main_usemobile",
                "/images/background/to_be_continued.png"
        ));

        // ---------- Scene: Chapter1_Scene09 ----------
        Scene Chapter1_Scene09 = new Scene("Chapter1_Scene09");
        Chapter1_Scene09.setBackgroundPath("/images/background/comsci_01.png");
        Chapter1_Scene09.setEnding(true);

        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมสูดหายใจเข้าลึกๆ แล้วกดปุ่ม [Follow] สีฟ้าบนหน้าจอ ปุ่มเปลี่ยนสถานะเป็น [Requested] (หรือ Following ถ้าเธอเปิดสาธารณะ) ราวกับผมเพิ่งยิงจรวดออกไปสู่อวกาศแล้วรอฟังผล",
                "main_usemobile"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"กดแล้ว. ..\"",
                "main_usemobile"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "(มองหน้าจอพลางเท้าคาง) \"โธ่... พ่อหนุ่ม Play Safe นึกว่าจะวิ่งไปดักรอแบบพระเอกซีรีส์เกาหลี สุดท้ายก็เลือกจีบผ่าน Wifi สินะ\"",
                "to_thinking"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"เอาน่า... วิ่งไปตอนนี้เหงื่อซก เดี๋ยวสภาพดูไม่ได้ ทักไปแบบนี้น่าจะดูสุภาพกว่า ไม่ดูคุกคามด้วย\"",
                "main_ask"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "\"จ้าๆ พ่อคนสุภาพ... อ้าว แล้วจะทักว่าไง? อย่าส่งสติกเกอร์ 'สวัสดีวันจันทร์' ไปนะเว้ย กูตบคว่ำเลยนะ\"",
                "to_basic"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(บรรยาย) : นั่นสิ... จะทักยังไงให้ดูไม่เหมือนพวกโรคจิตที่แอบส่อง IG? ผมนั่งจ้องช่อง Direct Message (DM) ที่ว่างเปล่า เคอร์เซอร์กระพริบวิบวับเหมือนกำลังเร่งเร้า",
                "main_confused"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "[Drafting Message...]\n" + //
                "Draft 1: \"สวัสดีครับ\" (สั้นไป ดูห้วน)\n" + //
                "Draft 2: \"เห็นกินชานมอยู่ น่ากินจัง\" (น่ากลัวชิบหาย! ลบๆๆ!)\n" + //
                "Draft 3: \"พี่ชื่อ... ที่เจอกันเมื่อเช้า...\" (ทางการไปไหมวะ?)",
                "main_usemobile"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "(ทนไม่ไหว แย่งคีย์บอร์ดไปพิมพ์) \"โอ๊ย! ลีลาเยอะ! มานี่!\"",
                "main_usemobilemain"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! ไอ้โต! อย่ากดส่งมั่วๆ นะเว้ย!\"",
                "main_surprised"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "(พิมพ์รัวๆ แล้วกด Enter) \"เรียบร้อย! แบบนี้แหละ Natural สุด!\"",
                "main_usemobilemain"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "Message Sent  : \"สวัสดีครับ พี่ ตัวเอก เองนะ ที่เจอกันหน้าตึกเพชรเมื่อเช้า พอดี IG เด้งขึ้นมาใน Suggested Friend เลยกดทักมาครับ วันนี้หลงทางอีกไหมเนี่ย? 555\"",
                "sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(อ่านข้อความแล้วหน้าซีด) \"เฮ้ย! โกหกหน้าตายว่า IG เด้งขึ้นมาเนี่ยนะ!?\"",
                "main_usemobile"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "\"เออน่า! ผู้หญิงเขาไม่มานั่งจับผิด Algorithm หรอก\"",
                "to_thinking"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "เวลาผ่านไป 15 นาที... หน้าจอยังคงเงียบสงบ"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "ผมนั่งจ้องหน้าจอโทรศัพท์สลับกับหน้าจอคอมฯ จิตใจไม่อยู่กับเนื้อกับตัว"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"15 นาทีแล้ว... ยังไม่ตอบเลยว่ะ หรือว่าน้องเขารู้ว่าเราส่อง?\"",
                "main_usemobile"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"หรือว่าเขาคิดว่าพี่เป็นพวก Stalker?\"",
                "main_laughlittle"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "\"ใจเย็นพ่อคุณ! น้องเขาอาจจะกำลังดูดไข่มุกติดคออยู่ก็ได้ หรือไม่ก็เม้าท์กับเพื่อนอยู่ รอหน่อยดิวะ Ping มันต้องมี Time-out บ้าง\"",
                "to_basic"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "(เสียงแจ้งเตือน IG ดัง \"ติ๊ง!\")",
                "SFX"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "ผมสะดุ้งสุดตัว รีบคว้าโทรศัพท์ขึ้นมาดู"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "[Notification: @Himiko_TheCatLover started following you.][Notification: @Himiko_TheCatLover sent you a message.]",
                "SFX"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"ตอบแล้ว!! ฟอลกลับด้วย!!\"",
                "main_surprised"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "\"เห็นม่ะ! กูบอกแล้วว่าเชื่อมือโปร!\"",
                "to_thinking"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "[Chat Log]",
                "himiko_sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(himiko,
                "\"อุ๊ย! พี่ตัวเอก! สวัสดีค่าาา\"",
                "himiko_sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(himiko,
                "\"ตกใจเลย พี่หาหนูเจอได้ไงเนี่ย 5555\"",
                "himiko_sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(himiko,
                "\"วันนี้ไม่หลงแล้วค่ะ! แต่ขาลากมากกก ม.เรากว้างเกินไปแล้ว\"",
                "himiko_sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ตัวอักษรพวกนี้... ทำไมอ่านแล้วมันมีเสียงใสๆ ลอยออกมานะ? ผมรู้สึกว่ามุมปากตัวเองกำลังยกขึ้นโดยอัตโนมัติ",
                "main_deepthinking"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(พิมพ์ตอบ) \"ดีแล้วครับที่ไม่หลง 555 ไว้ถ้าหลงอีก หรือมีปัญหาเรื่องคอมฯ ก็ทักมาถามได้ตลอดนะครับ ยินดีช่วยครับ\"",
                "main_usemobile"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(himiko,
                "(ตอบกลับทันที)\"ขอบคุณค่าาา ใจดีที่สุดเลย! ไว้จะทักไปกวนบ่อยๆ นะคะ อิอิ\"",
                "himiko_sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(himiko,
                "[Sent a Sticker: แมวน้อยทำท่าขอบคุณ]",
                "himiko_sent"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(วางมือถือลงบนโต๊ะ แล้วถอนหายใจยาวๆ อย่างโล่งอก) \"ฟู่ววว... รอดตาย\"",
                "main_yawn"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "(ตบไหล่ผม) \"เป็นไงล่ะ... Mission Complete ไหม? ได้คุย ได้ฟอล ได้สานสัมพันธ์ แบบไม่ต้องเสียเหงื่อวิ่งไปหน้ามอ\"",
                "to_basic"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "\"แต่กูจะบอกให้นะเพื่อน... การคุยแชทมันง่ายกว่าคุยต่อหน้าก็จริง แต่มันก็สร้างความเข้าใจผิดง่ายกว่าเหมือนกัน\"",
                "to_basic"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "\"ครั้งหน้า... มึงต้องกล้าคุยกับน้องเขาต่อหน้านะเว้ย เข้าใจป่ะ?\"",
                "to_basic"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"เออ... รู้แล้วน่า แต่วันนี้ขอแค่นี้ก่อน หัวใจจะวาย\"",
                "main_ask"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "ผมกับโตเดินออกมาจากตึกเรียน อากาศเย็นลงเล็กน้อย ผมหยิบโทรศัพท์ขึ้นมาดูอีกครั้ง สถานะของผมกับฮิมิโกะเปลี่ยนไปแล้ว จาก \"คนแปลกหน้า\" -> \"คนรู้จัก\" -> \"Mutual Friend ในโลกออนไลน์\"",
                "main_1",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ถึงวันนี้ผมจะเลือกวิธีที่ขี้ขลาด (ในสายตาคนทั่วไป) หรือวิธีที่ชาญฉลาด (ในสายตาเด็กคอมฯ) ก็ตาม แต่ผลลัพธ์คือ... ผมได้เริ่มต้นเขียนบทแรกของเรื่องราวนี้แล้ว",
                "main_thinking",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "\"ขอบใจมากนะโต วันนี้ถ้าไม่มีมึง กูคงไม่กล้าทำอะไรเลย\"",
                "main_ask",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(to,
                "(สะบัดผมสีชมพู) \"แน่นอนดิ! เลี้ยงข้าวเย็นกูด้วยเลย โทษฐานทำให้มึงมีเมีย... เอ้ย มีเพื่อนคุย!\"",
                "to_thinking",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(ยิ้ม) \"เออๆ กินไรก็สั่งมา ป๋าเลี้ยงเอง\" (ดูเงินในกระเป๋าแล้วก็พอไหวอยู่)",
                "main_1",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Connection established successfully.Packet loss: 0%Happiness: 100%",
                "main_ask",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(speaker,
                "หน้าจอโทรศัพท์ของตัวเอกค่อยๆ ดับลง พร้อมกับโลโก้เกมที่ปรากฏขึ้น",
                "SFX",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(null,
                "Chapter 1: Hello World - COMPLETED",
                "SFX",
                "/images/background/to_be_continued.png"
        ));
        Chapter1_Scene09.addDialogue(new DialogueLine(null,
                "Next Time in \"The First Chapter of Love\":บทที่ 2: \"Logic Gate & Love Gate\"\n" + //
                "เมื่อการคุยในแชทเริ่มลื่นไหล... ฮิมิโกะเริ่มทักมาปรึกษาเรื่องคอมฯ ถี่ขึ้น (หรือแค่หาเรื่องคุย?) แต่แล้ว... \"บั๊ก\" ตัวใหญ่ก็โผล่มา เมื่อคอมพิวเตอร์ของเธอพังจริง! และเธอต้องการคนช่วย \"เดี๋ยวนี้\" ตัวเอกจะต้องเลือกว่าจะ Remote Desktop ไปช่วยแบบเท่ๆ หรือจะบุกไปช่วยถึงหอพัก! โปรดติดตามตอนต่อไป!",
                "SFX",
                "/images/background/to_be_continued.png"
        ));

        // ---------- Scene: Chapter1_Scene10 ----------
        Scene Chapter1_Scene10 = new Scene("Chapter1_Scene10");
        Chapter1_Scene10.setBackgroundPath("/images/background/comsci_01.png");
        Chapter1_Scene10.setEnding(true);

        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมองรูปใน IG ของฮิมิโกะอีกครั้ง... รอยยิ้มสดใส แสงแดด และแก้วชานมไข่มุก ทุกอย่างดูเปล่งประกายเกินกว่าที่คนอย่างผมจะเอื้อมถึง",
                "microphone"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(เลื่อนเมาส์ไปที่มุมขวาบน... แล้วกด X)",
                "main_basic"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(to,
                "\"เฮ้ย! มึงปิดทำไม!?\"",
                "to_surprised"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "\"พอเหอะโต... ดูสภาพกู กับดูสภาพน้องเขาดิ คนละโลกกันชัดๆ\"",
                "main_boring"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "\"น้องเขาดาวนิเทศฯ ส่วนกู... แค่ Backend Developer ที่ชอบทำงานหลังบ้าน ไปเสนอหน้าตอนนี้ เดี๋ยวเขาก็หาว่าเป็น Stalker หรอก\"",
                "main_markpoint"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(to,
                "(อ้าปากค้าง มองผมด้วยสายตาผิดหวังอย่างแรง) \"มึงนี่มัน... ป๊อดชิบหาย! แค่ทักทายมึงยังไม่กล้า แล้วชาตินี้มึงจะมีแฟนไหมฮะ!\"",
                "to_surprised"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "\"ไม่มีก็ไม่ตายหรอกมั้ง... กูง่วงแล้ว กลับหอดีกว่า\"",
                "main_boring"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเก็บกระเป๋า ลุกขึ้นยืน แล้วเดินออกจากห้องแล็บไป ทิ้งให้ \"โต\" นั่งหัวเสียอยู่คนเดียว",
                "main_thinking"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(to,
                "(ตะโกนไล่หลัง) \"เออ! เชิญโสดต่อไปเถอะไอ้บื้อ! กูไม่ช่วยแล้วนะเว้ย!\"",
                "to_basic"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ชีวิตผมกลับเข้าสู่ Loop เดิมอย่างสมบูรณ์แบบ while (true) { wake_up(); code(); eat(); sleep(); } ไม่มีบั๊ก ไม่มี Error และ... ไม่มีเรื่องตื่นเต้น",
                "main_thinking",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมกำลังนั่งกินข้าวคนเดียวที่มุมเดิม (มุมเสาที่มืดที่สุด) สายตาก็เหม่อมองไปรอบๆ ทันใดนั้น... ผมก็เห็นเธอ",
                "main_deepthinking",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ฮิมิโกะ เดินเข้ามาในโรงอาหาร พร้อมกับกลุ่มเพื่อนๆ และ... ผู้ชายคนหนึ่ง ผู้ชายคนนั้นถือกล้องตัวใหญ่ ท่าทางมั่นใจ แต่งตัวดี (เด็กนิเทศฯ แน่นอน) เขากำลังถ่ายรูปให้ฮิมิโกะที่กำลังยิ้มร่าเริง",
                "main_thinking",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(himiko,
                "\"พี่ซันถ่ายสวยมากเลย! รูปนี้ขอลง IG นะคะ!\"",
                "himiko_usemobile",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(sun,
                "\"ได้สิครับ สำหรับน้องฮิมิโกะ พี่จัดให้สวยๆ เลย\"",
                "sun_basic",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ทั้งสองคนเดินผ่านโต๊ะผมไป... ระยะห่างแค่เอื้อมมือ ผมเผลอสบตากับฮิมิโกะแวบหนึ่ง",
                "main_thinking",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(himiko,
                "(มองมาที่ผม... แล้วมองผ่านไปเหมือนมองอากาศธาตุ) เธอจำผมไม่ได้แล้ว... เหตุการณ์เมื่อ 1 เดือนก่อน เป็นแค่ Temporary Cache ที่ถูกล้างทิ้งไปนานแล้ว",
                "himiko_ask",
                "/images/background/bku_canteen.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินกลับหอคนเดียวเหมือนเดิม มือข้างหนึ่งถือถุงร้านสะดวกซื้อ อีกข้างล้วงกระเป๋า ผมหยิบมือถือขึ้นมา เปิดดู IG ที่ผมเคย \"ส่อง\" เมื่อเดือนก่อน",
                "main_usemobile",
                "/images/background/dobedo_road.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(speaker,
                "[Instagram Update] :\n" + //
                "Himiko_TheCatLover: Tagged @Guy_Production \"ขอบคุณตากล้องส่วนตัวที่เลี้ยงหนังนะคะ!  #MovieDate\"",
                "main_usemobile",
                "/images/background/dobedo_road.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(ยิ้มแห้งๆ ให้กับหน้าจอ)",
                "main_usemobile",
                "/images/background/dobedo_road.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "\"ก็ถูกแล้วแหละ... Logic ของโลกนี้มันถูกต้องแล้ว\" ",
                "main_usemobile",
                "/images/background/dobedo_road.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "\"User Interface ที่สวยงาม ก็ต้องคู่กับ Graphic ที่คมชัด... ส่วน Backend อย่างเรา ก็อยู่กับ Command Line จอดำๆ ต่อไป\"",
                "main_confused",
                "/images/background/dobedo_road.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(main,
                "(บรรยาย) : น้ำตาหยดหนึ่งไหลลงมาบนหน้าจอมือถือ... ไม่ใช่เพราะอกหัก (เพราะยังไม่ได้เริ่มรัก) แต่เป็นเพราะความเสียดาย... เสียดายที่วันนั้น ผมไม่ยอมกดปุ่ม \"Enter\"",
                "main_boring",
                "/images/background/dobedo_road.png"
        ));
        Chapter1_Scene10.addDialogue(new DialogueLine(speaker,
                "BAD END - GAME OVER : \"บางครั้ง... การไม่ทำอะไรเลย คือความเสี่ยงที่น่ากลัวที่สุด\"",
                "main_usemobile",
                "/images/background/system_error.png"
        ));

        // ---------- Scene: Chapter1_Scene11 ----------
        Scene Chapter1_Scene11 = new Scene("Chapter1_Scene11");
        Chapter1_Scene11.setBackgroundPath("/images/background/comsci_01.png");
        Chapter1_Scene11.setEnding(true);

        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมสูดหายใจเข้าลึกๆ แล้วตัดเรื่องฮิมิโกะออกจาก RAM ในสมอง",
                "main_thinking"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(คิดในใจ)  : \"ผู้หญิงก็เหมือน User Requirement ที่เปลี่ยนแปลงได้ตลอดเวลา... แต่โค้ดคือสัจธรรม ถ้า Logic ถูก ผลลัพธ์ก็ต้องถูก\"",
                "main_deepthinking"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเริ่มรัวนิ้วลงบนคีย์บอร์ด แก้ไขฟังก์ชันที่ซับซ้อน ปรับโครงสร้าง Database และ Refactor โค้ดให้สะอาดตาที่สุด ความรู้สึกเวลาเห็นตัวหนังสือสีเขียวขึ้นว่า BUILD SUCCESSFUL มันช่างหอมหวานยิ่งกว่าชานมไข่มุกร้านไหนๆ",
                "main_thinking"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(speaker,
                "[Time Skip: 3 ชั่วโมงผ่านไป]",
                "microphone"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "(ฟุบหลับคาโต๊ะ แล้วสะดุ้งตื่น) \"เฮือก!... ฮ้าวววว... นี่มึงยังไม่เสร็จอีกเหรอวะ?\"",
                "to_surprised"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "(มองจอผมด้วยตาปรือๆ) \"โห... โค้ดสะอาดกริบ เป็นระเบียบเว่อร์... มึงนี่มันบ้างานเข้าเส้นเลือดจริงๆ\"",
                "to_basic"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(บิดขี้เกียจจนกระดูกลั่นกร๊อบ) \"เสร็จแล้วเว้ย! ระบบลื่นหัวแตก ไม่มีบั๊กสักตัว\"",
                "main_umm"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "\"ความรักอาจจะทำให้เจ็บ... แต่ Java ไม่เคยทำร้ายกู (ยกเว้นตอนลืม Semicolon)\"",
                "main_deepthinking"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "\"จ้าพ่อคนเก่ง... สาธุ! ขอให้มึงแต่งงานกับคอมพิวเตอร์ไปเลยนะ!\"",
                "to_basic"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "\"แต่ตอนนี้... กูหิวไส้กิ่วแล้ว ถ้ามึงไม่พาไปหาไรแดก กูจะแทะสาย LAN แทนแล้วนะ!\"",
                "to_thinking"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(speaker,
                "เราสองคนเดินลงมาจากตึกเพชร อากาศตอนกลางคืนเริ่มเย็นลง ผมรู้สึกภาคภูมิใจกับงานที่ทำเสร็จไป แต่มันก็แลกมาด้วยความเหนื่อยล้าที่กัดกินร่างกาย",
                "microphone",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "\"รีบไปขึ้นรถรางเร็ว คันสุดท้ายแล้วมั้งเนี่ย\"",
                "to_surprised",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราวิ่งไปขึ้นรถรางที่กำลังจะออก... ทันใดนั้น ขณะที่รถรางค่อยๆ เคลื่อนตัวผ่าน \"ตึกนิเทศศาสตร์ (Building C)\"",
                "main_thinking",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(speaker,
                "[Visual Focus : มองผ่านหน้าต่างรถรางออกไป]",
                "microphone",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเห็นกลุ่มนักศึกษากำลังแบกของทำฉากละครกันอยู่อย่างขะมักเขม้น และในกลุ่มนั้น... ผมเห็น ฮิมิโกะ เธอกำลังแบกแผ่นไม้กระดานอันใหญ่อย่างทุลักทุเล เหงื่อซึมหน้าผาก แต่ก็ยังยิมแย้มคุยกับเพื่อน",
                "main_thinking",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : \"ฮิมิโกะ...\" ผมมองเธอผ่านกระจกรถราง... ระยะห่างแค่ไม่กี่เมตร แต่เหมือนอยู่คนละโลก ถ้าเมื่อตอนบ่ายผมเลือกที่จะไปหาเธอ ป่านนี้ผมอาจจะกำลังช่วยเธอแบกของอยู่ตรงนั้นก็ได้",
                "main_deepthinking",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "(มองตามสายตาผม) \"มองไรวะ?... อ้าว นั่นน้องคนเมื่อเช้านี่\"",
                "to_thinking",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "\"เห็นมะ... ถ้ามึงไม่มัวแต่บ้าเขียนโค้ด ป่านนี้มึงได้ซีนพระเอกขี่ม้าขาวไปช่วยสาวแบกของแล้ว... สมน้ำหน้า!\"",
                "to_basic",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(ถอนหายใจ) \"ช่างเถอะ... เขาคงมีคนช่วยเยอะแยะแล้วล่ะ\"",
                "main_boring",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(ละสายตาจากกระจก แล้วก้มมองมือถือ) \"เรามันคนเบื้องหลัง ก็อยู่ส่วนเบื้องหลังแหละดีแล้ว\"",
                "main_usemobile",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(speaker,
                "รถรางวิ่งห่างออกไป... พาผมกลับสู่ความจริง และพาเธอห่างออกไปในความทรงจำ",
                "microphone",
                "/images/background/dimandhall_a3_night.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(speaker,
                "ผมเปิดมือถือดูฆ่าเวลา... ข้อความจากรุ่นพี่ประธานสโมสรนักศึกษาคณะ\nLINE Group: Com Sci - Community]",
                "main_usemobile",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(secret,
                "\"ประกาศด่วนครับ! ทางคณะนิเทศฯ ติดต่อมา... เขาต้องการคนเขียนโปรแกรม Interactive สำหรับงานละครเวทีธีม Sci-Fi ของเด็กปี 1\"",
                "male",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(secret,
                "\"งานด่วนมาก ต้องการคนเก่งๆ ที่ปิดงานไวได้... มีใครสนใจรับจ็อบนี้ไหม? มีค่าขนมให้ + ชั่วโมงกิจกรรม\"",
                "male",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(ตาเบิกกว้าง)",
                "main_surprised",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "(ชะโงกหน้ามาดู) \"เฮ้ย! งานละครเวทีนิเทศฯ... ปี 1...\" ",
                "to_surprised",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "(ยิ้มเจ้าเล่ห์) \"นี่มันงานรุ่นเดียวกับน้องฮิมิโกะเลยนี่หว่า!\"",
                "to_basic",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : การที่ผมเลือก \"อัปเกรดตัวเอง\" (Code Optimization) ในวันนี้... ทำให้ผมมีความมั่นใจพอที่จะรับงานยากๆ ถ้าผมไม่ได้ฝึกฝีมือเมื่อบ่าย ผมคงไม่กล้ารับงานนี้แน่ๆ",
                "main_deepthinking",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(to,
                "\"เอาไงเพื่อน? สวรรค์ประทานโอกาสรอบสองมาให้แล้วนะ... รอบนี้จะใช้สกิล Coding ที่มึงภูมิใจนักหนา พาตัวเองไปหาเขาได้รึยัง?\"",
                "to_basic",
                "/images/background/bku_tramnight.png"
        ));
        Chapter1_Scene11.addDialogue(new DialogueLine(main,
                "(พิมพ์ตอบในกลุ่ม) \"ผมสนใจครับ\"",
                "main_usemobile",
                "/images/background/to_be_continued.png"
        ));

        // ---------- Scene: Chapter1_Scene12 ----------
        Scene Chapter1_Scene12 = new Scene("Chapter1_Scene12");
        Chapter1_Scene12.setBackgroundPath("/images/background/comsci_01.png");

        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมองหน้า \"โต\" เพื่อนรักที่กำลังนั่งทำตาแป๋ว",
                "main_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"ไอ้โต... มึงช่วยกูหน่อยดิ มึงเฟรนด์ลี่ เข้ากับคนง่าย... ลองไปสืบเรื่องน้องฮิมิโกะให้หน่อยได้ไหม? แบบเนียนๆ น่ะ\"",
                "main_umm"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "(ตบโต๊ะปัง!) \"ได้เลยเพื่อนรัก! เรื่องเผือก... เอ้ย เรื่องช่วยเพื่อนคืองานถนัดของ 'น้องโต' คนนี้!\"",
                "to_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "(ลุกขึ้นยืนจัดโบว์ผูกผม) \"เดี๋ยวกูจะแฝงตัวเข้าไปในดงเด็กนิเทศฯ ไปหลอกถามคอนแทค ถามสเปก ถามตารางเรียนมาให้มึงหมดเปลือก! ไว้ใจมือโปรได้เลย!\"",
                "to_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"เออ... เอาเนียนๆ นะเว้ย อย่าให้เขารู้ตัวล่ะ\" โต: \"สบายมาก! กูจะใช้สกิล Social Engineering ขั้นเทพ หลอกล่อให้ตายใจ!\"",
                "main_ask"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "โตเดินออกจากห้องแล็บไปอย่างมั่นใจ ทิ้งให้ผมนั่งรอด้วยความคาดหวัง... โดยหารู้ไม่ว่า นั่นคือจุดเริ่มต้นของหายนะ",
                "main_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "[เวลาผ่านไป 1 ชั่วโมง... ห้องแล็บคอมพิวเตอร์]",
                "main_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมกำลังนั่งรันโค้ดรออย่างกระวนกระวาย ประตูห้องแล็บเปิดออก โตเดินกลับเข้ามาด้วยสีหน้ายิ้มแย้ม... ยิ้มกว้างผิดปกติ แถมในมือถือแก้วน้ำแดงโซดามาด้วย",
                "main_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"เป็นไงบ้างวะ!? ได้เรื่องไหม?\"",
                "main_ask"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"ได้! ได้เยอะกว่าที่มึงคิดอีกเพื่อน!\"",
                "to_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"กูไปเจอแก๊งน้องเขาที่โรงอาหารนิเทศฯ พอดี... กูเลยเข้าไปตีเนียนคุย บอกว่าเป็นเพื่อนสนิทมึงที่อยู่ Com Sci\"",
                "to_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"แล้ว... แล้วเขาว่าไง?\"",
                "main_ask"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"น้องเขาน่ารักมาก! คุยเก่งเว่อร์! กูก็เลยใส่ไฟเชียร์มึงไปเต็มที่เลย!\"",
                "to_sweeteyes"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "[Flashback: สิ่งที่โตพูดกับฮิมิโกะ]",
                "main_thinking",
                "/images/background/deep_black.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"โอ๊ยยย น้องฮิมิโกะ! ไอ้ ตัวเอก เนี่ยนะ มันนิสัยดีมากกกก! (ลากเสียงยาว) อยู่กับพี่ตลอดเวลา ตัวติดกันเป็นปาท่องโก๋เลย\"",
                "to_surprised"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"เมื่อคืนก็นั่งเขียนโค้ดด้วยกันยันเช้า... มันดูแลพี่ดีม้ากกก ตามใจพี่ทุกอย่าง อยากกินไรก็พาไป\"",
                "to_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"แถมนะ... มันไม่เคยสนใจผู้หญิงคนไหนเลย! วันๆ มองแต่หน้าจอคอม กับหน้าพี่เนี่ยแหละ! คิกคิก\"",
                "to_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(ฟังแล้วเริ่มเหงื่อตก) \"เดี๋ยว... มึงพูดแบบนั้นจริงดิ?\"",
                "main_umm"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"เออดิ! ก็ต้องโฆษณาว่ามึงเป็นคนทุ่มเท รักใครรักจริง ดูแลคนใกล้ชิดดีไง!\"",
                "to_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"แล้วน้องเขาก็ตาวาวเลยนะ! กรี๊ดกร๊าดกับเพื่อนใหญ่เลย ดูตื่นเต้นมากที่ได้ฟังเรื่องมึง!\"",
                "to_sweeteyes"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(หน้าซีด) \"กูว่า... สัญชาตญาณกูบอกว่ามันแปลกๆ...\"",
                "main_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "[เสียงแจ้งเตือน Line ดัง \"ติ๊ง!\"]",
                "line"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"อ้าว! น้องเขาทักกูมาแล้ว! กูขอไลน์น้องเขาไว้ แล้วบอกว่าจะส่งรูปโปรเจกต์มึงไปอวด\"",
                "to_surprised"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"ไหนดูซิ...\"",
                "to_sweeteyes"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "โตเปิดอ่านข้อความ แล้วสีหน้าเริ่มเจื่อนลงเรื่อยๆ",
                "main_thinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"เอ่อ... ตัวเอก...\"",
                "to_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"อะไร? น้องเขาด่ากูเหรอ?\"",
                "main_ask"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"เปล่า... มึงดูเองเถอะ\"",
                "main_usemobilemain"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "[Chat Log: โต <-> ฮิมิโกะ]",
                "sent"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "\"พี่โตค้าาา! ขอบคุณที่มาเล่าเรื่องพี่ ตัวเอก ให้ฟังนะคะ! ฟินมากกกกก \"",
                "himiko_sent"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "\"หนูไม่เคยรู้มาก่อนเลยว่า Com Sci จะมีโมเมนต์น่ารักๆ แบบนี้!\"",
                "himiko_sent"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "\"พี่สองคนเหมาะสมกันมากเลยค่ะ! เคมีเข้ากันสุดๆ! หนูขอสมัครเป็น FC คู่จิ้น #โตxตัวเอก ได้ไหมคะ!? >///<\"",
                "himiko_sent"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "\"ไม่ต้องห่วงนะคะ หนูจะไม่เข้าไปเป็นมือที่สามแน่นอน! ขอเชียร์อยู่ห่างๆ อย่างห่วงๆ นะคะ! รักกันนานๆ น้าาาา \"",
                "himiko_sent"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(อ่านจบแล้วปล่อยมือถือร่วงลงบนโต๊ะ) \"...\"",
                "main_usemobile"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "(หัวเราะแห้งๆ) \"แหะๆ... สงสัยกูจะเชียร์มึงแรงไปหน่อย... น้องเขาเลยนึกว่า... เรา... เอิ่ม...\"",
                "to_laugh"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"มึงทำให้กู... กลายเป็นคู่เกย์กับมึง... ในสายตาน้องเขาไปแล้ว!!!\" ",
                "main_basic"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"โอ๊ย! ก็สมัยนี้สาววายมันเยอะนี่หว่า! ใครจะไปรู้ว่ะว่าน้องเขาเป็นสายนี้!\"",
                "to_sweeteyes"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "[วันต่อมา - ทางเดินตึกเพชร]",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(บรรยาย) :ผมเดินไหล่ตกมาเรียน สภาพเหมือนวิญญาณออกจากร่าง บังเอิญสวนกับฮิมิโกะและกลุ่มเพื่อนของเธอพอดี",
                "main_thinking",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(ทำใจดีสู้เสือ พยายามจะแก้ข่าว) \"เอ่อ... น้องฮิมิโกะครับ คือเรื่องเมื่อวาน...\"",
                "main_umm",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "(ทำตาเป็นประกาย เอามือปิดปากเขิน) \"อร้ายยย! พี่ ตัวเอก ! ไม่ต้องพูดค่ะ! หนูเข้าใจ!\"",
                "himiko_surprised",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "\"พี่โตเล่าให้ฟังหมดแล้ว... สู้ๆ นะคะพี่! ความรักชนะทุกอย่าง! หนูเป็นกำลังใจให้พี่กับพี่โตนะคะ!\" (เพื่อนๆ ฮิมิโกะพากันยิ้มล้อเลียนแล้วกระซิบกระซาบว่า \"น่ารักเนอะแก\")",
                "himiko_ask",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(himiko,
                "\"ไปก่อนนะคะ! ไว้เดี๋ยวหนูส่ง Link นิยายวายที่พระเอกเป็นเด็กคอมไปให้อ่านนะคะ เผื่อเป็น Ref!\" เธอวิ่งจากไป ทิ้งให้ผมยืนอ้าปากค้างอยู่ตรงนั้น... คำว่า \"เข้าใจผิด\" จุกอยู่ที่คอ พูดไม่ออก",
                "himiko_hihi",
                "/images/background/dimandhall_a3_morning.jpg"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "[ห้องแล็บคอมพิวเตอร์ - ตัวเอกนั่งกอดเข่าอยู่ที่มุมห้อง]",
                "main_boring"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : หมดกัน... เส้นทางความรักใสๆ กับเฟรชชี่สาวนิเทศฯ ตอนนี้ผมกลายเป็น \"คู่จิ้นในตำนาน\" ของคณะไปแล้ว โดยมี \"โต\" เป็นคู่กรณี ยิ่งแก้ข่าว ก็ยิ่งเหมือนแก้ตัว ยิ่งอยู่ใกล้โต ก็ยิ่งตอกย้ำภาพจำ",
                "main_deepthinking"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(to,
                "\"เอาน่ามึง... มองในแง่ดี อย่างน้อยน้องเขาก็ปลื้มมึงนะ... แค่ปลื้มผิดโพสิชั่นไปหน่อย\"",
                "to_laugh"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(main,
                "\"หุบปากไปเลยไอ้โต... ไปไกลๆ ส้นตีนกูเลย\"",
                "main_boring"
        ));
        Chapter1_Scene12.addDialogue(new DialogueLine(speaker,
                "BAD END\n" + //
                "Ending Name: The Accidental BL Hero (พระเอกวายโดยไม่ได้ตั้งใจ)\n" + //
                "Summary:\n" + //
                "Relationship with Himiko: Fanclub President (เธอเป็นประธานด้อมคู่จิ้นของคุณ)\n" + //
                "Status: คุณถูกล็อกสเปกให้เป็นแฟนกับ \"โต\" ในสายตาคนทั้งคณะ\n" + //
                "Opportunity: 0% (เธอขีดเส้นให้คุณเป็น \"พี่สาว\" หรือ \"เคะ\" ไปเรียบร้อยแล้ว)\n" + //
                "Lesson Learned: \"Social Engineering มีความเสี่ยง ผู้ลงทุนควรศึกษากลุ่มเป้าหมาย (ว่าเป็นสาววายหรือไม่) ก่อนตัดสินใจ\"",
                "main_thinking",
                "/images/background/deep_black.jpg"
        ));

        // addChoice
        Chapter1_Scene12.addChoice(new Choice(
                "เริ่มใหม่",
                "Start_Again"
        ));
        Chapter1_Scene12.addChoice(new Choice(
                "ไม่ยอมแพ้",
                "Chapter1_Scene13"
        ));

        Scene Start_Again = new Scene("Start_Again");
        Start_Again.setBackgroundPath("/images/background/system_error.png");
        Start_Again.setEnding(true);

        Start_Again.addDialogue(new DialogueLine(main,
                "เกมได้จบลงแล้ว",
                "microphone"
        ));

        Scene Chapter1_Scene13 = new Scene("Chapter1_Scene13");
        Chapter1_Scene13.setBackgroundPath("/images/background/dobedo_room.png");
        Chapter1_Scene13.setEnding(true);

        Chapter1_Scene13.addDialogue(new DialogueLine(speaker,
                " คุณเลือกที่จะ ไม่ยอมแพ้ ต่ออออส์ โชคชะตา ",
                "microphone"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(speaker,
                "[Time: 22:00 น. คืนวันเกิดเหตุ]",
                "microphone"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(to,
                "(นั่งพนมมือสำนึกผิดอยู่บนพื้นห้องตัวเอก) \"กูขอโทษ... กูผิดไปแล้วเพื่อนรัก... กูไม่นึกว่าน้องเขาจะเป็นสาววายสายฮาร์ดคอร์ขนาดนี้!\"",
                "to_thinking"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(นอนแผ่หลากลางเตียง หมดอาลัยตายอยาก) \"พอเถอะ... ตอนนี้กูเป็น 'เคะน้อยผู้น่ารัก' ในสายตาน้องเขาไปแล้ว จะไปมองหน้าติดได้ไงวะ\"",
                "main_boring"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(to,
                "\"เฮ้ย! อย่าเพิ่งยอมแพ้ดิวะ! Coding มึงยังแก้บั๊กได้ เรื่องนี้มันก็ต้องแก้ได้!\"",
                "to_sweeteyes"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(to,
                "\"ในเมื่อน้องเขาเข้าใจว่ามึง 'ชอบผู้ชาย' (คือชอบกู)... มึงก็แค่ต้องพิสูจน์ให้เห็นกับตาว่ามึง 'ชอบผู้หญิง' (คือชอบน้องเขา) แบบชัดเจน ชนิดที่สาววายสมองไหลยังต้องยอมรับความจริง!\"",
                "to_basic"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"แล้วจะทำไง? เดินไปบอกว่า 'พี่ชอบน้องครับ' เหรอ? น้องเขาก็จะคิดว่ากูแค่งอนมึง แล้วมาประชดรักใส่เขาอีก\"",
                "main_umm"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(to,
                "(ดีดนิ้วเปาะ) \"ต้องใช้สถานการณ์บังคับ! กูมีแผน... แผนนี้ชื่อว่า 'Break the Ship' (ล่มเรือผี)\"",
                "to_basic"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(to,
                "\"พรุ่งนี้บ่าย... น้องฮิมิโกะทักกูมาว่า อยากให้ช่วยลงโปรแกรมตัดต่อในโน้ตบุ๊กให้หน่อย\"",
                "to_basic"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(to,
                "\"กูจะแกล้งป่วยการเมือง... แล้วส่งมึงไปคนเดียว... ย้ำว่า คนเดียว!\"",
                "to_thinking"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(speaker,
                "[ใต้ตึกตึก C - โต๊ะม้าหินอ่อน][Time: บ่ายวันรุ่งขึ้น]",
                "microphone",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมายืนอยู่ที่นัดหมายตามแผนของไอ้โต... โดยปราศจาก \"คู่จิ้น\" ของผม ฮิมิโกะนั่งรออยู่แล้ว พร้อมโน้ตบุ๊กตัวเก่ง",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(ชะเง้อมองหา) \"อ้าวพี่ ตัวเอก ! มาแล้วเหรอคะ... แล้ว...\" (สีหน้าเธอดูผิดหวังเล็กน้อย)",
                "himiko_boring",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"พี่โตล่ะคะ? ไม่มาด้วยกันเหรอ? ทะเลาะกันเหรอคะ!?\" (เตรียมจิ้นดราม่า)",
                "himiko_interested",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(สูดหายใจลึก รวบรวมความกล้า)",
                "himiko_chubbycheeks",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"เปล่าครับ... โตมันไม่ว่าง และพี่บอกมันเองว่า ไม่ต้องมา\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"เพราะพี่อยากมาดูคอมให้น้อง... ด้วยตัวเอง\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ขยับเก้าอี้เข้าไปนั่งตรงข้าม จ้องตาฮิมิโกะนิ่งๆ ไม่หลบสายตาแบบเขินอายเหมือนทุกที",
                "main_thinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"เอ๋?... อ๋อ... ค่ะ...\" (หน้าแดงนิดๆ เริ่มทำตัวไม่ถูก เพราะผิดคิว)",
                "himiko_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"ไหนครับคอมเป็นอะไร?\" ผมดึงโน้ตบุ๊กของเธอมาดู... อาการคือลงโปรแกรมแล้ว Crack ไม่ผ่าน (ตามสไตล์เด็กมหาลัย) ผมเริ่มรัวนิ้วแก้ปัญหาด้วยความชำนาญ... ใช้เวลาไม่ถึง 10 นาที ทุกอย่างก็เรียบร้อย",
                "main_laughlittle",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"เสร็จแล้วครับ\" (หมุนคอมกลับไปให้)",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"โห! ไวมาก! พี่เก่งจังเลยอะ... สมเป็นแฟนพี่โต! เอ้ย! สมเป็นคู่หูพี่โต!\"",
                "himiko_surprised",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ยัง... เธอยังไม่หยุดชม... ต้องใช้ไม้ตาย",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(เอื้อมมือไปปิดฝาพับโน้ตบุ๊กของเธอลงเบาๆ เพื่อให้เธอละสายตาจากจอมามองหน้าผม)",
                "main_basic",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"ฮิมิโกะครับ\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"คะ... คะ?\"",
                "himiko_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"พี่ขอแก้ข่าวเรื่องนึงนะ... แบบจริงจัง\"",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"พี่กับโต... เราเป็นเพื่อนกัน เพื่อนผู้ชายที่สนิทกันเฉยๆ... พี่ไม่ได้ชอบผู้ชายครับ\"",
                "main_basic",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(ตาโต อ้าปากค้าง) \"เอ๋!!? จะ... จริงเหรอคะ? แต่พี่โตบอกว่า...\"",
                "himiko_surprised",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"ไอ้โตมันขี้โม้... ฟังนะ\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(ขยับหน้าเข้าไปใกล้อีกนิด สายตาคมกริบแบบที่เด็ก Com Sci เวลาเอาจริงจะทำกัน)",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"สเปกของพี่... คือผู้หญิงตัวเล็กๆ ใส่ชุดนักศึกษาปี 1 เรียนนิเทศฯ... และชอบหลงทางบ่อยๆ\"",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(speaker,
                "[บรรยากาศรอบข้างเงียบกริบ เสียงนกร้องยังหยุด]",
                "SFX",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(หน้าแดงแปร๊ดจนลามไปถึงหู) \"อะ... เอ๋!?... ระ... ระบุเจาะจงขนาดนี้...\"",
                "himiko_shy",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"พะ... พี่หมายถึง...\"",
                "himiko_shy",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : System.alert(\"WARNING: Too direct!\");",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : ชิบหายแล้ว! พูดความจริงออกไปหมดเปลือกเลย! เดี๋ยวไก่ตื่น! ต้องรีบแก้ Code ด่วน!",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(รีบถอยหลังกลับมานั่งท่าเดิม แล้วแกล้งกระแอมไอเสียงดัง) \"อะแฮ่ม!!\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"ยะ... อย่าเพิ่ง Compile ผิดสิครับ!\"",
                "main_markpoint",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"พี่แค่ยกตัวอย่าง! ใช่... ยกตัวอย่างเฉยๆ ว่าสเปกพี่เป็น 'ประมาณ' นี้ เพื่อพิสูจน์ว่าพี่ชอบผู้หญิง!\"",
                "main_umm",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(กระพริบตาปริบๆ) \"แค่... ตัวอย่างเหรอคะ? แต่เมื่อกี้มัน...\"",
                "himiko_surprised",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(เลิ่กลั่กแต่อ้างหลักการ) \"ก็... ก็ทางสถิติ (Statistics) เด็กปี 1 นิเทศฯ มีตั้งกี่ร้อยคน คนตัวเล็กๆ ชอบหลงทางก็มีเยอะแยะไป... มันเป็นแค่... ความน่าจะเป็น (Probability) ที่บังเอิญตรงกับเราเฉยๆ!\"",
                "himiko_shy",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"อีกอย่างนะ... เราน่ะซุ่มซ่ามจะตาย ขืนเป็นแฟนคงต้องตามแก้บั๊กชีวิตให้ทั้งวัน ไม่ไหวหรอกๆ\" (ทำหน้าเนือยๆ กลบเกลื่อน)",
                "himiko_laugh",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(ทำแก้มป่อง มุ่ยหน้าทันที) \"บู๊... อะไรกัน นึกว่าจะจีบ... ที่แท้ก็หลอกด่านี่นา!\"",
                "himiko_chubbycheeks",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"เชอะ! ใช่สิคะ หนูมันตัวภาระนี่! หลงทางเก่ง คอมพังเก่ง!\"",
                "himiko_eyecontact",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Status: Saved ...เกือบไปแล้ว แต่ก็แอบเจ็บที่ต้องปากแข็งแบบนี้",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"โอ๋ๆ ไม่ได้ว่าขนาดนั้น... แค่จะบอกว่า พี่ไม่ได้คบกับไอ้โต และ พี่ชอบผู้หญิง... เคลียร์นะครับ?\"",
                "main_laughlittle",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(ถอนหายใจอย่างโล่งอก) \"โอเคค่ะ... เคลียร์ก็ได้ เชื่อแล้วค่ะว่าไม่ได้เป็นแฟนพี่โต\"",
                "himiko_sorry",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "(ยิ้มเจ้าเล่ห์นิดๆ) \"แสดงว่า... ตอนนี้พี่ ตัวเอก ก็โสดสนิทเลยสิคะ? แถมสเปกก็ดันมาคล้ายๆ หนูซะด้วย... อิอิ\"",
                "himiko_eyecontact",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(สะดุ้ง) \"ก... ก็บอกว่าแค่ความน่าจะเป็นไง!\"",
                "main_basic",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"ค่าาา เชื่อค่าาา\" (ลากเสียงยาวแบบไม่ค่อยเชื่อ)",
                "himiko_laugh",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "\"งั้นเพื่อเป็นการไถ่โทษที่หนูเข้าใจผิด... เย็นนี้หนูเลี้ยงไอติมพี่เอง! แต่พี่ต้องพาหนูไปนะ ห้ามหนีกลับไปเขียนโค้ดก่อนด้วย!\"",
                "himiko_sorry",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "\"ครับๆ... จะกินให้พุงกางเลยคอยดู\"",
                "main_ask",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ถึงจะไม่ได้สารภาพออกไปตรงๆ แต่กำแพงเรื่อง \"คู่จิ้น\" ได้ถูกทลายลงแล้ว ตอนนี้สถานะของเราถูกรีเซ็ตใหม่... จาก \"คู่จิ้นของเพื่อน\" กลายเป็น \"รุ่นพี่ปากแข็ง กับ รุ่นน้องจอมป่วน\" และดูเหมือนเธอจะเริ่มสนุกกับการ \"แหย่\" ผมเล่นซะแล้วสิ",
                "main_thinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(himiko,
                "[ฮิมิโกะเดินนำหน้า หันมายิ้มกว้างให้ตัวเอก แสงแดดยามเย็นสาดส่อง]",
                "himiko_sexyopen",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(main,
                "(คิดในใจ) :Project Love:Status: Running...Current Obstacle: Tsundere Mode (Activated)Warning: Chapter 2 is loading...",
                "main_deepthinking",
                "/images/background/building_c4.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(speaker,
                "BAD END -> AVOIDED!\n" + //
                "Route Name: The \"Just Kidding\" (พี่น้องท้องชนกัน... เอ้ย พี่น้องเนียนๆ)\n" + //
                "Summary:\n" + //
                "Misunderstanding: Cleared (เลิกจิ้นแล้ว)\n" + //
                "Relationship: พี่ชายขี้ซึน (Tsundere Senior) <-> น้องสาวขี้แกล้ง (Teasing Junior)\n" + //
                "Flag: ยังไม่ปักธงรัก แต่ปักธงรบ (ทางความรู้สึก) เรียบร้อย\n" + //
                "Next Chapter: เตรียมตัวพบกับ \"คู่แข่งตัวจริง\" และ \"กิจกรรมรับน้อง\" ที่จะทำให้คุณต้องเลิกปากแข็ง!\n",
                "microphone",
                "/images/background/status_completed.png"
        ));
        Chapter1_Scene13.addDialogue(new DialogueLine(speaker,
                "ยินดีด้วย! คุณรอดพ้นจาก Bad End และเข้าสู่เส้นทางหลัก (Main Route) ของ Chapter 2 ได้สำเร็จ! ความสัมพันธ์แบบ \"พ่อแง่แม่งอน\" เริ่มต้นขึ้นแล้ว! โปรดติดตามตอนต่อไป",
                "microphone",
                "/images/background/to_be_continued.png"
        ));

        Scene Chapter1_Scene14 = new Scene("Chapter1_Scene14");
        Chapter1_Scene14.setBackgroundPath("/images/background/dobedo_room.png");

        Chapter1_Scene14.addDialogue(new DialogueLine(speaker,
                "[SFX: เสียงกดตู้น้ำหยอดเหรียญ + เสียงลิฟต์ติ๊งหน่อง]",
                "SFX"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(speaker,
                "[พื้นที่ส่วนกลาง (Co-working Space) ชั้นล่างของหอพัก Dobedo - แอร์เย็นฉ่ำ เงียบสงบ มีโซฟาตัวใหญ่น่านอน]",
                "microphone"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "(บรรยาย) : โรงอาหารคนเยอะเกินไป... ห้องแล็บก็น่าจะวุ่นวาย ผมตัดสินใจหนีความวุ่นวายกลับมาตั้งหลักที่หอพัก \"Dobedo\" (หอโด) ของผม กะว่าจะงีบเอาแรงสักชั่วโมงที่โซฟาส่วนกลาง ก่อนขึ้นห้องไปปั่นงานต่อ แอร์ที่นี่เย็นฉ่ำ กลิ่นน้ำยาปรับผ้านุ่มจางๆ ทำให้รู้สึกเหมือนได้กลับบ้าน",
                "main_boring"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินตรงดิ่งไปที่มุมประจำ... โซฟายาวมุมห้องที่ลับตาคนที่สุด แต่ทว่า... ฐานทัพลับของผมถูกยึดครองไปแล้ว",
                "main_umm"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(speaker,
                "[Object: ก้อนสิ่งมีชีวิตปริศนา] มีใครบางคนนอนขดตัวอยู่ในผ้าห่มเน่าๆ สีเทา บนโซฟาตัวยาว คลุมโปงจนมิด เห็นแค่ปลายเท้าที่ใส่รองเท้าแตะช้างดาวโผล่ออกมา บนโต๊ะกระจกข้างๆ มีกระป๋องกาแฟเปล่า 3 กระป๋อง และโน้ตบุ๊กสภาพผ่านศึกที่แปะสติกเกอร์ทับจนมองไม่เห็นยี่ห้อ หน้าจอยังรัน Code สีเขียวๆ ไหลเป็นน้ำตก (Matrix style)",
                "microphone"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "(ยืนงง)\"เอ่อ... โทษนะครับ... ตรงนี้...\"",
                "main_sorry"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "ขยับตัวยุกยิก แล้วโผล่หัวออกมาจากผ้าห่มเหมือนหนอนชาเขียว)\n" + //
                "Class: Year 3 Com Sci (ระดับ Legendary)\n" + //
                "Status: Sleep Deprived (อดนอนสะสม 72 ชม.)\n" + //
                "Location: Resident of Dobedo (สิงสู่ที่นี่)\n" + //
                "Skill: Hacking, Social Engineering, นอนได้ทุกที่ที่มีแอร์",
                "J_sitsad"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "(ขยับแว่นหนาเตอะที่เอียงกะเท่เร่ ตาปรือปรอยขอบตาดำยิ่งกว่าหมีแพนด้า)",
                "J_boring"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"หือ... ตัวเอก เหรอ? ...กี่โมงแล้ววะ? ...เซิร์ฟเวอร์คณะล่มรึยัง?\"",
                "J_sitsad"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "\"พะ... พี่เจ! มานอนทำไมตรงนี้ครับเนี่ย? ทำไมไม่ขึ้นห้องตัวเอง?\"",
                "main_surprised"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "(เกาหัวยุ่งๆ) \"ห้องฉันแอร์เสีย... ช่างบอกคิวซ่อมอาทิตย์หน้า... จะให้ฉันขึ้นไปอบซาวน่ารึไง\"",
                "J_thinking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"แล้วนี่แกกลับมาทำไม? ไม่ไปรับน้องที่คณะเหรอ?\"",
                "J_thinking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "\"หนีความวุ่นวายมาครับพี่... ว่าจะมางีบสักหน่อย\"",
                "main_basic"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"หนีความวุ่นวาย... หรือหนีหัวใจตัวเองกันแน่?\" พี่เจหรี่ตามองผมผ่านเลนส์แว่นหนาๆ ยิ้มมุมปากแบบตัวร้ายในหนัง",
                "J_deepthinking2"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "(สะดุ้ง) \"ห๊ะ? พี่พูดเรื่องอะไร?\"",
                "main_surprised"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"อย่ามาเนียน... เมื่อเช้าฉันนั่งแฮกกล้องวงจรปิดรถรางดูเล่นแก้เบื่อ (ระหว่างรอกาแฟดีด)\"",
                "J_deepthinking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"เห็นนะเว้ย... ช็อตที่แกประคองน้องเฟรชชี่นิเทศฯ คนนั้นน่ะ... แหมๆ มีจัดผมให้ด้วย ธรรมดาที่ไหน\" (พี่เจหันโน้ตบุ๊กมาโชว์หน้าจอ คลิปจากกล้องวงจรปิดรถรางเมื่อเช้าแบบชัดแจ๋ว)",
                "J_hacking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! พี่แฮกระบบมหาลัยอีกแล้วเหรอ!? พี่เจ! เดี๋ยวก็โดนเด้งหรอก!\"",
                "main_handupshock"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"ชู่ววว! อย่าเสียงดัง! เดี๋ยวป้าแม่บ้านตื่น...\" พี่เจลุกขึ้นนั่งขัดสมาธิ จ้องหน้าผมด้วยสายตาจริงจัง (แต่ตายังปรืออยู่)",
                "J_angry"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"น้องคนนั้น... ฮิมิโกะใช่ไหม? ปี 1 นิเทศฯ... ฉันเช็ก Database เด็กเข้าใหม่แล้ว (แฮกมาเมื่อกี้)\"",
                "J_hacking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"โปรไฟล์ดี บ้านรวย ชอบแมว... และที่สำคัญ 'โสด'...\"",
                "J_thinking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"แกคิดจะจีบจริงๆ เหรอ? ด้วยสกิล Com Sci เลเวล 1 ของแกเนี่ยนะ? คู่แข่งแกคือเดือนคณะนิเทศฯ เชียวนะ\"",
                "J_thinking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "\"โหววว ข้อมูลแน่นปึ้ก... ผมก็แค่... รู้สึกว่าน้องเขาน่ารักดีเฉยๆ ยังไม่ถึงขั้นจีบหรอกพี่\" (ตอบเสียงอ่อย)",
                "main_laughlittle"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"หึ... ปากแข็งสไตล์ Com Sci สินะ น่ารำคาญชะมัด\"",
                "J_angry"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"เอาเถอะ... เห็นแก่ที่แกเป็นรุ่นน้องคณะเดียวกัน (และอยู่หอเดียวกัน)\"",
                "J_angry"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"เจ๊จะช่วยเทรนให้... เอาไหม?\"",
                "J_thinking"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(main,
                "\"เทรน? เทรนจีบสาวเนี่ยนะ? จากพี่เนี่ยนะ?\" (มองสภาพพี่เจที่ดูห่างไกลจากคำว่ากูรูความรัก)",
                "main_basic"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"อย่ามามองฉันด้วยสายตาแบบนั้น... ความรักมันก็คือ Algorithm\"",
                "J_angrymuch"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"Input คือความใส่ใจ, Process คือจังหวะเวลา, Output คือความประทับใจ... ถ้าแกเข้าใจ Logic แกก็แฮกหัวใจใครก็ได้\"",
                "J_angry"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"ฉันจะสอนแกใช้ 'Social Engineering' ในการเข้าหาเป้าหมาย... รับรองเสร็จทุกราย\"",
                "J_smile"
        ));
        Chapter1_Scene14.addDialogue(new DialogueLine(j,
                "\"แต่ถ้าแกปฏิเสธ... เจ๊จะเอาคลิปแกทำหน้าเคลิ้มบนรถรางไปลงกลุ่มไลน์คณะ รับรองแกได้ฉายาใหม่แน่\"",
                "J_deepthinking"
        ));

        // addChoice
        Chapter1_Scene14.addChoice(new Choice(
                "รับข้อเสนอ",
                "Chapter1_Scene15"
        ));
        Chapter1_Scene14.addChoice(new Choice(
                "ปฏิเสธและเปลี่ยนเรื่อง",
                "Chapter1_Scene16"
        ));
        Chapter1_Scene14.addChoice(new Choice(
                "ท้าทายกลับ",
                "Chapter1_Scene19"
        ));

        Scene Chapter1_Scene15 = new Scene("Chapter1_Scene15");
        Chapter1_Scene15.setBackgroundPath("/images/background/dobedo_room.png");

        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"เออๆ ก็ได้ครับเจ๊! ช่วยสอนหน่อยแล้วกัน... ผมไม่อยากนก\"",
                "main_umm"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"แต่พี่ห้ามเอาคลิปผมไปประจานนะเว้ย!\"",
                "main_basic"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "(แสยะยิ้มมุมปาก) \"ดีมาก... ว่านอนสอนง่ายแบบนี้ค่อยน่าปั้นหน่อย\"",
                "J_smile"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ยินดีต้อนรับสู่ 'Dark Side' ไอ้หนู... จำไว้ว่า Social Engineering ไม่ใช่การหลอกลวง แต่มันคือการ 'เจาะระบบปฏิบัติการมนุษย์ (Hacking Human OS)' โดยใช้บั๊กทางอารมณ์และความเชื่อใจ\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พี่เจกระดกกาแฟกระป๋องจนหมดหยดสุดท้าย แล้วรัวนิ้วลงบนคีย์บอร์ดโน้ตบุ๊กสภาพเน่าๆ ของเธอ",
                "main_thinking"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"บทเรียนแรก: Information Gathering (การรวบรวมข้อมูล)\"",
                "J_boring"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"แกจะรบชนะได้ไง ถ้าไม่รู้ว่าศัตรู... เอ้ย เป้าหมาย ชอบกินอะไร? นอนกี่โมง? และเกลียดอะไร?\"",
                "J_smile"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "(หน้าจอโน้ตบุ๊กของพี่เจแสดงหน้าต่าง Command Line ไหลรัวๆ ก่อนจะเด้งขึ้นมาเป็น แผนผังความสนใจ (Interest Graph) ของฮิมิโกะ)",
                "microphone"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ดูนี่...\" (ชี้ไปที่หน้าจอ)",
                "J_ask"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"จากการวิเคราะห์ Digital Footprint ของน้องฮิมิโกะในรอบ 24 ชม. ที่ผ่านมา...\" ",
                "J_deepthinking2"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"น้องเขาเพิ่งโพสต์บ่นใน Twitter ลับ (Priv) ว่า 'อยากกินมาม่าต้มยำกุ้งใส่ชีส แต่ขี้เกียจต้มเอง' เมื่อ 5 นาทีที่แล้ว\"",
                "J_thinking"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"โห... พี่ไปขุด Twitter ลับน้องเขามาจากไหนเนี่ย?\"",
                "main_deepthinking"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"อย่าถามเยอะ... ประเด็นคือ 'Timing' (จังหวะเวลา)\"",
                "J_smile"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ตอนนี้ 22:30 น. ร้านข้าวปิดหมดแล้ว เซเว่นใต้หอคือทางเลือกเดียว\"",
                "J_smile"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"อีกไม่เกิน 10 นาที น้องเขาจะลงมาเซเว่น... และนี่คือ 'Quest' แรกของแก\"",
                "J_deepthinking"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "[Quest Log Updated: The Late Night Snack]\n" + //
                "Mission: ดักรอที่เซเว่นใต้หอ Dobedo\n" + //
                "Objective: เข้าไปทักทายและ \"บังเอิญ\" มีของที่เธออยากได้พอดี\n" + //
                "Item Required: มาม่ารสหมูสับ (เพื่อเอาไปแลก) หรือ ชีสแผ่น",
                "microphone"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมมายืนทำเนียนอ่านหนังสือการ์ตูนอยู่หน้าร้านตามคำสั่งพี่เจ ใจเต้นตุ๊มๆ ต่อมๆ",
                "main_thinking",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : \"จะมาจริงเหรอวะ? หรือพี่เจมั่ว?\"",
                "main_deepthinking",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "\"ติ๊งน่อง!\" (เสียงประตูเซเว่นเปิด) ฮิมิโกะ เดินงัวเงียลงมาจากลิฟต์จริงๆ! เธอใส่ชุดนอนลายเป็ดสีเหลือง (น่ารักจนใจเจ็บ) สวมแว่นตาอันใหญ่ (ไม่ได้ใส่คอนแทคเลนส์) และผมยุ่งนิดๆ ดูเป็นธรรมชาติสุดๆ",
                "microphone",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "เธอเดินตรงดิ่งไปที่เชลฟ์บะหมี่กึ่งสำเร็จรูป... แล้วยืนนิ่ง",
                "microphone",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "(พึมพำ) \"อ้าว... ต้มยำกุ้งหมดเกลี้ยงเลยเหรอ? แง...\" (สินค้าหมดจริงๆ ตามที่พี่เจคาดการณ์ไว้ว่าของขาดตลาดช่วงสอบ)",
                "himiko_duck_confused",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Target acquired. Opportunity detected. ผมสูดหายใจลึก... แล้วเดินเข้าไปพร้อมกับ \"คัพโจ๊กหมู\" ในมือ (ตามบทที่พี่เจเขียนให้)",
                "main_deepthinking",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"อ้าว... น้องฮิมิโกะ? พักที่นี่เหมือนกันเหรอครับ?\"",
                "main_ask",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "(สะดุ้งโหยง หันมามองผ่านแว่นหนา) \"อุ๊ย! พี่... พี่ ตัวเอก?\"",
                "himiko_duck_smile",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "\"งื้อออ! อย่ามองสภาพนี้นะคะ! หนูโทรมมาก!\" (เอามือปิดหน้าอายม้วน)",
                "himiko_duck_smile",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"ไม่โทรมหรอกครับ... ใส่แว่นก็น่ารักดีออก\" (หยอดตามสคริปต์พี่เจเป๊ะๆ)",
                "main_ask",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "(หน้าแดงทะลุมือ) \"บ้า... ปากหวานจัง...\"",
                "himiko_duck_shy",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"หิวรอบดึกเหรอครับ? พี่เห็นเราจ้องเชลฟ์มาม่านานละ... หมดเหรอ?\"",
                "main_ask",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "(พยักหน้าหงึกๆ) \"หนูอยากกินต้มยำกุ้งง่ะ... แต่มันหมดเกลี้ยงเลย\"",
                "himiko_duck_smile",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"บังเอิญจัง...\" ผมล้วงมือเข้าไปในถุงผ้าที่ถือมา... หยิบ \"มาม่าต้มยำกุ้งน้ำข้น\" (ที่พี่เจบังคับให้ซื้อดักไว้ก่อนหน้านี้) ออกมา 1 ห่อ",
                "main_basic",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"พี่เพิ่งซื้อห่อสุดท้ายไปเมื่อกี้นี้เอง... ว่าจะเอาไปต้มกินแกล้มงาน\"",
                "main_laughlittle",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"แต่เห็นเราอยากกินขนาดนี้... พี่ 'ยกให้' เอาไหม?\"",
                "main_ask",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "(ตาเป็นประกายวิบวับเหมือนเห็นทองคำ) \"จะ... จริงเหรอคะ!? พี่ให้หนูจริงเหรอ?\"",
                "himiko_duck_sweeteyes",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "\"แต่พี่ก็ต้องกินนี่นา... หนูเกรงใจ...\"",
                "himiko_duck_smile",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"ไม่เป็นไรครับ... แลกกับอย่างอื่นก็ได้\"",
                "main_laughlittle",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "\"แลก? แลกกับอะไรคะ?\"",
                "himiko_duck_smile",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(ยิ้มมุมปากสไตล์ Hacker ฝึกหัด) \"แลกกับ... 'ไลน์ส่วนตัว' ของเรา ไว้ทักมาบอกว่าอร่อยไหม... โอเคไหมครับ?\"",
                "main_deepthinking",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "(อึ้งไป 3 วินาที... ก่อนจะหลุดขำออกมา) \"ฮ่าๆๆๆ! ร้ายกาจ! พี่ไปเรียนมุกนี้มาจากไหนเนี่ย?\"",
                "himiko_duck_laugh",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "\"โอเคค่ะ! Deal! มาม่าห่อนี้แพงจังเลยน้าาา ต้องจ่ายด้วย ID Line เลย\"",
                "himiko_duck_ok",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอยื่นมือถือให้ผมสแกน QR Code ทันทีด้วยความเต็มใจ (และหิว)",
                "main_usemobile",
                "/images/background/711_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "\"ขอบคุณสำหรับมาม่านะคะพี่! ช่วยชีวิตหนูไว้แท้ๆ เลย!\" ",
                "himiko_duck_sweeteyes",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(himiko,
                "\"ฝันดีนะคะพี่ Tech สุดหล่อ (ในชุดนอน)!\" เธอโบกมือหยอยๆ แล้ววิ่งเข้าลิฟต์ไปพร้อมกับมาม่าในมือ",
                "himiko_duck_smile",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยืนยิ้มแก้มปริดูโทรศัพท์ตัวเอง... ได้ไลน์แล้ว! แถมยังได้เห็นมุมลับๆ (ชุดนอน+หน้าสด) ที่คนอื่นไม่มีวันเห็น",
                "main_usemobile",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "(เสียงปรบมือแปะๆ ดังมาจากมุมมืด)",
                "microphone",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พี่เจเดินออกมาจากมุมโซฟาพร้อมรอยยิ้มพอใจ",
                "main_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"Not bad... สำหรับมือใหม่\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"เห็นไหม? แค่รู้ข้อมูล + จังหวะเวลาที่ถูกต้อง... หัวใจก็โดนแฮกง่ายนิดเดียว\"",
                "J_smile",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"ขอบคุณครับลูกพี่! สุดยอดจริงๆ!\"",
                "main_basic",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"อย่าเพิ่งดีใจไป... นี่แค่ Tutorial\" ",
                "J_interested",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ด่านต่อไปคือ 'Final Exam'... งานลอยกระทงที่กำลังจะมาถึง\"",
                "J_angry",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ฉันมีแผนใหญ่... ที่จะทำให้แกเป็นตำนาน Com Sci... เตรียมตัวไว้ให้ดีล่ะ\"",
                "J_deepthinking2",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"ลอยกระทง? อีกตั้งนานนะพี่ แล้วมันเกี่ยวอะไรกับตอนนี้?\"",
                "main_ask",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "(ขยับแว่น แสยะยิ้มเจ้าเล่ห์) \"แกคิดว่าจะเดินดุ่มๆ ไปขอลอยกระทงกับดาวนิเทศฯ ได้เลยรึไง? ฝันไปเถอะ! คู่แข่งแกคือเดือนคณะนะเว้ย\"",
                "J_deepthinking2",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ก่อนจะถึงวันนั้น... แกต้องแทรกซึมเข้าไปเป็น 'คนใน (Insider)' ของพวกเด็กนิเทศฯ ให้ได้ก่อน\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ต้องทำให้เขาขาดแกไม่ได้... ต้องทำให้เขารู้สึกว่า 'ถ้าไม่มีพี่คนนี้ งานหนูพังแน่' เข้าใจไหม?\"",
                "J_ask",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "\"แล้วผมต้องทำไงอะ?\"",
                "main_ask",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ฉันไป 'ดักฟัง'... เอ้ย ไปสืบมาแล้ว\"",
                "J_angry",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ตอนนี้คณะนิเทศฯ กำลังทำละครเวทีธีม Sci-Fi ของเด็กปี 1... พวกนั้นเก่งศิลป์แต่กากเทคฯ กำลังวิ่งหาคนเขียนโค้ดคุมไฟกับระบบ Interactive กันให้วุ่น\"",
                "J_ask",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"และนั่นแหละ... คือ 'ม้าไม้เมืองทรอย (Trojan Horse)' ของแก\"",
                "J_smile",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "(ยื่นใบปลิวรับสมัครทีมงานฝ่าย Tech ที่ยับยู่ยี่ให้)",
                "J_smile",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"พรุ่งนี้... แกต้องไปสมัครเป็นฝ่าย Technical Support ให้ละครเรื่องนี้\"",
                "J_ask",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"น้องฮิมิโกะอยู่ฝ่าย Prop... แกจะได้ทำงานใกล้ชิดกับน้องเขาแบบเนียนๆ ทุกวัน โดยมีข้ออ้างเรื่อง 'งาน' บังหน้า\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(main,
                "(รับใบปลิวมาดู) \"โห... แผนสูงชิบหาย\"",
                "main_umm",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"ไอ้โตมันสมัครไปเป็นฝ่าย Costume แล้ว... แกแค่ตามไปสมทบก็พอ\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(j,
                "\"จำไว้... Be Useful, Be Cool, and Don't Panic. ไปซะ!\"",
                "J_deepthinking2",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World - COMPLETED",
                "microphone",
                "/images/background/status_completed.png"
        ));
         Chapter1_Scene15.addDialogue(new DialogueLine(speaker,
                "โปรดติดตามตอนต่อไป.............",
                "microphone",
                "/images/background/to_be_continued.png"
        ));

        Scene Chapter1_Scene16 = new Scene("Chapter1_Scene16");
        Chapter1_Scene16.setBackgroundPath("/images/background/dobedo_room.png");

        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "(ถอนหายใจยาวเหยียด) \"พอเถอะพี่เจ... ทฤษฎีพี่น่ะฟังดูดีนะ 'Algorithm ความรัก' อะไรนั่นน่ะ...\"",
                "main_thinking"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "(หรี่ตามองพี่เจ แล้วยิ้มมุมปาก) \"แต่พี่ลืมอะไรไปอย่างหรือเปล่า?\"",
                "main_ask"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "\"ลืมอะไร? ไม่มีทาง! Memory ฉันดีจะตาย\"",
                "J_smile"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "\"ก็... เท่าที่ผมรู้มา ตั้งแต่พี่เข้าปี 1 จนถึงตอนนี้ปี 3... พี่ก็ยังโสดสนิทไม่ใช่เหรอครับ?\"",
                "main_confused"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "\"ถ้า Algorithm พี่เทพจริง... ทำไมป่านนี้พี่ยังนั่งกอดโน้ตบุ๊กนอนอยู่ล็อบบี้หอพักคนเดียว แทนที่จะไปเดทกับหนุ่มวิศวะล่ะครับ?\"",
                "main_thinking"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "\"หรือว่า... Code พี่มันมี 'Bug' ที่แก้ไม่หาย?\"",
                "main_basic"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(speaker,
                "[Critical Hit!][Effect: P'Jay took 9999 Damage!]",
                "main_umm"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "(สำลักกาแฟพรวด!) \"แค่กๆๆ! เฮ้ย!! ไอ้เด็กบ้า!\"",
                "J_boring"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "(หน้าแดงเถือกทะลุแว่น รีบเช็ดปากลุกลี้ลุกลน) \"นะ... นี่แกกล้าแซะรุ่นพี่เหรอ!?\"",
                "J_boring"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "\"ฉะ... ฉันไม่ได้หาเว้ย! ฉันแค่... ฉันแค่ 'เลือกเยอะ'! Hardware ผู้ชายสมัยนี้มัน Spec ต่ำ! ไม่ Compatible กับฉันต่างหาก!\"",
                "J_angry"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "\"เหรอครับ... 'Incompatible Hardware' สินะครับ ข้ออ้างคลาสสิกของคนโสดเลยนะเนี่ย\"",
                "main_ask"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "(กัดฟันกรอด) \"หนอยแน่... ปากดีนักนะ! กล้ามาหยามศักดิ์ศรีราชินี Hacking เหรอ!\" พี่เจวางกระป๋องกาแฟลงเสียงดัง ปัง! แววตาหลังแว่นเปลี่ยนจากง่วงนอนเป็น \"นักล่า\" ที่ถูกท้าทาย",
                "J_angry"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "\"ได้... ในเมื่อแกกล้าจี้จุดอ่อนฉันขนาดนี้... เรามาเล่นเกมกันหน่อยไหม?\"",
                "J_thinking"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พี่เจขยับตัวเข้ามาใกล้ จ้องตาผมเขม็ง",
                "main_thinking"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "\"แกคิดว่าฉัน 'ดีแต่ทฤษฎี' ใช่ไหม? ได้...\"",
                "main_basic"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(j,
                "\"งั้นเรามาพิสูจน์กันว่า Logic ของใครมันเจ๋งกว่ากัน\"",
                "main_basic"
        ));
        Chapter1_Scene16.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอชี้หน้าผมด้วยนิ้วเรียวยาวที่เปื้อนคราบกาแฟเล็กน้อย",
                "main_thinking"
        ));

        // addChoice
        Chapter1_Scene16.addChoice(new Choice(
                "เดิมพันคนโสด",
                "Chapter1_Scene17"
        ));
        Chapter1_Scene16.addChoice(new Choice(
                "บทพิสูจน์สมมติฐาน",
                "Chapter1_Scene18"
        ));

        Scene Chapter1_Scene17 = new Scene("Chapter1_Scene17");
        Chapter1_Scene17.setBackgroundPath("/images/background/dobedo_room.png");
        Chapter1_Scene17.setEnding(true);
        

        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "\"เหอะ! พี่อย่ามาขู่ ผมจะรีบไปจีบน้องฮิมิโกะเดี๋ยวนี้แหละ!\" ผมทำท่าจะหยิบมือถือขึ้นมาทำท่าทางจะทักหาฮิมิโกะ",
                "main_basic"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"ช้าไป...\"",
                "J_thinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "(เคาะปุ่ม Enter บนโน้ตบุ๊ก 1 ครั้งดัง ปัง!)",
                "J_hacking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "[Sound : เสียงมือถือตัวเอกสั่นรัวๆ แจ้งเตือนเด้งไม่หยุด]",
                "SFX"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! อะไรเนี่ย!?\" ผมก้มมองหน้าจอมือถือ... แอปฯ Facebook และ IG ของผมกำลังโพสต์ข้อความบางอย่างเองโดยที่ผมไม่ได้พิมพ์!",
                "main_usemobile"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "[Status Update: ตัวเอก\n" + //
                "\"ประกาศครับ! ตอนนี้ผมโสดและเหงามากกกก! ใครก็ได้ช่วยมาจีบผมทีครับ ผมชอบผู้ชายกล้ามโตๆ ใส่เสื้อกล้ามสีชมพูครับ! #โสดโปรดจีบ #อยากมีผัว\"Tagged: @Himiko_Smile (เผลอแท็กน้องเขาไปด้วย!) @To_CuteBoy (แท็กไอ้โตด้วย!)",
                "main_thinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "(หน้าซีดเผือด) \"พี่เจ!!! พี่ทำบ้าอะไรเนี่ยยยยย!!\"",
                "main_surprised"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"ก็แกบอกว่า 'ใครมีแฟนก่อนชนะ' นี่? ฉันก็แค่... ช่วยขยายกลุ่มเป้าหมาย (Target Group) ให้แกไง\"",
                "J_thinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"Algorithm ของฉันคำนวณแล้วว่า... แกน่าจะหาแฟนเป็นผู้ชายได้ง่ายกว่าผู้หญิงนะ\"",
                "J_ask"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "[Notification: Himiko_Smile commented on your post]",
                "SFX"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(himiko,
                "\"เอ๋!?... พี่ ตัวเอก ชอบแบบนี้เหรอคะ? ขอโทษที่เข้าใจผิดน้าาา หนูจะไม่กวนแล้วค่าาา สู้ๆ นะคะ!\"",
                "himiko_usemobile"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "[Notification: To_CuteBoy commented]",
                "SFX"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(to,
                "\"อีบ้า! มึงแท็กกูทำไม! กูเสียหายนะเว้ย!\"",
                "to_surprised"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "\"ม่ายยยยยยยยยย!\" ผมรีบพยายามจะลบโพสต์ แต่... [System Error: Access Denied. Your account is locked by Administrator.]",
                "main_surprised"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "(หัวเราะในลำคอ หึหึหึ)",
                "J_smile"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"ดูเหมือนว่า... โอกาสที่แกจะจีบน้องฮิมิโกะติดตอนนี้คือ 0.00% นะ\"",
                "J_thinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"และในทางเทคนิค... ตอนนี้แกยังไม่มีแฟน... ส่วนฉัน...\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "(พี่เจหยิบโทรศัพท์ขึ้นมา โชว์หน้าจอแอปฯ หาคู่ (ที่เธอเขียนบอทปั๊ม Match ไว้))",
                "main_thinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"ฉันมี Match รอคุยอยู่ 500 คน... ถ้าฉันตอบตกลงสักคนตอนนี้ ฉันก็ชนะทันที\"",
                "J_deepthinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"แต่ฉันขี้เกียจคบใครจริงๆ... เอาเป็นว่า ฉันปรับให้แก 'แพ้ฟาวล์' ฐานที่โดนบล็อกสังคมเรียบร้อยแล้วกัน\"",
                "J_deepthinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "[ห้องพักของพี่เจ (ที่รกไปด้วยสายไฟและกระป๋องกาแฟ)][Time: 1 เดือนต่อมา]",
                "main_thinking"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "(ใส่ผ้ากันเปื้อน สภาพอิดโรย) \"กาแฟได้แล้วครับลูกพี่...\" ผมนั่งคุกเข่าเสิร์ฟกาแฟให้พี่เจที่กำลังนั่งเล่นเกมอย่างสบายใจ",
                "main_boring"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(j,
                "\"ดีมาก... นวดไหล่ให้ด้วยสิ ช่วงนี้แบกแรงค์หนัก ปวดหลัง\"",
                "J_smile"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "\"ครับ...\"",
                "main_boring"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : ชีวิตปี 2 ของผมจบสิ้นแล้ว... ฮิมิโกะบล็อกผมทุกช่องทาง (เพราะคิดว่าผมเป็นเกย์สายรุกที่น่ากลัว) ส่วนผม... กลายเป็น \"เบ๊ส่วนตัว\" ของราชินี Hacker แห่ง Dobedo ต้องคอยซักผ้า ซื้อข้าว และชงกาแฟให้เธอ ตลอดเทอมนี้... และอาจจะตลอดไป",
                "main_boring"
        ));
        Chapter1_Scene17.addDialogue(new DialogueLine(speaker,
                "การประเมินความเสี่ยง (Risk Assessment) เป็นสิ่งสำคัญก่อนการลงทุน(เดิมพัน)นะครับ",
                "main_thinking",
                "/images/background/system_error.png"
        ));

        Scene Chapter1_Scene18 = new Scene("Chapter1_Scene18");
        Chapter1_Scene18.setBackgroundPath("/images/background/dobedo_room.png");
        Chapter1_Scene18.setEnding(true);

        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "\"งั้นพี่พิสูจน์สิ... ถ้าทฤษฎีพี่แน่จริง พี่ต้องทำให้ผมจีบน้องเขาติดให้ได้\"",
                "main_umm"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "\"ถือว่าผมเป็น 'Subject Zero' (หนูทดลองหมายเลข 0) ให้พี่เลย ถ้าผมทำสำเร็จ ผมจะยอมรับว่าพี่คือเทพเจ้าแห่งความรัก... แต่ถ้าล้มเหลว พี่ต้องเลิกโม้เรื่องนี้ตลอดไป\"",
                "main_basic"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "(นิ่งไป 3 วินาที... ดวงตาหลังแว่นหนาเริ่มเปล่งประกายวาวโรจน์)",
                "J_smile"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"Hooo... น่าสนใจ...\"",
                "J_ask"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"แกกำลังท้าทายฉัน ด้วยการเอา 'ความกาก' ของตัวเองมาเป็นเดิมพันงั้นเหรอ?\"",
                "J_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอขยับตัวลุกขึ้นนั่งหลังตรง วางกระป๋องกาแฟลง",
                "main_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"ได้... Challenge Accepted.\"",
                "J_smile"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"ถ้าฉันสามารถ Debug ชีวิตรักที่เต็มไปด้วย Error ของแกให้ Run ผ่านได้... ก็ไม่มีระบบไหนในโลกที่ฉันแฮกไม่ได้แล้ว\"",
                "J_interested"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"เตรียมตัวให้ดีไอ้หนู... ต่อไปนี้แกไม่ใช่แค่รุ่นน้อง... แต่แกคือ 'Project: Romeo_v1.0' ของฉัน\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(speaker,
                "(พี่เจรัวนิ้วลงบนคีย์บอร์ดโน้ตบุ๊กสภาพเน่าๆ ของเธอด้วยความเร็วแสง หน้าจอดำๆ มีตัวหนังสือสีเขียววิ่งผ่านตารัวๆ)",
                "main_basic"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"ฉันเพิ่งเจาะเข้าไปดูตารางกิจกรรมของคณะนิเทศฯ มา...\"",
                "J_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"ฟังนะ... การจะจีบเด็กนิเทศฯ โดยเฉพาะระดับดาวคณะอย่างน้องฮิมิโกะ การเดินเข้าไปขอเบอร์ตรงๆ คือวิธีของพวก Loser (เพราะโดนกันซีนแน่นอน)\"",
                "J_ask"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"เราต้องใช้กลยุทธ์ 'Trojan Horse' (ม้าไม้เมืองทรอย)\"",
                "J_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "\"ม้าไม้? จะให้ผมซื้อตุ๊กตาม้าไปฝากน้องเขาเหรอ?\"",
                "main_basic"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "(เขกหัวผมหนึ่งทีดังโป๊ก) \"โอ๊ย! ซื่อบื้อจริง! หมายถึงการแฝงตัวเข้าไปเป็น 'คนใน' ต่างหาก!\"",
                "J_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"ตอนนี้คณะนิเทศฯ กำลังทำละครเวทีธีม Sci-Fi ของเด็กปี 1... น้องฮิมิโกะอยู่ฝ่าย Prop (อุปกรณ์ประกอบฉาก)\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"และจุดอ่อนของพวกเด็กศิลป์คือ... พวกเขาเก่ง Art แต่กาก Tech\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(speaker,
                "(พี่เจหันหน้าจอมาให้ดู เป็นประกาศรับสมัครทีมงานที่ยับยู่ยี่ (ที่เธอแฮกไปดึงไฟล์ต้นฉบับมา))",
                "main_basic"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"เขาต้องการคนทำระบบไฟ LED ที่ Interactive กับเสียงดนตรี... ซึ่งไม่มีใครในคณะนั้นทำเป็น\"",
                "J_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"นี่คือตั๋ว VIP ของแก... แกต้องไปสมัครเป็นฝ่าย Technical Support ของละครเรื่องนี้ซะ\"",
                "J_interested"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! แต่ผมไม่เคยทำละครเวทีนะพี่!\"",
                "main_confused"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"แกเขียน Python เป็นไหม? ต่อบอร์ด Arduino ได้ไหม?\"",
                "J_ask"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "\"ก็... ได้ครับ พื้นฐานนะ\"",
                "main_basic"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"นั่นแหละคือเทพเจ้าสำหรับพวกนั้นแล้ว!\"",
                "J_thinking"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "จ้องตาเขม็ง) \"ฟังนะ... ภารกิจของแกคือ:\"\n" + //
                "1.Infiltrate (แทรกซึม): สมัครเข้าทีมงานให้ได้ (ฉันส่งเรซูเม่ปลอมๆ ที่ดูเทพซ่าไปให้ประธานค่ายแล้ว แกแค่ไปรายงานตัว)\n" + //
                "2.Gain Trust (สร้างความเชื่อใจ): ทำให้ฮิมิโกะเห็นว่าแก 'พึ่งพาได้' ในเรื่องที่ผู้ชายคนอื่น (โดยเฉพาะไอ้เดือนคณะนั่น) ทำไม่ได้\n" + //
                "3.Execute (ลงมือ): เมื่อถึงเวลาวิกฤต... แกต้องเป็นคนเดียวที่แก้ปัญหาได้",
                "J_smile"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(j,
                "\"ไปซะ... อย่าให้โปรเจกต์ฉันล่มตั้งแต่วันแรก\"",
                "J_smile"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(main,
                "(กลืนน้ำลาย) \"ครับลูกพี่... ผมจะพยายาม\"",
                "main_basic"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(speaker,
                "the_first_chapter_of_love",
                "main_basic",
                "/images/background/the_first_chapter_of_love.png"
        ));
        Chapter1_Scene18.addDialogue(new DialogueLine(speaker,
                "โปรดติดตามตอออนต่อไปปป..........",
                "main_basic",
                "/images/background/to_be_continued.png"
        ));
        
        Scene Chapter1_Scene19 = new Scene("Chapter1_Scene19");
        Chapter1_Scene19.setBackgroundPath("/images/background/dobedo_room.png");

        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"พี่เก่งทฤษฎีจังนะครับ... 'Algorithm' นู่นนี่นั่น\"",
                "main_basic"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "(ยิ้มมุมปาก ท้าทาย) \"งั้นพี่ลองพิสูจน์ให้ผมดูหน่อยสิ... ถ้าพี่แน่จริง พี่หา 'IG ลับ' (Private Account) ของน้องเขาให้ผมดูหน่อยสิ... ภายใน 1 นาที\"",
                "main_ask"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"ถ้าพี่ทำได้ ผมเลี้ยงข้าวเย็นพี่ไม่อั้นเลย! แต่ถ้าไม่ได้... พี่เลิกบ่นแล้วปล่อยผมไปนอนนะ\"",
                "main_ask"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "(นิ่งไปครู่หนึ่ง... แววตาหลังแว่นหนาเปลี่ยนจาก 'ง่วงนอน' เป็น 'นักล่า')",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"Hooo... กล้าท้าทาย 'Queen of Dobedo' ด้วยเรื่องแค่นี้เหรอ?\"",
                "J_yay"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "(วางกระป๋องกาแฟลงดัง ปัง!)",
                "J_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"จับเวลาซะไอ้หนู... แล้วเตรียมเงินในกระเป๋าตังค์แกไว้ให้ดี\"",
                "J_angry"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"เริ่มจาก Cross-reference ชื่อจริง... หา Facebook พ่อแม่... เจอแท็กรูปเก่าสมัยมัธยม... เจอ Twitter หลุม...\"",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"อ่าฮะ... ลิงก์เชื่อมโยงไปที่ Instagram ลับที่ใช้ชื่อแมว...\"",
                "J_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "(บรรยาย) : นิ้วของพี่เจขยับเร็วจนมองไม่ทัน หน้าจอโน้ตบุ๊กที่มีแต่ Code สีเขียวสลับไปมากับหน้าเว็บ ตัวเอก: (ยืนอ้าปากค้าง ดูนาฬิกา) \"พะ... พี่... ผ่านไป 40 วินาทีแล้วนะ...\"",
                "main_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"เสร็จ.\" (กด Enter หนึ่งครั้งเสียงดัง)",
                "J_hacking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(speaker,
                "เธอหมุนหน้าจอโน้ตบุ๊กมาให้ผมดู [Instagram Profile]\n" + //
                "Username: @Miko_No_Himitsu (ความลับของมิโกะ)\n" + //
                "Status: Private Account\n" + //
                "Bio: Just a girl who loves cats & sci-fi movies ? | Year 1 Comm Arts BU\n" + //
                "Latest Story (เมื่อ 2 นาทีที่แล้ว): รูปแมวนอนหงายท้อง พร้อมข้อความ \"งื้อออ อยากกินบิงซูหน้าหอจัง ใครใจดีซื้อมาให้หน่อยยย ?\"",
                "main_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"48 วินาที...\" (ขยับแว่นเท่ๆ)",
                "main_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"ของจริงพอไหมไอ้น้อง?\"",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"เชรดดดดด! พี่ทำได้ไงอะ!? ผมหามาทั้งวันไม่เจอ!\"",
                "main_ask"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"ยอมแล้วครับ! พี่คือเทพเจ้า! พี่คือพระเจ้าแห่ง Com Sci!",
                "main_ask"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"หึ... รู้แล้วก็ดี\"",
                "J_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"ตอนนี้แกติดหนี้ฉัน... ชาบู 1 มื้อ (แบบพิเศษเนื้อวากิว) และ กาแฟกระป๋องตลอด 1 เดือน\"",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"Deal?\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "(น้ำตาตกในแต่จำยอม) \"Deal ครับลูกพี่... ยอมถวายหัวเลยครับ\"",
                "main_confused"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"ดี... ในเมื่อแกยอมรับในฝีมือฉันแล้ว และฉันก็ได้ข้อมูลสำคัญมาแล้ว...\"",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(speaker,
                "(ชี้ไปที่รูป Story ล่าสุดในจอ) \"น้องเขาอยากกิน 'บิงซู' หน้าหอ... แกเห็นโอกาสไหม?\"",
                "himiko_igstory"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"ให้ผมรีบวิ่งไปซื้อบิงซูตอนนี้เลยเหรอ?\"",
                "main_sunshade"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"นั่นมันวิธีของพวก Simp... เราต้องเล่นเกมระยะยาวกว่านั้น\"",
                "J_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"ฉันเพิ่งไปสืบมาเพิ่ม (ใน 12 วินาทีที่เหลือ) ว่าน้องเขากำลังทำละครเวทีอยู่... และกำลังขาดคนทำไฟ\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"แกจะต้องเอา 'บิงซู' ไปเซ่นไหว้... ไม่ใช่ในฐานะคนส่งอาหาร แต่ในฐานะ 'ว่าที่ฝ่าย Tech คนใหม่' ของกองละคร!\"",
                "J_thinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"กว่าจะซื้อบิงซู กว่าจะเอามาให้ ละลายพอดี พี่ไม่กินของหวานเลยไม่รู้ล่ะสิ\"",
                "main_ask"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"เอาเถอะ อย่างน้อยแค่ไปงานก็พอแล้ว\"",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"นี่คือแผนการ... แกต้องแทรกซึมเข้าไปในคณะนิเทศฯ พรุ่งนี้\"",
                "J_deepthinking2"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"ฉันจะเทรนแกให้กลายเป็น 'เทพเจ้า Backend' ที่น้องเขาขาดไม่ได้... แลกกับชาบูมื้อนั้น โอเคไหม?\"",
                "J_deepthinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"ถ้าพี่ช่วยผมจีบติด... ชาบูกี่มื้อผมก็เลี้ยง!\"",
                "main_umm"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(main,
                "\"เอาเลยพี่! ผมพร้อมลุยแล้ว! บอกมาเลยว่าต้องทำไง!\"",
                "main_ask"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "(ยิ้มมุมปากอย่างชั่วร้าย)",
                "J_smile"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(j,
                "\"เริ่มจาก... พรุ่งนี้ 9 โมงเช้า ไปที่โรงละครตึกนิเทศฯ... ฉันส่งชื่อแกไปสมัครงานเรียบร้อยแล้ว\"",
                "J_deepthinking"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World - COMPLETED",
                "main_thinking",
                "/images/background/status_completed.png"
        ));
        Chapter1_Scene19.addDialogue(new DialogueLine(speaker,
                "โปรดติดตามตอนต่อไป.........",
                "main_basic",
                "/images/background/to_be_continued.png"
        ));

        Scene Chapter1_Scene20 = new Scene("Chapter1_Scene20");
        Chapter1_Scene20.setBackgroundPath("/images/background/bu_market.png");

        Chapter1_Scene20.addDialogue(new DialogueLine(speaker,
                "[ตลาดนัด BU (BU Market) - เต็นท์ผ้าใบสีขาวเรียงราย แดดบ่ายแก่ๆ เริ่มคล้อย แต่ความร้อนยังระอุ]",
                "main_thinking"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมตัดสินใจเดินฝ่าเปลวแดดมาที่ตลาดนัด... กลิ่นหมูปิ้งผสมกับกลิ่นเครปเย็นลอยมาเตะจมูกทันทีที่ก้าวเท้าเข้ามา ที่นี่มันนรกสำหรับคนขี้ร้อนอย่างผมชัดๆ เหงื่อเม็ดเป้งเริ่มซึมตามไรผม แต่ทำไงได้... กองทัพต้องเดินด้วยท้อง และผมก็เบื่อข้าวโรงอาหารเต็มทน",
                "main_basic"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินเบียดเสียดกับฝูงนักศึกษาที่มาเดินช้อปปิ้งหลังเลิกเรียน สายตาพยายามสแกนหาของกินที่คิวไม่ยาวมาก \"คนเยอะชะมัด... รู้งี้ฝากไอ้โตซื้อข้าวแล้วนอนตากแอร์ดีกว่า\"",
                "main_basic"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ในขณะที่ผมกำลังยืนลังเลอยู่หน้าร้านขายเคสโทรศัพท์และอุปกรณ์ IT (ด้วยสัญชาตญาณเด็ก Com Sci ที่เห็นแผงวงจรไม่ได้ต้องแวะดู) สายตาผมก็ไปสะดุดกับ \"แผ่นหลังที่คุ้นเคย\"",
                "main_umm"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(speaker,
                "[สาวน้อยผมสั้นประบ่า กำลังยืนทำหน้าเครียดอยู่หน้าร้าน Power Bank]",
                "main_thinking"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ฮิมิโกะ นั่นเอง... เธอกำลังถือ Power Bank ลายการ์ตูนน่ารักมุ้งมิ้งอันหนึ่ง พลิกไปพลิกมาด้วยสีหน้าลังเลสุดขีด โดยมีพ่อค้ากำลังเชียร์สินค้าอย่างเมามัน",
                "main_handupshock"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(merchant,
                "\"น้องครับ! ตัวนี้รุ่น Limited เลยนะ! ชาร์จไว 100W เต็มภายใน 10 นาที! แถมจุไฟได้ 50,000 mAh เบาหวิว พกพาง่าย! พี่ลดให้พิเศษเหลือ 399 บาทพอ!\"",
                "main_thinking"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(himiko,
                "\"โห... 50,000 mAh เลยเหรอคะ? แต่ทำไมมันเบาจัง...\"",
                "himiko_interested"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(merchant,
                "\"เทคโนโลยีนาโนครับน้อง! ของแท้แน่นอน! ไม่ซื้อตอนนี้หมดนะ!\"",
                "main_thinking"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Alert: Scam Detected! 50,000 mAh ในขนาดเท่าตลับแป้งเนี่ยนะ? แถมชาร์จไว 100W ราคา 399? นี่มันไม่ใช่ Power Bank แล้ว... นี่มัน \"ระเบิดเวลาพกพา (C4)\" ชัดๆ!",
                "main_thinking"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยืนดูสถานการณ์อยู่ห่างๆ... ฮิมิโกะกำลังจะล้วงกระเป๋าตังค์ออกมาแล้ว! ถ้าปล่อยไว้แบบนี้ เธอเสียเงินฟรีแน่ แถมอาจจะได้ของอันตรายไปใช้ด้วย แต่จะเข้าไปขัดจังหวะยังไงดีไม่ให้ดูเจือกจนเกินไป?",
                "main_umm"
        ));
        Chapter1_Scene20.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เอาล่ะ... ได้เวลาใช้ความรู้ที่ร่ำเรียนมา (และสกิลความปากดี) ให้เป็นประโยชน์!",
                "main_ask"
        ));

        // addChoice
        Chapter1_Scene20.addChoice(new Choice(
                "งัดข้อมูลเข้าสู้",
                "Chapter1_Scene21"
        ));
        Chapter1_Scene20.addChoice(new Choice(
                "แกล้งเป็นแฟนขี้งก",
                "Chapter1_Scene22"
        ));
        Chapter1_Scene20.addChoice(new Choice(
                "เบี่ยงเบนความสนใจ",
                "Chapter1_Scene23"
        ));

        Scene Chapter1_Scene21 = new Scene("Chapter1_Scene21");
        Chapter1_Scene21.setBackgroundPath("/images/background/bu_market.png");

        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Mode: Technical Expert Activated. ผมขยับแว่นให้เข้าที่ สูบหายใจเข้าลึกๆ แล้วเดินฝ่าวงล้อมเข้าไปยืนขวางระหว่างฮิมิโกะกับพ่อค้า",
                "main_deepthinking"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"เดี๋ยวครับน้อง... อย่าเพิ่งจ่ายเงิน\"",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "(สะดุ้ง) \"อ้าว... ตัวเอก?\"",
                "himiko_surprised"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(merchant,
                "(ชักสีหน้า) \"อะไรอีกล่ะพ่อหนุ่ม? จะมาแย่งซื้อเหรอ? ของมีชิ้นเดียวนะ\"",
                "main_basic"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(หยิบ Power Bank ตัวนั้นขึ้นมาพลิกดูด้วยสายตาจับผิด)",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"พี่ครับ... พี่บอกว่าตัวนี้จุ 50,000 mAh ใช่ไหมครับ?\"",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(merchant,
                "\"ช่ายยย! จุจุกๆ ชาร์จได้เป็นสิบรอบ!\"",
                "main_basic"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"พี่ครับ... ตามหลักฟิสิกส์แล้ว แบตเตอรี่ Lithium-Polymer ความจุ 50,000 mAh น้ำหนักมันต้องประมาณเกือบ 1 กิโลนะครับ แต่นี่เบาหวิวเหมือนพลาสติกเปล่าๆ... ข้างในใส่ทรายมาหรือเปล่าครับ?\"",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(merchant,
                "(เริ่มเลิ่กลั่ก) \"กะ... ก็บอกแล้วไงว่าเป็นเทคโนโลยีนาโน!\"",
                "main_basic"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"แล้วพอร์ต USB Type-A ธรรมดาแบบนี้... พี่บอกว่าจ่ายไฟ 100W?\"",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"หัวพอร์ตมาตรฐานจ่ายได้เต็มที่ก็ 5V/2.4A หรือ 12W เองครับ... ถ้าจะเอา 100W มันต้องเป็น USB-C PD (Power Delivery) หรือไม่ก็หัวพิเศษแล้วครับ\"",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"สกรีนสเปกมั่วขนาดนี้... อย่าว่าแต่ชาร์จเข้าเลยครับ เสียบไปเมนบอร์ดจะไหม้เอานะครับ\"",
                "main_usemobile"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(speaker,
                "[Silence: คนรอบข้างเริ่มหันมามอง]",
                "microphone"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(merchant,
                "(เหงื่อตก หน้าซีด) \"เอ่อ... คือ... มันเป็นเกรดเทียบเท่าไง! ไม่ซื้อก็วางลง! อย่ามาขัดลาภ!\" (รีบดึงของคืนไปซ่อนหลังร้าน)",
                "main_basic"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(หันไปหาฮิมิโกะ) \"ไปกันเถอะครับ... ขืนซื้อไป นอกจากจะชาร์จไม่เข้าแล้ว มันอาจจะระเบิดใส่หน้าเราได้นะ\"",
                "main_basic"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(จับข้อมือเธอเบาๆ แล้วพาเดินออกมาจากร้านทันที)",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราเดินออกมาจนถึงจุดที่ปลอดภัย ฮิมิโกะยังดูงงๆ ปนทึ่ง",
                "main_thinking"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "\"โห... ตัวเอก... เมื่อกี้พี่เท่มากกกก!\" (ตาเป็นประกายวิบวับ)",
                "himiko_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "\"พี่รัวศัพท์อะไรไม่รู้ หนูฟังไม่ทันเลย 'ลิเธียม' 'พีดี' 'ร้อยวัตต์'... แต่พ่อค้าหน้าซีดเป็นไก่ต้มเลยอะ!\"",
                "himiko_interested"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(เกาแก้มแก้เขิน) \"ขอโทษทีครับที่เสียมารยาท... แต่พี่เห็นแล้วทนไม่ได้จริงๆ ของพวกนั้นมันอันตรายนะ ย้อมแมวขายชัดๆ\"",
                "main_laughlittle"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"ถ้าอยากได้ Power Bank ดีๆ เดี๋ยววันหลังพี่พาไปซื้อที่ร้าน IT ที่เชื่อถือได้ดีกว่าครับ หรือจะฝากพี่ซื้อก็ได้ พี่มีร้านประจำ\"",
                "main_ask"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "\"จริงเหรอคะ? งั้นหนูฝากพี่ดูให้หน่อยนะ! หนูดูสเปกไม่เป็นเลย กลัวโดนหลอกอีก\"",
                "himiko_laugh"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "\"ดีจังเลยที่มีพี่อยู่ด้วย... พี่เหมือนฮีโร่กู้ระเบิดเลยอะ!\"",
                "himiko_shy"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : System.Success(True); ถึงจะไม่ได้ใช้กำลัง... แต่การใช้ \"สมอง\" ปกป้องสาว ก็เท่ได้เหมือนกันแฮะ",
                "main_deepthinking"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "\"งั้นเพื่อเป็นการตอบแทนที่พี่ช่วยเซฟเงินค่าขนมหนู...\"",
                "himiko_smile"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(himiko,
                "\"เดี๋ยวหนูเลี้ยง 'เครปเย็น' พี่เอง! ร้านนู้นคนน้อยพอดี ไปกินกันนะค้าาา~\"",
                "himiko_eyecontact"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอดึงแขนเสื้อผมเบาๆ ให้เดินตามไปที่ร้านเครป บรรยากาศยามเย็นของตลาดนัด BU ที่เคยร้อนอบอ้าว... จู่ๆ ก็ดูสดใสและเย็นสบายขึ้นมาทันที",
                "main_thinking"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เรายืนกินเครปเย็นด้วยกันข้างทาง คุยเรื่องสัพเพเหระ แลกไลน์กัน (เพื่อส่งสเปก Power Bank ที่ถูกต้องให้) และวินาทีนั้น ผมรู้ตัวแล้วว่า... ชีวิตปี 2 ของผมจะไม่เหมือนเดิมอีกต่อไป",
                "main_thinking"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Function: Life_Style()Result: Updated.Status: Not Alone Anymore.",
                "main_deepthinking"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(speaker,
                "[ล็อบบี้หอพัก Dobedo - เวลาหัวค่ำ แอร์เย็นฉ่ำตัดกับอากาศข้างนอก]",
                "main_basic",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินฮัมเพลงเบาๆ เข้ามาในล็อบบี้หอพัก ในมือยังกำโทรศัพท์ที่เพิ่งได้ LINE ของฮิมิโกะมาแน่น ความรู้สึกของการเป็น \"ฮีโร่\" (แม้จะเป็นแค่เรื่อง Power Bank) มันทำให้หัวใจพองโตอย่างบอกไม่ถูก วันนี้ System.Status ของผมเป็นสีเขียวสดใสที่สุดในรอบปี",
                "main_usemobile",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(secret,
                "\"ยิ้มหน้าบานมาเชียวนะ... ไปกู้โลกมา หรือไปหลอกจีบเด็กปี 1 มาล่ะ?\"",
                "main_basic",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เสียงแหบห้าวดังขึ้นจากมุมมืดของโซฟาล็อบบี้... มุมประจำของสิ่งมีชีวิตลึกลับ ผมหันขวับไปมอง ก็พบกับร่างในชุดฮู้ดสีเทาตัวโคร่ง นอนขดตัวจิ้มโน้ตบุ๊กอยู่",
                "main_thinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(speaker,
                "[Character Reveal: \"พี่เจ\" (P'Jay)]\n" + //
                "Class: Year 3 Com Sci (รุ่นพี่สายโหดประจำคณะ)\n" + //
                "Status: Resident Hacker (แฮกเกอร์ประจำหอ)",
                "main_basic",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"อ้าว... พี่เจ? ยังไม่ขึ้นห้องอีกเหรอครับ?\"",
                "main_umm",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "(ขยับแว่นหนาเตอะ มองผมด้วยสายตารู้ทัน)",
                "J_smile",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"ขึ้นไปก็ร้อน... เน็ตข้างล่างแรงกว่า\"",
                "J_boring",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"ว่าแต่แกเถอะ... เมื่อกี้ฉันเห็นใน Twitter มีคนทวีตว่า \"เจอพี่ Com Sci สุดเท่ ด่าพ่อค้าขาย Power Bank ปลอมจนหน้าหงายที่ตลาดนัด BU\"...\"",
                "J_thinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอหมุนหน้าจอโน้ตบุ๊กมาให้ดู... มีรูปแอบถ่าย (เบลอๆ) ของผมตอนกำลังยืนเทศนาพ่อค้า โดยมีฮิมิโกะยืนทำตาโตอยู่ข้างๆ",
                "main_thinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"ดังใหญ่แล้วนะเรา... 'Tech Savior' สินะ?\"",
                "J_smile",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(เกาหัวแก้เขิน) \"ก็... ผมทนเห็นน้องเขาโดนหลอกไม่ได้นี่ครับ ข้อมูลมันมั่วซั่ว\"",
                "main_confused",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "(พับหน้าจอลง แล้วมองหน้าผมตรงๆ)",
                "J_hacking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"หึ... เริ่มต้นได้ไม่เลว\"",
                "J_interested",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"แต่จำไว้นะไอ้น้อง... การ 'แก้บั๊ก' ให้สาวน่ะ มันได้แค่ความประทับใจชั่วคราว\"",
                "J_thinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"ถ้าอยากได้ 'Source Code' ของหัวใจเขา... แกต้องเข้าไปเป็นส่วนหนึ่งของ 'ระบบปฏิบัติการ' ของเขาให้ได้\"",
                "J_smile",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "\"พะ... พี่พูดเรื่องอะไรครับเนี่ย? ลึกซึ้งไปมั้ย?\"",
                "main_basic",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "(หยิบกระป๋องกาแฟขึ้นมาจิบ)",
                "J_smile",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"เดี๋ยวแกก็รู้... เร็วๆ นี้คณะนิเทศฯ จะมีงานใหญ่\"",
                "J_deepthinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"เตรียมตัวปัดฝุ่นสกิล Python ของแกไว้ให้ดีล่ะ... โอกาสทองกำลังจะมา\"",
                "J_deepthinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(j,
                "\"ไปพักผ่อนซะ ฮีโร่... พรุ่งนี้งานหนักรอแกอยู่\"",
                "J_smile",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พี่เจโบกมือไล่ผม แล้วหันกลับไปรัวคีย์บอร์ดต่อ ทิ้งปริศนาไว้ให้ผมงงเล่น แต่คำพูดของ \"ระดับบอส\" อย่างพี่เจ... มักจะไม่เคยพลาด",
                "main_thinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : งานใหญ่ของคณะนิเทศฯ? ...มันเกี่ยวอะไรกับเราวะ? ช่างเถอะ วันนี้ฝันดีแล้ว ขึ้นห้องไปแอดไลน์น้องเขาดีกว่า!",
                "main_deepthinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมกลับห้องไปนอนโดยที่ไม่รู้เลยว่า พี่เจได้ลงชื่อให้ผมสมัครไปเป็นคนเขียนโปรแกรมสำหรับงานละครเวทีเป็นที่เรียบร้อยแล้ว",
                "main_thinking",
                "/images/background/dobedo_lobby.png"
        ));
        Chapter1_Scene21.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World - COMPLETED",
                "main_basic",
                "/images/background/to_be_continued.png"
        ));

        Scene Chapter1_Scene22 = new Scene("Chapter1_Scene22");
        Chapter1_Scene22.setBackgroundPath("/images/background/bu_market.png");

        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Logic: Disabled. / Emotion: Acting Mode On. แย่แล้ว... ฮิมิโกะกำลังรูดซิปกระเป๋าตังค์! ขืนมัวแต่เดินเข้าไปอธิบายเรื่อง Volts/Amps พ่อค้าคงกล่อมเธอจนจ่ายเงินเสร็จไปแล้ว เวลานี้ต้องใช้ \"Social Engineering\" ขั้นสูง... นั่นคือการ \"สวมรอย\"",
                "main_deepthinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมสูดหายใจเข้าลึกๆ ปรับสีหน้าจาก 'เด็กเนิร์ดหน้าคอม' ให้กลายเป็น 'พ่อบ้านใจกล้าขี้บ่น' ผมเดินดุ่มๆ เข้าไปประชิดตัวเธอทันที!",
                "main_thinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเข้าไปคว้าข้อมือฮิมิโกะ (ข้างที่ถือกระเป๋าตังค์) ไว้เบาๆ",
                "main_thinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(ดัดเสียงให้เข้มขึ้น และดังพอให้ร้านข้างๆ ได้ยิน)",
                "main_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"นี่! ตัวเอง! บอกให้รอที่รถไง เดินมาทำไมตรงนี้เนี่ย?\"",
                "main_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "(สะดุ้งสุดตัว หันมามองตาโตเท่าไข่ห่าน) \"เอ๊ะ?... พะ... พี่?\"",
                "himiko_surprised"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(merchant,
                "(ชะงัก) \"อ้าว... แฟนเหรอครับน้อง?\"",
                "main_deepthinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(ไม่เปิดช่องว่างให้ฮิมิโกะปฏิเสธ ผมหันไปมองหน้าพ่อค้า แล้วมอง Power Bank ในมือเธอด้วยสายตาดูแคลน)",
                "main_basic"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"แล้วนี่จะซื้ออะไรอีกเนี่ย? Power Bank? โอ๊ยยย! ที่หอก็มีตั้ง 3 อันแล้ว จะซื้อไปถมที่เหรอ?\"",
                "main_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "(อ้าปากค้าง สมองประมวลผลไม่ทัน) \"ดะ... เดี๋ยว...\"",
                "himiko_surprised"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(เล่นใหญ่ต่อ รัชดาลัยเธียเตอร์ต้องภูมิใจ)",
                "main_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"ไม่ต้องมาดเดี๋ยวเลย! บอกแล้วไงว่าต้องประหยัด! เดือนนี้ค่าไฟคอนโดยิ่งแพงๆ อยู่ แล้วดูซิเนี่ย... ของก็ก๊องแก๊ง 399 บาท? ซื้อมาเดี๋ยวก็พังเหมือนอันที่แล้วอีก!\"",
                "main_umm"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(หันไปพูดกับพ่อค้าเสียงแข็ง) \"ไม่เอาครับพี่! แฟนผมมันใช้เงินไม่คิด วางเลยๆ!\"",
                "main_markpoint"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(merchant,
                "(หน้าเจื่อน รีบดึงของกลับ) \"เอ่อ... ครับๆ แหม... แฟนดุจังนะน้อง เชื่อแฟนเถอะครับ เดี๋ยวบ้านแตก\"",
                "main_deepthinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(หันกลับมาดุฮิมิโกะต่อ) \"มานี่เลยตัวดี! กลับไปช่วยถือของเลย!\" ผมกระชับมือที่จับข้อมือเธอไว้แน่นขึ้น แล้วกึ่งจูงกึ่งลากเธอออกมาจากหน้าร้านทันที ท่ามกลางสายตาพ่อค้าแม่ค้าแถวนั้นที่มองตามด้วยความเอ็นดู (และสมเพชในความขี้งก)",
                "main_umm"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมพาเธอเดินจ้ำอ้าวออกมาจนพ้นโซนอันตราย แสงแดดยามเย็นสาดส่องลงมากระทบเราสองคน มือของผม... ยังกำข้อมือเล็กๆ ของเธอไว้แน่น และเธอก็ยอมเดินตามมาต้อยๆ โดยไม่ขัดขืน แต่หน้าแดงแปร๊ดจนลามไปถึงหู",
                "main_thinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(พอได้สติ ก็รีบปล่อยมือเธอเหมือนโดนของร้อน) \"อะ... เอ่อ! โทษทีครับ!\"",
                "main_surprised"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"พี่... พี่จับแรงไปไหม?\"",
                "main_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "(ยกมือข้างที่โดนจับมาแนบอก ยืนบิดตัวไปมา) \"มะ... ไม่เจ็บค่ะ... แต่...\"",
                "himiko_eyecontact"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "(เงยหน้ามองผม ตาเป็นประกายวิบวับ) \"พี่เล่นใหญ่มากกกก! หนูตกใจหมดเลย! นึกว่าโดนแฟนดุจริงๆ!\"",
                "himiko_shy"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(ถอนหายใจเฮือกใหญ่) \"ฟู่ววว... รอดตัวไป นึกว่าน้องจะโกรธซะอีก\"",
                "main_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"คือ Power Bank ร้านนั้นมันปลอมน่ะครับ สเปกหลอกลวงมาก ขืนพี่มัวแต่อธิบาย พี่กลัวเราจ่ายเงินไปก่อน พี่เลยต้อง... เอ่อ... สวมบทบาท นิดหน่อย\"",
                "main_basic"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"ขอโทษที่แอบอ้างนะครับ... แล้วก็ขอโทษที่ทำให้ดูเหมือนเราเป็นแฟนขี้งกด้วย\"",
                "main_confused"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "\"ฮ่าๆๆๆ! ไม่โกรธเลยค่ะ! สนุกดีออก!\"",
                "himiko_laugh"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "\"พี่รู้มั้ย ตอนพี่ทำเสียงดุว่า 'ที่หอก็มีตั้ง 3 อันแล้ว' หนูกลัวจนขนลุกเลยอะ เหมือนพ่อบ้านใจกล้ามาก!\"",
                "himiko_scary"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "(ยิ้มเจ้าเล่ห์) \"แสดงว่าในอนาคต... พี่ต้องเป็นแฟนที่ขี้บ่นแน่ๆ เลย อิอิ\"",
                "himiko_shy"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(หน้าเริ่มร้อนผ่าว) \"บะ... บ้า! พี่แค่แสดงเฉยๆ ปกติพี่ตามใจจะตาย!\"",
                "main_laughlittle"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "\"งั้นเหรอคะ? ไหนพิสูจน์ซิว่าตามใจจริงหรือเปล่า?\" เธอขยับตัวเข้ามาใกล้ เอานิ้วจิ้มแขนผมเบาๆ",
                "himiko_shy"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "\"เมื่อกี้ 'แฟนกำมะลอ' ห้ามหนูซื้อของ... ตอนนี้ 'พี่ชายตัวจริง' ต้องปลอบใจหนูนะ\"",
                "himiko_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "\"หนูอยากกิน ยำมะม่วงปูม้า ร้านตรงนู้น... พี่เลี้ยงหนูหน่อยจิ นะนะนะ~\"",
                "himiko_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Fatal Error: Cuteness Overload. โดนลูกอ้อนระยะประชิดขนาดนี้... ต่อให้เป็น Firewall ระดับกองทัพก็กันไม่อยู่ครับ",
                "main_deepthinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"เฮ้อ... ก็ได้ครับ ถือว่าไถ่โทษที่พี่เล่นแรงไป\"",
                "main_basic"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"แต่สัญญามาก่อนนะ ว่าจะไม่ไปซื้ออุปกรณ์ IT มั่วซั่วอีก ถ้าจะซื้อ... ทักมาถามพี่ก่อน\"",
                "himiko_ask"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(himiko,
                "\"รับทราบค่า! จะทักหา 'ที่รัก' ทุกครั้งก่อนรูดบัตรเลยค่า!\" (เธอยังไม่เลิกแซว)",
                "himiko_eyecontact"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราเดินกลับเข้าไปในตลาดนัดเพื่อซื้อยำมะม่วง... บรรยากาศระหว่างเราเปลี่ยนไปอย่างสิ้นเชิง ความเกร็งหายไป เหลือแต่ความขี้เล่นและการหยอกล้อ ถึงผมจะเสียเหงื่อจากการแสดงละครตบตา... แต่สิ่งที่ได้กลับมาคือ \"ความสนิทสนม\" ที่ก้าวกระโดดข้ามขั้นพี่น้องไปไกลเลยทีเดียว",
                "main_thinking"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(speaker,
                "[ทางเดินกลับหอพัก - หลังแยกย้ายกับฮิมิโกะ]",
                "main_deepthinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินถือถุงยำมะม่วง (ที่เธอคะยั้นคะยอให้ซื้อกลับมากินด้วย) เดินฮัมเพลงกลับหออย่างอารมณ์ดี วันนี้ได้ทั้งช่วยน้อง ได้ทั้งจับมือ (เนียนๆ) แถมยังโดนเรียกว่าแฟนอีก... กำไรชีวิตชัดๆ",
                "main_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(secret,
                "\"แหม... เดินยิ้มแก้มปริมาเลยนะพ่อพระเอกตุ๊กตาทอง\"",
                "main_deepthinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เสียงแหบห้าวดังขึ้นจากม้านั่งมืดๆ ใต้ต้นไม้หน้าหอพัก Dobedo [Character Reveal: \"พี่เจ\" (P'Jay)] พี่เจในชุดฮู้ดสีเทาตัวเก่ง นั่งไขว่ห้างจิบกาแฟกระป๋อง สายตาภายใต้แว่นหนาจ้องมองมาที่ผมเหมือนสแกนกรรม",
                "main_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! พี่เจ! มานั่งทำไรมืดๆ ครับเนี่ย ผีหลอกนะพี่\"",
                "main_ask",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"ผีไม่น่ากลัวเท่าคนมีความรักหรอก...\"",
                "J_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"เมื่อกี้ฉันแวะไปซื้อลูกชิ้นที่ตลาดนัด... เห็นละครฉากเด็ดพอดี\"",
                "J_ask",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"'ที่หอก็มีตั้ง 3 อันแล้ว จะซื้อไปถมที่เหรอ?'\" (พี่เจดัดเสียงล้อเลียนผมได้เหมือนเปี๊ยบ)",
                "J_smile",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(หน้าแดงเถือก) \"พะ... พี่เห็นด้วยเหรอ!?\"",
                "main_laughlittle",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"เห็นสิ... เล่นใหญ่รัชดาลัยขนาดนั้น พ่อค้าแม่ค้าเขาลือกันให้แซ่ดว่า 'หนุ่มแว่นหึงโหด ลากแฟนสาวกลางตลาด'\"",
                "J_smile",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"แต่ก็นะ... Not bad.\" พี่เจลุกขึ้นเดินเข้ามาตบไหล่ผม",
                "J_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"วิธีของแกมัน 'บ้านๆ' ไปหน่อย แต่ก็ได้ผลเรื่อง Emotional Impact (ผลกระทบทางอารมณ์)\"",
                "J_deepthinking2",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"น้องเขาดูชอบใจนะที่โดนแกดุ... สงสัยจะชอบแนว S (Sadism) สินะ\"",
                "J_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "\"พี่เจ! หยุดวิเคราะห์เลย!\"",
                "main_ask",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"หึหึ... เอาเถอะ วันนี้แกสอบผ่าน\"",
                "J_deepthinking2",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"แต่เตรียมตัวไว้... ของจริงกำลังจะเริ่ม\"",
                "J_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"ได้ข่าวมาว่าคณะนิเทศฯ กำลังจะทำละครเวที... และน้องฮิมิโกะของแกก็อยู่ที่นั่น\"",
                "J_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(j,
                "\"ถ้าแกอยากขยับสถานะจาก 'แฟนกำมะลอ' เป็น 'ตัวจริง'... แกต้องหาทางแทรกซึมเข้าไปในกองถ่ายนั้นซะ\"",
                "J_deepthinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พี่เจเดินผิวปากขึ้นหอไป ทิ้งให้ผมยืนกอดถุงยำมะม่วงพร้อมกับหัวใจที่เต้นรัว ",
                "main_thinking",
                "/images/background/dobedo_park_day.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : ละครเวทีเหรอ? ...งานนี้ต้องสนุกแน่",
                "main_deepthinking",
                "/images/background/status_completed.png"
        ));
        Chapter1_Scene22.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World - COMPLETED โปรดติดตามตอนต่อไป",
                "deep_story",
                "/images/background/to_be_continued.png"
        ));

        Scene Chapter1_Scene23 = new Scene("Chapter1_Scene23");
        Chapter1_Scene23.setBackgroundPath("/images/background/bu_market.png");

        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Strategy: Change Topic. Priority: Food > Gadget. การจะไปเถียงเรื่องสเปกไฟกับพ่อค้า อาจจะทำให้บรรยากาศเสีย หรือการแกล้งเป็นแฟนก็เสี่ยงจะโดนตบถ้าเล่นไม่เนียน แต่มีสิ่งหนึ่งที่ชนะทุกอย่างในตลาดนัดนี้... นั่นคือ \"ของกินระดับแรร์ไอเทม\"",
                "main_deepthinking"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมสูดหายใจเข้าลึกๆ สายตากวาดไปเห็นร้านเป้าหมายที่อยู่ถัดไป 3 ล็อก...",
                "main_markpoint"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"ร้านยำมะม่วงปูม้า เจ้าดัง ที่ปกติคิวยาวเป็นหางว่าว แต่วันนี้... คิวว่าง!\"",
                "main_sunshade"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมตะโกนออกไปสุดเสียง แข่งกับเสียงลำโพงร้านขายเคส",
                "main_handupshock"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"น้องฮิมิโกะ!!! เฮ้ย! นั่นมัน...!!\" (ทำเสียงตื่นเต้นเหมือนเจอ UFO)",
                "main_handupshock"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(สะดุ้งโหยงจน Power Bank เกือบร่วง หันขวับมา) \"คะ!? อะไรคะ!? ไฟไหม้เหรอ!?\" ",
                "himiko_scary"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(merchant,
                "(ตกใจตาม) \"เฮ้ย! อะไรวะ!?\"",
                "main_deepthinking"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(วิ่งเหยาะๆ เข้าไปหา ไม่มองหน้าพ่อค้า แต่มองเลยไปที่ร้านยำ)",
                "main_basic"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"ยำมะม่วงปูม้าเจ้านั้น! คิวว่าง!! ปกติรอ 2 ชั่วโมงนะนั่น! เร็วเข้า! เดี๋ยวปูหมด!\"",
                "main_ask"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"พี่จะวิ่งไปจองโต๊ะนะ! เราตามมาเร็ว! เรื่อง Power Bank ช่างมันก่อน ปูม้าสำคัญกว่า!\"",
                "main_ask"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(สมองประมวลผลคำว่า 'ปูม้า' 'คิวว่าง' 'ของกิน')",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(ดวงตาเบิกกว้างเป็นประกาย น้ำลายสอทันที) \"จริงเหรอพี่!? ปูม้าไข่ดองเหรอ!?\" ",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(วาง Power Bank ลงบนแผงทันทีโดยอัตโนมัติ) \"พี่รอหนูด้วยยย! อย่าเพิ่งให้ใครแย่งโต๊ะน้าาา!\"",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอรีบวิ่งตามผมออกมาทันที ทิ้งพ่อค้าให้ยืนงงถือ Power Bank ค้างเติ่งอยู่กลางอากาศ",
                "main_sunshade"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(merchant,
                "\"อ้าว... น้อง! ไม่เอาแล้วเหรอ... เดี๋ยว! กลับมาก่อนนน!\"",
                "main_deepthinking"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(speaker,
                "[โต๊ะพับเล็กๆ ข้างร้านยำ - กลิ่นน้ำปลาร้าหอมนัว]",
                "main_deepthinking"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ภารกิจสำเร็จ... เรานั่งลงที่โต๊ะพร้อมกับจานยำมะม่วงปูม้าจานยักษ์ที่วางอยู่ตรงหน้า ฮิมิโกะดูมีความสุขมาก เธอใส่ถุงมือพลาสติกเตรียมพร้อมรบเต็มที่ ลืมเรื่อง Power Bank ไปอย่างสิ้นเชิง",
                "main_deepthinking"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(เคี้ยวปูตุ้ยๆ) \"งื้อออ! อร่อยน้ำตาไหล! พี่ ตัวเอก ตาไวมากกก! ขอบคุณที่เรียกหนูนะ เกือบพลาดของดีแล้ว!\"",
                "himiko_surprised"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(นั่งดูดน้ำลำไยแก้เผ็ด) \"ยินดีครับ... เห็นเราทำหน้าเครียดๆ อยู่ร้านนั้น พี่เลยกะว่าจะช่วยดึงออกมาด้วยแหละ\"",
                "main_ask"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"เอ๊ะ? ช่วยดึง? ทำไมอะคะ?\"",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"ก็ Power Bank ร้านนั้นน่ะ... สเปกหลอกครับ 50,000 mAh บ้าบออะไรเบาหวิวขนาดนั้น แถมราคาถูกจนน่ากลัว ขืนซื้อไปใช้ เดี๋ยวระเบิดตูมตามขึ้นมา อดกินยำตลอดชีวิตนะ\"",
                "main_basic"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(หยุดเคี้ยว ชะงักไปนิดนึง) \"หูววว... จริงเหรอคะ? หนูเกือบซื้อแล้วนะนั่น!\"",
                "himiko_scary"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"พี่นี่สุดยอดเลย... ไม่ใช่แค่หาของกินเก่ง แต่ยังดูของเป็นด้วย!\"",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "(ยิ้มหวาน) \"พี่ช่วยเซฟตังค์หนูไว้... งั้นมื้อนี้หนูเลี้ยงพี่เอง! ห้ามปฏิเสธ!\"",
                "himiko_smile"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"ไม่เป็นไรครับ แค่นี้เอง...\"",
                "main_ask"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"ไม่ได้! แม่สอนว่าบุญคุณต้องทดแทน แค้นต้องชำระ... เอ้ย ไม่ใช่! เอาเป็นว่าหนูเลี้ยงค่ะ จบนะ!\"",
                "himiko_shy"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : บรรยากาศเป็นไปอย่างผ่อนคลายและเป็นกันเองสุดๆ การ \"กินข้าวด้วยกัน\" คือการละลายพฤติกรรมที่ดีที่สุดจริงๆ ตอนนี้ผมรู้สึกว่ากำแพงระหว่างรุ่นพี่รุ่นน้องมันพังทลายลงไปพร้อมกับเปลือกปูม้าแล้ว",
                "main_ask"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : หลังจากจัดการของคาวเสร็จ ฮิมิโกะ (ที่ดูเหมือนกระเพาะยังไม่เต็ม) ก็หันมามองผมตาแป๋ว",
                "main_thinking"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"พี่คะ... ของคาวจบแล้ว...\" ",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "\"อย่าบอกนะว่า...\"",
                "main_umm"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"ร่างกายต้องการของหวานค่าาา!~\"",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอลุกขึ้นยืน ปัดมือแปะๆ",
                "main_basic"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"พี่ ตัวเอก ... หนูอยากได้ Power Bank ใหม่จริงๆ นะ อันเก่ามันเสื่อมแล้วอะ\"",
                "himiko_chubbycheeks"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"แต่หนูก็อยากกินไอติมกะทิร้านตรงนู้นด้วย...\"",
                "himiko_interested"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอมองหน้าผมสลับกับมองไปทางออกตลาด",
                "main_umm"
        ));
        Chapter1_Scene23.addDialogue(new DialogueLine(himiko,
                "\"เอาไงดีคะ? พี่รีบกลับไหม?\"",
                "himiko_ask"
        ));

        // addChoice
        Chapter1_Scene23.addChoice(new Choice(
                "อาสาพาไปซื้อของ",
                "Chapter1_Scene24"
        ));
        Chapter1_Scene23.addChoice(new Choice(
                "สัญญาเดทครั้งหน้า",
                "Chapter1_Scene25"
        ));

        Scene Chapter1_Scene24 = new Scene("Chapter1_Scene24");
        Chapter1_Scene24.setBackgroundPath("/images/background/bu_market.png");

        Chapter1_Scene24.addDialogue(new DialogueLine(speaker,
                "[ณ ร้านไอติมกะทิสด ข้างทาง - แสงแดดสีส้มยามเย็นเริ่มสาดส่อง]",
                "main_deepthinking"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(speaker,
                "ฮิมิโกะตักไอติมกะทิเข้าปากด้วยสีหน้าฟินสุดขีด แก้มป่องๆ ของเธอขยับไปมาเหมือนหนูแฮมสเตอร์ ",
                "main_deepthinking"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"งื้อออ~ หวานเย็นชื่นใจ! พี่ ตัวเอก ไม่กินเหรอคะ? อร่อยน้าาา\"",
                "himiko_surprised"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(นั่งมองเธอเพลินจนลืมตักถ้วยตัวเอง) \"กินครับๆ... แค่เห็นเรากินพี่ก็อิ่มแล้ว... เอ้ย! หมายถึงมันถ้วยใหญ่ดี\" ผมรีบตักไอติมกลบเกลื่อนความเขิน",
                "main_laughlittle"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(หัวเราะคิกคัก) \"ปากหวานอีกละ... ว่าแต่เรื่อง Power Bank เอาไงดีคะ? ถ้าไม่ซื้อร้านเมื่อกี้ หนูต้องไปหาซื้อที่ไหนอะ? หนูไม่อยากเดินสุ่มสี่สุ่มห้าแล้ว กลัวโดนหลอกเหมือนเมื่อกี้อีก\" เธอทำหน้าหงอยลงเล็กน้อย วางช้อนลงแล้วถอนหายใจ",
                "himiko_laugh"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"แบตมือถือหนูไหลเป็นน้ำเลยช่วงนี้ ต้องใช้ถ่ายรูปส่งงานอาจารย์ด้วยสิ...\"",
                "himiko_chubbycheeks"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : Opportunity Detected. นี่คือจังหวะที่ต้อง Strike!",
                "main_ask"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(ขยับแว่น วางมาดผู้เชี่ยวชาญ) \"อย่าห่วงครับ เรื่อง IT ไว้ใจพี่ได้\"",
                "main_deepthinking"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"กินไอติมเสร็จแล้ว... เราไป 'ห้าง' กันต่อเลยไหม?\"",
                "main_ask"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(ตาโต) \"ห้าง? ตอนนี้เหรอคะ?\"",
                "himiko_laugh"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"ใช่ครับ ไปห้างหน้ามอนี่แหละ (Future Park / Zpell) มีร้าน Advice กับ Banana IT ใหญ่ๆ อยู่ ของแท้ประกันศูนย์แน่นอน\"",
                "main_ask"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"เดี๋ยวพี่ไปช่วยเลือกให้เอง รับรองว่าจะได้ของที่ 'สเปกเทพ' ในราคาที่ 'สมเหตุสมผล' ที่สุด... ไม่มีย้อมแมวแน่นอน\"",
                "main_ask"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(ยิ้มมุมปาก) \"ถือว่าเป็นบริการเสริมจาก 'Personal Consultant' ส่วนตัวของเราแล้วกันครับ\"",
                "main_deepthinking"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(หน้าแดงระเรื่อ ยิ้มกว้างจนตาหยี) \"โห... มีที่ปรึกษาส่วนตัวด้วย... หรูจัง!\"",
                "himiko_smile"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"งั้น... ไปค่ะ! พี่นำทางเลย! หนูพร้อมเดินตามต้อยๆ แล้ว!\"",
                "himiko_shy"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(speaker,
                "[ณ ห้างสรรพสินค้า - แอร์เย็นฉ่ำ สว่างไสว]",
                "main_deepthinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราเดินเข้ามาในห้างสรรพสินค้า บรรยากาศเปลี่ยนจากความร้อนระอุของตลาดนัด เป็นความเย็นสบายและทันสมัย ฮิมิโกะเดินข้างๆ ผม ระยะห่างของเราลดลงจากตอนแรกมาก... ไหล่ของเราชนกันเบาๆ เป็นระยะๆ",
                "main_basic",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"พี่รู้เรื่องคอมฯ เรื่องไอทีเยอะจัง พี่เรียนยากไหมคะ Com Sci เนี่ย?\"",
                "himiko_interested",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"ก็... ยากครับ ต้องคุยกับคอมพิวเตอร์มากกว่าคุยกับคน บางทีก็ปวดหัวกับ Logic แปลกๆ\"",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"แต่พอมาเจอเราวันนี้... พี่ว่าคุยกับคน (น่ารักๆ) ก็ไม่ได้ยากอย่างที่คิดนะ\"",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(ตีแขนผมเบาๆ) \"บ้า! หยอดอีกและ! เดี๋ยวนี้พี่ Tech เขาเรียนวิชาจีบสาวในหลักสูตรเหรอคะ?\"",
                "himiko_shy",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"เปล่าครับ... เรียนรู้หน้างานล้วนๆ (Machine Learning)\"",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราหัวเราะกันคิกคัก เดินผ่านร้านเสื้อผ้า ร้านขนม จนมาถึงโซน IT ชั้นบน การที่มีคนเดินข้างๆ คุยเรื่องสัพเพเหระแบบนี้... มันทำให้การเดินห้างที่น่าเบื่อ (สำหรับคนไม่มีแฟน) กลายเป็นช่วงเวลาพิเศษขึ้นมาทันที",
                "main_deepthinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเดินนำเธอเข้าไปในร้าน ตรงไปที่โซน Accessories ราวกับเป็นเจ้าถิ่น",
                "main_thinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"โอเคครับ โจทย์คือ... เบา พกพาง่าย ชาร์จไว และแบตทนใช่ไหม?\"",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมกวาดสายตามองชั้นวาง... แล้วหยิบตัวเลือกมา 2-3 รุ่น",
                "main_thinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"พี่แนะนำตัวนี้ครับ (Model C)\" ผมยื่นกล่องให้เธอดู แล้วเริ่มอธิบายด้วยน้ำเสียงนุ่มนวลแต่ดูโปร",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"ตัวนี้ 10,000 mAh ชาร์จมือถือเราได้ประมาณ 2 รอบครึ่ง... พอดีวันนึงสบายๆ น้ำหนักเบาแค่ 2 ขีด ใส่กระเป๋าผ้าไม่ตุง\" ",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"ที่สำคัญคือช่องนี้... เห็นเขียนว่า 'PD 20W' ไหมครับ? มันคือระบบชาร์จเร็ว เสียบแค่ 30 นาที แบตเราจะเด้งขึ้นมา 50% เลย ไม่ต้องรอนานเหมือนอันที่ตลาดนัด\"",
                "main_deepthinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(มองผมสลับกับกล่องสินค้า ตาเป็นประกายวิบวับ)",
                "himiko_smile",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"หูววว... พี่อธิบายเข้าใจง่ายมากกกก! ปกติหนูอ่านหลังกล่องแล้วงงแตกเลย\"",
                "himiko_surprised",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"แล้วสีชมพูนี้ก็น่ารักด้วย... เข้ากับเคสโทรศัพท์หนูเลย!\"",
                "himiko_usemobile",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"ใช่ครับ... พี่เลือกสีนี้เพราะคิดว่าน่าจะเหมาะกับเรา\"",
                "main_deepthinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(เงยหน้าสบตาผม แก้มแดงปลั่ง) \"ใส่ใจจัง... งั้นเอาอันนี้ค่ะ! หนูเชื่อใจพี่!\"",
                "himiko_eyecontact",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เธอหยิบกล่องไปจ่ายเงินที่เคาน์เตอร์ด้วยรอยยิ้มกว้าง ผมยืนมองเธอจากด้านหลังด้วยความรู้สึกภูมิใจ... ไม่ใช่แค่เพราะเลือกของถูกใจ แต่เพราะได้รับความ \"เชื่อใจ\" จากเธอ",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราเดินออกมาส่งกันที่จุดรอรถตู้/แท็กซี่ ฮิมิโกะกอดถุงใส่ Power Bank ไว้แนบอกเหมือนของล้ำค่า",
                "main_basic",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"วันนี้ขอบคุณพี่ ตัวเอก มากๆๆๆ เลยนะคะ! สนุกมากกกก แถมได้ของดีกลับบ้านด้วย\"",
                "himiko_eyecontact",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"ถ้าไม่ได้พี่ หนูคงได้ระเบิดเวลา C4 จากตลาดนัดมาแล้วแน่ๆ\"",
                "himiko_sorry",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"ยินดีครับ... ถ้ามีปัญหาการใช้งาน หรืออยากลงโปรแกรมอะไรเพิ่ม ก็ทักไลน์พี่มาได้ตลอดนะ ไม่ต้องเกรงใจ\"",
                "main_deepthinking",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "\"บริการหลังการขายครับ\"",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(ยิ้มเจ้าเล่ห์) \"บริการหลังการขาย... หรือบริการจีบหลังไมค์คะ?\"",
                "himiko_interested",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(สะดุ้ง) \"กะ... ก็... ทั้งสองอย่างมั้งครับ\" (กลั้นใจตอบไปเลย!)",
                "main_laughlittle",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "(หน้าแดงแปร๊ด หัวเราะเขินๆ) \"คนบ้า! ยอมรับตรงๆ ซะงั้น!\" ",
                "himiko_shy",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"โอเคค่า... ไว้หนูจะทักไปกวนบ่อยๆ นะคะ 'ที่ปรึกษาส่วนตัว' ของหนู\"",
                "himiko_smile",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : รถแท็กซี่มาจอดเทียบท่า เธอเปิดประตูขึ้นรถ แล้วลดกระจกลงมาโบกมือให้ผมจนรถเคลื่อนตัวออกไป ",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(himiko,
                "\"กลับดีๆ นะคะพี่! ถึงแล้วบอกด้วยน้าาา!\"",
                "himiko_hihi",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยืนมองไฟท้ายรถแท็กซี่ที่ค่อยๆ ลับสายตาไป... ท่ามกลางบรรยากาศยามค่ำคืนที่แสนสดใสในใจผม",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "(บรรยาย) : วันนี้ผมเริ่มต้นด้วยการเป็นแค่ \"รุ่นพี่คณะ Com Sci ที่บังเอิญเจอ\" แต่จบวันด้วยสถานะ \"ที่ปรึกษาส่วนตัว\" ที่มีไลน์ มีรูปถ่าย และมีความทรงจำดีๆ ร่วมกัน Algorithm ความรักของผม... เริ่ม Compile ผ่านแล้วสินะ",
                "main_ask",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(speaker,
                "[หน้าจอโทรศัพท์ของตัวเอกเด้งแจ้งเตือน LINE]\n" + //
                "Himiko: ส่งสติกเกอร์แมวเต้นดุ๊กดิ๊กHimiko: \"ถึงหอแล้วบอกเค้าด้วยนะ! วันนี้ขอบคุณมากๆ ค่ะพี่ชายคนเก่ง �\"",
                "line",
                "/images/background/Future_Park.png"
        ));
        Chapter1_Scene24.addDialogue(new DialogueLine(main,
                "ผมยิ้มกว้าง พิมพ์ตอบกลับไปทันที...",
                "main_usemobile",
                "/images/background/status_completed.png"
        ));
         Chapter1_Scene24.addDialogue(new DialogueLine(speaker,
                "โปรดติดตามตอนต่อไป.......................",
                "main_deepthinking",
                "/images/background/to_be_continued.png"
        ));

        Scene Chapter1_Scene25 = new Scene("Chapter1_Scene25");
        Chapter1_Scene25.setBackgroundPath("/images/background/bu_market.png");

        Chapter1_Scene25.addDialogue(new DialogueLine(speaker,
                "[ร้านไอติมกะทิสด - แสงอาทิตย์เริ่มลับขอบฟ้า]",
                "main_deepthinking"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ฮิมิโกะกำลังตักไอติมคำสุดท้ายเข้าปาก พลางมองนาฬิกาข้อมือด้วยสีหน้าเสียดายเล็กน้อย",
                "main_umm"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "\"งื้อออ... เย็นป่านนี้แล้วเหรอเนี่ย? ร้านคอมฯ น่าจะเริ่มปิดแล้วมั้งคะ?\"",
                "himiko_ask"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(ดูนาฬิกา) \"อืม... 6 โมงกว่าแล้วครับ ร้านดีๆ น่าจะปิด หรือไม่ของก็เหลือน้อย\"",
                "main_usemobile"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"ถ้าไปตอนนี้ เราอาจจะต้องรีบเลือก รีบซื้อ... พี่กลัวว่าจะได้ของที่ไม่ถูกใจที่สุดน่ะสิ\"",
                "main_thinking"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมเว้นจังหวะนิดนึง แล้วสบตาเธอตรงๆ",
                "main_deepthinking"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"เอาอย่างนี้ไหมครับ? วันนี้แยกย้ายกันไปพักผ่อนก่อน...\"",
                "main_ask"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"ไว้เสาร์นี้... พี่พาเราไปเดิน Fortune หรือสยามไหม? ไปเดินเลือกแบบชิลล์ๆ มีเวลาทั้งวัน แถมมีของให้เลือกเยอะกว่าด้วย\"",
                "main_ask"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "(ชะงักไปนิดนึง แก้มเริ่มขึ้นสีแดงระเรื่อ)",
                "himiko_eyecontact"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "\"วันเสาร์... ทั้งวันเลยเหรอคะ?\"",
                "himiko_shy"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "\"อื้มมม... ก็ได้ค่ะ! ดีเลย! หนูจะได้แต่งตัวสวยๆ... เอ้ย! แต่งตัวสบายๆ ไปเดินเที่ยวด้วย!\" (หลุดปากแล้วรีบแก้ตัว)",
                "himiko_surprised"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"ครับ... พี่จะรอนะ\"",
                "main_ask"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "\"โอเคค่า! ดีล! ห้ามเบี้ยวนัดหนูนะ!\" เธอชูนิ้วก้อยขึ้นมา ผมยื่นนิ้วก้อยไปเกี่ยวนิ้วเธอเบาๆ... พันธสัญญาแห่งเดทแรกได้เริ่มต้นขึ้นแล้ว",
                "himiko_shy"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(speaker,
                "[จุดรอรถหน้าตลาดนัด]",
                "main_deepthinking"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เราแลกไลน์กันเรียบร้อย ฮิมิโกะโบกมือลาผมหยอยๆ ก่อนขึ้นรถแท็กซี่กลับหอ",
                "main_basic"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "\"ถึงห้องแล้วทักมาด้วยนะคะ 'พี่ว่าที่แฟน... เอ้ย พี่ที่ปรึกษา'!\" (เธอตะโกนแซวทิ้งท้ายก่อนปิดประตูรถ)",
                "main_basic"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยืนยิ้มค้างอยู่คนเดียวเหมือนคนบ้า... หัวใจเต้นแรงระดับ Overclock วันเสาร์นี้... ผมมีเดท! เดทจริงๆ กับน้องฮิมิโกะ!",
                "main_yawn"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(คิดในใจ) :Mission Status: Complete.Next Objective: Survive untill Saturday.",
                "main_laughlittle"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(speaker,
                "[ล็อบบี้หอพัก Dobedo - เวลาหัวค่ำ]",
                "main_deepthinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(secret,
                "\"แหม... หน้าบานเป็นจานดาวเทียมเชียวนะพ่อหนุ่ม\"",
                "main_deepthinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : เสียงแหบห้าวอันเป็นเอกลักษณ์ดังขึ้นจากมุมมืดของโซฟาล็อบบี้ ผมสะดุ้งโหยง หันไปมองต้นเสียง [Character Reveal: \"พี่เจ\" (P'Jay)] รุ่นพี่ Com Sci ปี 3 ในตำนาน... สวมฮู้ดสีเทาตัวเก่ง นั่งขัดสมาธิอยู่บนโซฟา บนตักมีโน้ตบุ๊กที่รัน Code ไหลเป็นน้ำตก และในมือมีกระป๋องกาแฟ",
                "main_surprised",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"พี่เจ? มานั่งทำไรมืดๆ ครับเนี่ย? แฮก Wi-Fi หออีกแล้วเหรอ?\"",
                "main_markpoint",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "(ขยับแว่นหนาเตอะ) \"เปล่า... แค่มานั่งเช็ก Traffic เล่นๆ\"",
                "J_deepthinking2",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"แต่น่าแปลกนะ... Traffic ข้อมูลของแกวันนี้ดู 'สีชมพู' ผิดปกติ\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "(ยิ้มมุมปาก) \"ได้ยินแว่วๆ ว่ามีคนไปทำเท่ที่ตลาดนัด... ช่วยสาวจากพ่อค้าหน้าเลือด แล้วยังนัดเดทวันเสาร์อีก... ร้ายไม่เบานี่\"",
                "J_deepthinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"เฮ้ย! พี่รู้ได้ไง!? ผมเพิ่งคุยกับน้องเขาจบเมื่อกี้เอง!\"",
                "main_surprised",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"หึ... ในโลกนี้ไม่มีความลับหรอกไอ้น้อง... โดยเฉพาะเมื่อแกใช้ Wi-Fi สาธารณะ\" (พี่เจชูโทรศัพท์โชว์หน้า Feed ข่าวของเพจ 'Cute Boy & Girl BU' ที่มีคนแอบถ่ายรูปผมกับฮิมิโกะตอนเกี่ยวก้อยกันลง) Caption: 'งื้อออ น่ารักมากคู่นี้! พี่คณะวิทย์คอมกับน้องนิเทศฯ เคมีดีเวอร์! #เรือแล่นแล้ว'",
                "J_deepthinking2",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(หน้าแดงเถือก) \"เชรดดด... ดังเฉย\"",
                "main_laughlittle",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "(พับจอโน้ตบุ๊กลง แล้วลุกขึ้นเดินมาหาผม)",
                "J_angry",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"แต่ฟังนะ... อย่าเพิ่งดีใจไป\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"การที่แกนัดน้องเขาไปเดทวันเสาร์... มันคือการเปิดโอกาสให้ 'ตัวแปรแทรกซ้อน' ทำงาน\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "\"ตัวแปรแทรกซ้อน? หมายความว่าไงพี่?\"",
                "main_confused",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"แกคิดว่าคนระดับน้องฮิมิโกะ จะไม่มีคนอื่นจ้องอยู่เหรอ?\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"ระหว่างนี้จนถึงวันเสาร์... เตรียมตัวรับแรงกระแทกไว้ให้ดี\"",
                "J_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(j,
                "\"ยังไงก็แล้วแต่ พรุ่งนี้ตอนเช้ามาเจอเจ๊ที่โรงละคร Black Box Theatre ตึกนิเทศศาสตร์ด้สย ฉันมีของดีจะให้\"",
                "J_angry",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : พี่เจตบไหล่ผมสองที แล้วเดินลากรองเท้าแตะขึ้นลิฟต์ไป ทิ้งให้ผมยืนงงกับคำเตือนปริศนา",
                "main_confused",
                "/images/background/dobedo_lobby_night.png"
        ));Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : ตัวแปรแทรกซ้อน? ...คงไม่มีอะไรหรอกมั้ง? น้องเขาก็ตกลงแล้วนี่นา แต่คำพูดพี่เจ... ไม่เคยพลาดสักครั้ง",
                "main_thinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(คิดในใจ) : ว่าแต่....พรุ่งนี้ที่โรงละครหรอ? รุ่นพี่มีอะไรจะให้กันแน่นะ.....",
                "main_umm",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(speaker,
                "[หน้าจอมือถือของตัวเอกเด้งแจ้งเตือน LINE]",
                "main_deepthinking",
                "/images/background/line.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "(ส่งรูปสติกเกอร์แมวส่งจูบ)",
                "himiko_sent",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(himiko,
                "\"ฝันดีล่วงหน้านะคะ! ตื่นเต้นจัง อยากให้ถึงวันเสาร์เร็วๆ!\"",
                "himiko_sent",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(main,
                "(บรรยาย) : ผมยิ้มออก... ช่างเถอะ อุปสรรคอะไรก็มาดิครับ นาทีนี้ผมสู้ตาย!",
                "main_deepthinking",
                "/images/background/dobedo_lobby_night.png"
        ));
        Chapter1_Scene25.addDialogue(new DialogueLine(speaker,
                "Chapter 1: Hello World - COMPLETED",
                "main_deepthinking",
                "/images/background/status_completed.png"
        ));
         Chapter1_Scene25.addDialogue(new DialogueLine(speaker,
                "โปรดติดตามตอนต่อไป.............",
                "main_deepthinking",
                "/images/background/to_be_continued.png"
        ));

        // ---------- ใส่เข้า engine ----------
        // engine.addCharacter(main);
        engine.addCharacter(himiko);
        engine.addCharacter(rin);
        engine.addCharacter(j);

        // engine.addScene(intro);
        engine.addScene(Chapter0_Diamondhall);
        engine.addScene(Chapter0_Diamondhall01);
        engine.addScene(Chapter0_Diamondhall02);
        engine.addScene(Chapter0_Diamondhall03);

        engine.addScene(Chapter1_Scene01);
        engine.addScene(Chapter1_Scene02);
        engine.addScene(Chapter1_Scene03);
        engine.addScene(Chapter1_Scene04);
        engine.addScene(Chapter1_Scene05);
        engine.addScene(Chapter1_Scene06);
        engine.addScene(Chapter1_Scene07);
        engine.addScene(Chapter1_Scene08);
        engine.addScene(Chapter1_Scene09);
        engine.addScene(Chapter1_Scene10);
        engine.addScene(Chapter1_Scene11);
        engine.addScene(Chapter1_Scene12);
        engine.addScene(Chapter1_Scene13);
        engine.addScene(Chapter1_Scene14);
        engine.addScene(Chapter1_Scene15);
        engine.addScene(Chapter1_Scene16);
        engine.addScene(Chapter1_Scene17);
        engine.addScene(Chapter1_Scene18);
        engine.addScene(Chapter1_Scene19);
        engine.addScene(Chapter1_Scene20);
        engine.addScene(Chapter1_Scene21);
        engine.addScene(Chapter1_Scene22);
        engine.addScene(Chapter1_Scene23);
        engine.addScene(Chapter1_Scene24);
        engine.addScene(Chapter1_Scene25);

        engine.addScene(Start_Again);

        engine.start("intro");
        return engine;
    }
}

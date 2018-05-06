package jumpper;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

public class Resources {


    private static Image playerImage1;
    private static Image playerImage2;
    private static Image playerImage3;
    private static Image playerImage4;
    private static Image playerImage5;
    private static Image playerJumpImage;
    private static Image grassImage;
    private static Image blockImage;
    private static Image welcomeImage;
    private static Color skyColor;
    private static AudioClip jumpAudio;
    private static AudioClip hitAudio;

    private Resources() {
    }

    public static Image getGrassImage() {
        return grassImage;
    }

    public static Image getBlockImage() {
        return blockImage;
    }

    public static Color getSkyColor() {
        return skyColor;
    }

    public static AudioClip getJumpAudio() {
        return jumpAudio;
    }

    public static Image getPlayerImage1() {
        return playerImage1;
    }

    public static Image getPlayerImage2() {
        return playerImage2;
    }

    public static Image getPlayerImage3() {
        return playerImage3;
    }

    public static Image getPlayerImage4() {
        return playerImage4;
    }

    public static Image getPlayerImage5() {
        return playerImage5;
    }

    public static Image getPlayerJumpImage() {
        return playerJumpImage;
    }

    public static Image getWelcomeImage() {
        return welcomeImage;
    }

    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/grass.png"));
            Resources.playerImage1 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/run_anim1.png"));
            Resources.playerImage2 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/run_anim2.png"));
            Resources.playerImage3 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/run_anim3.png"));
            Resources.playerImage4 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/run_anim4.png"));
            Resources.playerImage5 = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/run_anim5.png"));
            Resources.playerJumpImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/jump.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/block.png"));
            Resources.welcomeImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/welcome.png"));
            Resources.jumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("jumpper/audios/onjump.wav"));
            Resources.hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("jumpper/audios/hit.wav"));
            Resources.skyColor = new Color(146, 212, 255);
        } catch (Exception e) {

        }
    }

    public static AudioClip getHitAudio() {
        return hitAudio;
    }
}
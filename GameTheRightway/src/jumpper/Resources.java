package jumpper;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

public class Resources {


    private static Image grassImage;
    private static Image blockImage;
    private static Image welcomeImage;
    private static Color skyColor;
    private static AudioClip jumpAudio;

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

    public static Image getWelcomeImage() {
        return welcomeImage;
    }

    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/grass.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/block.png"));
            Resources.welcomeImage = ImageIO.read(Resources.class.getClassLoader().getResourceAsStream("jumpper/images/welcome.png"));
            Resources.jumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("jumpper/audios/onjump.wav"));
            Resources.skyColor = new Color(146, 212, 255);
        } catch (Exception e) {

        }
    }
}
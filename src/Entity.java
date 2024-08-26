import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Entity {
    public static int imgDiameter = 150;
    public static int screenWidth = 1000;
    public static int screenHeight = 750;
    public static BufferedImage type1Girl5;
    public static BufferedImage type1Girl15;
    public static BufferedImage type1Girl30;
    public static BufferedImage type1Girl60;
    public static BufferedImage type2Girl10;
    public static BufferedImage type2Girl25;
    public static BufferedImage type2Girl60;
    public static BufferedImage type1Boy10;
    public static BufferedImage type1Boy25;
    public static BufferedImage type1Boy40;
    public static BufferedImage background;

    static {
        try {
            type1Girl5 = ImageIO.read(new File("src\\assets\\fiveGirlSari.png"));
            type1Girl15 = ImageIO.read(new File("src\\assets\\img_1.png"));//"src\\assets\\fifhteenGirlSari.png"));
            type1Girl30 = ImageIO.read(new File("src\\assets\\thirtySariGirl.png"));
            type1Girl60 = ImageIO.read(new File("src\\assets\\oldNeneSariGirl.png"));
            type2Girl10 = ImageIO.read(new File("src\\assets\\fiveGirlSari.png"));
            type2Girl25 = ImageIO.read(new File("src\\assets\\twentyFiveGirlQara.png"));
            type2Girl60 = ImageIO.read(new File("src\\assets\\oldNeneQara.png"));
            type1Boy10 = ImageIO.read(new File("src\\assets\\tenSariBoy.png"));
            type1Boy25 = ImageIO.read(new File("src\\assets\\img_1.png"));//"src\\assets\\twentyFiveBoySari.png"));
            type1Boy40 = ImageIO.read(new File("src\\assets\\fourtyBoySari.png"));
            background=ImageIO.read(new File("src\\assets\\img.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

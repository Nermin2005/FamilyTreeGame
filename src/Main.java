import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static BigDecimal totalPrice=BigDecimal.valueOf(0);
    public static Character mainChar=new Character(BigDecimal.valueOf(548),18,null,(int)(Math.random()*2)==1?'F':'M',null,null,null,0);
    public static List<Character> characterList=new ArrayList<>();
    public static void main(String[] args) {
        mainChar.setName(mainChar.getGender()=='F'?"Olivia":"Baki");
        mainChar.setImage(mainChar.getGender()=='F'?Entity.type1Girl15:Entity.type1Boy25);
        characterList.add(mainChar);
        JFrame jFrame = new JFrame();
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(Entity.screenWidth, Entity.screenHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setTitle("Family Tree Game");
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.add(imagePanel);
    }
    public void wait(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
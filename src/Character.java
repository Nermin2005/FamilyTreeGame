import java.awt.image.BufferedImage;
import java.math.BigDecimal;

public class Character {
    private BigDecimal money;
    private int age;
    private Education education;
    private char gender;
    private String name;
    private double happiness;
    private BufferedImage image;
    private boolean changedImg;
    public void defineImg() {
        if(gender=='F'){

        }
        else {

        }
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public boolean isChangedImg() {
        return changedImg;
    }

    public void setChangedImg(boolean changedImg) {
        this.changedImg = changedImg;
    }
private int counter=0;
    public void aMonthPasses() {

        if (education == null) {
            if (age > 6 && age < 17) {
                //ask user
                money.add(BigDecimal.valueOf(education.getPay()));
            }
        }
        ProjectForSwing.totalPrice.add(money);
        counter++;
        if(counter==12) {
            age++;
            counter=0;
        }

    }

}

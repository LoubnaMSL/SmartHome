package home;

public class Adresse {

    private int num;
    private String city;


    public Adresse(int num, String city) {
        this.num=num;
        this.city = city;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

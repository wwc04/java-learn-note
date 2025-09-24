package JiHe.Collection.Test;

public class Card {
    private String num;
    private String color;
    private int size;

    public Card() {
    }

    public Card(String num, String color, int size) {
        this.num = num;
        this.color = color;
        this.size = size;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return color + num;
    }
}

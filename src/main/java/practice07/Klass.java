package practice07;

public class Klass {
    protected int number;

    public Klass(int klass) {
        this.number = klass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}

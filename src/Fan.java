public class Fan {
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = LOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";

    //getters
    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.on;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    //setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.on = status;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //to string
    public String toString() {
        String strSpeed = "Speed: " + this.speed;
        String strColor = "\nColor: " + this.color;
        String strRadius = "\nRadius: " + this.radius;
        String strStatus = this.on == true?"\nfan is on":"\nfan is off";
        return strSpeed + strColor + strRadius + strStatus;
    }

}

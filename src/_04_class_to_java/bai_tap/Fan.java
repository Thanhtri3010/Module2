package _04_class_to_java.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public int speed =SLOW;
    private boolean on =false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSppeed() {
        return speed;
    }

    public void setSppeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
    }
    public Fan(int speed, boolean on,double radius, String color){
        this.speed =speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public String Print(){
        if (on){
            return " Speed: " +this.speed + " Radius: " + this.radius + " Collor "+ this.color + " Fan on";
        }else {
            speed=0;
            return " Speed: " +this.speed + " Radius: " + this.radius + " Collor "+ this.color + " Fan off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false,5,"blue");
        System.out.println(fan1.Print());
        System.out.println(fan2.Print());
    }
}

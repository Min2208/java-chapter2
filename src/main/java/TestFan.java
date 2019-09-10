import org.w3c.dom.ls.LSOutput;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());


    }
}

class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        String result=null;
        if (this.on){

            result="speed: " +this.speed +", color: "+ this.color +", radius: fan is on" ;

        }else {

            result="color: "+ this.color +", radius: fan is off" ;
        }

        return result;
    }
}
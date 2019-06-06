public class ClassFan {
    final public int SLOW =1;
    final public int MEDIUM =2;
    final public int FAST =3;
    private int speed = this.SLOW;
    private boolean on =false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed(){
        return this.speed;
    }

    public boolean getOn(){
        return this.on;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setter(int speed, boolean on,double radius,String color){
        this.speed = speed;
        this.on = on;
        this.radius =radius;
        this.color =color;
    }

    ClassFan(){
    }

    public String ToString(){
        if (this.on){
            return "Speed of Fan:"+" "+speed +","+"color of Fan:"+" "+ color +","+"radius of Fan:"+" "+radius +","+" "+"fan is on";
        }
            return "color of Fan:"+" "+color +","+"radius of Fan:"+" "+radius +","+" "+"fan is off";
    }

}

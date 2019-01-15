public class Vehicle {

    private  Double speed;
    private  String color;
    private  boolean isAuto;

    public  Vehicle (double startSpeed,String intiColor ,boolean statusIsAuto){

         speed = 10.0;
         color = "red";
         isAuto = true;
    }

    public  void  setSpeed(double newSpeed){
        speed = newSpeed;
    }

    public  void  setColor(String newColor){
        color = newColor;
    }

    public  void setAuto(boolean newStatus){
        isAuto = newStatus;
    }

    public  void  getSpeed(double newSpeed){
        speed = newSpeed;
    }

    public  void  getColor(String newColor){
        color = newColor;
    }

    public  double getSpeed (){
        return this.speed;
    }


    public  String getColor (){
        return this.color;
    }


    public  boolean getStatus (){
        return this.isAuto;
    }

    public  void incSpeed(double value){
        this.speed = value;
    }


    public  void decSpeed(double value){
        this.speed = value;
    }

    public  void  print(double startSpeed,String intiColor ,boolean statusIsAuto){
        System.out.println(startSpeed);
        System.out.println(intiColor);
        System.out.println(statusIsAuto);
    }

}

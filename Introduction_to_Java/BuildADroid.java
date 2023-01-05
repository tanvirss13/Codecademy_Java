 BuildADroid
Building a Basic Droid using Java.
public class Droid{
  String name;
  int batteryLevel;
  
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task + ".");
    batteryLevel -= 10;
  }
  public void energyReport(){
    System.out.println(name + " is losing power and currently stands at the following level: " + batteryLevel + ".");
  }
  public void energyTransfer(int batteryPercent, String droidName){
    batteryLevel -= batteryPercent;
    System.out.println("Energy is being transferred from " + name + " to " + droidName + " at the following rate: " + batteryLevel + ".");
  }
  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("dancing");
    //Codey.performTask("coding");
    Codey.energyReport();
    Codey.energyTransfer(37, "Casey");
  }
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
}

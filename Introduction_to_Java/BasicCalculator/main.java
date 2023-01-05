# BasicCalculatorJava
Code for a Basic Calculator coded in java.

public class Calculator {
  //This is a very basic calculator program and performs addition, subtraction, multiplication, division and modulo functions
  public Calculator(){

  }
  public int add(int a, int b){
    return a+b;
  }
  public int subtract(int a, int b){
    return a-b;
  }
  public int multiply(int a, int b){
    return a*b;
  }
  public int divide(int a, int b){
    return a/b;
  }
  public int modulo(int a, int b){
    return a%b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    //add
    System.out.println(myCalculator.add(5,7));
    //subtract
    System.out.println(myCalculator.subtract(45,11));
    //multiply
    System.out.println(myCalculator.multiply(50,78));
    //division
    System.out.println(myCalculator.divide(45,9));
    //modulo
    System.out.println(myCalculator.modulo(67,4));
  }
}

public class operatorsDemo{
    void add(int a ,int b) {
    int sum = a+b;
    System.out.println("Addition: " + sum);
    }


    int multiply(int a, int b){
    return a * b ; 
}
public static void main(string[] args){

    int x = 10, y = 3;
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y =" + (x - y));
    System.out.println("x * y =" + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y =" + (x % y));

    byte a = 10, b = 20;
    int result = a + b;
    System.out.println("Arithmatic promotion result: " + result);

    operatorsDemoobj = new operatorsDemo();
    obj.add(5,7);
    int product = obj.multiply(4,6);
    System.out.println("multiplication:" + product);

}
}


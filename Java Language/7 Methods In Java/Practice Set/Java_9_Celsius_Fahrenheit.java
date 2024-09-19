// write a function to convert celsius temperature into fahrenheit

public class Java_9_Celsius_Fahrenheit {
    static float celsius_fahrenheit(float n){
        float result=(n*9/5)+32;
        return result;
    }
    public static void main(String[] args) {
        float a=celsius_fahrenheit(6);
        System.out.println(a);
    }
}

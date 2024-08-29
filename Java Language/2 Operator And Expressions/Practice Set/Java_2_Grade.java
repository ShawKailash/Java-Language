// write a java program to encrypt a grade by adding 8
// to it decrypt it to show the correct grade

public class Java_2_Grade {
    public static void main(String[] args) {
        char grade = 'b';
        grade = (char)(grade+8);
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}

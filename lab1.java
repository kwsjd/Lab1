import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first;
        first = num.nextInt();
        System.out.println("Введите второе число: ");
        int second;
        second = num.nextInt();
        System.out.println("Введите третье число: ");
        int third;
        third = num.nextInt();
        System.out.println("Введите четвертое число: ");
        int fourth;
        fourth = num.nextInt();
        if (first<second && first<third && first < fourth ){
            System.out.println("Наименьшее из введенных чисел: "+ first);
        }
        if(second<first && second<third && second<fourth){
            System.out.println("Наименьшее из введенных чисел: "+ second);
        }
        if (third<first && third<second && third<fourth){
            System.out.println("Наименьшее из введенных чисел: "+ third);
        }
        if (fourth<first && fourth<second && fourth<third){
            System.out.println("Наименьшее из введенных чисел: "+ fourth);
        }
    }

}

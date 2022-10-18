package homeWorks.homeWorks19102022;
import java.util.Scanner;

class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = input.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = input.nextInt();
//        int sum = num1+num2+num3;
//        System.out.println("Сумма трёх чисел равна: "+sum);
        System.out.println("Сумма трёх чисел: "+sumTotal(num1,num2,num3));
    }
    protected static int sumTotal(int num1, int num2, int num3){
        int sum = 0;
        sum = num1+num2+num3;
        return sum;
        // так просто для практики решил вызвать
    }
}

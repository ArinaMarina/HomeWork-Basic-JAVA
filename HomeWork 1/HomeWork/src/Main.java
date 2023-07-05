public class Main {
    public static void main(String...args) {
        String text1 = "Привет всем";
        String text2 = "Меня зовут Марина";
        String text3 = "Как ваши дела ?";

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);

        String text4 = "Мне ";
        String text5 = " года.";
        int number1 = 24;
        int number2 = 10;
        int number3 = number1 + number2;
        System.out.println(text4 + number3 + text5);


        String method1 = "Плюсы";
        System.out.println(method1);
        int num1 = 20;
        int num2 = 30;
        int num3 = num1 + num2;
        System.out.println(num1 + num2);

        String method2 = "Минусы";
        System.out.println(method2);
        int num4 = 37;
        int num5 = 25;
        int num6 = num4 - num5;
        System.out.println(num4 - num5);

        String method3 = "Умножение";
        System.out.println(method3);
        int num7 = 54;
        int num8 = 12;
        int num9 = num7 * num8;
        System.out.println(num7 * num8);

        String method4 = "Диление";
        System.out.println(method4);
        int num10 = 542;
        int num11 = 8;
        int num12 = num10 / num11;
        System.out.println(num10 / num11);
    }
}
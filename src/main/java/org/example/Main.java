package org.example;

public class Main {
    public static boolean func(int a){
        if (a % 5 == 0 && a % 7 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean func2(int b){
        if (b >=10 && b<=20){
            return true;
        } else {
            return false;
        }
    }

    public static boolean func3(int x, int y){
        if (x*x==y){
            return true;
        }else{
            return false;
        }
    }

    public static boolean func5(int a){
        int sum = 0;
        for(int i = 0; a != 0; i++){
            int x = a % 10;
            sum = sum + x;
            a = a / 10;
        }
        if (sum % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean func6(int a, int b){
        if (a < 0){
            a = a / -1;
        }
        if (b < 0){
            b = b / -1;
        }

        if(a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean func8(int a){
        if (a % 2 == 0 || a % 3 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static String func9(int a, int b){
        if ((a+b) % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(func(35));

        System.out.println(func2(21));

        System.out.println(func3(6, 36));

        task4 task4 = new task4();
        Boolean result = task4.func4(37);
        System.out.println(result);

        System.out.println(func5(3429633));

        System.out.println(func6(-20, -20));

        task7 task7 = new task7();
        System.out.println(task7.func7(-45));

        System.out.println(func8(12));

        System.out.println(func9(32, 70));

        TasksSolver tasksSolver = new TasksSolver();
        System.out.println(tasksSolver.func10(20));
        System.out.println(tasksSolver.func11(12, 17));
        System.out.println(tasksSolver.func12(65,28,890));
    }
}
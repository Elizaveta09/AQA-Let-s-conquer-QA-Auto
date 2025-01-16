package org.example;

public class TasksSolver {
    public boolean func10(int a){
        if(a % 4 == 0 && a % 6 == 0){
            return  true;
        } else{
            return false;
        }
    }

    public String func11(int a, int b){
        if(((a+b) % 2 == 0) && ((a+b) % 10 == 0)){
            return "Even and Divisible by 10";
        } else if (((a+b) % 2 == 0) && ((a+b) % 10 != 0)) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    public int func12(int a, int b, int c) {
        int max = a; // Предполагаем, что a - наибольшее

        if (b > max) {
            max = b; // Если b больше, обновляем max
        }

        if (c > max) {
            max = c; // Если c больше, обновляем max
        }

        return max;
    }
}

package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в Анализатор Треугольника!"); // Инициализация и приветствие
        int k;
        do {

            System.out.println("Введите первую сторону треугольника: "); // Получение данных
            int a = in.nextInt();
            System.out.println("Введите вторую сторону треугольника: ");
            int b = in.nextInt();
            System.out.println("Введите третью сторону треугольника: ");
            int c = in.nextInt();
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) || Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {

                System.out.println("a, b и c являются сторонами прямоугольного треугольника"); // Проверка всех условий
            }
            else if (a == b && c != a || b == c && a != b|| c == a && b != c){

                System.out.println("a, b и c являются сторонами равнобедренного треугольника");

            }
            else if (a == b && a == c && c == b) {

                System.out.println("a, b и c являются сторонами равностороннего треугольника");
            }
            else if (a + b <= c || b + c <= a || c + a <= b){

            System.out.println("a, b и c не являются сторонами треугольника");

            }
            else{

                System.out.println("a, b и c являются сторонами обычного треугольника");
            }
            System.out.println("Хотите продолжить? Если да, то введите 1, если нет, то введите 2"); // Завершение программы
            k = in.nextInt();
        }while(k != 2);
    }
}
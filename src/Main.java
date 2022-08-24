public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    // Задача 1

    int clientOs = 0;
    if (clientOs == 0) {System.out.println("Установите версию приложения для IOS по ссылке");}
    else if (clientOs == 1) {System.out.println("Установите версию приложения для Android по ссылке");}

    // Задача 2

    int clientDevaiceYear = 2013;
    if (clientOs == 0 && clientDevaiceYear < 2105) {System.out.println("Установите облегченную версию приложения для IOS по ссылке");}
    else if (clientOs == 1 && clientDevaiceYear < 2015) {System.out.println("Установите облегченную версию приложения для Android по ссылке");}

    // Задача 3

    int yaer = 2020;
    if ((yaer % 400 == 0) || ((yaer % 4 == 0) && (yaer % 100 != 0)))
    {System.out.println("Год " +yaer + " високосный");}
    else {System.out.println("Год " + yaer + " не високосный");}

    // Задача 4

    int deliveryDistance = 51;
    if (deliveryDistance <= 20)
    {System.out.println("С учетом Вашего расстояния потребуется 1 день на доставку");}
    else if (deliveryDistance > 20 && deliveryDistance <= 60)
    {System.out.println("С учетом Вашего расстояния потребуется 2 дня на доставку");}
    else if (deliveryDistance > 60 && deliveryDistance <= 100)
    {System.out.println("С учетом Вашего расстояния потребуется 3 дня на доставку");}
    else {System.out.println("Доставки нет");}

    // Задача 5

    int month = 5;
    if (month == 12 || month <= 2)
    {System.out.println("Зима");}
    else if (month > 2 && month < 6) {System.out.println("Весна");}
    else if (month > 5 && month < 9) {System.out.println("Лето");}
    else if (month > 8 && month < 12) {System.out.println("Осень");}


    }}
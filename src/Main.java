import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1 - 2");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("Вас зовут " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task2() {
        System.out.println("Задача 3");
        String firstName = "Иванов ";
        String middleName = "Семён ";
        String lastName = "Семёнович";
        String fullName = firstName + middleName + lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Вас зовут " + fullName);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 4");
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Привет " + name);
        scanner.close();
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 5");
        System.out.println("Введите температуру");
        int temperature = scanner.nextInt();
        if (temperature >= -70 && temperature <= 50) {
            System.out.println("Температура воздуха сегодня: " + temperature + " градусов.");
        } else {
            System.out.println("Запредельный градус! \n МЫ ВСЕ УМРЕМ!!!!!!!");
        }
        scanner.close();
        // решил поделать условных операторов, рубрика ЭЭЭЭЭКСПРЕМЕНТ!
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 6");
        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        String actualDate = day + ":" + month + ":" + year;
        System.out.println(actualDate);
        scanner.close();
        //не стал делать проверку условными операторами, решил что
        //не буду нагромождать код лишними строками и усложнять проверку дз
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 7");
        System.out.println("Введите ваше имя");
        String userName = scanner.next();
        System.out.println("Введите имя помощника");
        String assistantName = scanner.next();
        System.out.println("Введите желаемое кол-во сообщений");
        int messageCount = scanner.nextInt();
        System.out.println("Привет," + userName + "! Это твой помощник " + assistantName + ".");
        System.out.println("У тебя " + messageCount + " новых писем.");
        scanner.close();
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("Ф. И. О. сотрудника — "+ fullName);

        //Задача2
        fullName = fullName.toUpperCase();
        System.out.println("Ф. И. О. сотрудника — "+ fullName);

        //Задача3
        fullName = "Метёлкин Геннадий Петрович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'е');
        }
        System.out.println("Ф. И. О. сотрудника — "+ fullName);
    }
}
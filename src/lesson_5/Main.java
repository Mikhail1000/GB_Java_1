package lesson_5;

public class Main {
    public static void main(String[] args) {
        Employees employees1 = new Employees("Иванов Иван Иванович", "Директор", "dir@yandex.ru", "+79521648954", 100000, 45);
        Employees employees2 = new Employees("Сидоров Иван Иванович", "Бухгалтер", "buh@yandex.ru", "+79521123954", 70000, 41);
        Employees employees3 = new Employees("Медная Елизавета Ивановна", "Инженер", "mednayaei@yandex.ru", "+79251123954", 40000, 30);
        Employees employees4 = new Employees("Чистяков Вадим Денисович", "Инженер", "chistyakovvd@yandex.ru", "+79521124531", 45000, 32);
        Employees employees5 = new Employees("Антонов Николай Викторович", "Инженер", "antonovnv@yandex.ru", "+79521154782", 55000, 48);

        Employees[] employeesArr = {employees1, employees2, employees3, employees4, employees5};

        for (Employees employee : employeesArr) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }

    }
}


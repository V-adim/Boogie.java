package LearningFromEPAM.Chapter2;

public class TaskB6 {
    public static void main(String[] args) {

        for (int i = 2; i < 81 ; i++) {
            if (81 % i == 0) {
                System.out.println("число 81 в какой-то системе получилось 100\n" +
                        "первая проверка показывает делители без остатка");
                System.out.println("делитель мог бы быть "+i);
                var ost = 81 / i;
                if (ost % i == 0){
                    System.out.println("вторая проверка ищет второй ноль\n" +
                            "вторая проверка оставила "+i);
                    ost = ost / i;
                    if (ost % i == 1){
                        System.out.println("ищем последнюю единицу\n" +
                                "третья проверка оставила " + i + "\nЭТО И ЕСТЬ ОТВЕТ");
                    }
                }
            }

        }
    }
}

package LearningFromEPAM.Chapter3;



/**
 * 4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
 * Создать массив объектов. Вывести:
 * a) список абитуриентов, имеющих неудовлетворительные оценки;
 * b) список абитуриентов, у которых сумма баллов выше заданной;
 * c) выбрать заданное число n абитуриентов, имеющих самую высокую
 * сумму баллов (вывести также полный список абитуриентов, имеющих
 * полупроходную сумму).
 */
public class TaskA4 {
    public static void main(String[] args) {

        Abiturients.fillingForm();
        for (var v:Abiturients.abiturients) {
            System.out.println(v.toString());
        }
        sortByGrades();
        sortByAverage();

    }

     static class Abiturient{
        private int id, mathGrade, phisicsGrade, chemistryGrade, foreignLanguageGrade, programmingGrade;
        private String surname, name, patronymic, address, phone;


         Abiturient (int id, String surname, String name, String patronymic, int mathGrade, int phisicsGrade,
                    int chemistryGrade, int foreignLanguageGrade, int programmingGrade, String address, String phone){
                    this.id = id;
                    this.surname = surname;
                    this.name = name;
                    this.patronymic = patronymic;
                    this.mathGrade = mathGrade;
                    this.phisicsGrade = phisicsGrade;
                    this.chemistryGrade = chemistryGrade;
                    this.foreignLanguageGrade = foreignLanguageGrade;
                    this.programmingGrade = programmingGrade;
                    this.address = address;
                    this.phone = phone;
        }

         @Override
         public String toString() {
             return "Abiturient{" +
                     "id=" + id +
                     ", surname='" + surname + '\'' +
                     ", mathGrade=" + mathGrade +
                     ", phisicsGrade=" + phisicsGrade +
                     ", chemistryGrade=" + chemistryGrade +
                     ", foreignLanguageGrade=" + foreignLanguageGrade +
                     ", programmingGrade=" + programmingGrade +
                     ", name='" + name + '\'' +
                     ", patronymic='" + patronymic + '\'' +
                     ", address='" + address + '\'' +
                     ", phone='" + phone + '\'' +
                     '}';
         }
     }
    class Abiturients {
        static Abiturient abiturient1 = new Abiturient(1, "Ковалев", "Алексей", "Николаевич",
                8, 7, 9, 6, 9,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient2 = new Abiturient(2, "Петров", "Алексей", "Николаевич",
                6, 4, 5, 8, 8,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient3 = new Abiturient(3, "Васечкин", "Алексей", "Николаевич",
                6, 9, 4, 10, 10,"Шмидта 55",
                "+626+51261");
        static  Abiturient abiturient4 = new Abiturient(4, "Щувалов", "Алексей", "Николаевич",
                3, 6, 9, 8, 8,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient5 = new Abiturient(5, "Сергеев", "Алексей", "Николаевич",
                5, 9, 5, 4, 4,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient6 = new Abiturient(6, "Кравцов", "Алексей", "Николаевич",
                5, 9, 3, 4, 5,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient7 = new Abiturient(7, "Буланов", "Алексей", "Николаевич",
                4, 7, 3, 4, 8,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient8 = new Abiturient(8, "Курин", "Алексей", "Николаевич",
                9, 9, 9, 5, 6,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient9 = new Abiturient(9, "Яковлев", "Алексей", "Николаевич",
                6, 8, 4, 8, 7,"Шмидта 55",
                "+626+51261");
        static Abiturient abiturient10 = new Abiturient(10, "Дергунов", "Алексей", "Николаевич",
                9, 5, 3, 8, 8,"Шмидта 55",
                "+626+51261");

        static Abiturient[] abiturients = new Abiturient[10];

        static void fillingForm (){
           abiturients[0] = abiturient1;
            abiturients[1] = abiturient2;
            abiturients[2] = abiturient3;
            abiturients[3] = abiturient4;
            abiturients[4] = abiturient5;
            abiturients[5] = abiturient6;
            abiturients[6] = abiturient7;
            abiturients[7] = abiturient8;
            abiturients[8] = abiturient9;
            abiturients[9] = abiturient10;
        }

    }
    static void sortByGrades (){
        System.out.println("\nсписок абитуриентов, имеющих :");
        for (var v:Abiturients.abiturients) {
            if (v.programmingGrade<=5 | v.mathGrade<=5 | v.phisicsGrade<=5 | v.foreignLanguageGrade<=5 |
                    v.chemistryGrade<=5){
                System.out.println("\n неудовлетворительные оценки");
                System.out.println(v.surname + "\n mathematics " + v.mathGrade +
                        "\n phisics " + v.phisicsGrade + "\n chemistry " + v.chemistryGrade +
                        "\n foreign language " + v.foreignLanguageGrade + "\n programming " + v.programmingGrade);
            }else {
                System.out.println("\nудовлетворительные оценки");
                System.out.println(v.surname + "\n mathematics " + v.mathGrade +
                        "\n phisics " + v.phisicsGrade + "\n chemistry " + v.chemistryGrade +
                        "\n foreign language " + v.foreignLanguageGrade + "\n programming " + v.programmingGrade);
            }
        }
    }
    static void sortByAverage (){
      double   averageRating;
        System.out.println("\n");
        for (var v:Abiturients.abiturients) {
            averageRating = (v.chemistryGrade+v.mathGrade+v.phisicsGrade+v.programmingGrade+v.foreignLanguageGrade)/5;
            if (averageRating>5){
                System.out.println(v.surname + " average = " + averageRating + " can study");
            }else{
                System.out.println(v.surname + " average = " + averageRating + " going away");
            }

        }
    }
}

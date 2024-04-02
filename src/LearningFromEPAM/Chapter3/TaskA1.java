package LearningFromEPAM.Chapter3;


import java.util.Objects;

/**
 * Создать классы, спецификации которых приведены ниже. Определить кон-
 * структоры и методы setТип(), getТип(), toString(). Определить дополнительно
 * методы в классе, создающем массив объектов. Задать критерий выбора данных
 * и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 * должно быть объявлено несколько конструкторов.
 * 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа.
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */
public class TaskA1 {


    public static void main(String[] args) {

        fillingForm();
        chooseByFaculty();
        chooseByYearOfStudy();
        chooseByBirthYear();
        chooseByGroup();
    }
    static class Student {

        private int id, birthDay, birthMonth, birthYear, yearOfEduc;
        private String surname, name, patronymic, address, phone, faculty, group;

        Student(int id, String surname, String name, String patronymic, int birthDay,
                int birthMonth, int birthYear, String address, String phone,
                String faculty, int yearOfEduc, String group) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.birthDay = birthDay;
            this.birthMonth = birthMonth;
            this.birthYear = birthYear;
            this.address = address;
            this.phone = phone;
            this.faculty = faculty;
            this.yearOfEduc = yearOfEduc;
            this.group = group;
        }
    }

    class Students {
        static Student[] students = new Student[13];


        static Student student1 = new Student(1, "Иванов", "Алексей", "Иванович",
                5, 11, 2001, "Минск, Гоголя 12-23", "+375441523262",
                "Механический", 1, "МЕХ 191");
        static Student student2 = new Student(2, "Петров", "Сергей", "Денисович",
                9, 3, 2002, "Минск, Я.Купалы 42-2", "+375441125262",
                "Механический", 2, "МЕХ 201");
        static Student student3 = new Student(3, "Кузьмин", "Константин", "Иванович",
                23, 6, 2003, "Минск, Первомайская 12-23", "+375441523262",
                "Физический", 3, "ФИЗ 202");
        static Student student4 = new Student(4, "Гуляев", "Алексей", "Иванович",
                17, 1, 2004, "Минск, Гоголя 12-23", "+375441523262",
                "Химический", 2, "ХИМ 223");
        static Student student5 = new Student(5, "Васильев", "Алексей", "Иванович",
                29, 9, 2002, "Минск, Ленинская 132-231", "+375441565662",
                "Механический", 4, "МЕХ 212");

        static Student student6 = new Student(6, "Смирнов", "Дмитрий", "Иванович",
                15, 4, 1999, "Минск, Маркса 12-23", "+375441523262",
                "Физический", 3, "ФИЗ 192");
        static Student student7 = new Student(7, "Сергеев", "Сергей", "Денисович",
                22, 6, 2000, "Минск, Я.Купалы 42-2", "+375441125262",
                "Механический", 1, "МЕХ 201");
        static Student student8 = new Student(8, "Алексеев", "Константин", "Иванович",
                23, 7, 2001, "Минск, Первомайская 12-23", "+375441523262",
                "Физический", 3, "ФИЗ 202");
        static Student student9 = new Student(9, "Овчинников", "Алексей", "Иванович",
                17, 1, 2005, "Минск, Гоголя 12-23", "+375441523262",
                "Химический", 2, "ХИМ 223");
        static Student student10 = new Student(10, "Бобров", "Алексей", "Иванович",
                29, 9, 2002, "Минск, Ленинская 132-231", "+375441565662",
                "Механический", 4, "МЕХ 212");
        static Student student11 = new Student(11, "Зайцев", "Сергей", "Денисович",
                9, 3, 2002, "Минск, Я.Купалы 42-2", "+375441125262",
                "Механический", 2, "МЕХ 201");
        static Student student12 = new Student(12, "Курнавкин", "Константин", "Иванович",
                23, 6, 2003, "Минск, Первомайская 12-23", "+375441523262",
                "Физический", 3, "ФИЗ 202");
        static Student student13 = new Student(13, "Лукьянов", "Алексей", "Иванович",
                17, 1, 2004, "Минск, Гоголя 12-23", "+375441523262",
                "Химический", 2, "ХИМ 223");


    }


    public static void fillingForm() {
        Students.students[0] = Students.student1;
        Students.students[1] = Students.student2;
        Students.students[2] = Students.student3;
        Students.students[3] = Students.student4;
        Students.students[4] = Students.student5;
        Students.students[5] = Students.student6;
        Students.students[6] = Students.student7;
        Students.students[7] = Students.student8;
        Students.students[8] = Students.student9;
        Students.students[9] = Students.student10;
        Students.students[10] = Students.student11;
        Students.students[11] = Students.student12;
        Students.students[12] = Students.student13;
    }

    public static void chooseByFaculty() {
        System.out.println("Студенты по факультетам\nМеханический");
        for (Student s : Students.students) {
            if (s.faculty.equals("Механический")) {
                System.out.println(s.surname + " ( " + s.faculty + " ) ");
            }
        }
        System.out.println("\nФизический");
        for (Student s : Students.students) {
            if (s.faculty.equals("Физический")) {
                System.out.println(s.surname + " ( " + s.faculty + " ) ");
            }
        }
        System.out.println("\nХимический");
        for (Student s : Students.students) {
            if (s.faculty.equals("Химический")) {
                System.out.println(s.surname + " ( " + s.faculty + " ) ");
            }
        }
    }

    public static void chooseByYearOfStudy() {
        System.out.println("\nСортируем по году обучения");
        for (int i = 1; i < 6; i++) {
            for (Student s:Students.students) {
                if (s.yearOfEduc == i){
                    System.out.println("студент "+s.surname+" "+s.name+" учится "
                            +i+"-й год");
                }
            }
        }

    }
    public static void chooseByBirthYear(){
    int year = 2002;
        System.out.println("\nСтуденты родившиеся после " + year + "года");
        for (Student s:Students.students) {
            if (s.birthYear > year){
                System.out.println(s.surname + " " + s.name + " " + s.birthYear);
            }
        }
    }


    /**
     * not ready for equal elements
     */
    public static void chooseByGroup(){
        System.out.println("\nСтуденты по группам");
        for (int i = 0; i < Students.students.length; i++) {
            for (int j = i; j >=0 ; j--) {
                if (Objects.equals(Students.students[i].group,Students.students[j].group)&j==0){

                    System.out.println(Students.students[j].group + " " + Students.students[j].surname);

                }
            }

        }
        System.out.println("********************************");
        for (int i = 0; i < Students.students.length; i++) {
            for (int j = 0; j < Students.students.length; j++) {
                if (Objects.equals(Students.students[i].group, Students.students[j].group) & i!=j){
                    break;
                }else
                 {
                    if (j == Students.students.length-1) {
                        System.out.println(Students.students[i].group + " " + Students.students[i].surname);
                    }
                }
            }
        }
    }
}
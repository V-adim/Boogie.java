package LearningFromEPAM.Chapter3;

import java.util.Objects;

/**
 * 3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
 * карты, Диагноз.
 * Создать массив объектов. Вывести:
 * a) список пациентов, имеющих данный диагноз;
 * b) список пациентов, номер медицинской карты которых находится в за-
 * данном интервале.
 */
public class TaskA3 {
    public static void main(String[] args) {
        Patients.patients();
        diagnosis();
        sortByCardNumber();
    }

    static class Patient {
        private int id,  cardNumber;
        private String surname, name, patronymic, address, phone, diagnosis;

        Patient(int id, String surname, String name, String patronymic, String address, String phone,
                int cardNumber, String diagnosis ) {
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.address = address;
            this.phone = phone;
            this.cardNumber = cardNumber;
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "id=" + id  +
                    ", surname='" + surname + '\'' +
                    ", diagnosis='" + diagnosis + '\'' +
                    '}';
        }
    }
    class Patients {
        static Patient[] patients = new Patient[10];

        static Patient patient1 = new Patient(1, "Иванов", "Алексей", "Иванович","Гоголя 32",
                "35614651",5298,"насморк");
        static Patient patient2 = new Patient(2, "Петров", "Алексей", "Иванович","Гоголя 32",
                "35614651",7458,"ангина");
        static Patient patient3 = new Patient(3, "Сидоров", "Алексей", "Иванович","Гоголя 32",
                "35614651",9212,"насморк");
        static Patient patient4 = new Patient(4, "Ананич", "Алексей", "Иванович","Гоголя 32",
                "35614651",8452,"чесотка");
        static Patient patient5 = new Patient(5, "Сергеев", "Алексей", "Иванович","Гоголя 32",
                "35614651",4166,"алергия");
        static Patient patient6 = new Patient(6, "Шулов", "Алексей", "Иванович","Гоголя 32",
                "35614651",2615,"чесотка");
        static Patient patient7 = new Patient(7, "Баранов", "Алексей", "Иванович","Гоголя 32",
                "35614651",5151,"алергия");
        static Patient patient8 = new Patient(8, "Соловьев", "Алексей", "Иванович","Гоголя 32",
                "35614651",1555,"чесотка");
        static Patient patient9 = new Patient(9, "Васильев", "Алексей", "Иванович","Гоголя 32",
                "35614651",5298,"алергия");
        static Patient patient10 = new Patient(10, "Зайцев", "Алексей", "Иванович","Гоголя 32",
                "35614651",3255,"ангина");


        static void patients(){
            Patients.patients[0] = patient1;
            patients[1] = patient2;
            patients[2] = patient3;
            patients[3] = patient4;
            patients[4] = patient5;
            patients[5] = patient6;
            patients[6] = patient7;
            patients[7] = patient8;
            patients[8] = patient9;
            patients[9] = patient10;
        }


    }

    /**
     * not ready
     */
        static void diagnosis (){
            for (int i = 0; i < Patients.patients.length ; i++) {

                for (int j = 0; j < Patients.patients.length; j++) {
                    if (i <= j & Objects.equals(Patients.patients[i].diagnosis, Patients.patients[j].diagnosis)){
                        System.out.println(Patients.patients[j].diagnosis + " " + Patients.patients[j].surname);

                    }

                    if (j == 0 & Patients.patients[i].diagnosis != Patients.patients[j].diagnosis){
                        for (int k = 0; k < Patients.patients.length; k++) {


                        }
                    }

                }


            }
        }
        static void sortByCardNumber(){
            System.out.println("Patients with CardNumber less than 4000");
            for (var v:Patients.patients) {
                if (v.cardNumber < 4000) {
                    System.out.println(v.cardNumber + " " + v.surname);
                }
            }
            System.out.println("Patients with CardNumber more than 4000");
            for (var v:Patients.patients) {
                if (v.cardNumber > 4000) {
                    System.out.println(v.cardNumber + " " + v.surname);
                }
            }
        }
}



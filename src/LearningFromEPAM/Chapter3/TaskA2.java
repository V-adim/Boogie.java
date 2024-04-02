package LearningFromEPAM.Chapter3;

import java.util.Arrays;

/**
 *  Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
 * Номер банковского счета.
 * Создать массив объектов. Вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится
 * в заданном интервале.
 */
public class TaskA2 {
    public static void main(String[] args) {

        Customers.fillingForm();
        customersInAlpabetical();
        sortByAccauntNumber();

    }
     static class Customer{
        private int id, cardNumber, accountNumber;
        private String surname, name, patronymic, address;

         @Override
         public String toString() {
             return "Customer{" +
                     "id=" + id +
                     ", cardNumber=" + cardNumber +
                     ", accountNumber=" + accountNumber +
                     ", surname='" + surname + '\'' +
                     ", name='" + name + '\'' +
                     ", patronymic='" + patronymic + '\'' +
                     ", address='" + address + '\'' +
                     '}';
         }

         public int getId() {
             return id;
         }

         public void setId(int id) {
             this.id = id;
         }

         Customer(int id, String surname, String name, String patronymic, String address,
                  int cardNumber, int accountNumber){
             this.id = id;
             this.surname = surname;
             this.name = name;
             this.patronymic = patronymic;
             this.address = address;
             this.cardNumber = cardNumber;
             this.accountNumber = accountNumber;

         }

     }
    class Customers {

        public static Customer[] customers = new Customer[10];

        static Customer customer1 = new Customer(1, "Васильев", "Иван", "Петрович",
                "Шкловская 29", 616151515, 741852963);
        static Customer customer2 = new Customer(1, "Петров", "Иван", "Петрович",
                "Шкловская 29", 651600036, 741542963);
        static Customer customer3 = new Customer(1, "Смирнов", "Иван", "Петрович",
                "Шкловская 29", 251951532, 741852623);
        static Customer customer4 = new Customer(1, "Кузьмин", "Иван", "Петрович",
                "Шкловская 29", 369251147, 741856563);
        static Customer customer5 = new Customer(1, "Ефремов", "Иван", "Петрович",
                "Шкловская 29", 369251547, 741852153);
        static Customer customer6 = new Customer(1, "Грачев", "Иван", "Петрович",
                "Шкловская 29", 369156147, 741852093);
        static Customer customer7 = new Customer(1, "Гурьев", "Иван", "Петрович",
                "Шкловская 29", 315458147, 741853663);
        static Customer customer8 = new Customer(1, "Иванов", "Иван", "Петрович",
                "Шкловская 29", 369565647, 741856263);
        static Customer customer9 = new Customer(1, "Лапшин", "Иван", "Петрович",
                "Шкловская 29", 369284847, 746262963);
        static Customer customer10 = new Customer(1, "Славин", "Иван", "Петрович",
                "Шкловская 29", 369222147, 745152963);





        static void fillingForm(){
        Customers.customers[0] = Customers.customer1;
        Customers.customers[1] = Customers.customer2;
        Customers.customers[2] = Customers.customer3;
        Customers.customers[3] = Customers.customer4;
        Customers.customers[4] = Customers.customer5;
        Customers.customers[5] = Customers.customer6;
        Customers.customers[6] = Customers.customer7;
        Customers.customers[7] = Customers.customer8;
        Customers.customers[8] = Customers.customer9;
        Customers.customers[9] = Customers.customer10;
        }

    }
static void customersInAlpabetical(){
    System.out.println("Customers in alphabetical order");
        String[] surnames = new String[Customers.customers.length];
    for (int i = 0; i < Customers.customers.length; i++) {
        surnames[i] = Customers.customers[i].surname;
    }
    Arrays.sort(surnames);
    for (var v:surnames) {
        System.out.println(v);
    }
}
static void sortByAccauntNumber(){
    System.out.println("\nCredit card number less than 500000000");
    for (var v:Customers.customers) {
        if (v.cardNumber<500000000){
            System.out.println(v.toString());
        }
    }
    System.out.println("\nCredit card number more than 500000000");
    for (var v:Customers.customers) {
        if (v.cardNumber>500000000){
            System.out.println(v.toString());
        }
    }
}


}

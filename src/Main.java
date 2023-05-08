public class Main {
    public static void main(String[] args) {
       /* БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.
   ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ КЫЛЫП  ТУЗОСУЗДОР.
       АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.
   АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА МЕТОДТОРУ БАР СУРОТТОГУДОЙ.
   КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
   МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
   КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.*/

   Programmer programmer = new Programmer("Robert","Java developer","GigTech");
   Dancer dancer = new Dancer("Kamila","Tango dancer","Passion");
   Singer singer = new Singer("Maks","Rock singer","Metallica");
        System.out.println(programmer);
        programmer.walk();
        programmer.eat();
        programmer.learn();
        programmer.coding();
        System.out.println("============================================================================");
        System.out.println(dancer);
        dancer.walk();
        dancer.eat();
        dancer.learn();
        dancer.dancing();
        System.out.println("=============================================================================");
        System.out.println(singer);
        singer.walk();
        singer.eat();
        singer.learn();
        singer.playGuitar();















    }
}
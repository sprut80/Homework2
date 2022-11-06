public class javaclass {
    public static void main(String[] args) {

        //First level: Level1: Астерикс и Обеликс варили зелье.
        //Зелье будет сварено правильно, если его будут варить больше 5 часов.
        // Астерикс варил его 3 часа, Обеликс в два раза меньше.
        // Получится ли у них сварить зелье? true - если получится, иначе false

        int astrics = 3;
        double obelics = 1.5;
        boolean goodPotion = (astrics + obelics > 5);
        System.out.println(goodPotion);

        //Level2: Вводится число. Если оно четное, то выведите true, иначе false

        short number = 10;
        short evenNumber = 10;
        boolean somethingNumber = (number == evenNumber );
        System.out.println(somethingNumber);



    }
}

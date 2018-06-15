package OOP.Lesson1.Four;
/*
Created by matua on 15.06.2018 at 11:16
*/

public class PhoneTester {
    public static void main(String[] args) {
        Network network = new Network();
        Phone phoneOne = new Phone(79256859403L, network);
        Phone phoneTwo = new Phone(79252839400L, network);
        Phone phoneThree = new Phone(79253847584L, network);
        Phone phoneFour = new Phone(79254839485L, network);

        phoneOne.call(phoneTwo);
        System.out.println();
        phoneTwo.call(phoneThree);
        System.out.println();
        phoneThree.call(phoneFour);
        System.out.println();
        phoneFour.call(phoneOne);
        System.out.println();
        phoneTwo.call(new Phone(79823748594L, network));

    }
}

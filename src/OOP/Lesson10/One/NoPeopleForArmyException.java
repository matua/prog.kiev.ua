package OOP.Lesson10.One;
/*
Created by matua on 23.06.2018 at 17:30
*/

public class NoPeopleForArmyException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("There are no people for the army training):");
    }
}

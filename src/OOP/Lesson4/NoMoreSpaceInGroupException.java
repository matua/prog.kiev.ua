package OOP.Lesson4;
/*
Created by matua on 16.06.2018 at 16:19
*/

    public class NoMoreSpaceInGroupException extends Exception {
    @Override
    public void printStackTrace() {
        System.err.println("Sorry! But the group is full!");
    }
}

package OOP.Lesson8.TwoThree;
/*
Created by matua on 10.08.2018 at 19:23
*/


public class StackTester {
    public static void main(String[] args) {
        StackContainerClass scc = new StackContainerClass();

        //Adding three objects to the stack
        scc.addObject(new Integer(5));
        scc.addObject(new Double(5));
        scc.addObject(new StackTester());

        //Getting and deleting three objects from the stack
        scc.getAndDeleteObject();
        scc.getAndDeleteObject();
        scc.getAndDeleteObject();

        //Throwing exceptions
        //System.out.println(scc.getObject());
        //System.out.println(scc.getAndDeleteObject());

        //Creating blacklist and adding String and SomeClass1 to the list
        BlackList blackList = new BlackList();
        blackList.addObjectClass("String");
        blackList.addObjectClass(new SomeClass1());

        //Setting the blacklist on the object of stack class (scc)
        scc.setBlackList(blackList);

        System.out.println("\nStack is now " + scc.getStack().length + " elements long\n");//after deleting all the elements in stack the length is ZERO

        scc.addObject("Hello"); //trying to add an element from a blacklist class

        System.out.println("\nStack is now " + scc.getStack().length + " elements long\n"); //As we see there was nothing added because "Hello" belongs to class String which is in the blacklist. The length remains the same

        System.out.println("Adding Object and SomeClass1 to the stack\n_________\n");
        scc.addObject(new Object());
        scc.addObject(new SomeClass1());

        System.out.println("\nStack is now " + scc.getStack().length + " elements long\n");
    }
}

class SomeClass1 {

}
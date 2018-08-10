package OOP.Lesson8.TwoThree;
/*
Created by matua on 10.08.2018 at 20:50
*/

import java.util.Arrays;

public class StackContainerClass {
    private Object[] stack;
    private BlackList blackList;

    public StackContainerClass(BlackList blackList) {
        stack = new Object[0];
        this.blackList = blackList;
    }

    public StackContainerClass() {
        stack = new Object[0];
    }

    public void setBlackList(BlackList blackList) {
        this.blackList = blackList;
    }

    public Object[] getStack() {
        return stack;
    }

    public BlackList getBlackList() {
        return blackList;
    }

    public void addObject(Object objectToAdd) {
        System.out.println("Trying to add...");
        boolean notInBlackList = true;

        if (blackList == null) {
            stack = Arrays.copyOfRange(stack, 0, stack.length + 1);
            stack[stack.length - 1] = objectToAdd;
            System.out.printf("Added object of class %s to the stack.\n", objectToAdd.getClass().getName());
        } else {
            for (Object prohibited : blackList.getProhibitedList()) {
                if (objectToAdd.getClass().equals(prohibited.getClass())) {
                    System.out.printf("Object of class %s is prohibited to add to this stack\n", objectToAdd.getClass().getName());
                    notInBlackList = false;
                    break;
                }
            }
            if (notInBlackList) {
                stack = Arrays.copyOfRange(stack, 0, stack.length + 1);
                stack[stack.length - 1] = objectToAdd;
                System.out.printf("Added object of class %s to the stack.\n", objectToAdd.getClass().getName());
            }
        }
    }

    public Object getObject() {
        if ((stack.length) == 0) {
            throw new NoElementsException();
        } else {
            return stack[stack.length - 1];
        }
    }

    public Object getAndDeleteObject() {
        if ((stack.length) == 0) {
            throw new NoElementsException();
        } else {
            Object temp = stack[stack.length - 1];
            stack = Arrays.copyOfRange(stack, 0, stack.length - 1);
            System.out.printf("Deleted object of class %s from the stack.\n", temp.getClass().getName());
            return temp;
        }
    }

    @Override
    public String toString() {
        String[] objects = new String[stack.length];

        for (int i = 0; i < objects.length; i++) {
            objects[i] = stack[i].getClass().getName();
        }
        return Arrays.toString(objects);
    }
}

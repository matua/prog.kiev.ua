package OOP.Lesson8.TwoThree;
/*
Created by matua on 10.08.2018 at 19:11
*/

import java.util.Arrays;

public class BlackList {
    private Object[] prohibitedList;

    public BlackList() {
        prohibitedList = new Object[0];
    }

    public Object[] getProhibitedList() {
        return prohibitedList;
    }

    public Object[] addObjectClass(Object classToAdd) {
        prohibitedList = Arrays.copyOfRange(prohibitedList, 0, prohibitedList.length + 1);
        prohibitedList[prohibitedList.length - 1] = classToAdd;
        return prohibitedList;
    }

    public boolean isInBlackList(String someClass) {
        boolean result = false;
        for (Object cl : prohibitedList) {
            if (someClass.equals(cl)) {
                result = true;
            }
        }
        return result;
    }
}

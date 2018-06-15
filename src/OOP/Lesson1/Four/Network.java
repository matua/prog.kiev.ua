package OOP.Lesson1.Four;
/*
Created by matua on 15.06.2018 at 8:44
*/

public class Network {
    private final String name = "Telecom";

    private long [] registeredNumbers = {79253748594L, 79253849273L,79252839483L, 79252839400L, 79253847584L, 79253847382940L, 79253842894L};

    public boolean register(Phone phone) {
        if (codeDetector(phone) == 925){
            if (checkNumberRegistration(phone)) {
                System.out.format("%s is registered on %s network. ", phone.getNumber(), name);
            } else {
                System.out.format("%s is NOT registered on %s network. ", phone.getNumber(), name);
                return false;
            }
            return true;
        } else {
            System.out.format("%s cannot be registered on %s network. ", phone.getNumber(), name);
            return false;
        }
    }

    private final int codeDetector(Phone phone) {
        int code = (int) (phone.getNumber() / 10_000_000);
        code %= 1000;
        return code;
    }

    public boolean checkNumberRegistration(Phone phone) {
        boolean isRegistered = false;
        for (long number : registeredNumbers) {
            if (number == phone.getNumber()) {
                isRegistered = true;
            }
        }
        return isRegistered;
    }
}

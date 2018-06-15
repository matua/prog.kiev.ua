package OOP.Lesson1.Four;
/*
Created by matua on 15.06.2018 at 8:43
*/

public class Phone {
    private long number;
    private Network network;

    public Phone(long number, Network network) {
        this.number = number;
        this.network = network;
    }

    public long getNumber() {
        return number;
    }

    public boolean registerOnNetwork() {
        if (network.register(this)) {
            return true;
        } else {
            return false;
        }
    }

    public void call(Phone phone) {
        if (registerOnNetwork()) {
            if (network.checkNumberRegistration(phone)) {
                System.out.format("Dialing %s. ", phone.number);
            } else {
                System.out.format("The number %s is not on the network. ", phone.number);
            }
        }
    }
}
package JavaPro.Lesson_2.Three;
/*
Created by matua on 02.09.2018 at 20:17
*/

public class Currency {
    private String valuteID;
    private int numCode;
    private String charCode;
    private int nominal;
    private String name;
    private double value;

    public Currency() {
    }

    public Currency(String valuteID, int numCode, String charCode, int nominal, String name, double value) {
        this.valuteID = valuteID;
        this.numCode = numCode;
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
    }

    public String getValuteID() {
        return valuteID;
    }

    public void setValuteID(String valuteID) {
        this.valuteID = valuteID;
    }

    public int getNumCode() {
        return numCode;
    }

    public void setNumCode(int numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return nominal + " " + name + " = " + value + " Russian Roubles\n" +
                "\tNumber Code: " + numCode + "\n" +
                "\tCharacter Code: '" + charCode + '\'' + "\n" +
                "\tName: " + valuteID + '\'' + "\n";
    }
}

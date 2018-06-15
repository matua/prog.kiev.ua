package OOP.Lesson1.One;
/*
Created by matua on 14.06.2018 at 20:31
*/

public class Cat {
    private String name;
    private String breed;
    private int weight;
    private int age;
    private int impudenceLevel;

    public Cat(String name, String breed, int weight, int age, int impudenceLevel) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
        checkImpudence(impudenceLevel);
        System.out.format("A cat named %s is created.\n", name);
    }

    public Cat() {
    }

    private final void checkImpudence(int impudenceLevel) {
        if (impudenceLevel < 1) {
            this.impudenceLevel = 1;
        } else if (impudenceLevel > 5) {
            this.impudenceLevel = 5;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImpudenceLevel() {
        return impudenceLevel;
    }

    public void setImpudenceLevel(int impudenceLevel) {
        this.impudenceLevel = impudenceLevel;
    }

    public void meow() {
        System.out.format("%s is mewoing. ", name);
    }

    public void fakeEatAnotherCat(Cat cat) {
        System.out.println(this.getName() + " ate " + cat.getName() + ". ");
        cat = null; //Nothing happens as we only set the argument reference to Cat object as null, not the object itself
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", impudenceLevel=" + impudenceLevel +
                '}';
    }
}

class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Micky", "Ragdoll", 5, 3, 0);
        System.out.println(cat);
        cat.meow();

        Cat anotherCat = new Cat("Vasya", "Bengal", 2, 1, 5);
        anotherCat.meow();

        cat.fakeEatAnotherCat(anotherCat);
        anotherCat.meow();
    }
}

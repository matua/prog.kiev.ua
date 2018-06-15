package OOP.Lesson1.Three;
/*
Created by matua on 15.06.2018 at 12:35
*/

public class Vector3dTester {
    public static void main(String[] args) {
        Vector3d vector3dOne = new Vector3d(-5, 3, 5);
        Vector3d vector3dTwo = new Vector3d(0, 2, -4);

        System.out.println("Сложение двух векторов = " + vector3dOne.add(vector3dTwo));

        System.out.println("Векторное произведение двух векторов = " + vector3dOne.multiplyVector(vector3dTwo));

        System.out.println("Скалярное произведение двух векторов = " + vector3dTwo.multiplyScalar(vector3dTwo));
    }
}


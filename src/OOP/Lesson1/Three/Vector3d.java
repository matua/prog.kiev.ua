package OOP.Lesson1.Three;
/*
Created by matua on 14.06.2018 at 21:40
*/

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector3d add(Vector3d anotherVector) {
        return new Vector3d(this.x + anotherVector.x, this.y + anotherVector.y, this.z + anotherVector.z);
    }

    public double multiplyScalar(Vector3d anotherVector) {
        return this.x * anotherVector.x + this.y * anotherVector.y + this.y * anotherVector.y;
    }

    public Vector3d multiplyVector(Vector3d anotherVector) {
        return new Vector3d((this.y * anotherVector.z) - (this.z * anotherVector.y), (this.z * anotherVector.x) - (this.x * anotherVector.z), (this.x * anotherVector.y) - (this.y * anotherVector.x));
    }
}

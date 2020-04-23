package triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4, 8, 6);

        System.out.println("Czy z podanych trzech długości " +
                "odcinków AB,BC,AC można zbudować trójkąt? " + triangle1.triangleABC());
    }
}

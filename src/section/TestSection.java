package section;

public class TestSection {
    public static void main(String[] args) {
        Section sectionAB = new Section(1,2,4,5);

        System.out.println("Długość odcinka z punktu A do punkyu B wynosi: "
        +sectionAB.section()+ " jednostki");
    }
}

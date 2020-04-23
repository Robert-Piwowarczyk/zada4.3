package section;

import static java.lang.StrictMath.sqrt;

public class Section {
    private int a1;
    private int a2;
    private int b1;
    private int b2;
    private int A = (b1 - a1);
    private int B = (b2 - a2);

    public Section(int x1, int x2, int y1, int y2) {
        this.a1 = x1;
        this.a2 = x2;
        this.b1 = y1;
        this.b2 = y2;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int section() {
        int sectionAxBy = (int) sqrt((b1 - a1) * (b1 - a1)
                + (b2 - a2) * (b2 - a2));
        return sectionAxBy;
    }
}


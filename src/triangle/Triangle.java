package triangle;

import static java.lang.StrictMath.sqrt;

public class Triangle {
    int ab;
    int bc;
    int ac;

    public Triangle(int ab, int bc, int ac) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public int getBc() {
        return bc;
    }

    public void setBc(int bc) {
        this.bc = bc;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int section() {
        int sectionAB = ab;
        return sectionAB;
    }

    public boolean triangleABC() {
        if (ab < bc + ac && bc < ac + ab && ac < ab + ac) {
            return true;
        } else {
            return false;
        }
    }
}

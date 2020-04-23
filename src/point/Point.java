package point;

public class Point {
    private int a;
    private int b;

    public Point(int x, int y) {
        a = x;
        b = y;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean setCheckI() {
        if (a < 0 && b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setCheckII() {
        if (a > 0 && b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setCheckIII() {
        if (a > 0 && b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setCheckIV() {
        if (a < 0 && b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnAxisX() {
        if (a < 0 || a > 0 && b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnBxisY() {
        if (b < 0 || b > 0 && a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnAOrBisCenter() {
        if (a == 0 && b == 0) {
            return true;
        } else {
            return false;
        }
    }
}







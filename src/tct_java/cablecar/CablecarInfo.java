package tct_java.cablecar;

public class CablecarInfo {

    private int start;
    private int end;

    public CablecarInfo(int start, int end) {
        super();
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    public String toString() {
        return "(" + start + ", " + end + ")";
    }
    public boolean equals(Object obj) {
        return (getStart() == ((CablecarInfo)obj).getStart())
                && (getEnd() == ((CablecarInfo)obj).getEnd());
    }
}

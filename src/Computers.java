public class Computers {
    private String os;
    private int ssd;

    public Computers(String os, int ssd){
        this.os = os;
        this.ssd = ssd;
    }
    public Computers(){

    }

    public String getOs() {
        return os;
    }

    public int getSsd() {
        return ssd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Computers)) return false;
        Computers hp = (Computers) o;
        return ssd == hp.ssd;
        // оставил только ssd(т.к. так требовалось в задании), хочу по нему делать сравнение, но если return ssd == hp.ssd || os.equals(hp.os); вот так прописать,
        // тогда он будет считать их одинаковыми, при хотя бы одном из двух положительных сравнении. Суть я уловил)
    }

    @Override
    public String toString() {
        return "Computers: " +
                "os = '" + os + '\'' +
                ", ssd = " + ssd;
// Пожеланию чуть переписал, так как фигурные скобки тут не красиво смотрятся и пробелов не хватало мне)))
    }
}

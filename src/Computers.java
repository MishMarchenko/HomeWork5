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
}

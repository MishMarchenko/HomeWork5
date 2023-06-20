
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OOP");
        Computers hp = new Computers("Windows10", 256);
        Computers macos = new Computers();

        macos.setOs("Ventura 13.2");
        macos.setSsd(256);

        System.out.println(macos.getOs());
        System.out.println(macos.getSsd());
        }
    }

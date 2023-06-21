
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OOP");
        Computers hp = new Computers("Windows10", 256);
        Computers hpPro = new Computers("Windows10", 256);
        Computers macos = new Computers();

        macos.setOs("Ventura13.2");
        macos.setSsd(256);
        System.out.println(macos);
        System.out.println(hp);
        System.out.println(hpPro);


        System.out.println(hp == macos);
        System.out.println(hp.equals(macos));
        }
    }

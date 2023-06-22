public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OOP");
        Computers hp = new Computers("Windows10", 256);
        Computers hpPro = new Computers("Windows10", 256);
        Computers macos = new Computers();

        macos.setOs("Ventura13.2");
        macos.setSsd(256);

        System.out.println(macos.getOs() + " " + macos.getSsd());
        System.out.println(hp.getOs() + " " + hp.getSsd());
        System.out.println(hpPro.getOs() + " " + hpPro.getSsd());

        System.out.println(hp);
        System.out.println(hpPro);
        System.out.println(macos);

//      Они сравниваються по ssd соответственно выдает тру, так как ssd одинаковые, а os он не сравнивает
        System.out.println(hp.equals(macos));
        }
    }

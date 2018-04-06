package praktek03;
public class TeleponAksi {
    public static void main(String[] args) {
        Telepon s = new Telepon();
        
        s.setMerk("Panasonic");
        s.setWarna("Hitam");
        s.setHarga(500000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}

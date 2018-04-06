package praktek03;
public class TeleponAksi {
    public static void main(String[] args) {
        Telepon s = new Telepon();
        
        s.setMerk("Panasonic");
        s.setWarna("Hitam");
        s.setHarga(500000);
        //gak bisa s.setJenisHandphone();
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        Handphone sh = new Handphone();
        sh.setMerk("Samsung");
        sh.setWarna("Putih");
        sh.setHarga(200000);
        sh.setJenisHandphone("Touchscreen");
        sh.cetakInfo();
        System.out.println("Jenis \t:"+sh.getJenisHandphone());
        sh.throttle();
    }
}

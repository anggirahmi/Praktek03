package praktek03;

public class Handphone extends Telepon{
    private String jenisHandphone;
    
    void throttle(){
        System.out.println("Taktaktak.....");
    }

    public String getJenisHandphone() {
        return jenisHandphone;
    }

    public void setJenisHandphone(String jenisHandphone) {
        this.jenisHandphone = jenisHandphone;
    }
    
    
}

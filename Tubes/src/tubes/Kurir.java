
package tubes;


public class Kurir extends Pesanan{
    private String idKurir, namaKurir;
    
    public Kurir(String idKurir, String namaKurir, String id, String asal, String tujuan){
        super(id, asal, tujuan);
        this.idKurir = idKurir;
        this.namaKurir = namaKurir;
    }

    public String getNamaKurir() {
        return namaKurir;
    }

    public void setNamaKurir(String namaKurir) {
        this.namaKurir = namaKurir;
    }

    public String getIdKurir() {
        return idKurir;
    }

    public void setIdKurir(String idKurir) {
        this.idKurir = idKurir;
    }
    
    
    
}

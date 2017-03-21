package tubes;

public class Pesanan {

    private String id, asal, tujuan;
    private String tglPesanan;
    
    public Pesanan(String id, String asal, String tujuan){
        this.id = id;
        this.asal = asal;
        this.tujuan = tujuan;
    }
    

    public String getAsal() {
        return asal;
    }

    public void setAsal(String Asal) {
        this.asal = Asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.tujuan = Tujuan;
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }
    
    
}
    

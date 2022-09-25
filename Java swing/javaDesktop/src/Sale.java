public class Sale {

    private int id;
    private String zno;
    private String fisno;
    private String tarih;
    private String toplam;
    private String kdv;

    private String sifirOran;
    private String sifirTutar;
    private String sifirKdv;

    private String birOran;
    private String birTutar;
    private String birKdv;

    private String sekizOran;
    private String sekizTutar;
    private String sekizKdv;

    private String onsekizOran;
    private String onsekizTutar;
    private String onsekizKdv;

    public Sale(int id, String zno, String fisno, String tarih, String toplam, String kdv, String sifirOran, String sifirTutar, String sifirKdv, String birOran, String birTutar, String birKdv, String sekizOran, String sekizTutar, String sekizKdv, String onsekizOran, String onsekizTutar, String onsekizKdv) {
        this.id = id;
        this.zno = zno;
        this.fisno = fisno;
        this.tarih = tarih;
        this.toplam = toplam;
        this.kdv = kdv;
        this.sifirOran = sifirOran;
        this.sifirTutar = sifirTutar;
        this.sifirKdv = sifirKdv;
        this.birOran = birOran;
        this.birTutar = birTutar;
        this.birKdv = birKdv;
        this.sekizOran = sekizOran;
        this.sekizTutar = sekizTutar;
        this.sekizKdv = sekizKdv;
        this.onsekizOran = onsekizOran;
        this.onsekizTutar = onsekizTutar;
        this.onsekizKdv = onsekizKdv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZno() {
        return zno;
    }

    public void setZno(String zno) {
        this.zno = zno;
    }

    public String getFisno() {
        return fisno;
    }

    public void setFisno(String fisno) {
        this.fisno = fisno;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getToplam() {
        return toplam;
    }

    public void setToplam(String toplam) {
        this.toplam = toplam;
    }

    public String getKdv() {
        return kdv;
    }

    public void setKdv(String kdv) {
        this.kdv = kdv;
    }

    public String getSifirOran() {
        return sifirOran;
    }

    public void setSifirOran(String sifirOran) {
        this.sifirOran = sifirOran;
    }

    public String getSifirTutar() {
        return sifirTutar;
    }

    public void setSifirTutar(String sifirTutar) {
        this.sifirTutar = sifirTutar;
    }

    public String getSifirKdv() {
        return sifirKdv;
    }

    public void setSifirKdv(String sifirKdv) {
        this.sifirKdv = sifirKdv;
    }

    public String getBirOran() {
        return birOran;
    }

    public void setBirOran(String birOran) {
        this.birOran = birOran;
    }

    public String getBirTutar() {
        return birTutar;
    }

    public void setBirTutar(String birTutar) {
        this.birTutar = birTutar;
    }

    public String getBirKdv() {
        return birKdv;
    }

    public void setBirKdv(String birKdv) {
        this.birKdv = birKdv;
    }

    public String getSekizOran() {
        return sekizOran;
    }

    public void setSekizOran(String sekizOran) {
        this.sekizOran = sekizOran;
    }

    public String getSekizTutar() {
        return sekizTutar;
    }

    public void setSekizTutar(String sekizTutar) {
        this.sekizTutar = sekizTutar;
    }

    public String getSekizKdv() {
        return sekizKdv;
    }

    public void setSekizKdv(String sekizKdv) {
        this.sekizKdv = sekizKdv;
    }

    public String getOnsekizOran() {
        return onsekizOran;
    }

    public void setOnsekizOran(String onsekizOran) {
        this.onsekizOran = onsekizOran;
    }

    public String getOnsekizTutar() {
        return onsekizTutar;
    }

    public void setOnsekizTutar(String onsekizTutar) {
        this.onsekizTutar = onsekizTutar;
    }

    public String getOnsekizKdv() {
        return onsekizKdv;
    }

    public void setOnsekizKdv(String onsekizKdv) {
        this.onsekizKdv = onsekizKdv;
    }
}


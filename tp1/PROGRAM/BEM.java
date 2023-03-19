import java.util.ArrayList;

class BEM extends Mahasiswa {
    private String posisi;
    private ArrayList<String> proker;
    private ArrayList<String> inovasi;
    private boolean sudahSelesai;

    BEM(){}
    BEM(String NIK, String NIM, String nama, String jenis_kelamin,  String asal_universitas,String fakultas, String prodi,String email_edu, String laptop, String posisi) {
      // set atribut dari Human
      this.setNIK(NIK);
      this.setNama(nama);
      this.setJenkal(jenis_kelamin);

      // set atribut dari SivitasAkademik
      this.setAsalUniversitas(asal_universitas);
      this.setEmailEdu(email_edu);

      // set atribut dari Mahasiswa
      this.setNIM(NIM);
      this.setFakultas(fakultas);
      this.setProdi(prodi);
      this.setLaptop(laptop);

      this.posisi = posisi;
      this.proker = new ArrayList<String>();
      this.inovasi = new ArrayList<String>();
      this.sudahSelesai = false;
    }

    public String getPosisi(){
        return this.posisi;
    }

    public ArrayList<String> getProker(){
        return this.proker;
    }

    public ArrayList<String> getInovasi(){
        return this.inovasi;
    }

    public boolean getSudahSelesai()
    {
        return this.sudahSelesai;
    }

    public void setPosisi(String posisi){
        this.posisi = posisi;
    }

    public void setProker(ArrayList<String> proker){
        this.proker = proker;
    }

    public void setInovasi(ArrayList<String> inovasi){
        this.inovasi = inovasi;
    }

    public void setSudahSelesai(boolean sudahSelesai)
    {
        this.sudahSelesai = sudahSelesai;
    }

    public void jalankanProker(String namaProker)
    {
        System.out.println(this.getNama() + " sudah menjalakan proker " + namaProker);
        for (int i = 0; i < this.proker.size(); i++) {
            if (this.proker.get(i) == namaProker) {
                this.proker.remove(i);
            }
        }
        this.sudahSelesai = true;
    }
}
import java.util.ArrayList;

class DPM extends Mahasiswa {
    private String posisi;
    DPM(){}
    DPM(String NIK, String NIM, String nama, String jenis_kelamin,  String asal_universitas,String fakultas, String prodi,String email_edu, String laptop, String posisi) {
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
    }

    public String getPosisi(){
        return this.posisi;
    }

    public void setPosisi(String posisi){
        this.posisi = posisi;
    }

    public void apresiasi(BEM bem, String namaProker)
    {
        if (bem.getSudahSelesai() == true)
        {
            System.out.println(this.getNama() + " : \"Saya mengapresiasi pekerjaan " + bem.getNama() + " dalam proker " + namaProker + "\"");
            bem.setSudahSelesai(false);
        }
        else
        {
            System.out.println("Belum dapat mengapresiasi karena " + bem.getNama() + " belum selesai menjalakan proker " + namaProker);
        }
    }
}
import java.util.ArrayList;

class Mahasiswa extends SivitasAkademik {
    // private atribut untuk kelas Mahasiswa
  private String NIM;
  private String fakultas;
  private String prodi;
  
  private String laptop;
  Mahasiswa(){}
  Mahasiswa(String NIK, String NIM, String nama, String jenis_kelamin,  String asal_universitas,String fakultas, String prodi,String email_edu, String laptop) 
  {
      // set atribut dari Mahasiswa
      this.setNIK(NIK);
      this.setNama(nama);
      this.setJenkal(jenis_kelamin);

      // set atribut dari SivitasAkademik
      this.setAsalUniversitas(asal_universitas);
      this.setEmailEdu(email_edu);

      // set atribut dari Mahasiswa
      this.NIM = NIM;
      this.fakultas = fakultas;
      this.prodi = prodi;
     
      this.laptop = laptop;
  }
  public void setNIM(String b) // method UNTUK SET NIM
  {
      this.NIM = b;
  }
  public void setProdi(String c) // method UNTUK SET PRODI
  {
      this.prodi = c;
  }
  public void setFakultas(String d)// method UNTUK SET FAKULTAS
  {
      this.fakultas = d;
  }
 
  public void setLaptop(String f)
  {
    this.laptop = f;
  }
  public String getNIM() {//method untuk getnim
      return NIM;
  }
  public String getFakultas() {//method untuk get fakultas
      return fakultas;
  }

  public String getProdi() {//method untuk get prodi
      return prodi;
  } 
 
  public String getLaptop() {//method untuk get
    return laptop;
    }
    public void belajar(String materi) {
        System.out.println(this.getNama() + " sudah mempelajari " + materi);
        System.out.println("Sekarang " + this.getNama() + " merasa lebih pintar");
    }
    public void datang_ke_kelas(String namaKelas) {
        System.out.println(this.getNama() + " masuk ke kelas " + namaKelas);
    }
    public void kerjakan_tugas(String tugas) {
        System.out.println(this.getNama() + " telah selesai mengerjakan tugas " + tugas);
    }
}
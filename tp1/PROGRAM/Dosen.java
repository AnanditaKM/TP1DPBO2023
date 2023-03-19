import java.util.ArrayList;

class Dosen extends SivitasAkademik {
    // private atribut untuk kelas Dosen
  private String NIP;
  private String fakultas;
  private String prodi;
  private ArrayList<String> marker;
  private String laptop;
  Dosen(){}
  Dosen(String NIK, String NIP, String nama, String jenis_kelamin,  String asal_universitas,String fakultas, String prodi,String email_edu, String laptop) 
  {
      // set atribut dari Dosen
      this.setNIK(NIK);
      this.setNama(nama);
      this.setJenkal(jenis_kelamin);

      // set atribut dari SivitasAkademik
      this.setAsalUniversitas(asal_universitas);
      this.setEmailEdu(email_edu);

      // set atribut dari Dosen
      this.NIP = NIP;
      this.fakultas = fakultas;
      this.prodi = prodi;
      this.marker = new ArrayList<String>();
      this.laptop = laptop;
  }
  public void setNIP(String b) // method UNTUK SET NIP
  {
      this.NIP = b;
  }
  public void setProdi(String c) // method UNTUK SET PRODI
  {
      this.prodi = c;
  }
  public void setFakultas(String d)// method UNTUK SET FAKULTAS
  {
      this.fakultas = d;
  }
  public void setMarker(ArrayList<String> e)
  {
    this.marker = e;
  }
  public void setLaptop(String f)
  {
    this.laptop = f;
  }
  public String getNIP() {//method untuk getNIP
      return NIP;
  }
  public String getFakultas() {//method untuk get fakultas
      return fakultas;
  }

  public String getProdi() {//method untuk get prodi
      return prodi;
  } 
  public ArrayList<String> getMarker() {//method untuk get marker
        return marker;
  }
  public String getLaptop() {//method untuk get
    return laptop;
    }
    public void beriNilai(Asprak a, String namaTugas) {
        if (this.getJenkal() == "Perempuan") {
            System.out.print("Ibu ");
        }
        else if (this.getJenkal() == "Laki-laki") {
            System.out.print("Bapak ");
        }

        if (a.getSudahMemberiTugas() == true) {
            System.out.println(this.getNama() + " telah memberi nilai pada semua mahasiswa yang mengerjakan tugas " + namaTugas);
        }
        else
        {
            System.out.println(this.getNama() + " belum dapat memberi nilai karena asprak belum memberikan tugas " + namaTugas);
        }
    }
}
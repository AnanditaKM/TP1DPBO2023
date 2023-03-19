import java.util.ArrayList;

class Asprak extends Mahasiswa {
    private String nip_dosen;
    boolean sudahMemberiTugas;
    Asprak(){}
    Asprak(String NIK, String NIM, String nama, String jenis_kelamin,  String asal_universitas,String fakultas, String prodi,String email_edu, String laptop, String nip_dosen) {
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
  
        this.nip_dosen = nip_dosen;
        this.sudahMemberiTugas = false;
      }

    public String getNIP_dosen() {
        return this.nip_dosen;
    }

    public void setNIP_dosen(String nip_dosen) {
        this.nip_dosen = nip_dosen;
    }

    public boolean getSudahMemberiTugas() {
        return this.sudahMemberiTugas;
    }

    public void setSudahMemberiTugas(boolean sudahMemberiTugas) {
        this.sudahMemberiTugas = sudahMemberiTugas;
    }

    public void beriTugas(String namaTugas) {
        System.out.println(this.getNama() + " memberi tugas " + namaTugas);
        this.sudahMemberiTugas = true;
    }
}
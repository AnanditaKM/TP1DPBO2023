/*Saya Anandita K NIM 2101114 mengerjakan soal TP 1 dalam mata kulia
h Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
//import library
import java.util.ArrayList;

// main class
class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================================");
        System.out.println("DATA DOSEN");
        System.out.println("==================================================");
    
        ArrayList<Dosen> listDosen = new ArrayList<Dosen>();

        Dosen dsn1 = new Dosen("000001", "1234567", "Bu Rosa", "P", "UPI", "FPMIPA", "IlKom", "rosa@upi.edu", "acer");
        listDosen.add(dsn1);
        Dosen dsn2 = new Dosen("000002", "2345678", "Pak Away", "L", "UPI", "KamdaCibiru", "RPL", "away@upi.edu", "lenovo");
        listDosen.add(dsn2);
        Dosen dsn3 = new Dosen("000003", "3456789", "PROF MUNIR", "L", "UPI", "FPMIPA", "IlKom", "MINIR@upi.edu", "asus");
        listDosen.add(dsn3);

        for (int i = 0; i < listDosen.size(); i++)
        {
            System.out.println();
            System.out.println("Data Dosen ke-"+Integer.toString(i+1));
            System.out.println("NIK                 : " + listDosen.get(i).getNIK());
            System.out.println("NIP                 : " + listDosen.get(i).getNIP());
            System.out.println("Nama                : " + listDosen.get(i).getNama());
            System.out.println("Jenis Kelamin       : " + listDosen.get(i).getJenkal()); 
            System.out.println("Asal Universitas    : " + listDosen.get(i).getAsalUniversitas());
            System.out.println("Fakultas            : " + listDosen.get(i).getFakultas());
            System.out.println("Program Studi       : " + listDosen.get(i).getProdi());
            System.out.println("Email Edu           : " + listDosen.get(i).getEmailEdu());
            System.out.println("Laptop              : " + listDosen.get(i).getLaptop());

        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("DATA MAHASISWA BIASA");
        System.out.println("==================================================");
        //membuat list
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        //objek instantion menggunakan paramater yang ada di CONSTRUCTOR dan dimasukan kedalaam listMahasiswa
        Mahasiswa mhs1=new Mahasiswa("000004","2101114","ANIN","P","UPI","FPMIPA","ILKOM","anin@upi.edu", "lenovo");
        listMahasiswa.add(mhs1);
        Mahasiswa mhs2=new Mahasiswa("000005","2101115","AFRI","L","UPI","FPMIPA","ILKOM","afri@upi.edu", "asus");
        listMahasiswa.add(mhs2);
        Mahasiswa mhs3=new Mahasiswa("000006","2101116","MIDA","P","UPI","FPMIPA","ILKOM","MIDA@upi.edu", "hp");
        listMahasiswa.add(mhs3);

        //menampilkan data dalam listMahasiswa
        for (int i = 0; i < listMahasiswa.size(); i++)
        {
            System.out.println();
            System.out.println("Data Mahasiswa ke-"+Integer.toString(i+1));
            System.out.println("NIK                 : " + listMahasiswa.get(i).getNIK());
            System.out.println("NIM                 : " + listMahasiswa.get(i).getNIM());
            System.out.println("Nama                : " + listMahasiswa.get(i).getNama());
            System.out.println("Jenis Kelamin       : " + listMahasiswa.get(i).getJenkal()); 
            System.out.println("Asal Universitas    : " + listMahasiswa.get(i).getAsalUniversitas());
            System.out.println("Fakultas            : " + listMahasiswa.get(i).getFakultas());
            System.out.println("Program Studi       : " + listMahasiswa.get(i).getProdi());
            System.out.println("Email Edu           : " + listMahasiswa.get(i).getEmailEdu());
            System.out.println("Laptop              : " + listMahasiswa.get(i).getLaptop());
        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("DATA ASPRAK");
        System.out.println("==================================================");
    //membuat list
        ArrayList<Asprak> listAsprak = new ArrayList<>();
        //objek instantion menggunakan paramater yang ada di CONSTRUCTOR dan dimasukan kedalaam listAsprak
        Asprak asp1=new Asprak("000007","2101117","NAJMI","P","UPI","FPMIPA","ILKOM","NAJMI@upi.edu", "hp", "1234567");
        listAsprak.add(asp1);
        Asprak asp2=new Asprak("000008","2101118","BULAN","L","UPI","FPMIPA","ILKOM","BULAN@upi.edu", "asus", "1234567");
        listAsprak.add(asp2);
        Asprak asp3=new Asprak("000009","2101119","OJAN","L","UPI","FPMIPA","ILKOM","OJAN@upi.edu", "lenovo", "1234567");
        listAsprak.add(asp3);

        //menampilkan data dalam listAsprak
        for (int i = 0; i < listAsprak.size(); i++)
        {
            System.out.println();
            System.out.println("Data Asprak ke-"+Integer.toString(i+1));
            System.out.println("NIK                 : " + listAsprak.get(i).getNIK());
            System.out.println("NIM                 : " + listAsprak.get(i).getNIM());
            System.out.println("Nama                : " + listAsprak.get(i).getNama());
            System.out.println("Jenis Kelamin       : " + listAsprak.get(i).getJenkal()); 
            System.out.println("Asal Universitas    : " + listAsprak.get(i).getAsalUniversitas());
            System.out.println("Fakultas            : " + listAsprak.get(i).getFakultas());
            System.out.println("Program Studi       : " + listAsprak.get(i).getProdi());
            System.out.println("Email Edu           : " + listAsprak.get(i).getEmailEdu());
            System.out.println("Laptop              : " + listAsprak.get(i).getLaptop());
            System.out.println("NIP Dosen           : " + listAsprak.get(i).getNIP_dosen());
        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("DATA BEM");
        System.out.println("==================================================");
        //membuat list
        ArrayList<BEM> listBEM = new ArrayList<>();
        //objek instantion menggunakan paramater yang ada di CONSTRUCTOR dan dimasukan kedalaam listBEM
        BEM bem1=new BEM("000010","2101120","RAPI","L","UPI","FPMIPA","ILKOM","rafi@upi.edu", "lenovo", "ketua");
        listBEM.add(bem1);
        BEM bem2=new BEM("000011","2101121","AINI","P","UPI","FPMIPA","ILKOM","aini@upi.edu", "asus", "kadiv");
        listBEM.add(bem2);
        BEM bem3=new BEM("000012","2101122","raihan","Laki","UPI","FPMIPA","ILKOM","RAIHAN@upi.edu", "hp", "anggota");
        listBEM.add(bem3);

        //menampilkan data dalam listBEM
        for (int i = 0; i < listBEM.size(); i++)
        {
            System.out.println();
            System.out.println("Data BEM ke-"+Integer.toString(i+1));
            System.out.println("NIK                 : " + listBEM.get(i).getNIK());
            System.out.println("NIM                 : " + listBEM.get(i).getNIM());
            System.out.println("Nama                : " + listBEM.get(i).getNama());
            System.out.println("Jenis Kelamin       : " + listBEM.get(i).getJenkal()); 
            System.out.println("Asal Universitas    : " + listBEM.get(i).getAsalUniversitas());
            System.out.println("Fakultas            : " + listBEM.get(i).getFakultas());
            System.out.println("Program Studi       : " + listBEM.get(i).getProdi());
            System.out.println("Email Edu           : " + listBEM.get(i).getEmailEdu());
            System.out.println("Laptop              : " + listBEM.get(i).getLaptop());
            System.out.println("POSISI              : " + listBEM.get(i).getPosisi());

        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("DATA DPM");
        System.out.println("==================================================");
        //membuat list
        ArrayList<DPM> listDPM = new ArrayList<>();
        //objek instantion menggunakan paramater yang ada di CONSTRUCTOR dan dimasukan kedalaam listDPM
        DPM dpm1=new DPM("000013","2101123","Algha","L","UPI","FPMIPA","ILKOM","algha@upi.edu", "lenovo", "anggota");
        listDPM.add(dpm1);
        DPM dpm2=new DPM("000014","2101124","Laela","P","UPI","FPMIPA","ILKOM","bintang@upi.edu", "asus", "sekertaris");
        listDPM.add(dpm2);
        DPM dpm3=new DPM("000015","2101125","HASAN","laki","UPI","FPMIPA","ILKOM","SUHOLKAY@upi.edu", "hp", "ketua");
        listDPM.add(dpm3);

        //menampilkan data dalam listDPM
        for (int i = 0; i < listDPM.size(); i++)
        {
            System.out.println();
            System.out.println("Data DPM ke-"+Integer.toString(i+1));
            System.out.println("NIK                 : " + listDPM.get(i).getNIK());
            System.out.println("NIM                 : " + listDPM.get(i).getNIM());
            System.out.println("Nama                : " + listDPM.get(i).getNama());
            System.out.println("Jenis Kelamin       : " + listDPM.get(i).getJenkal()); 
            System.out.println("Asal Universitas    : " + listDPM.get(i).getAsalUniversitas());
            System.out.println("Fakultas            : " + listDPM.get(i).getFakultas());
            System.out.println("Program Studi       : " + listDPM.get(i).getProdi());
            System.out.println("Email Edu           : " + listDPM.get(i).getEmailEdu());
            System.out.println("Laptop              : " + listDPM.get(i).getLaptop());
            System.out.println("posisi              : " + listDPM.get(i).getPosisi());

        }

        System.out.println();
        System.out.println("==================================================");
        System.out.println("TAMBAHAN");
        System.out.println("==================================================");

        System.out.println();
        dsn1.makan("Nasi Padang");

        System.out.println();
        dpm3.tidur("10");

        System.out.println();
        mhs2.belajar("Inheritance");

        System.out.println();
        asp3.datang_ke_kelas("E-Business");

        System.out.println();
        bem1.kerjakan_tugas("Worksheet 3");

        System.out.println();
        System.out.println("==================================================");
        System.out.println("BONUS");
        System.out.println("==================================================");

        System.out.println();
        dpm1.apresiasi(bem1, "Rapat Kerja");   // algha mau apresiasi rafi tapi belum bisa karena belum dijalankan

        System.out.println();
        bem1.jalankanProker("Rapat Kerja");     // rafi selesain proker

        System.out.println();
        dpm1.apresiasi(bem1, "Rapat Kerja");    // coba apresiasi ulang setelah rafi selesai, berhasil

        System.out.println();
        dsn1.beriNilai(asp1, "TP1");  // bu rosa coba nilai tp1 tapi belum bisa

        System.out.println();
        asp1.beriTugas("TP1");    // najmi bagiin tugas tp1

        System.out.println();
        dsn1.beriNilai(asp1, "TP1");  // bu rosa bisa nilai karena udah dibagiin
        System.out.println("==================================================");
        System.out.println("==================================================");
    }
}
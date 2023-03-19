class Human{
    private String NIK;
    private String nama;
    private String jenis_kelamin;
    Human(){}
      //setter and getter
    public String getNIK(){
        return this.NIK;
    }
       public String getNama(){
        return this.nama;
    } 
        public String getJenkal(){
        return this.jenis_kelamin;
    }
     public void setNIK(String NIK){
         this.NIK=NIK;
    }
       public void setNama(String nama){
         this.nama=nama;
    }
        public void setJenkal(String jenis_kelamin){
         this.jenis_kelamin=jenis_kelamin;
    }
    public void makan(String nama_makanan) {
        System.out.println(this.nama + " telah memakan " + nama_makanan);
        System.out.println("Sekarang perut " + this.nama + " kenyang");
    }
    public void minum(String nama_minuman) {
        System.out.println(this.nama + " telah meminum " + nama_minuman);
        System.out.println("Sekarang tenggorokan " + this.nama + " tidak kering");
    }
    public void tidur(String jam) {
        System.out.println(this.nama + " telah tidur selama " + jam + " jam");
        System.out.println("Sekarang " + this.nama + " sudah tidak mengantuk");
    }
}
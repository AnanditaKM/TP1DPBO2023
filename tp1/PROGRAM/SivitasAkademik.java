class SivitasAkademik extends Human{
    private String asal_universitas;
    private String email_edu;
    SivitasAkademik(){
       
    }
    //setter and getter
    public String getAsalUniversitas(){
        return this.asal_universitas;
    }

    public String getEmailEdu(){
        return this.email_edu;
    }

    public void setAsalUniversitas(String asal_universitas){
        this.asal_universitas = asal_universitas;
    }

    public void setEmailEdu(String email_edu){
        this.email_edu = email_edu;
    }
}
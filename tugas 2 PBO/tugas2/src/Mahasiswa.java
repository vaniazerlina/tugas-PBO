public class Mahasiswa extends Elemen { //polymorphism
    //sub class yang mengambil nilai konstruktor dari class elemen
    private int sks;
    public int jamSibuk;
    public Mahasiswa (String nama, int sks){
        super(nama);
        this.sks = sks;  
    }
    public int getJamSibuk1 (){
        return jamSibuk = sks * 3;
    }
    public int getJamSibuk (){
        return jamSibuk = sks * 3;
    }
    public void show(){
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }
}

     
   
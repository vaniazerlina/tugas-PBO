public class Dosen extends Elemen{ //polymorphism
    //sub class yang mengambil nilai konstruktor dari class elemen
   private int jumlahHariKerja;
   public int jamSibuk;
   public Dosen(String nama,int jumlahHariKerja){
    super(nama);  
    this.jumlahHariKerja = jumlahHariKerja;
    }
    public int getJamSibuk (){
        return jamSibuk = jumlahHariKerja * 8;
    }
    public void show(){
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }
}

public class Dosen extends Elemen{
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

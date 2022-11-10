public class Asdos extends Mahasiswa { //polymorphism
    //sub class yang mengambil nilai konstruktor dari class mahasiswa
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos){
        super(nama, sks);  
        this.jamNgasdos = jamNgasdos;
        }
        public void setJamSibuk (int jamSibuk){
        }
        public int getJamSibuk (){
            return jamSibuk = getJamSibuk1() + jamNgasdos;
        }
        public void show(){
            System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
        }
}

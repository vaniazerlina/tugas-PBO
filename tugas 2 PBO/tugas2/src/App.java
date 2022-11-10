public class App {
    public static void main(String[] args) {
            int totalJamSibuk;
            Mahasiswa asdos1 = new Asdos(" Fairuzikun ", 21, 10); /*(Upcasting)
            Proses Pengubahan Referensi dari SubClass Ke SuperClass*/
            Mahasiswa asdos2 = new Asdos(" Angel-chan ", 20, 4); //(Upcasting)
            Dosen dosen1 = new Dosen(" Raja OP Damanik ", 5); 
            Dosen dosen2 = new Dosen(" Nivotko ", 3); 
            Mahasiswa mahasiswa1 = new Mahasiswa(" Firman ", 20); 
            Mahasiswa mahasiswa2 = new Mahasiswa(" Nid to pass this sem ", 23); 

            asdos1.show();
            dosen1.show();
            asdos2.show();
            mahasiswa1.show();
            mahasiswa2.show();
            dosen2.show();

            totalJamSibuk = 
            asdos1.getJamSibuk() + dosen1.getJamSibuk() + asdos2.getJamSibuk() 
            + mahasiswa1.getJamSibuk() + mahasiswa2.getJamSibuk() + dosen2.getJamSibuk();
            System.out.println(" Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);

        }
       
}

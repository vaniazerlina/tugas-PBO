public class VirtualDemo {
    public static void main(String [] args){
        gaji s = new gaji("Wahyu", "KUBAR", 3, 5000.00); 
        pegawai e = new gaji("ini nama ", "Samarinda", 2, 2500.00);//upcasting

        System.out.println("Memanggil mailCheck berdasarkan referensi gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck berdasarkan referensi pegawai--");
        e.mailCheck();
    }
    
}
/*penyebab menyusun gaji berjumlah dua kali yaitu karena class gaji merupakan sub class 
dari class pegawai yang merupakan superclass, sehingga class gaji secara otomatis akan mengakses 
semua method yang terdapat pada class pegawai, karena method yang ada di kelas pegawai tidak dirubah
isinya pada kelas gaji, maka dia tetap menampilkan ulang menyusun pegawai. selanjutnya upcasting dari 
gaji yang dibuat dengan class pegawai akan mengakses method pegawai di kelas pegawai*/

/* OUTPUT
Menyusun pegawai
Menyusun pegawai
Memanggil mailCheck berdasarkan referensi gaji --
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Wahyudengan gaji 5000.0

Memanggil mailCheck berdasarkan referensi pegawai--
Memeriksa kelas gaji dalam surat
Surat tertuju untuk ini nama dengan gaji 2500.0
 */
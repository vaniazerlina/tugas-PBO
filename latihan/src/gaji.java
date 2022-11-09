public class gaji extends pegawai {
    /*kelas ini merupakan sub class, 
    yang akan mewarisi sifat dari super class, 
    hal ini akan menyebabkan terjadinya polymorphisme */
    private double salary; // gaji tahunan
    public gaji (String name, String address, int number, double salary ) {
        super (name, address, number);
        setSalary (salary);
    }
public void mailCheck(){
    System.out.println("Memeriksa kelas gaji dalam surat");
    System.out.println("Surat tertuju untuk " + getName () + "dengan gaji " + salary);
}
public double getSalary (){ 
    return salary;
}
public void setSalary (double newSalary){
    if (newSalary >= 0.0) {
        salary = newSalary;
    }
}
public double computePay(){
    System.out.println("Menghitung pembayaran gaji untuk " + getName());
    return salary/52;

}
}



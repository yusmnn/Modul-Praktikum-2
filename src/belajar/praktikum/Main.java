package belajar.praktikum;

class Mahasiswa {
    private String stambuk;
    private String nama;
    private Integer angkatan;

    public void stambuk(String stambuk) {
        this.stambuk = stambuk;
    }
    public String getStambuk() {
        return stambuk;
    }


    public void nama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }


    public void angkatan(Integer angkatan) {
        this.angkatan = angkatan;
    }
    public Integer getAngkatan() {
        return angkatan;
    }

    
}

public class Main{

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        mhs.stambuk("13020200252");
        mhs.nama("Yusman");
        mhs.angkatan(2020);


        System.out.println("Stambuk\t: " + mhs.getStambuk());
        System.out.println("Nama\t: " + mhs.getNama());
        System.out.println("Angkatan: " + mhs.getAngkatan());

    }



}

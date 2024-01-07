package com.tutorial;

class Pegawai{
    String nama;
    double gajipokok;

    void display(){
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Gaji Pokok : " + this.gajipokok);
    }
}

class PegawaiTetap extends Pegawai{
    double durasi_lembur;
    double tunjangan;
    private double gaji_Bersih;
    
    double Tunjangan () {
        return (double) 0.7d*gajipokok;
    }

   double Lembur(){
        return this.durasi_lembur*(double)(0.1*this.gajipokok);
    }
    double gaji_Bersih(){
        return this.gajipokok + Tunjangan() + Lembur();
    }

    void display(){
        System.out.println("\n----Pegawai Tetap----");
        System.out.println("Nama Pegawa : " + this.nama);
        System.out.println("Gaji Pokok : " + this.gajipokok);
        System.out.println("Durasi Lembur : " + this.durasi_lembur + " Jam");
        System.out.println("Gaji Bersih : Rp " + this.gaji_Bersih());
    }
}

class PegawaiTidakTetap extends Pegawai{
    double durasi_lembur;
    private double gaji_bersih;

    double Lembur() {
        return durasi_lembur * (double) (0.1d * gajipokok);
    }

    double gaji_Bersih() {
        return gajipokok + Lembur(); 
    }

    void display() {
        System.out.println("\n---- Pegawai Tidak Tetap ----");
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Gaji Pokok : " + this.gajipokok);
        System.out.println("Durasi Lembur : " + this.durasi_lembur + " Jam");
        System.out.println("Gaji Bersih: Rp " + gaji_Bersih());
        System.out.println("\n");
    }
}

public class UAS {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap();
        pegawaiTetap.nama ="Stanislaus Nani";
        pegawaiTetap.durasi_lembur=5;
        pegawaiTetap.gajipokok=3500000;
        pegawaiTetap.display();
        
        PegawaiTidakTetap pegawaiTidakTetap = new PegawaiTidakTetap();
        pegawaiTidakTetap.nama = "Pabito";
        pegawaiTidakTetap.durasi_lembur = 6;
        pegawaiTidakTetap.gajipokok = 25000000;
        pegawaiTidakTetap.display();
    } 
}

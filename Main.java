package com.tutorial;

class BangunDatar{
    float Luas () {
        return 0;
    }
    float Keliling () {
        return 0;
    }
}

class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    //membuat getter dan setter segitiga
    float getalas () {
        return alas;
    }
    
    void setalas (float alas){
        this.alas = alas;
    }

    float gettingi (){
        return tinggi;
    }

    void settinggi (float tinggi){
        this.tinggi = tinggi;
    }
    //overloading method hhitung luas
    float hitungluas(){
        return (float) (0.5*alas*tinggi);
    }

    //overreading method hitungkeliing 
    float hitungKeliing(){
        float a = (float) Math.sqrt(alas*alas)+(tinggi*tinggi);
        return alas + tinggi + a;
        
    }

    public void display(){
        System.out.println("\n-----BangunDatar Segitga----- ");
        System.out.println("luas segitiga : " + hitungluas());
        System.out.println("keliling segitiga : " + hitungKeliing());
    }
}

    //sub class bangun datar persegi
   class Persegi extends BangunDatar{
        float sisi;

        //membuat getter dan setter Persegi
        float getsisi(){
        return sisi;
        }

        void setsisi(float sisi){
            this.sisi = sisi;
        }

        //overeading hitung luaspersegi
        float hitungluas(){
            return (float) (sisi*sisi);
        }
        //overreading hitung keliling Persegi
        float hitungKeliing(){
            return (float) (4*sisi);
        }

        public void display(){
            System.out.println("\n-----BangunDatar Persegi----- ");
            System.out.println("Luas Persegi : " + hitungluas());
            System.out.println("Keliling Persegi : " + hitungKeliing());
        }     
    }

    class PersegiPanjang extends BangunDatar {
        float panjang;
        float lebar;

        //setter dan getter 
        float getpanjang(){
            return panjang;
        }

        void setpanjang(float panjang){
            this.panjang = panjang;
        }

        float getlebar(){
            return lebar;
        }
        
        void setlebar(float lebar){
            this.lebar = lebar;
        }
        //overeading 
        float hitungluas(){
            return (float) (panjang*lebar);
        }

        float hitungKeliing(){
            return (float) (2*panjang*lebar);
        }

        public void display(){
            System.out.println("\n--BangunDatar Persegi Panjang-- ");
            System.out.println("Luas Persegi panjang : " + hitungluas());
            System.out.println("Keliling PersegiPanjang : " +hitungKeliing());
        }

    }

    class Lingkaran extends BangunDatar{
    float jarijari;

    //setter dan gettr
    float getsisi(){
        return jarijari;
    }

    void setjarijari(float jarijari){
        this.jarijari = jarijari;
    }

    //overeading hitung luas lingkaran
    float hitungluas(){
        return (float) (3.14*jarijari*jarijari);
    }
    //overeading hitung keliling lingkaran 
    float hitungKeliing(){
        return (float) (2*3.14*jarijari*jarijari);
    }

    public void display(){
        System.out.println("\n-----BangunDatar Lingkaran----- ");
        System.out.println("Luas Liangkaran : " + hitungluas());
        System.out.println("Kelilng Lingkaran : " + hitungKeliing());
        System.out.println("\n");
    }
}

 public class Main {
 
    public static void main(String[] args) {

        Segitiga segitiga = new Segitiga();
        segitiga.setalas(3);
        segitiga.settinggi(9);
        segitiga.display();

        Persegi persegi = new Persegi();
        persegi.setsisi(2);     
        persegi.display();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setlebar(2);;
        persegiPanjang.setpanjang(4);;
        persegiPanjang.display();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setjarijari(9);
        lingkaran.display();
    }
 }
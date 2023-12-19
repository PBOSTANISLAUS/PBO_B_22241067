package com.tutorial;

class Player {
    //data member 
    String name; //default, bisa diakses oleh kelas lain
    public int exp; //public, bisa diakses oleh kelas lain
    private int health ; //private,tidak bisa diakses ole kelas lain

    Player (String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;

    }
void Display () {
    System.out.println("Nama Player : " + this.name);
    System.out.println("Player exp : " + this.exp);
    System.out.println("Player Health: " + this.health);
}

}

public class Main {
   public static void main(String[] args) {
      //inisialisasi atau membuat objek baru
      Player hero_1 = new Player("Saitama", 20, 100);
      hero_1.Display();

   } 
}

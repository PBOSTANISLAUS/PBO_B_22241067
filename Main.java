package com.tutorial;


class Hero{
    String nama;

    public void display(){
        System.out.println("nama hero : "+ nama);
    }
}

    //sub class hero tank
class HeroTank extends Hero{
        String healt;
        String nama;


    public void display(){
        System.out.println("nama hero : " + nama);
        System.out.println("Healt : "+ healt);
    }
}

class HeroMarksman extends Hero{
        String attackspeed;
        String nama;

        public void display (){
            System.out.println("nama hero 2 : " + nama);
            System.out.println("attackspeed : " + attackspeed);
        
    }
}

public class Main {
    
    public static void main(String[] args) {

     HeroTank heroTank = new HeroTank();
     heroTank.nama = "saitama";
     heroTank.healt= "20";
     heroTank.display();

     HeroMarksman heroMarksman = new HeroMarksman();
     heroMarksman.nama = "pablito";
     heroMarksman.attackspeed = "100";
     heroMarksman.display();
    }
}



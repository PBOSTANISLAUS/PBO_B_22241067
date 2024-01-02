package com.tutorial;


class Hero {
    String name;
    
    void display(){
         System.out.println("Name : "+ name);

    }
}
   
    class HeroTank extends Hero{
        float health;

        void display(){
         System.out.println("health : "+ health);
        }  
}
    
public class Main {
   public static void main(String[] args) {
      
      Hero hero_1 = new Hero();
      hero_1.name = "ucup";
      hero_1.display();


      HeroTank hero_2 = new HeroTank();
      hero_2.name = "Pahlawan";
      hero_2.display();
   } 
}

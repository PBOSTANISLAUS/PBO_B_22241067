package com.tutorial;

class User{
    private String username;
    private String password;

    User(String username, String password){
        this.username = username;
        this.password = password;

    }
    // method getter
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }

    //method stter ganti password
    public void setPassword(String password){
        this.password = password;


    }

}


public class Main {
   public static void main(String[] args) {
    //instansiasi atau buat objek baru
    User person_1 = new User("Undikma", "Jaya-jaya-jaya");


    System.out.println(person_1.getUsername());
    System.out.println(person_1.getPassword());
    person_1.setPassword("sukses");
    System.out.println("password Baru : " + person_1.getPassword());
   }  
}

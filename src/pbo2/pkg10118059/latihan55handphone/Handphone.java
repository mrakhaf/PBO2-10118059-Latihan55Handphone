/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan55handphone;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;
    
    
    
    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry BB = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone WP = new WindowsPhone("Nokia", "Win8", "Lumia",13000000);
        
        android.setKeyStore("234ibfd3840fo");
        BB.setPinBB("BHS249");
        WP.setWpKeyStore("UUUQIJWORJ");
        
        //Android
        System.out.println("Manufaktur : " + android.manufacture);
        System.out.println("OS : " + android.operatingSystem);
        System.out.println("Model : " + android.model);
        System.out.println("Harga : Rp. " + android.harga);
        System.out.println("Android Key Store : " + android.getKeyStore());
        System.out.println("");
        //BB
        System.out.println("Manufaktur : " + BB.manufacture );
        System.out.println("OS : " + BB.operatingSystem);
        System.out.println("Model : " + BB.model);
        System.out.println("Harga : Rp. " + BB.harga);
        System.out.println("PIN : " + BB.getPinBB());
        System.out.println("");
        //WP
        System.out.println("Manufaktur : " + WP.manufacture );
        System.out.println("OS : " + WP.operatingSystem);
        System.out.println("Model : " + WP.model);
        System.out.println("Harga : Rp. " + WP.harga);
        System.out.println("Wp Key Store : " + WP.getWpKeyStore());
    }
    
}

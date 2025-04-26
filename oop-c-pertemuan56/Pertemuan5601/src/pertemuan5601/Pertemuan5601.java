/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author Maria Droste LAB F
 * TGL 26 April 2025
 * 
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.warna = "Hijau";
        apel.SetRasa("Manis");
        
        System.out.printf("Warna Apel diset %s\n", apel.warna);
        System.out.printf("Rasa Apel diset %s\n", apel.getRasa());
        
        buah anggur = new buah();
        anggur.warna = "Hitam";
        anggur.SetRasa("Enak");
        
        System.out.printf("Warna Anggur diset %s\n", anggur.warna);
        System.out.printf("Rasa Anggur diset %s\n", anggur.getRasa());
    }
    
}

class buah{
    public String warna;
    private String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
    }
    public String getRasa(){
        return this.rasa;
    
    }
}

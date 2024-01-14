/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring1;

/**
 *
 * @author ASUS
 */
public class ComparacaoString1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String("Vinicius");
        String res;
        res = (nome1 == nome2) ? "Igual" : "Diferente";
        System.out.println(res);*/
        
        /*String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String("Vinicius");
        String res;
        res = (nome1 == nome3) ? "Igual" : "Diferente";
        System.out.println(res);*/
        
        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String("Vinicius");
        String res;
        res = (nome1.equals(nome3)) ? "Igual" : "Diferente";
        System.out.println(res);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author ASUS
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Vinícius";
        String nome2 = "Vinícius";
        String nome3 = new String("Vinícius");
        String res;
        res = (nome1 == nome2)?"Igual" : "Diferente";
        System.out.println(res);
    }
    
}

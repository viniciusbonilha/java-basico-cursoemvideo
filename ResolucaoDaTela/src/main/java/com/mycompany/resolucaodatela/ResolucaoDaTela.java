package com.mycompany.resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
 Dimension size
            = Toolkit.getDefaultToolkit().getScreenSize();
      
      int largura = (int)size.getWidth();
      
      int altura = (int)size.getHeight();
      
       System.out.println("Sua resolução é de : "
                           + " " + largura
                           + " X " + altura);

    }
}

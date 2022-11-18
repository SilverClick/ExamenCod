import javax.swing.*;

public class Menu {
    package boletin8_2;
import javax.swing.JOptionPane;

    public class Menu {
        public void abrirMenu(int boton){
            switch(boton){
                case 1:
                    String lad = JOptionPane.showInputDialog(" teclea canto vale o lado do cadrado ");
                    double lado=Double.parseDouble(lad);
                    System.out.println(" A area do cadrado e igual a "+(lado*lado));
                    break;
                case 2:
                    String bas =JOptionPane.showInputDialog(" teclea canto vale a base do triángulo ");
                    double base=Double.parseDouble(bas);
                    String alt =JOptionPane.showInputDialog(" teclea canto vale a altura do triángulo ");
                    double altura=Double.parseDouble(alt);
                    System.out.println(" A area do triángulo e igual a "+((base*altura)/2));
                    break;
                case 3:
                    String rad =JOptionPane.showInputDialog(" teclea canto vale a base do triángulo ");
                    double radio=Double.parseDouble(rad);
                    System.out.println(" A area do circulo e igual a "+(Math.PI*Math.pow(radio, 2)));
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
}


package veiculo;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();
        
        carro1.setModelo(JOptionPane.showInputDialog(null, "MODELO DO CARRO"));
        carro1.setFabricante(JOptionPane.showInputDialog(null, "FABRICANTE DO CARRO"));
        
        moto1.setModelo(JOptionPane.showInputDialog(null, "MODELO DA MOTO"));
        moto1.setFabricante(JOptionPane.showInputDialog(null, "FABRICANTE DA MOTO"));
        
        
        
        System.out.println("Modelo do Carro: "+carro1.getModelo());
        System.out.println("Fabricante do Carro: "+carro1.getFabricante());
        
        System.out.println("Modelo da Moto: "+moto1.getModelo());
        System.out.println("Fabricante do Moto: "+moto1.getFabricante());
    }
    
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectbuilder;

/**
 *
 * @author Administrador
 */
public class ProyectBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuilderHawaianaPremium builderh = new BuilderHawaianaPremium();
        BuilderHawaianaNormal buildern = new BuilderHawaianaNormal();
        Chef chef = new Chef();
        System.out.println("pizza hawaiana premium ");
        chef.cocinar(builderh);
        System.out.println("pizza hawaiana normal ");
        chef.cocinar(buildern);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectbuilder;

/**
 *
 * @author Administrador
 */
public class Chef {

    public Chef() {
    }
    
    public void cocinar (Builder receta){
        receta.construirJamoon();
        receta.construirPiña();
        receta.construirQueso();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectbuilder;

/**
 *
 * @author Administrador
 */
public class BuilderHawaianaNormal  implements Builder{

    @Override
    public void crearPizza() {
       
    }

    @Override
    public void construirQueso() {
        pizzaCreada.colocarQueso(new Holandes());
    }

    @Override
    public void construirJamoon() {
        pizzaCreada.colocarJamon(new JamónGato());
    }

    @Override
    public void construirPiña() {
      pizzaCreada.colocarPiña(new PiñaNormal());
    }
    
}

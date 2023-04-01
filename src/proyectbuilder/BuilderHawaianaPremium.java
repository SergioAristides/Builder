/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectbuilder;

import static proyectbuilder.Builder.pizzaCreada;

/**
 *
 * @author Administrador
 */
public class BuilderHawaianaPremium implements Builder{
     @Override
    public void crearPizza() {
       
    }

    @Override
    public void construirQueso() {
        pizzaCreada.colocarQueso(new Mozzarella());
    }

    @Override
    public void construirJamoon() {
        pizzaCreada.colocarJamon(new JamonPietran());
    }

    @Override
    public void construirPiña() {
      pizzaCreada.colocarPiña(new PiñaCalada());
    }

    public BuilderHawaianaPremium() {
    }
    
}

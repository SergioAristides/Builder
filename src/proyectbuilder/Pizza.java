/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectbuilder;

/**
 *
 * @author Administrador
 */
public  class Pizza {
  Piña piña;
  Jamon jamon;
  Queso queso;

    public Pizza(Piña piña, Jamon jamon, Queso queso) {
        this.piña = piña;
        this.jamon = jamon;
        this.queso = queso;
    }
    public Pizza(){}
  
  public void colocarQueso(Queso quesito){
      this.queso = quesito;
      System.out.println("se coloco " + this.queso.caracteristicas()+ " en la pizza");
  }
  
    public void colocarPiña(Piña piñita ){
      this.piña = piñita;
      System.out.println("se coloco " + this.piña.caracteristicas()+ " en la pizza");
  }
    
 public void colocarJamon(Jamon jamoncito ){
      this.jamon = jamoncito;
      System.out.println("se coloco " + this.jamon.caracteristicas()+ " en la pizza");
  }
}

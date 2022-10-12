/**
 *
 * @author Daw120
 * 
 */
package com.solomongo.ejercicio2;
public class Coche {
    
   //declara los atributos de clase Coche:
    private String matricula;
    private String velocidad;
    private int velocidadCero;
 
    // par de constructores
    public Coche(){}
     
    public Coche(String matricula, String velocidad, int velocidadCero){ 
       this.matricula=matricula;  
       this.velocidad=velocidad;
        this.velocidadCero=velocidadCero;
      } 
 
 // getters que enviaran los datos
 public String getMatricula(){ return matricula;}
 public String getVelocidad(){ return velocidad;}
 public int getVelocidadCero(){ return velocidadCero;}
 
 // seters de aqui para los cambios
  public void setMatricula(String matric){this.matricula=matric;}
  public void setVelocidad(String veloc) {this.velocidad=veloc;}
  public void setVelocidadCero(int veloCero) {this.velocidadCero=veloCero;}
 
}

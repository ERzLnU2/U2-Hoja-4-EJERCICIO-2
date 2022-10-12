# U2-Hoja-4-EJERCICIO-2
UN BUEN CHOCHO MORROCOTUDO

       2.- Diseñar una clase llamada ‘coche’ con los atributos privados: 
           matricula y velocidad y los métodos:
       
          • Un constructor que permita declarar objetos de tipo coche inicializado con la 
            matricula y la velocidad pasados como argumentos.
         
          • Otro constructor que permita declarar objetos de tipo coche con la matricula,
            pasada como argumento y ponga la velocidad a 0.
         
          • Un método llamado acelera que incrementa la velocidad en el valor que 
            pasamos como argumento, otro llamado frena idéntico pero que disminuye la 
            velocidad, controlando siempre que la velocidad no puede ser menor de 0 ni 
            mayor de 120.
         
          • Un método que permita mostrar las letras de la matrícula.
       
          • Un método que permita mostrar la matricula y velocidad del coche.
       
     Ejemplo de ejecución:

          creo un coche con matricula y velocidad
          Coche [matricula=1234RET, velocidad=20]
          creo otro coche solo con matricula
          Coche [matricula=4567KKK, velocidad=0]
          el coche 2 despues de frenar 10 es
          Coche [matricula=4567KKK, velocidad=0]
          el coche 1 despues de acelerar 80 es
          Coche [matricula=1234RET, velocidad=100]
          Las letras que tiene la matricula del coche Coche [matricula=1234RET, velocidad=100] 
          son RET
    
    ![1](https://user-images.githubusercontent.com/80227002/195220789-f1b945a2-b5f6-4ec5-a8b8-0c7f4ccb92ea.png)

    ![2](https://user-images.githubusercontent.com/80227002/195220807-011b0ed9-5454-46ec-a9b3-9abb88d75ba4.png)


```java
 import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
    Coche coche2=new Coche();
    String matric,matric2,veloc;     
     matric=JOptionPane.showInputDialog(">>> Crear matricula del coche: " ); 
     coche2.setMatricula(matric);  
     veloc=JOptionPane.showInputDialog(">>> Crear velocidad del coche: " );   
     coche2.setVelocidad(veloc);
     System.out.print("\n\nCreo un coche con matricula y velocidad\n");    
     System.out.print("Coche [matricula="+matric+", velocidad="+veloc+"]\n");  
     System.out.print("Creo otro coche solo con matricula\n");     
     matric2 =JOptionPane.showInputDialog(">>> Crear matricula del coche 2: " ); 
     coche2.setMatricula(matric2);   
     Coche veloCero=new Coche(); 
     veloCero.setVelocidadCero(0);
     System.out.print("Coche [matricula="+matric2+", velocidad="+veloCero.getVelocidadCero()+"]");    
     System.out.print("\nel coche 2 despues de frenar 10 es");
     int ternario = veloCero.getVelocidadCero()<0 ? 0 : 0;
     System.out.print("\nCoche [matricula="+matric2+", velocidad="+ternario+"]");
     System.out.print("\nel coche 1 despues de acelerar 80 es ");
     System.out.print("\nCoche [matricula="+matric+", velocidad=");        
     var acelera = Integer.parseInt(coche2.getVelocidad()); 
     System.out.print(acelera+80); System.out.print("]\n");    
     String sinnumeros = matric;
     String letrasMatricula = sinnumeros.replace('1',' ').replace('2','\b').replace('3',
     ' ').replace('4',' ').replace('5','\b').replace('6',' ').replace('7','\b').replace('8', 
     ' ').replace('9','\b').replace('0','\b');
     System.out.print("Las letras que tiene la matricula del coche Coche [matricula="+matric+", velocidad="+veloc+"]" +
     "\nson \b"+letrasMatricula+"\n\n");   
    }
}

```

![3](https://user-images.githubusercontent.com/80227002/195220875-b7aa26f4-256f-4c34-8446-93ffb7d61dbd.png)


```java
00
```

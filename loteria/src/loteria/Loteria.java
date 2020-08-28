
package loteria;

import java.util.Random;
import java.util.Scanner;

public class Loteria {
    int  num=0;
    Scanner ent = new Scanner (System.in);
    public void loteria(){
        int [] numeros;
        int aux=0,cont=0,pos=0;
        Random r = new Random();
        int ram = r.nextInt(10)+1;
        
        numeros = new int [5];
        for (int i=0;i<numeros.length;i++){
            System.out.print("Ingrese un valor: ");
            numeros[i]=ent.nextInt();
            for(int j=0; j<i;j++){
                if (numeros[i]==numeros[j]){
                    System.out.println("Inserto un mismo numero mas de una vez");
                    i--;
                }}}    
        for (int j=0;j<5;j++){
            if(numeros[j]==ram ){
                System.out.println("Felicidades acertaste el numero es:"+ram);
                }else {
                cont ++;
                if (cont==5){
                System.out.println("suerte para la proxima el numero era: "+ram);
                }
            }
        }    
    }
           
             
}
 
        


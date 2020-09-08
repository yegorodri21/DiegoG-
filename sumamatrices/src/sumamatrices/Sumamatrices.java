
package sumamatrices;

import java.util.Random;

public class Sumamatrices {

        private int [][] matriz1;
        private int [][]matriz2;
        private int [][]suma;
        Random r = new Random();
        public Sumamatrices(int i,int j){
            matriz1=new int[i][j];
            matriz2=new int [i][j];
            suma=new int [i][j];
        }
            public void llenarMatriz(){
            for (int i=0; i<matriz1.length;i++){
                for (int j=0; j<matriz1[i].length;j++){
                        int ram = r.nextInt(9)+1;
                        matriz1 [i][j]=ram;
                        matriz2 [i][j]=ram+1;
                        ram++;
                }
            }
        }
        public void imprimirmatriz(){
            String M1="matriz 1:\n", M2="matris 2:\n";
            for (int i=0; i<matriz1.length;i++){
                   for (int j=0; j<matriz1[i].length;j++){
                       M1+="("+matriz1[i][j]+")";
                       M2+="("+matriz2[i][j]+")";
                   }
                   System.out.println("");
                   M1+="\n";
                   M2+="\n";                   
            }
                System.out.println(M1);
                System.out.println(M2);
        }
        public void sumar(){
            System.out.println("La suma de las Matrices es:");
            for (int i=0; i<matriz1.length;i++){
                   for (int j=0; j<matriz1[i].length;j++){
                       suma [i][j]=matriz1[i][j]+matriz2[i][j];
                       System.out.print("("+suma[i][j]+")");

                }
                   System.out.println(" ");
            }
        }
}

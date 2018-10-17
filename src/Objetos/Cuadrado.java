/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Scanner;
public class Cuadrado {
    int a;
    int al; 
    int b;
    int la;
    int p;
    public Cuadrado(int alt){
        la=alt;
        p=alt*4;
        a=alt*2;
    }

    public int getA () { return a; }
      public int getLA () { return la; }
        public int getP () { return p; }
    
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int p,l,a,b,al,opcion=0,op=0;
        do{
System.out.println("Ingrese el tamaño del lado");
  l=s1.nextInt();
            char desea;
   do{Cuadrado v=new Cuadrado(l);
   System.out.println("              MENU"
           +"\n*ACCIONES:"
           +"\n1-Area cuadrado"+"      2-Perimetro cuadrado"
           +"\n3-Volumen del cubo"+"   4-Perimetro del cubo"
           +"\n         5-salir           6-cancelar       "
   );
  

   opcion=s1.nextInt();
   if(opcion==1||opcion==2||opcion==3||opcion==4){
   cubo f =new cubo(l);
   switch(opcion){
       case 1:
        int A=v.getA();
        System.out.println("El area es: "+A);
        break;
       case 2:
            int P1=v.getP();
        System.out.println("El area es: "+P1);
        break;
         case 3:
        int V=f.getv();
        System.out.println("El area es: "+V);
        break;
       case 4:
            int P2=f.getP();
        System.out.println("El area es: "+P2);
        break;
        
   }}
      if(opcion==5){
       System.exit(0);
   }
   System.out.println("Desaea salir al inicio o al menu(m/i)");
   desea=s1.next().charAt(0);
  
   }while(desea=='m');
   
        }while(op!=5);
}
    
    
    }
    


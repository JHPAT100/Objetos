/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;


public class cubo {
    int v;
    int p;
public cubo(int l){
    v=l*3;
    p=l*12;
}
 public int getP () { return p; }
  public int getv () { return v; }
    cubo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 }


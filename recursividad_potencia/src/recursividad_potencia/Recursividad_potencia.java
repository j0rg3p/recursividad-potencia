
package recursividad_potencia;

/**
 *
 * @author jorge
 */
public class Recursividad_potencia {

    
    public static  int potencia( int a, int b){
    if (b==1){
        
        return a;
    }
    else if (b==0){
        return 1;
    }
    else{
        return a*potencia(a, b-1);
    }
}    
public static void main (String[]args){
    System.out.println(potencia(2,3));
}
}
    


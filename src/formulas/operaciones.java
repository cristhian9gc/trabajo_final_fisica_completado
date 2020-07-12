
package formulas;

public class operaciones {
    public double sumax, sumay;
    public double restax, restay;
    public double multi;
    public double modulosuma;
    public double moduloA, moduloB;
    public double vecunitarioA, vecunitarioB;
    
    
    public void calsuma(double vx1, double vx2, double vy1, double vy2){
        sumax = vx1 + vy1;
        sumay = vx2 + vy2;
    }
    
    public void calresta(double vx1, double vx2, double vy1, double vy2){
        restax = vx1 - vy1;
        restay = vx2 - vy2;
    }
    
    public void calmoduloA(double vx1, double vx2){
        double cua1, cua2, su;
        
        cua1 = Math.pow(vx1, 2);
        cua2 = Math.pow(vx2, 2);
        su = cua1 + cua2;
        
        moduloA = Math.sqrt(su);
    }
    
    public void calmoduloB(double vy1, double vy2){
        double cu1, cu2, sum;
        
        cu1 = Math.pow(vy1, 2);
        cu2 = Math.pow(vy2, 2);
        sum = cu1 + cu2;
        
        moduloB = Math.sqrt(sum);
    }
       
    public void calmult(double vx1, double vx2, double vy1, double vy2){
        double mult1, mult2;
        
        mult1 = vx1 * vy1;
        mult2 = vx2 * vy2;
        
        multi = mult1 + mult2;
    }
    
    public void modulosuma(double vx1, double vx2, double vy1, double vy2){
        double cuad1, cuad2, suma;
        
        cuad1 = Math.pow(sumax, 2);
        cuad2 = Math.pow(sumay, 2);
        suma = cuad1 + cuad2;
        
        modulosuma = Math.sqrt(suma);
    }
}

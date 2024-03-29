/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

public class EstudianteDistancia extends Estudiante {
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
    */ 
    int numeroAsignaturas;
    double costoAsignatura;
    
    public EstudianteDistancia(String n, String ap, String iden, int e,
            int numAsg, double costoAsg){
        super(n, ap, iden, e);
        numeroAsignaturas = numAsg;
        costoAsignatura = costoAsg;
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    @Override
    public void calcularMatricula(){
        matricula = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%sEstudiante Distancia\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignautras: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                obtenerCostoAsignatura(),
                obtenerNumeroAsignaturas(),
                obtenerMatricula());
        
        return cadenaFinal;
    }
        
}

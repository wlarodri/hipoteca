package paquete;

import javax.swing.JOptionPane; 

public class Usuario { 
 
 public static void main (String args[]) { 
double cantidad; // en euros 
double interes; // en porcentaje (anual) 
int tiempo; // en a�os 
double cuota; // en euros (mensual) 
double interesMensual; // en tanto por uno 
String entrada; // variable auxiliar 
 
// Entrada de datos 
entrada = JOptionPane.showInputDialog("Importe de la hipoteca (�)"); 
cantidad = Double.parseDouble(entrada); 
entrada = JOptionPane.showInputDialog("Tipo de inter�s (%)"); 
interes = Double.parseDouble(entrada); 
entrada = JOptionPane.showInputDialog("Per�odo de amortizaci�n (a�os)"); 
tiempo = Integer.parseInt(entrada); 
 
// C�lculo de la cuota mensual 
interesMensual = interes/(12*100); 
double x= Math.pow(1+interesMensual,tiempo*12);
double y =1.0/x;
double z = 1.0-y;
cuota = (cantidad*interesMensual)/z;
 

cuota = Math.round(cuota*100)/100.0; 
 
// Resultado 
JOptionPane.showMessageDialog(null, "Cuota mensual = "+cuota+"�" ); 
System.exit(0); 
 } 
}
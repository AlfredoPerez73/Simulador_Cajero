package Metodos;

 // @author Alfredo

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos extends Banco {
    
    Vector lista=new Vector();
    
    public void guardarArreglo(Banco usuario){
        lista.addElement(usuario);
    }
    
    public void guardarArchivo(Banco user){
        try {
            FileWriter archivo = new FileWriter("REPORTE USUARIOS.txt", true);
            BufferedWriter escribir = new BufferedWriter(archivo);
            PrintWriter escribir2 =new PrintWriter(escribir);
            
            escribir2.print("|"+getIdr());
            escribir2.print("|"+getId());
            escribir2.print("|"+getTransaccion());
            escribir2.print("|"+getTransaccionIdr());
            escribir2.print("|"+getSaldo());
            escribir2.print("|"+getSaldoActual()+"\n");
            escribir2.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"NO SE GENERO EL FICHERO","ERROR",2);
        }
    }
    public DefaultTableModel listadoPersona(){
        Vector Titulos = new Vector();
        Titulos.addElement("IDENTIFICADOR");
        Titulos.addElement("IDENTIFICACION");
        Titulos.addElement("TRANSACCION");
        Titulos.addElement("TRANSACCION IDR");
        Titulos.addElement("SALDO INICIAL");
        Titulos.addElement("SALDO ACTUAL");
    
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(Titulos,0); 
        
        try {
           FileReader fr = new FileReader("REPORTE USUARIOS.txt");
           BufferedReader br = new BufferedReader(fr);
           String d;
           while((d=br.readLine())!= null){
              StringTokenizer pai=new StringTokenizer(d,"|");
              Vector x=new Vector();
                      while(pai.hasMoreTokens()){ 
                       x.addElement(pai.nextToken());  
                      }
                  modelo.addRow(x);
              
           }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"NO SE GENERO EL FICHERO","ERROR",2);
        }
     return modelo;   
    }

}

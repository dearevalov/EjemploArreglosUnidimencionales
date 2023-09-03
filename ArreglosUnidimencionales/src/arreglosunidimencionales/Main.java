/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosunidimencionales;
import java.util.*;
import java.io.*;
import java.util.Calendar;
/**
 *
 * @author danie
 */
public class Main {

 static int i,sel;
  String ms;
  static double ventas,sv,prv,mayorv,menrv;
  static String s[]=new String[12];
  static double venta[]=new double[12];
  Calendar c1 = Calendar.getInstance();
public void obtenerMesAño() {
   annio = c1.get(Calendar.YEAR);
    mes = c1.get(Calendar.MONTH)+1;

}

private int annio;
private int mes;

  Calendar fecha1 = Calendar.getInstance();
  static BufferedReader te=new BufferedReader(new InputStreamReader(System.in));  
  public static void main(String[] args) throws IOException {
    System.out.println("Bievenidos al areglo unidimencional Tventas");
    System.out.println("Programador Daniel Arévalo");
    System.out.println("Bienvenido al programa de Ventas");
   
    do{
      System.out.println("1_entrada de mes y Ventas ");
      System.out.println("2-mostrar ventas");
      System.out.println("3-sumatoria - promedio de ventas ");
      System.out.println("4-mayor venta");
      System.out.println("5-menor venta");
      System.out.println("6-ordenar ventas");
      System.out.println("7-Salir");
      System.out.println("Cual es su opcion");
      sel=Integer.parseInt(te.readLine());
      System.out.println("");
      System.out.println("");
      switch(sel)
      {
        case 1:System.out.println("Entrada de ventas");
               for(i=0;i<12;i++)
               {
                 System.out.println("Digite mes # "+(i+1));
                 venta[i]=Double.parseDouble(te.readLine());
                 System.out.println("Digite venta # :"+(i+1));
                 venta[i]=Double.parseDouble(te.readLine());
               }
               System.out.println("");
               System.out.println("");
        break;
        case 2:System.out.println("Mostrar datos");
               for(i=0;i<12;i++)
               {
                 System.out.println("Ventas del mes #  "+(i+1)+" : "+venta[i]);
               }
               System.out.println("");
               System.out.println("");
        break;
        case 3:System.out.println("Suma_Promedio ventas");
               sv=0;
               for(i=0;i<12;i++)
               {
                 sv=sv+venta[i];
               }
               prv=sv/12;
               System.out.println("Sumatoria es : "+sv);
               System.out.println("Promedio es : "+prv);       
               System.out.println("");
               System.out.println("");
        break;
        case 4:System.out.println("Mayor venta");
               mayorv=menrv=venta [0];
               for(i=0;i<12;i++)
               if(venta[i]>mayorv)
               {
                 mayorv=venta[i];
               }
               System.out.println("Mayor : "+mayorv);
               System.out.println("");
               System.out.println("");
        break;
        case 5:System.out.println("Menor venta");
               menrv=mayorv=venta [0];
               for(i=0;i<12;i++)
               if(venta[i]<menrv)
               {
                 menrv=venta[i];
               }
               System.out.println("Menor : "+menrv);
               System.out.println("");
               System.out.println("");
        break;
        case 6:System.out.println("Ordenar Arreglo ventas");
               Arrays.sort(venta);
               for(i=0;i<12;i++)
               {
                 System.out.println("Venta #"+(i+1)+": "+ venta[i]);
               }  
               System.out.println(" ");
               System.out.println(" ");
        break;       
      }     
    }while(sel!=7);
    System.out.println(" se acabo");
  }
    }


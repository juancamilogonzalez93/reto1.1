import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   
    System.out.println("Ingrese Distacia a casa de Goku");
    
    Scanner input = new Scanner (System.in);
    CasaGoku casagoku = new CasaGoku(input.nextInt());
    ProximaEsfera proximaesfera = new ProximaEsfera(casagoku);
    Viaje viaje = new Viaje(casagoku,proximaesfera);
    Esfera esfera = new Esfera(viaje);  

    System.out.println(casagoku.Distancia+" "+ proximaesfera.Distancia+" "+viaje.Tiempo);
    System.out.println(esfera.Numero);
  }
}
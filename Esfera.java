public class Esfera{
public String Numero;
  public Esfera(Viaje viaje){
  this.ObtenerNumero(viaje);  
  }

  
  private void ObtenerNumero(Viaje viaje){
    String NumeroEsfera="";
     if(viaje.Tiempo <= 20){
      NumeroEsfera = "uno";
    }
    if(viaje.Tiempo > 20 && viaje.Tiempo<=30){
      NumeroEsfera = "dos";
    }
    if(viaje.Tiempo > 30 && viaje.Tiempo<50){
      NumeroEsfera = "tres";
    }
    if(viaje.Tiempo > 50){
      NumeroEsfera = "cuatro";
    }
  this.Numero = NumeroEsfera;
  }
}
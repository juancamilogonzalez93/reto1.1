public class Viaje{
  public int Tiempo;
public Viaje(CasaGoku casagoku, ProximaEsfera proximaesfera){
  this.Tiempo = (casagoku.Distancia + proximaesfera.Distancia)/5;
} 
}
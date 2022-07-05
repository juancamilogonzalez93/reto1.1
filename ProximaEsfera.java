public class ProximaEsfera{
  public int Distancia;
  private CasaGoku CasaGoku;
  
  public ProximaEsfera(CasaGoku casaGoku){
    this.CasaGoku = casaGoku;
    this.Distancia = 2 * this.CasaGoku.Distancia + 4; 
  
 }
  
}
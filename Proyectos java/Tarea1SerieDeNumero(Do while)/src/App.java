public class App {
    public static void main(String[] args) throws Exception {
      int PrimerNumero=5;
      int SegundoNumero=10;
      int ContadorCiclo=10;
      int Contador=1;
      int Suma=0;
      System.out.println(PrimerNumero);
      System.out.println(SegundoNumero);
      do
      {
          Contador=Contador+1;
          Suma=PrimerNumero+SegundoNumero;
          System.out.println(Suma);
          PrimerNumero=SegundoNumero;
          SegundoNumero=Suma;
      }
      while (Contador<=ContadorCiclo);
    }
}

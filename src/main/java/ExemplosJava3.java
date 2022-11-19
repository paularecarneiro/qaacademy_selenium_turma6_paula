import java.util.ArrayList;
import java.util.HashMap;

public class ExemplosJava3 {

public static void main (String[] args) {
    //criandoArray();
    //criandoHashMap();
    tratandoExcecao();
}
    public static void criandoArray(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Paula");
        nomes.add("Renata");
        System.out.println(nomes.get(0));
    }

    public static void criandoHashMap(){
        HashMap<Integer,String > nomes = new HashMap<>();
        nomes.put(10,"Paula");
        nomes.put(20, "Renata");
        System.out.println(nomes.get(20));
    }
    public static void tratandoExcecao(){
    String numero = "10xyz";

    try{
    int num = Integer.parseInt(numero);
    System.out.println(num);
    }catch (Exception e){

        throw new RuntimeException("Parse invalido");

   }

  }
}

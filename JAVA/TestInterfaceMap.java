import java.util.HashMap;
import java.util.Map;

public class TestInterfaceMap {
    public static void main(String[] args) {
        Map<Integer, String> mapNomes = new HashMap<>();
        mapNomes.put(1, "UNIVESP");
        mapNomes.put(2, "USP");
        mapNomes.put(3, "UNICAMP");
        mapNomes.put(4, "UNESP"); // Corrigido para a posição 4
        System.out.println(mapNomes);

        // Resgatando o nome da posição 2
        System.out.println(mapNomes.get(3));
    }
}
//• O código abaixo testa a interface Map
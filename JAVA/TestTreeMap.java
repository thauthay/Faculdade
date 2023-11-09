import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String args[]) {
        // Declaração do TreeMap
        TreeMap<Integer, String> tmap;
        tmap = new TreeMap<Integer, String>();
        // Adiciona elementos
        tmap.put(1, "UNIVESP");
        tmap.put(7, "USP");
        tmap.put(6, "UNICAMP");
        tmap.put(4, "UNESP");
        tmap.put(5, "UFMG");
    }
}

//• Armazenar os mapeamentos de chave e valor no 
//TreeMap e obter um mapeamento de chave-valor 
//classificado ao buscar os dados do TreeMap.
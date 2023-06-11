import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdentificarPlacas {
    public static void main(String[] args) {
        // Crie um mapa para armazenar as abreviações de estado e suas sequências de placas correspondentes
        Map<String, String> stateAbbreviations = new HashMap<>();

        // ESTADO DO ACRE
        stateAbbreviations.put("ACRE", "MZN");
        stateAbbreviations.put("ACRE", "NAG");
        stateAbbreviations.put("ACRE", "NXR");
        stateAbbreviations.put("ACRE", "NXT");
        stateAbbreviations.put("ACRE", "OVG");
        stateAbbreviations.put("ACRE", "QLU");
        stateAbbreviations.put("ACRE", "QLZ");
        stateAbbreviations.put("ACRE", "OXP");
        stateAbbreviations.put("ACRE", "OWM");
        stateAbbreviations.put("ACRE", "QWQ");
        
        // ESTADO DO AMAZONAS
        stateAbbreviations.put("AMAZONAS", "JWF");
        stateAbbreviations.put("AMAZONAS", "JXY");
        stateAbbreviations.put("AMAZONAS", "NOI");
        stateAbbreviations.put("AMAZONAS", "NPB");
        stateAbbreviations.put("AMAZONAS", "OAA");
        stateAbbreviations.put("AMAZONAS", "OAO");
        stateAbbreviations.put("AMAZONAS", "OXM");
        stateAbbreviations.put("AMAZONAS", "QZA");
        stateAbbreviations.put("AMAZONAS", "QZZ");
        
        // ESTADO DE RONDÔNIA
        stateAbbreviations.put("RONDÔNIA", "NBB"); 
        stateAbbreviations.put("RONDÔNIA", "NEH"); 
        stateAbbreviations.put("RONDÔNIA", "OXL"); 
        stateAbbreviations.put("RONDÔNIA", "QRA");
        stateAbbreviations.put("RONDÔNIA", "QTA");  
        stateAbbreviations.put("RONDÔNIA", "QTJ"); 
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de placa de licença (formato: L L L Nº L Nº Nº):");
        String licensePlate = scanner.nextLine().toUpperCase().replaceAll(" ", "");

        // Extrai as 3 primeiras letras da placa
        String plateSequence = licensePlate.substring(0, 3);

        // Verifica se a placa corresponde a abreviação do estado
        boolean found = false;
        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) {
            if (entry.getValue().equals(plateSequence)) {
                System.out.println("O veículo é do estado de " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("O estado de origem não pôde ser determinado.");
        }
    }
}

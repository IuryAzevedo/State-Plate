import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdentificarPlacas {
    public static void main(String[] args) {
        // Crie um mapa para armazenar as abreviações de estado e suas sequências de placas correspondentes
        Map<String, String> stateAbbreviations = new HashMap<>();

        // ESTADO DO ACRE
        stateAbbreviations.put("MZN", "ACRE");
        stateAbbreviations.put("NAG", "ACRE");
        stateAbbreviations.put("NXR", "ACRE");
        stateAbbreviations.put("NXT", "ACRE");
        stateAbbreviations.put("OVG", "ACRE");
        stateAbbreviations.put("QLU", "ACRE");
        stateAbbreviations.put("QLZ", "ACRE");
        stateAbbreviations.put("OXP", "ACRE");
        stateAbbreviations.put("OWM", "ACRE");
        stateAbbreviations.put("QWQ", "ACRE");

        // ESTADO DO AMAZONAS
        stateAbbreviations.put("JWF", "AMAZONAS");
        stateAbbreviations.put("JXY", "AMAZONAS");
        stateAbbreviations.put("NOI", "AMAZONAS");
        stateAbbreviations.put("NPB", "AMAZONAS");
        stateAbbreviations.put("OAA", "AMAZONAS");
        stateAbbreviations.put("OAO", "AMAZONAS");
        stateAbbreviations.put("OXM", "AMAZONAS");
        stateAbbreviations.put("QZA", "AMAZONAS");
        stateAbbreviations.put("QZZ", "AMAZONAS");

        // ESTADO DE RONDÔNIA
        stateAbbreviations.put("NBB", "RONDÔNIA");
        stateAbbreviations.put("NEH", "RONDÔNIA");
        stateAbbreviations.put("OXL", "RONDÔNIA");
        stateAbbreviations.put("QRA", "RONDÔNIA");
        stateAbbreviations.put("QTA", "RONDÔNIA");
        stateAbbreviations.put("QTJ", "RONDÔNIA");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de placa de licença (formato: L L L Nº L Nº Nº):");
        String licensePlate = scanner.nextLine().toUpperCase().replaceAll(" ", "");

        // Extrai as 3 primeiras letras da placa
        String plateSequence = licensePlate.substring(0, 3);

        // Verifica se a placa corresponde à abreviação do estado
        boolean found = false;
        for (Map.Entry<String, String> entry : stateAbbreviations.entrySet()) {
            if (entry.getKey().equals(plateSequence)) {
                System.out.println("O veículo é do estado de " + entry.getValue());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("O estado de origem não pôde ser determinado.");
        }
    }
}

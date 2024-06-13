import java.io.*;
import java.util.*;

public class nutritionistUpdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el código que quiere buscar:");
        String updateid = sc.nextLine();

        File f1 = new File("./registerNutritionist.csv");
        ArrayList<Dietitian> dietitians = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(f1)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    Dietitian dietitian = new Dietitian(parts[0], parts[1], parts[2]);
                    dietitians.add(dietitian);
                } 
            }
        } catch (FileNotFoundException e) {
            System.out.println("Se ha producido un error al cargar los nutricionista: " + e.getMessage());
        }


        for (Dietitian dietitian : dietitians) {
            if (dietitian.getdietitianId().equals(updateid)) {
                System.out.println("Nutricionista encontrado: " + dietitian.getname());
                System.out.println("Ingrese la nueva información del nutricionista:");

                System.out.println("Nombre completo: ");
                dietitian.setName(sc.nextLine());

                System.out.println("especialidad");
                dietitian.setSpecialty(sc.nextLine());

                break;
            }
        }

        // Guardar la nueva información en el archivo CSV
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Dietitian dietitian : dietitians) {
                bw.write(dietitian.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los nutricionista: " + e.getMessage());
        }
    }
}

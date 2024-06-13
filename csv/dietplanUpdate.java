import java.io.*;
import java.util.*;
public class dietplanUpdate {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el código que quiere buscar:");
        String updateid = sc.nextLine();

        //search diet plan in cvs register
        File f1 = new File("./dietplan.csv");
        ArrayList<DietPlan> dietplans = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(f1)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    DietPlan dietPlan = new DietPlan(parts[0], parts[1], parts[2], parts[3]);
                    dietplans.add(dietPlan);
                } else {
                    System.out.println("La línea " + line + " no tiene suficientes elementos para crear un paciente.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Se ha producido un error al cargar los pacientes: " + e.getMessage());
        }

        // update diet plan information in cvs record
        for (DietPlan dietPlan : dietplans) {
            if (dietPlan.getplanId().equals(updateid)) {
                System.out.println("plan de alimentacion encontrado: " + dietPlan.getplanId());
                System.out.println("Ingrese la nueva información del plan de alimentacion:");

                System.out.println("las nuevas calorias diarias: ");
                dietPlan.setDailyCalories(sc.nextLine());

                System.out.println("la nueva distribuccion de macronutrientes");
                dietPlan.setMacronutrientDistribution(sc.nextLine());

                System.out.println("las nuevas recomendaciones especificas");
                dietPlan.setSpecificRecomendations(sc.nextLine());




                break;
            }
        }

        // Guardar la nueva información en el archivo CSV
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (DietPlan dietPlan : dietplans) {
                bw.write(dietPlan.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los pacientes: " + e.getMessage());
        }
    }
}

    

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class deleteNutricionist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el código que quiere eliminar:");//search nutritionist in cvs and delete it
        String deleteid = sc.nextLine();

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
     // save the new information to the cvs file
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Dietitian dietitian: dietitians) {
                bw.write(dietitian.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los nutricionistas: " + e.getMessage());
        }
        dietitians.removeIf(dietitian -> dietitian.getdietitianId().equals(deleteid));

       
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Dietitian dietitian : dietitians) {
                bw.write(dietitian.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los nutricionistas: " + e.getMessage());
        }
    }
    

}
    


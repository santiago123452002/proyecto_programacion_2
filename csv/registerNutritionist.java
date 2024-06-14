import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class registerNutritionist {
 public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        ArrayList<Dietitian> al= listNutritionist(sc);

        //create the csv file
        File f= new File("./registerNutritionist.csv");
        try(FileWriter fw= new FileWriter(f, true)){
            for (Dietitian Dietitian : al){
                fw.write(Dietitian.tocsv()+ "\n");
            }

        }catch (Exception e){
            System.out.println("se ha producido un error");
        }

    }

    //register Nutritionist information
    public static ArrayList<Dietitian> listNutritionist (Scanner sc){
        ArrayList<Dietitian> al= new ArrayList<Dietitian>();
        String dietitianId;
       String name;
       String specialty;


        Dietitian p;

          do{
            System.out.println("Desea registar un nutricionista... (si/no)");
            opc = sc.nextLine();
           
            if(!opc.equalsIgnoreCase("no")){
                System.out.println("Codigo: ");
                dietitianId= sc.nextLine();

                System.out.println("Nombre completo ");
                name= sc.nextLine();

                System.out.println("Especialidad");
                specialty=sc.nextLine();

                p = new Dietitian(dietitianId, name,specialty);
                al.add(p);
            }

        }while (!opc.equalsIgnoreCase("no"));
        return al;
    }
    
  
}


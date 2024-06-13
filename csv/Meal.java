public class Meal {
    public static void main(String[] args) {

        //show diet options
        System.out.println("segun el plan que se le dio escriba la opcion para registro de comida");
        int opc = Integer.parseInt(Console.readLine());

        System.out.println("escriba 1.desayuno 2.Almuerzo 3.cena");
        int opc2= Integer.parseInt(Console.readLine());

        String macronutrients;
        int calories;

        if (opc2 == 1) {
       if (opc == 1) {
        System.out.println("registro de desayuno para cada dia de la semana ");
        System.out.println("lunes: batido pan con aguacate y pavo contiene estos macronutrientes System.out.println(\"Grasas: Alrededor de 10 g.\" + \"Carbohidratos: Cerca de 30 g.\" + \"Proteínas: Alrededor de 15 g.\");");
            System.out.println("martes: yogurt con copos de maiz y crema de almendras");
            System.out.println("miercoles: avena con crema de almendras y fruta");
            System.out.println("jueves:batido pan con humus y memerlada ");
            System.out.println("viernes:smothie de fruta y yogurt pan con aceite ");
            System.out.println("sabado: leche con cacao pan crema de cacahuete ");
            System.out.println("domingo: leche con cereales y cacao puro ");

            calories=1000;
                System.out.println("las calorias a la hora del desayuno es " + calories);
       
    }else if(opc ==2){
            System.out.println("registro de desayuno para cada dia de la semana ");
            System.out.println("lunes: yogurt con futas y granola");
            System.out.println("martes: tostadas de aguacate y huevo");
            System.out.println("miercoles: batido de proteinas con leche y frutos secos");
            System.out.println("jueves: panquecas de avena y agua de piña");
            System.out.println("viernes: sandwich de atun lechuga, te verde");
            System.out.println("sabado:espinacas jugo de naranja sin azucar");
            System.out.println("domingo: panquecas de banana y avena");
                macronutrients="son ricas en proteinas y carbohidratos ";
                System.out.println("estas opciones de desayuno contienen :"+macronutrients);
                calories=400;
                System.out.println("las calorias a la hora del desayuno es " + calories);
            
       

        }else if (opc == 3) {
            System.out.println("registro de desayuno para cada dia de la semana ");
            System.out.println("lunes: zumo de frutas o cafe con leche");
            System.out.println("martes: cafe con leche o zumo de frutas, con mini jamon de atun");
            System.out.println("miercoles: zumo de naranja o cafe con leche con mi jamon");
            System.out.println("jueves:cafe con leche, mini de atun");
            System.out.println("viernes: tazon de leche con cereal");
            System.out.println("sabado: libre de comer lo que quieras");
            System.out.println("domingo:zumo de naranja, mini de jamon");

            calories=500;
            System.out.println("las calorias de cada desayuno deben de ser " + calories);
            
            
        }else if(opc ==4){
            System.out.println("registro de desayuno para cada dia de la semana ");
            System.out.println("lunes: avena con fresas");
            System.out.println("martes: huevo con tostadas");
            System.out.println("miercoles: pancakes de banana, taza de cafe ");
            System.out.println("jueves: sandwich con aguacate y huevo");
            System.out.println("viernes: batido de chocolate y banana ");
            System.out.println("sabado: pancakes de chocolate light");
            System.out.println("domingo: batido verde y mousse de proteina");
            calories=400;
            System.out.println("las calorias de cada desayuno deben de ser " + calories);

        }

       
                
           
        }else if(opc2==2){
            if (opc == 1) {
                System.out.println("registro de almuerzo para cada dia de la semana");  
                System.out.println("lunes: ensalada de lechuga,queso y maiz garbanzos con arroz y calabaza  ");
                System.out.println("martes: pescado al horno con pure de patatas casero y verdura pan ");
                System.out.println("miercoles: lentejas con quinoa y verdura pan con aceite ");
                System.out.println("jueves: pure de calabaza y boniato");
                System.out.println("viernes: salmon a la plancha con naranja pan y fruta ");
                System.out.println("sabado:tortilla de patata cocida pan con hummus fruta ");
                System.out.println("domingo: pure de boniato pesacado horno patatas asadas");
                calories=1000;
                System.out.println("las calorias de cada una de estas opciones de almuerzo es"+ calories);

            }else if(opc==2){
                System.out.println("registro de almuerzo para cada dia de la semana");
                System.out.println("lunes: Ensalada de pollo a la parrilla");
                System.out.println("martes: Salmon con brocoli");
                System.out.println("miercoles: Tacos de pavo con tortillas de maiz y guacamole");
                System.out.println("jueves: pechuga de pollo, arroz integral y agua de piña");
                System.out.println("viernes: pescado, taza de arroz integral, ensealda de vegetales");
                System.out.println("sabado: filete de carne de res, habichuelas al vapor");
                System.out.println("domingo: sopa de verduras, y media taza de arroz integral");
                macronutrients="Proteinas, grasas saludables y carbohidratos";
                System.out.println("estas opciones de almuerzo contienen: "+macronutrients);
                calories=600;
                System.out.println("las calorias de cada una de estas opciones de almuerzo es"+ calories);

        
                
           

            }else if(opc == 3){
                System.out.println("registro de almuerzo para cada dia de la semana");
                System.out.println("lunes: te blanco, 1 puñado de frutos secos");
                System.out.println("martes: muslo de pollo en  salsa");
                System.out.println("miercoles: salmon a la plancha");
                System.out.println("jueves: sopa de verduraras con patatas");
                System.out.println("viernes: ensalada de lechuga tomate pepino y huevo");
                System.out.println("sabado: brocoli con zanahorias");
                System.out.println("domingo: judias verdes hervidas");
                calories=700;
                System.out.println("las calorias para cada almuerzo es  " + calories);

            }else if(opc ==4){
                System.out.println("registro de almuerzo para cada dia de la semana");
                System.out.println("lunes: pechuga de pollo y vegetales ");
                System.out.println("martes: sopa de res con verduras  ");
                System.out.println("miercoles: tacos de lechuga light ");
                System.out.println("jueves: filete de carne a la parrilla y vegetales ");
                System.out.println("viernes: sopa de pollo y verduras ");
                System.out.println("sabado: salmon con habichuela");
                System.out.println("domingo: ensalada con pechuga");
                calories=500;
                System.out.println("las calorias para cada almuerzo es  " + calories);



            }
        }else if(opc2==3){
            if (opc==1) {
                System.out.println("para la cena tienes estas opciones");
                System.out.println("lunes: tortilla de patata y calabacin  ");
                System.out.println("martes: graten de verduras con carne picada ");
                System.out.println("miercoles: revuelto de brocoli y queso cheddar con semilla de sesamo ");
                System.out.println("jueves: ensalada con aguacate pescado al micro con mahonesa casera ");
                System.out.println("viernes: pure de verduras con avena quesitos con uvas");
                System.out.println("sabado: calabacin al horno gratinado con tomato ");
                System.out.println("domingo: verdura al graten, con oregano o pizza ");
                calories=1000;
                System.out.println("las calorias para la cena es  " + calories);

            }else if(opc==2){
                System.out.println("para la cena tienes estas opciones");
                System.out.println("lunes: Ensalada de pollo a la parrilla con espinacas, tomate y nueces");
                System.out.println("martes: Salmón al horno con brócoli y quinoa");
                System.out.println("miercoles: Tacos de pavo con tortillas de maiz ");
                System.out.println("jueves: pescado al vapor y ensalada de vegetales");
                System.out.println("viernes: filete a la plancha, verduras cocidas");
                System.out.println("sabado: pescado y habichuela tomate en rodaja");
                System.out.println("domingo: filete de carne de res, lechuga, tomate, pepino en trocitos");
                macronutrients="Proteínas (pollo, lentejas), carbohidratos (batata, arroz integral) y fibra (verduras)";
                calories=600;
                System.out.println("las calorias de cada una de estas opciones de cena es"+ calories);

                
           

            }else if(opc == 3){
                System.out.println("para la cena tienes estas opciones");
                System.out.println("lunes: espinacas, pechuga de pollo, yogurt");
                System.out.println("martes: pechuga de pavo y yogurt ");
                System.out.println("miercoles: atun y yogurt ");
                System.out.println("jueves: revuleto de esparragos con jamon ");
                System.out.println("viernes: ensalda verde, burritos de verduras");
                System.out.println("sabado: esparragos verdes y queso ");
                System.out.println("domingo: pavo con yogurt ");

                calories=300;
                System.out.println("las calorias para la cena es  " + calories);


            }else if(opc ==4){
                System.out.println("para la cena tienes estas opciones");
                System.out.println("lunes: pescado al vapor");
                System.out.println("martes: omelette con pollo y ensalada ");
                System.out.println("miercoles: carnde de cerdo con verduras ");
                System.out.println("jueves: brochetas de pollo y verduras ");
                System.out.println("viernes: salmon con habichuela");
                System.out.println("sabado: sopa de pollo y verduras");
                System.out.println("domingo: pescado");
                calories=300;
                System.out.println("las calorias para la cena es  " + calories);

            }
        }
       

      

            
        



        
       }
    
        
    }


    


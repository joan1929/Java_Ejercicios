
class Estructuras_de_Control{
    public static void main(String[] args) {
        System.out.println("Structure_Control_IF");

        int numeroif = 2;
        if ( numeroif > 0){
            System.out.println("EL num es positivo: "+ numeroif);
        }else if (numeroif < 0) {
            System.out.println("El num es negativo: "+ numeroif);
        }else{
            System.out.println("EL num sera igual a cero: "+ numeroif);
        }       
        
        System.out.println();
        System.out.println("Structure_Control_While");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("El Num_while es: "+ numeroWhile);
            numeroWhile= numeroWhile + 1;}
        
        System.out.println();
        System.out.println("Structure_Control_DO_While");        

        do{
            System.out.println("El Num_Do_while: " +numeroWhile);
        numeroWhile= numeroWhile+1;
        } while (numeroWhile < 3);
        
        System.out.println();
        System.out.println("Structure_Control_For");   

        for(int numeroFor = 0; numeroFor <=3;numeroFor++){
            System.out.println("el valor es: "+ numeroFor);
        }
        System.out.println();
        System.out.println("Structure_Control_Switch");

        var estacion = "Otoño"; 
            switch(estacion.toLowerCase()){
                case "verano":
                case "invierno":
                case "primavera":
                case "otoño":
                estacion.toLowerCase();
                    System.out.println("La estacion en que estamos es: " + estacion);
                    break;
                default:
                    System.out.println(" Estas en default, La variable que escribiste no es una estacion ");
                    break;
                }
        
    }

}

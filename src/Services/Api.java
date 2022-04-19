package Services;

public class  Api{

    String[] arr = country();
    public String[] data(int randomIndex) {


        return new String[0];
    }

    public String[] country() {

        return new String[]{
                "Afeganistão:Kabul", "África do Sul:Pretória", "Albânia:Tirana",
                "Alemanha:Berlim", "Angola:Luanda", "Arábia Saudita:Riad",
                "Argentina:Buenos Aires", "Australia:Camberra", "Armênia:Yerevam",
                "Azerbaijão:Bacu", "Bahamas:Nassau", "Bangladexe:Daca", "Bélgia:Bruxelas",
                "Bielorrússia:Minsque", "Bolívia:Sucre", "Bulgária:Sófia", "Cabo Verde:Praia",
                "Catar:Doa", "Canadá:Otava", "Cazaquistão:Astana", "Chile:Santiago",
                "China:Pequim", "Colômbia:Bogotá", "Coreia do Sul:Seul", "Costa Rica:São José"
        };
    }

    public String[] set (String[] arr, int randomIndex){

        String[] setter = arr;
        String Temp;
        Boolean t = arr[randomIndex].split("://").equals(arr[randomIndex]);

        if(!t){
            System.out.println("Ja foi");
        }
        else {

            Temp = setter[randomIndex] + "/" + randomIndex;
            setter[0] = Temp;

            setter = setter[randomIndex].split("://");

            return setter;
        }
    }
}

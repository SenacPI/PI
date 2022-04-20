package Services;

public class  Api{

    public String[] data(int randomIndex) {
        return set(country(), randomIndex);
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

    private String[] set (String[] arr, int randomIndex){

        String[] setter = arr;
        String Temp;

        Temp = setter[randomIndex] + "/" + randomIndex;
        setter = Temp.split(":, /");
        arr[randomIndex] = Temp;

        return validator(setter, arr, randomIndex);
    }

    private  String[] validator (String[] setter, String[] arr, int randomIndex) {
        if (setter.length == 3) {
            set(arr, randomIndex);
        }
        return setter;
    }
}



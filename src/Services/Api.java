package Services;

import java.util.ArrayList;

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
        ArrayList<String> ref = new ArrayList<>();
        String Temp;

        ref.add(arr[randomIndex]);

        Temp = setter[randomIndex] + "/" + randomIndex;
        setter = Temp.split(":, /");

        return validator(ref, arr, setter, randomIndex);
    }

    private  String[] validator (ArrayList ref, String[] arr, String[] setter, int randomIndex) {

        for (Object o : ref) {

            if (o == arr[randomIndex]) {
                set(arr, randomIndex);
            } else {
                break;
            }
        }
        return setter;
    }

}



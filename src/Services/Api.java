package Services;

import java.util.LinkedList;

public class  Api{

    public String[] data(int randomIndex) {
        set(country(), randomIndex);

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
        Integer counter;

        LinkedList<String[]> ref = new LinkedList<>();

        Temp = setter[randomIndex] + "/" + randomIndex;
        setter[0] = Temp;
        setter = setter[randomIndex].split(":, /");

        ref.push(setter);
        if (validator(setter)){
            return setter;
        }
    }

    interface returns {
     String[] set();
     boolean;
    }
    public  boolean validator (String[] setter) {
        switch (setter.length)
        {
            case 3:
                return true;
            default:
                return false;
        }
    }
}



package Services;

public class Api{

    public String[] data(int randomIndex) {

        return country()[randomIndex].split(":");
    }

    public String[] country() {

        return new String[]{
                "Afeganistão:Kabul", "África do Sul:Pretória", "Albânia:Tirana",
                "Alemanha: Berlim", "Angola:Luanda", "Arábia Saudita:São João",
                "Argentina:Buenos Aires", "Australia:Camberra", "Armênia:Yerevam",
                "Azerbaijão:Bacu", "Bahamas:Nassau", "Bangladexe:Daca", "Bélgia:Bruxelas",
                "Bielorrússia:Minsque", "Bolívia:Sucre", "Bulgária:Sófia", "Cabo Verde:Praia",
                "Catar:Doa", "Canadá:Otava", "Cazaquistão: Astana", "Chile:Santiago",
                "China:Pequim", "Colômbia:Bogotá", "Coreia do Sul:Seul", "Costa Rica: São José"
        };
    }
}

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartv = new SmartTv();

        System.out.println("TV ligada? " + smartv.ligada);

        smartv.ligar();
        System.out.println("Novo status - TV ligada? " + smartv.ligada);

        System.out.println("Volume atual: " + smartv.volume);
        smartv.aumetarVolume();
        smartv.aumetarVolume();
        smartv.aumetarVolume();
        smartv.aumetarVolume();
        System.out.println("Volume atual: " + smartv.volume);

        System.out.println("Canal atual: " + smartv.canal);
        smartv.mudarCanal(17);
        System.out.println("Canal atual: " + smartv.canal);

        smartv.aumetarVolume();
        System.out.println("Novo status - Volume atual: "  + smartv.volume);
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        System.out.println("Novo status - Volume atual: "+ smartv.volume);


        smartv.desligar();
        System.out.println("Novo status - TV ligada? " + smartv.ligada);
    }
}
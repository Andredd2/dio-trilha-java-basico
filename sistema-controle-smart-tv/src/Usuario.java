public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criando um objeto SmartTv
        SmartTv smartTv = new SmartTv();
        
        // Ligando a Tv e verificando o Status de ligada
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada : " + smartTv.ligada);

        // Verificando o canal atual e mudando para um novo canal
        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("Canal Atual : " + smartTv.canal);
        
        // Diminuindo e Aumentando o volume da tv
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual : " + smartTv.volume);
        
        // Verificando todos os status da SmartTv atual
        System.out.println("TV ligada : " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada : " + smartTv.ligada);
       
    }
}

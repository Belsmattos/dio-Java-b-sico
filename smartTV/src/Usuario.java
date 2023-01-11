import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(12);

        System.out.println("Canal atual: " + smartTv.canal);


        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);
    }
}

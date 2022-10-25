public class Main {
    public static void main(String[] args) {

        //instanciar um piloto
        Piloto pilotoEliane = new Piloto (
                "Eliane",
                38 ,
                Sex.FEMININO ,
                "Ferrari");

        //instanciar um carro de corrida
        CarroCorrida carroFerrari = new CarroCorrida(
                12 ,
                pilotoEliane,
                180,
                60,
                true);

        System.out.println(pilotoEliane);
        System.out.println(carroFerrari);

        //testando metodos

        carroFerrari.carBreak(30);
        carroFerrari.speedUp(50);
        carroFerrari.speedUp(150);
        carroFerrari.stop();
        carroFerrari.switchOff();
        carroFerrari.turnOn();
    }
}
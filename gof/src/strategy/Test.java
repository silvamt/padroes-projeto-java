package strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robon = new Robo();
        robon.setComportamento(normal);
        System.out.println("robo normal:");
        robon.mover();

        Robo robod = new Robo();
        robod.setComportamento(defensivo);
        System.out.println("robo defensivo:");
        robod.mover();

        Robo roboa = new Robo();
        roboa.setComportamento(agressivo);
        System.out.println("robo agressivo:");
        roboa.mover();

    }
}

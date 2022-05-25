package OO.Elevador;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializar();

        System.out.println(elevador.toString());

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        System.out.println(elevador.entrar(5));
        elevador.sair(7);

        System.out.println(elevador.toString());
    }


}

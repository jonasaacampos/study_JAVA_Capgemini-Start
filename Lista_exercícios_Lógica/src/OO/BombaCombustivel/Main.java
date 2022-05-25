package OO.BombaCombustivel;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel("Gasolina", 10f,100f);

        System.out.println(bomba1.statusBomba());

        bomba1.alterarCombustivel("querosene");
        bomba1.abastecerPorLitro(50f);
        bomba1.alterarQuantidadeCombustivel(150f);

        System.out.println(bomba1.statusBomba());

    }
}

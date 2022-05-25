package OO.Fatura;

public class Main {
    public static void main(String[] args) {
        Invoice fatura = new Invoice(1,"WebCam", 3, 150.5F);

        System.out.println(fatura.getInvoiceAmount());
    }
}

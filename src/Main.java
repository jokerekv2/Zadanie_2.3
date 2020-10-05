public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();

        product1.name = "Mleko";
        product1.producer = "Mlekowita";
        product1.price = 2.5;

        product2.name = "Czekolada";
        product2.producer = "Wedel";
        product2.price = 2.19;

        System.out.println(product1.name + " " + product1.producer + " " + product1.price + "zł");
        System.out.println(product2.name + " " + product2.producer + " " + product2.price + "zł");
    }
}

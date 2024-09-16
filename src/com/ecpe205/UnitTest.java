
public class UnitTest {
    public static void main(String[] args) {

        //1. Create an item and check if the amount computed coincides with your expected computation
        Order order = new Order();
        order.addItem(new Product("12345", "agogo",210 ),2);

        System.out.println(order.getItems().get(0).getAmount());

        //2. Create an item, then use setProduct to change the product, then check if the amount computed coincides with your expected computation
        order.addItem(new Product("12345", "mint",100 ),5);
        System.out.println(order.getItems().get(1).getProduct().getName());

        System.out.println(order.getItems().get(1).getAmount());

        order.getItems().get(1).setProduct(new Product("654321", "honey", 400));
        System.out.println(order.getItems().get(1).getProduct().getName());

        System.out.println(order.getItems().get(1).getAmount());

        //3.Create an item, then use setQuantity to change the quantity, then check if the amount computed coincides with your expected computation
        order.addItem(new Product("654321", "honey",400 ),12);
        System.out.println(order.getItems().get(2).getQuantity());

        order.getItems().get(2).setQuantity(40);

        System.out.println(order.getItems().get(2).getQuantity());
    }
}
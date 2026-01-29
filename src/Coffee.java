public class Coffee {
    public int orderNumber;
    public String beanFlavor;
    public boolean isIced;

    public Coffee(int zorderNumber, String zbeanFlavor, boolean zisIced){
        orderNumber = zorderNumber;
        beanFlavor = zbeanFlavor;
        isIced = zisIced;
    }

    public void printInfo(){
        System.out.println("The order number is: "+orderNumber);
        System.out.println("The bean flavor is: "+beanFlavor);
        System.out.println("It is "+isIced+" that the coffee is iced.");
    }
}

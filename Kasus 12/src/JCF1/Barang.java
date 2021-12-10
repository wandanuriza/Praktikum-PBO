package JCF1;

public class Barang {

    private Status status; //warning status barang not used
    private ServicePackage servicePackage; 
    private City city;
    private long weight;
    private long quantity;
    private long priceItem;
    private String productName;


    @Override
    public String toString() {
        return "Barang{"+productName+" | "+quantity+" | "+weight+" | "+
                city.getDestination()+" | "+servicePackage.getService()+" | "+
                servicePackage.getValue()+" | "+((priceItem*quantity)+servicePackage.getValue());
    }
    
    
}

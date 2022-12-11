
package models;

/**
 *
 * @author vicken
 */
public class Vendors {
    private int vendorID;
    private int addressID;
    private String vendorName;
    private int productList;
    private double totalSales;
    
    public Vendors(int vendorID, int addressID, String vendorName, int productList, double totalSales) {
        this.vendorID = vendorID;
        this.addressID = addressID;
        this.vendorName = vendorName;
        this.productList = productList;
        this.totalSales = totalSales;
    }
    
    public int getVendorID() {
        return vendorID;
    }
    
    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public int getAddressID() {
        return addressID;
    }
    
    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getVendorName() {
        return vendorName;
    }
    
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getProductList() {
        return productList;
    }
    
    public void setProductList(int productList) {
        this.productList = productList;
    }

    public double getTotalSales() {
        return totalSales;
    }
    
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
}

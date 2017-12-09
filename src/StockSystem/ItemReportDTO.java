package StockSystem;

public class ItemReportDTO {

    private String itemName;
    private int itemNetProfit;
    private int itemPrice;
    private String manufacturerName;
    private String manufacturerTel;

    public ItemReportDTO(String itemName, int itemNetProfit, int itemPrice, String manufacturerName, String manufacturerTel) {
        this.itemName = itemName;
        this.itemNetProfit = itemNetProfit;
        this.itemPrice = itemPrice;
        this.manufacturerName = manufacturerName;
        this.manufacturerTel = manufacturerTel;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNetProfit() {
        return itemNetProfit;
    }

    public void setItemNetProfit(int itemNetProfit) {
        this.itemNetProfit = itemNetProfit;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerTel() {
        return manufacturerTel;
    }

    public void setManufacturerTel(String manufacturerTel) {
        this.manufacturerTel = manufacturerTel;
    }
    

}

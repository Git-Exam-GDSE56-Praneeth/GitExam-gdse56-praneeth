package lk.exam.pos.model;

/**
 * @auther Praneeth Geethanjana <geethanjana10@gmail.com>
 * @Since 10/9/2021
 */
public class Item {
    private String itemcode;
    private String description;
    private double unitprice;
    private int qtyonhand;

    public Item() {
    }

    public Item(String itemcode, String description, double unitprice, int qtyonhand) {
        this.itemcode = itemcode;
        this.description = description;
        this.unitprice = unitprice;
        this.qtyonhand = qtyonhand;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public int getQtyonhand() {
        return qtyonhand;
    }

    public void setQtyonhand(int qtyonhand) {
        this.qtyonhand = qtyonhand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemcode='" + itemcode + '\'' +
                ", description='" + description + '\'' +
                ", unitprice=" + unitprice +
                ", qtyonhand=" + qtyonhand +
                '}';
    }
}

// package ToyShop;

public class Toys {
    private int id;
    private String name;
    private int quantity;
    private int weight;

    public Toys(int i, String n, int q, int w){
        this.id=i;
        this.name=n;
        this.quantity=q;
        this.weight=w;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getWeight() {
        return weight;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

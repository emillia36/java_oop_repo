package Searchingsorting;

public class Item {
String Itemname;
double price;
int qty;

public String getItemname() {
	return Itemname;
}

public void setItemname(String itemname) {
	Itemname = itemname;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public Item(String itemname, double price, int qty) {
	super();
	Itemname = itemname;
	this.price = price;
	this.qty = qty;
}
}

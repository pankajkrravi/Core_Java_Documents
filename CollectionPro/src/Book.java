public class Book
{
int bid;
String bname;
double price;
public Book(int bid, String bname, double price)
{
	this.bid = bid;
	this.bname = bname;
	this.price = price;
}
@Override
public String toString()
{
	return "Book [" + bid + "," + bname + "," + price + "]";
}

}

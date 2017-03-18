class Customer{
	int id;
	String name;
	int oid;
	String orderName;
}
class Bill
{
	Customer giveCustomerBill(){
		Customer customer = new Customer();
		customer.id =1001;
		customer.name = "Ram";
		customer.oid = 10;
		customer.orderName="Mobile Order";
		return customer;  //99
		//return "amit";
	}
}
public class CoVariant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
		Customer cust = bill.giveCustomerBill();
		System.out.println(cust.id);
		System.out.println(cust.name);
	}

}

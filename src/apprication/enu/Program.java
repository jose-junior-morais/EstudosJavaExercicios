package apprication.enu;

import java.util.Date;

import entitiesenum.Order;
import entitiesenum.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		Order order=new Order(8,date,OrderStatus.PROCESSANDO);
		
		System.out.println(order.toString());

	}

}

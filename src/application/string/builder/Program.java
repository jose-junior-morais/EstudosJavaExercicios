package application.string.builder;

import java.util.Date;

import entities.string.builder.Client;

public class Program {

	public static void main(String[] args) {
		
		Client client=new Client("Bob","bob@gmail",new Date());

		System.out.println(client.toString());
		
	}

}

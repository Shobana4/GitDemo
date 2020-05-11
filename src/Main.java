import java.util.Scanner;

class Product 
{
	
	private Long id;
	private String productName;
	private String supplierName;
	
	Product() {
	
	}
	Product(Long id,String productName, String supplierName) 
	{
		 this.id=id;
		 this.productName=productName;
		 this.supplierName=supplierName;
	}
		
		
	
		public void display()
		{
		
			System.out.println("Product Id is "+id);
			System.out.println("Product");
			System.out.println("Product Name is "+productName);
			System.out.println("Supplier Name is "+supplierName);
		}
		
	}

//***************************************************************

public class Main 
{
	
	private static Scanner sc;


	public static void main(String[] args) 
	{
		
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the product id");
		Long id2=sc.nextLong();sc.nextLine();
		
		System.out.println("Enter the product name");
		String pname1=sc.nextLine();
		
		System.out.println("Enter the supplier name");
		String sname1=sc.nextLine();
		
		//Product pr1=new Product();
		
		Product pr=new Product(id2,pname1,sname1);
		pr.display();
	}

}



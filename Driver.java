
public class Driver {
	public static void main(String [] args) {
		Author a1 = new Author();
		
		a1.setName("Bryan");
		a1.setGender('M');
		a1.setEmail("blabla");
		System.out.println(a1.toString());
		
		Author[] authors = new Author[2];
		authors[0] = new Author("ohnouh", "blablabla.gmail.com", 'm');
		authors[1] = new Author("someone", "aaa.gmail.com", 'm');
		Book b1 = new Book("three pigs", authors, 100000, 2);
		System.out.println(b1.toString());
		System.out.println(b1.getAuthorNames(authors));
		
		MyPoint original = new MyPoint(1, 2);
		MyPoint new1 = new MyPoint(4, 6);
		MyPoint new2 = new MyPoint(2, 7);
		System.out.println(original.toString());
		System.out.println(original.distance(5, 8));
		System.out.println(original.distance(new1));
		System.out.println(original.distance());
		
		MyCircle circle1 = new MyCircle(5, original);
		MyCircle circle2 = new MyCircle(8, new1);
		System.out.println(circle1.toString());
		System.out.println(circle1.getArea());
		System.out.println(circle1.getCircumference());
		System.out.println(circle1.distance(circle2));
		
		MyTriangle triangle1 = new MyTriangle(original, new1, new2);
		System.out.println(triangle1.toString());
		System.out.println(triangle1.getPerimeter());
		System.out.println(triangle1.getType());
		
		MyPoint topleftrect = new MyPoint(1, 9);
		MyPoint bottomrightrect = new MyPoint(4, 1);
		MyRectangle rectangle1 = new MyRectangle(topleftrect, bottomrightrect);
		System.out.println(rectangle1.toString());
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getPerimeter());
		
		Customer customer1 = new Customer(2301, "Bryan", 60);
		Invoice example1 = new Invoice(2302, customer1, 500000);
		System.out.println(customer1.toString());
		System.out.println(example1.getCustomerName());
		System.out.println(example1.getAmount());
		System.out.println(example1.getAmountAfterDiscount());
		
		Account account1 = new Account(2303, customer1, 1500.342);
		System.out.println(account1.getBalance());
		System.out.println(account1.getCustomerName());
		System.out.println(account1.toString());
		System.out.println(account1.deposit(500));
		System.out.println(account1.withdraw(300));
		System.out.println(account1.getBalance());
	}
}

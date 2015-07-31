import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;



public class JAXBExample {
public static void main(String args[])
{
Customer customer = new Customer();
customer.setName("karshan");
customer.setAge(20);
customer.setId(237);

try
{
	File file = new File("C:\\karshan.xml");
	JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
	 
	jaxbMarshaller.marshal(customer, file);
	jaxbMarshaller.marshal(customer, System.out);

	
}
catch (Exception e) {
	// TODO: handle exception
}
}
}

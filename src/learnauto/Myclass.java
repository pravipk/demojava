package learnauto;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Myclass {
 
	WebDriver driver;
	
	@Test
	 public void read_xml(){
		try{
  		File fXmlFile = new File("D://try.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		
		Node HotelNode = (Node) doc.getElementsByTagName("HotelCredentials");

		
		System.out.println("\nCurrent Element :" + HotelNode.getNodeName());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		    }		
	}

}
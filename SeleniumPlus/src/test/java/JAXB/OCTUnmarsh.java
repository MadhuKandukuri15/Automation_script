package JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class OCTUnmarsh {
	public void Oct20Unmarsh() throws JAXBException {
		JAXBContext Oct20Obj=JAXBContext.newInstance(OCTJAXBDemo.class);
		Unmarshaller Oct20U=Oct20Obj.createUnmarshaller();
		OCTJAXBDemo OCtObj1= (OCTJAXBDemo)Oct20U.unmarshal(new File ("src\\test\\java\\JAXB\\OctJaxB.xml"));

		System.out.println("Employee Details are: ");
		System.out.println(OCtObj1.getStudentname());
		System.out.println(OCtObj1.getStudentaddress());
		System.out.println(OCtObj1.getStudentID());
		System.out.println(OCtObj1.getStudentphone());

		}
	

}

package com.frequentis.semnotam.ws.test;

import com.frequentis.semnotam.schema._1.AerodromeType;
import com.frequentis.semnotam.schema._1.FirType;
import com.frequentis.semnotam.schema._1.InterestSpecResultType;
import com.frequentis.semnotam.ws.SemNotamWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

public class SemNotamTest {

	public static void main(String[] args) {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setAddress("http://localhost:8081/SemNotamWebService/services/SemNotamWebServicePort");
		
		factory.setServiceClass(SemNotamWebService.class);
		
		SemNotamWebService client = (SemNotamWebService)factory.create();
		
		try {
			List<String> response = client.getAircraftTypeIds() ;
//					.getInterestFromConcept("http://www.SemNotam.com/ontology", "http://www.SemNotam.com/ontology/Spatial/Fir_Austria");

			System.out.println(" Result : ");
			for (String fir : response) {
				System.out.println(fir);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FirType result = ((SemNotamWebService)client).getFirById("KZDC");
				
			System.out.println(" Result : ");
			//for (String fir : response) {
				System.out.println(result.getId());
				System.out.println(result.getDesignator());
				System.out.println(result.getLocalId());
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			InterestSpecResultType result = ((SemNotamWebService)client).evaluateInterestSpecification(null, true);
				
			System.out.println(" Result : ");
			//for (String fir : response) {
				System.out.println(result.getId());
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			AerodromeType result = ((SemNotamWebService)client).getAerodromeById("KJFK");
				
			System.out.println(" Result : ");
			//for (String fir : response) {
				System.out.println(result.getId());
				System.out.println(result.getArp().getElevatedPoint().getPos().getValue().get(0).toString());
				
			//}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

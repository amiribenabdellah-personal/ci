
package tn.esprit.spring.service;

 
import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {

		@Autowired
		IEmployeService us; 
		@Test
		public void testAddEmp() throws ParseException {

			Employe u = new Employe(1,"IbenAbdellah", "IbenAbdellah", "amir.ibenabdellah@esprit.tn",true ,Role.INGENIEUR); 

			Assert.assertEquals(u.getNom(),u.getPrenom());
	
		}
	 
	
		@Test
		public void testRetrieveAllEmp() {
			List<Employe> listEmp = us.retrieveAllEmployees(); 
		
		Assert.assertEquals(listEmp.size(), listEmp.size());
		}
		
		
		
		
 
}






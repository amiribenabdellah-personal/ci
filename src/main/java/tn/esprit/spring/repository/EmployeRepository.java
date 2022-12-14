package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.User;

@Repository
public interface EmployeRepository extends  CrudRepository<Employe, Integer> {


}
 




















// List<User> findByFirstName(String fname);
// List<User> findByLastName(String lname);
// List<User> findByIdGreaterThan(int lname);
	
//	@Query("SELECT MAX((e.id), 0) FROM User e") 
//	Long getMaxId(); 
	
//	// JPQL Update : 
//	@Modifying
//	@Query("update User u set u.role = :role where u.firstName = :fname")
//	int updateUserStatusForFirstName(@Param("role") Integer status, @Param("fname") String fname);

	// Native Update : 
//	@Modifying
//	@Query(value = "update User u set u.status = ? where u.name = ?", nativeQuery = true)
//	int updateUserStatusForFirstName1(Integer status, String name);
	
//	@Modifying
//	@Query(value = "insert into Users (firstName, lastName, role) values (:fn, :ln, :role)", nativeQuery = true)
//	void insertUser(@Param("fn") String fn, @Param("ln") Integer ln, @Param("role") Integer role);

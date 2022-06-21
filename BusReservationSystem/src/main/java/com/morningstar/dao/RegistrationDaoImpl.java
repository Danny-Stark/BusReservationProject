package com.morningstar.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Person;

@Repository
public class RegistrationDaoImpl implements RegistrationDao{

	@Autowired
	private JdbcTemplate template = null;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public int addPerson(Person p) {
		String query = "Insert Into Person(UserId ,Title, FName, LName, Email, Password, Dob, Mobile) Values(user_seq.nextval,?, ?, ?, ?, ?, ?, ?)";
		int result = template.update(query, p.getTitle(), p.getfName(), p.getlName(), p.getEmailId(), p.getPassword(), p.getDob(), p.getMobNo());
		return result;
	}

	@Override
	public Person checkUserInfo(String emailId, String password) {
		String query = "Select * from Person where Email='"+emailId+"'" +"and Password='"+password+"'";
		 Person list1 = template.queryForObject(query,(ResultSet rs, int rowNum) -> {
			Person person = new Person();
			person.setUserId(rs.getInt("userId"));
			person.setTitle(rs.getString("title"));
			person.setfName(rs.getString("fName"));
			person.setlName(rs.getString("lName"));
			person.setEmailId(rs.getString("email"));
			person.setPassword(rs.getString("password"));
			person.setMobNo(rs.getLong("mobile"));
			person.setDob(rs.getString("dob"));
			person.setRoleId(rs.getInt("roleId"));
			return person;
		});
		return list1;
	}

}

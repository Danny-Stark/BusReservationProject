package com.morningstar.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Customer;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private JdbcTemplate template = null;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int addCustomer(Customer p) {
		String query = "Insert Into Customer(UserId ,Title, FName, LName, Email, Password, Dob, Mobile) Values(user_seq.nextval,?, ?, ?, ?, ?, ?, ?)";
		int result = template.update(query, p.getTitle(), p.getfName(), p.getlName(), p.getEmailId(), p.getPassword(),
				p.getDob(), p.getMobNo());
		return result;
	}

	@Override
	public Customer checkUserInfo(String emailId, String password) {

		String query = "select * from Customer where email= '" + emailId + "'";

		List<Customer> list = template.query(query, (ResultSet rs, int rowNum) -> {
			Customer customer = new Customer();
			customer.setUserId(rs.getInt("userId"));
			customer.setTitle(rs.getString("title"));
			customer.setfName(rs.getString("fName"));
			customer.setlName(rs.getString("lName"));
			customer.setEmailId(rs.getString("email"));
			customer.setPassword(rs.getString("password"));
			customer.setMobNo(rs.getLong("mobile"));
			customer.setDob(rs.getString("dob"));
			customer.setRoleId(rs.getInt("roleId"));
			return customer;
		});

		return list.get(0);
	}

}

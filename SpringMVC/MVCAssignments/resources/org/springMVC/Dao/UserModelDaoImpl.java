package org.springMVC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springMVC.services.UserModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserModelDaoImpl {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int registerUser(UserModel user) {
		String query ="insert into login_details values(?,?,?)";
		return template.update(query, new Object[] { user.getUsername(), user.getPassword(), user.getEmailId()});
		
	}
	
	public UserModel validateUser(UserModel user) {
		// TODO Auto-generated method stub
		 String query = "select * from login_details where username='" + user.getUsername() + "' and password='" + user.getPassword()
	        + "'";
	    List<UserModel> users = template.query(query,  new UserModelMapper());
	    return users.size() > 0 ? users.get(0) : null;
		
	}
	
	private static final class UserModelMapper implements RowMapper<UserModel>{

		@Override
		public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserModel user = new UserModel();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			//user.setEmailId(rs.getString("emailId"));
			
			return user;
		}

	
		
	}
	

}

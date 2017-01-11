package com.aswini.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.aswini.modal.Menu;
import com.aswini.util.ConnectionUtil;

public class MenuDAO {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(Menu menu) {
		String sql = "insert into food(id,item) values(?,?)";
		Object[] params = { menu.getId(), menu.getItem() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of records inserted:" + rows);
	}

	public void update(Menu menu) {
		String sql = "update food set item=? where id=?";
		Object[] params = { menu.getItem(), menu.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of records updated:" + rows);
	}

	public void delete(int id) {
		String sql = "delete from food where id=?";
		Object[] params = { id };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of records deleted:" + rows);
	}

}

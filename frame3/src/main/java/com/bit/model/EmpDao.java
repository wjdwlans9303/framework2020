package com.bit.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.core.JdbcTemplate;
import com.bit.core.RowMapper;
import com.bit.model.entity.EmpVo;

public class EmpDao {

	public EmpVo selectOne() throws SQLException{
		JdbcTemplate template=new JdbcTemplate();
		String sql="select * from emp where sabun=?";
		return (EmpVo) template.executeOne(sql,new RowMapper() {
			
			@Override
			public Object rows(ResultSet rs) throws SQLException {
				EmpVo bean=new EmpVo();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				return bean;
			}
		},new Object[]{2});
	}
	
	public List<EmpVo> selectAll() throws SQLException{
		String sql="select * from emp";
		
		JdbcTemplate template=new JdbcTemplate();
		List<EmpVo> list=template.execute(sql,new RowMapper() {
			
			@Override
			public Object rows(ResultSet rs) throws SQLException {
				EmpVo bean=new EmpVo();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				return bean;
			}
		});
		return list;
	}
	
	public void insertOne(EmpVo bean) throws SQLException{
		String sql="insert into emp (name,nalja,pay) values (?,now(),?)";
		JdbcTemplate template=new JdbcTemplate();
		template.executeUpdate(sql,new Object[]{bean.getName(),bean.getPay()});
	}

}

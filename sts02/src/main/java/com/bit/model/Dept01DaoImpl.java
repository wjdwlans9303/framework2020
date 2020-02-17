package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bit.model.entity.Dept01Vo;

public class Dept01DaoImpl implements Dept01Dao {
	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<Dept01Vo> selectAll() throws SQLException {
		String sql="select * from dept01";
		List<Dept01Vo> list=new ArrayList<Dept01Vo>();
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())list.add(new Dept01Vo(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")
					));
		}
		return list;
	}

	@Override
	public void insertOne(Dept01Vo bean) {
		String sql="insert into dept01 (dname,loc) values (?,?)";
	}

	@Override
	public int deleteOne(int deptno) {
		String sql="delete from dept01 where deptno=?";
		return 0;
	}

}

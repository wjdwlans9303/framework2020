package com.bit.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.model.entity.Dept01Vo;

public interface Dept01Dao{
	List<Dept01Vo> selectAll() throws SQLException;
	void insertOne(Dept01Vo bean);
	int deleteOne(int deptno);
}

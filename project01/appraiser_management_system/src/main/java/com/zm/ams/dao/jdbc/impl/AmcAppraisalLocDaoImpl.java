package com.zm.ams.dao.jdbc.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.zm.ams.config.ConnectionFactory;
import com.zm.ams.dao.AmsDao;
import com.zm.ams.dto.AmcAppraisalLoc;
import com.zm.ams.dto.AmcSearchCriteria;
import com.zm.ams.dto.AppraisalLoc;

public class AmcAppraisalLocDaoImpl implements AmsDao<AmcAppraisalLoc, AmcSearchCriteria> {

	Connection connection;
	PreparedStatement preparedStatement;

	public AmcAppraisalLocDaoImpl() {
		super();
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public Optional<AmcAppraisalLoc> get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<AmcAppraisalLoc> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AmcAppraisalLoc> getBySearchCriteria(AmcSearchCriteria criteria) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(AmcAppraisalLoc t) throws SQLException {

		preparedStatement = connection.prepareStatement("insert into ams.amc_appraisal_loc (amc_id,loc_id)"
				+ "values(?,?)");
		
		preparedStatement.setInt(1, t.getAmcId());
		preparedStatement.setInt(2, t.getLocid());
		
		preparedStatement.executeUpdate();
	}

	@Override
	public void update(AmcAppraisalLoc t, String... params) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(AmcAppraisalLoc t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId(AmcAppraisalLoc t) throws SQLException {

		
		
		return 0;
	}

	@Override
	public boolean isExist(AmcAppraisalLoc t) throws SQLException {

		
		return false;
	}

	


}

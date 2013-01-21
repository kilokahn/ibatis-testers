package com.kilo.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.kilo.dao.LoginLocationDAO;
import com.kilo.domain.LoginLocation;

public class LoginLocationDAOImpl extends SqlMapClientDaoSupport implements
		LoginLocationDAO {

	@Override
	public List<LoginLocation> getLoginLocations() {
		@SuppressWarnings("unchecked")
		List<LoginLocation> loginLocations = getSqlMapClientTemplate()
				.queryForList("LoginLocation.getLoginLocations");
		return loginLocations;
	}

	@Override
	public LoginLocation getLoginLocationById(Long loginLocationId) {
		LoginLocation loginLocation = (LoginLocation) getSqlMapClientTemplate()
				.queryForObject("LoginLocation.getLoginLocationById",
						loginLocationId);
		return loginLocation;
	}

}

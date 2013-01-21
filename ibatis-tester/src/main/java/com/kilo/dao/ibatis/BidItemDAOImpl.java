package com.kilo.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.kilo.dao.BidItemDAO;
import com.kilo.domain.BidItem;

public class BidItemDAOImpl extends SqlMapClientDaoSupport implements
		BidItemDAO {

	@Override
	public List<BidItem> getBidItems() {
		@SuppressWarnings("unchecked")
		List<BidItem> bidItems = getSqlMapClientTemplate().queryForList(
				"BidItem.getBidItems");
		return bidItems;
	}

}

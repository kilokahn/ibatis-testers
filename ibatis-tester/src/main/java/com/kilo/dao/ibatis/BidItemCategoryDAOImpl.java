
package com.kilo.dao.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.kilo.dao.BidItemCategoryDAO;
import com.kilo.domain.BidItemCategory;

public class BidItemCategoryDAOImpl extends SqlMapClientDaoSupport implements
        BidItemCategoryDAO {

    @Override
    public BidItemCategory getBidItemCategoryById(Integer bidItemCategoryId) {
        BidItemCategory bidItemCategory = (BidItemCategory) getSqlMapClientTemplate()
                .queryForObject("BidItemCategory.getBidItemCategoryById",
                        bidItemCategoryId);
        return bidItemCategory;
    }

}

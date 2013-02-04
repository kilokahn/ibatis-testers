
package com.kilo.dao.ibatis;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.kilo.dao.BidDAO;
import com.kilo.domain.Bid;
import com.kilo.domain.BidItemCategory;
import com.kilo.domain.dto.BidItemCategoryAvgBidPrice;

public class BidDAOImpl extends SqlMapClientDaoSupport implements BidDAO {

    @Override
    public List<Bid> getBidsForBidIds(List<Long> bidIds) {
        @SuppressWarnings("unchecked")
        List<Bid> bids = getSqlMapClientTemplate().queryForList(
                "Bid.getBidsForBidIds", bidIds);
        return bids;
    }

    @Override
    public List<Bid> getBidsForUniqueBidIds(Set<Long> bidIds) {
        @SuppressWarnings("unchecked")
        List<Bid> bids = getSqlMapClientTemplate().queryForList(
                "Bid.getBidsForUniqueBidIds", bidIds);
        return bids;
    }

    @Override
    public List<BidItemCategoryAvgBidPrice> getAverageBidPricePerCategoryForBidIds(
            List<Long> bidIds) {
        @SuppressWarnings("unchecked")
        List<BidItemCategoryAvgBidPrice> avgBidPricePerCategories = getSqlMapClientTemplate()
                .queryForList("Bid.getAverageBidPricePerCategoryForBidIds",
                        bidIds);
        return avgBidPricePerCategories;
    }

    @Override
    public Map<BidItemCategory, BigDecimal> getAverageBidPricePerCategoryForBidIdsAsMap(
            List<Long> bidIds) {
        @SuppressWarnings("unchecked")
        Map<BidItemCategory, BigDecimal> avgBidPricePerCategoryMap = getSqlMapClientTemplate()
                .queryForMap("Bid.getAverageBidPricePerCategoryForBidIds",
                        bidIds, "bidItemCategory", "avgBidPrice");
        return avgBidPricePerCategoryMap;
    }

}

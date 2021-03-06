
package com.kilo.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kilo.domain.Bid;
import com.kilo.domain.BidItemCategory;
import com.kilo.domain.dto.BidItemCategoryAvgBidPrice;

public interface BidDAO {

    List<Bid> getBidsForBidIds(List<Long> bidIds);

    List<Bid> getBidsForUniqueBidIds(Set<Long> bidIds);

    List<BidItemCategoryAvgBidPrice> getAverageBidPricePerCategoryForBidIds(
            List<Long> bidIds);

    Map<BidItemCategory, BigDecimal> getAverageBidPricePerCategoryForBidIdsAsMap(
            List<Long> bidIds);
}

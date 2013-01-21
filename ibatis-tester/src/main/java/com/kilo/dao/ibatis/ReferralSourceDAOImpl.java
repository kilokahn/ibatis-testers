
package com.kilo.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.kilo.dao.ReferralSourceDAO;
import com.kilo.domain.ReferralSource;

public class ReferralSourceDAOImpl extends SqlMapClientDaoSupport implements
        ReferralSourceDAO {

    @Override
    public List<ReferralSource> getReferralSources() {
        @SuppressWarnings("unchecked")
        List<ReferralSource> referralSources = getSqlMapClientTemplate()
                .queryForList("ReferralSource.getReferralSources");
        return referralSources;
    }

    @Override
    public ReferralSource getReferralSourceById(Integer referralSourceId) {
        ReferralSource referralSource = (ReferralSource) getSqlMapClientTemplate()
                .queryForObject("ReferralSource.getReferalSourceById",
                        referralSourceId);
        return referralSource;
    }

}

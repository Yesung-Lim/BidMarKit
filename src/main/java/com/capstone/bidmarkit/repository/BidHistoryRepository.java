package com.capstone.bidmarkit.repository;

import com.capstone.bidmarkit.domain.BidHistory;
import com.capstone.bidmarkit.domain.SearchHistory;
import org.springframework.data.repository.CrudRepository;

public interface BidHistoryRepository extends CrudRepository<BidHistory, String> {
}

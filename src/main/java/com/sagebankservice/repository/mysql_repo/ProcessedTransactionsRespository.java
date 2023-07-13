package com.sagebankservice.repository.mysql_repo;

import com.sagebankservice.entity.mysql_entity.ProcessedTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProcessedTransactionsRespository extends JpaRepository<ProcessedTransactions, Integer> {
    public Optional<ProcessedTransactions> findProcessedTransactionsByTransId(String transId);
}

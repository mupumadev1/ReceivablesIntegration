package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Cbbthd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CbbthdRepository extends JpaRepository<Cbbthd, Integer> {
    public Cbbthd findDistinctByCustchqno(String transId);
    public Optional<Cbbthd> findByBatchid(String batchid);
}

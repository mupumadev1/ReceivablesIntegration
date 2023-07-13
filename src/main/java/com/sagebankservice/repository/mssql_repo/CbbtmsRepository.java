package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Cbbtms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CbbtmsRepository extends JpaRepository<Cbbtms,Integer> {
    public Optional<Cbbtms> findByBatchid(String batch);
}

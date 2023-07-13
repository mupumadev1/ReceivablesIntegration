package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Cbbtdt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CbbtdtRepository extends JpaRepository<Cbbtdt, Integer> {
    public Optional<Cbbtdt> findByBatchid(String batch);

}

package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Cbbctl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CbbctlRepository extends JpaRepository<Cbbctl, Integer> {
    @Query("SELECT MAX(batchid) FROM  Cbbctl ")
    Long findMaxBatchId();
    public Optional<Cbbctl> findByBatchid(String batchid);
}

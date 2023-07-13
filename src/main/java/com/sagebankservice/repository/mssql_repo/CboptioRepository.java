package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Cboptio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CboptioRepository extends JpaRepository<Cboptio, Integer> {
    public Optional<Cboptio> findByOptionid(String id);
}

package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Arcus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArcusRepository extends JpaRepository<Arcus, Integer> {
    public String findByIdcust(String custNo);
}

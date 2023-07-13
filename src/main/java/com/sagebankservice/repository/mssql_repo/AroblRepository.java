package com.sagebankservice.repository.mssql_repo;

import com.sagebankservice.entity.mssql_entity.Arobl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AroblRepository extends JpaRepository<Arobl, Integer> {

    public Arobl findDistinctByDescinvc(String transId);
}

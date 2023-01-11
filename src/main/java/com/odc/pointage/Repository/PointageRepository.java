package com.odc.pointage.Repository;

import com.odc.pointage.Model.Pointage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointageRepository extends JpaRepository<Pointage,Long> {
}

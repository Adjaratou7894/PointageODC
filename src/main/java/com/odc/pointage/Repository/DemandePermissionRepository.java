package com.odc.pointage.Repository;

import com.odc.pointage.Model.DemandePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandePermissionRepository extends JpaRepository<DemandePermission,Long> {
}

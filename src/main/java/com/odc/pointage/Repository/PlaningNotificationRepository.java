package com.odc.pointage.Repository;

import com.odc.pointage.Model.PlaningNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaningNotificationRepository extends JpaRepository<PlaningNotification,Long> {
}

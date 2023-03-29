package machado.antonio.testebackendestagiov3.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import machado.antonio.testebackendestagiov3.entities.EquipmentPositionHistory;

@Repository
public interface EquipmentPositionHistoryRepository extends JpaRepository<EquipmentPositionHistory, UUID> {

}
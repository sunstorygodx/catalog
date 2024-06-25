package uz.app.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.app.webapp.models.Machine;



@Repository
public interface MachineRepository extends JpaRepository<Machine, Long>{
    void deleteByName(String name);
    Machine findByName(String name);
}

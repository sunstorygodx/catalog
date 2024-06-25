package uz.app.webapp.service;

import org.springframework.stereotype.Service;
import uz.app.webapp.models.Machine;

import javax.crypto.Mac;
import java.util.List;


public interface MachineService {
    List<Machine> findAllMachines();
    Machine saveMachine(Machine machine);
    Machine findByName(String name);
    Machine update(Machine machine);
    void deleteMachine(String name);
}

package uz.app.webapp.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.app.webapp.models.Machine;
import uz.app.webapp.repository.InMemoryMachineDAO;
import uz.app.webapp.service.MachineService;

import java.util.List;


@Service
@AllArgsConstructor
public class InMemoryMachineServiceImpl implements MachineService {

    private final InMemoryMachineDAO repository;

    @Override
    public List<Machine> findAllMachines() {
        return repository.findAllMachines();
    }

    @Override
    public Machine saveMachine(Machine machine) {
        return repository.saveMachine(machine);
    }

    @Override
    public Machine findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Machine update(Machine machine) {
        return repository.update(machine);
    }

    @Override
    public void deleteMachine(String name) {
        repository.deleteMachine(name);
    }
}

package uz.app.webapp.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import uz.app.webapp.models.Machine;
import uz.app.webapp.repository.MachineRepository;
import uz.app.webapp.service.MachineService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class MachineServiceImlp implements MachineService {

    private final MachineRepository repository;


    @Override
    public List<Machine> findAllMachines() {
        return repository.findAll();
    }

    @Override
    public Machine saveMachine(Machine machine) {
        return repository.save(machine);
    }

    @Override
    public Machine update(Machine machine) {
        return repository.save(machine);
    }

    @Override
    public Machine findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void deleteMachine(String name) {
        repository.deleteByName(name);
    }
}

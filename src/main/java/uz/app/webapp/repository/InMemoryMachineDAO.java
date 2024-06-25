package uz.app.webapp.repository;

import org.springframework.stereotype.Repository;
import uz.app.webapp.models.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryMachineDAO {
    private final List<Machine> MACHINES = new ArrayList<>();

    public List<Machine> findAllMachines() {
        return MACHINES;
    }

    public Machine saveMachine(Machine machine) {
        MACHINES.add(machine);
        return machine;
    }

    public Machine findByName(String name) {
        return MACHINES.stream()
                .filter(element -> element.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Machine update(Machine machine) {
        var machineIndex = IntStream.range(0, MACHINES.size())
                .filter(index -> MACHINES.get(index).getName().equals(machine.getName()))
                .findFirst()
                .orElse(-1);
        if (machineIndex > -1){
            MACHINES.set(machineIndex, machine);
            return machine;
        }
        return null;
    }

    public void deleteMachine(String name) {
        var machine = findByName(name);
        if (machine != null){
            MACHINES.remove(machine);
        }
    }
}

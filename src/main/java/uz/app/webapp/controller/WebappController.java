package uz.app.webapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.app.webapp.models.Machine;
import uz.app.webapp.service.MachineService;

import javax.crypto.Mac;
import java.util.List;

@RestController
@RequestMapping("/api/v1/webapp")
@AllArgsConstructor
public class WebappController {

    private final MachineService service;

    @GetMapping
    public List<Machine> findAllMachines(){
        return service.findAllMachines();
    }

    @PostMapping("save_machine")
    public Machine saveMachine(@RequestBody Machine machine){
        return service.saveMachine(machine);
    }


    @GetMapping("/{name}")
    public Machine findByName(@PathVariable String name){
        return service.findByName(name);
    }

    @PutMapping("update")
    public Machine update(@RequestBody Machine machine){
        return service.update(machine);
    }

    @DeleteMapping("delete_machine/{name}")
    public void deleteMachine(@PathVariable String name){
        service.deleteMachine(name);
    }
}

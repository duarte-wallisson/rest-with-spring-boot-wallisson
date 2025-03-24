package br.com.wallisson.resource;

import br.com.wallisson.model.Person;
import br.com.wallisson.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;;

    @GetMapping(value = "/{id}")
    public Person findById(@PathVariable("id") String id){
        return service.findById(id);
    }

    @GetMapping
    public List<Person> findById(){
        return service.findAll();
    }

    @PostMapping(value = "/save")
    public Person findById(@RequestBody Person person){
        return service.savePerson(person);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable("id") String id){
        service.deleteById(id);
    }
}

package tp.demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Coposant Spring de type controller de WS REST
@RequestMapping(value = "/devise", headers = "Accept=application/json")
public class DeviseRestController {

    @Autowired
    private ServiceDevise serviceDevise;

    //url de test : http://localhost:8181/demo/devise
    @GetMapping("")
    public List<Devise> getAllDevices() {
        return serviceDevise.findAllDevises;
    }
}

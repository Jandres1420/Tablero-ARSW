package drawing;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebSiteController {
    @Resource
    private HttpServletRequest request;

    public static void main(String[] args) {
        Usuarios.getInstance();
        SpringApplication.run(WebSiteController.class, args);
        
    }

    @GetMapping("/status")
    public String status() {
        sessionManagement();
        String name = (String) request.getSession().getAttribute("name");
        return "{\"status\":\"Greetings from Spring Boot "
                + name + ", "
                + java.time.LocalDate.now() + ", "
                + java.time.LocalTime.now()
                + ". " + "The server is Runnig!\"}";
    }

    public void sessionManagement() {
        Usuarios.getInstance().setUsuario(request.getSession(true).getId());
        System.out.println(request.getSession(true).getId());
        System.out.println("Esto son el numero de usuarios " + Usuarios.getInstance().getListaUsuarios().size());
    }
 
    @GetMapping("/index/color/r")
    public ResponseEntity<String> changingColorR() {
        sessionManagement();
        return new ResponseEntity<String>(Usuarios.getInstance().posicionColor(request.getSession(true).getId()),HttpStatus.OK);
    }
    

}

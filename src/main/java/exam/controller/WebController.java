package exam.controller;

import exam.entity.EmployeeEntity;
import exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/home"})
    public String home(Model model) {
        model.addAttribute("name", "T1808A");
        return "home";
    }

   /* @GetMapping("/getProduct/{id}")
    public String detailProduct(Model model, @PathVariable("id") int productid) {
        ProductEntity product = employeeService.getById(productid);
        model.addAttribute("product", product);
        return "detailProduct";
    }

    @GetMapping("/editProduct/{id}")
    public String editProduct(Model model, @PathVariable("id") int productid) {
        ProductEntity product = employeeService.getById(productid);
        model.addAttribute("product", product);
        return "editProduct";
    }

    @PostMapping("/updateProduct/{id}")
    public String editProduct(@PathVariable("id") int id, @Valid ProductEntity productEntity,
                              BindingResult result, Model model) {
        *//*if (result.hasErrors()) {
            productEntity.setId(id);
            return "update-user";
        }*//*

        employeeService.save(productEntity);
        model.addAttribute("products", employeeService.getAll());
        return "redirect:/listproduct";
    }*/

    @GetMapping("/addemployee")
    public String openAddProduct(Model model) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        model.addAttribute("employee", employeeEntity);
        return "addemployee";
    }

    @PostMapping("/addemployee")
    public String addProduct(@ModelAttribute EmployeeEntity employeeEntity) {
        employeeService.saveProduct(employeeEntity);
        return "redirect:/listemployee";
    }

    @GetMapping({"/listemployee","/"})
    public String getAllProduct(Model model) {
        List<EmployeeEntity> list = employeeService.getAll();
        model.addAttribute("employees", list);
        return "listemployee";
    }
}

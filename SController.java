package com.example.smh.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import com.example.smh.Model.SModel;
import com.example.smh.Rep.Repository;
@Controller
public class SController {

    @Autowired
    Repository repo;

    @GetMapping("/index")
    public String home() {
        return "index"; // index.jsp
    }

    @PostMapping("/students/add")
    public String add(@ModelAttribute SModel student, Model model) {
        repo.save(student);
        List<SModel> student1=repo.findAll();
        model.addAttribute("students", student1);
        return "success"; // success.jsp
    }

//    @GetMapping("/students/list")
//    public String listStudents(Model model) {
//        List<SModel> students = repo.findAll();
//        model.addAttribute("students", students);
//        return "student_list"; // student_list.jsp
//    }
    
}

/*
@Controller
public class SController {
@Autowired
Repository repo;

@GetMapping("/home")
public String home() {
    return "index"; 
}

@PostMapping("/submit")
public String submit(SModel student) {
    repo.save(student);
    return "index";
}
}
    
   */ 
    
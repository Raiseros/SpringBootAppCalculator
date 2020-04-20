package ru.holyav.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.holyav.calculator.entity.Calculator;


@Controller
public class HelloController {

   /* @Autowired
    private StudentService studentService;*/


    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String registry(Model model) {
        Calculator theCalculator = new Calculator();
        model.addAttribute("calculator", theCalculator);
        return "calculation";
    }


   /* @PostMapping("saveStudent")
    public String addStudent(@ModelAttribute("calculator") Calculator theCalculator) throws SQLException {
        if(null != theCalculator && theCalculator.getId() > 0){
            studentService.updateStudent(theCalculator);
        } else{


            studentService.saveStudent(theCalculator);
            //securityService.autoLogin(theStudent.getFirstName(), theStudent.getConfirmPassword());
        }
        return "redirect:/";
    }*/





   /* @RequestMapping(value ="/", method = RequestMethod.GET)
    public String getStudents(Model model) {
     List<Student> theStudents = studentService.getStudents();
     model.addAttribute("students", theStudents);
        return "list-students";
    }





    @RequestMapping(value ="formForUpdate", method = RequestMethod.GET)
    public String update(@RequestParam("studentId") int theId, Model model) {
        Student theStudent = studentService.getStudent(theId);
        model.addAttribute("student", theStudent);
        return "registration";
    }




    @RequestMapping(value ="delete", method = RequestMethod.GET)
    public String delete(@RequestParam("studentId") int theId) {
        studentService.deleteStudent(theId);
        return "redirect:/";
    }
    */
}


package com.example.Department.Controller;

import com.example.Department.Service.DepartmentService;
import com.example.Department.Model.Department;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }
}

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    // constructor...

    @GetMapping("/{id}")
    public Mono<Employee> getEmployeeById(@PathVariable String id) {
        return employeeRepository.findEmployeeById(id);
    }

    @GetMapping
    public Flux<Employee> getAllEmployees() {
        return employeeRepository.findAllEmployees();
    }
}
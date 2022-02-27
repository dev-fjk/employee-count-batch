package batch.count.employee.controller;

import batch.count.employee.domain.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * 従業員情報 Controller
 */
@Slf4j
@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    /**
     * 部門別の従業員数を集計するジョブを実行する
     */
    public void employeeCountJob() {
        System.out.println("Hello World");
    }
}

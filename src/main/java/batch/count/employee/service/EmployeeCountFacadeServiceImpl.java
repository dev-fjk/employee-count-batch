package batch.count.employee.service;

import batch.count.employee.domain.service.EmployeeCountFacadeService;
import batch.count.employee.domain.service.EmployeeGroupingService;
import batch.count.employee.domain.service.EmployeeStdoutService;
import batch.count.employee.entity.result.EmployeeDetailListResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 従業員集計処理の FacadeService
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeCountFacadeServiceImpl implements EmployeeCountFacadeService {

    private final EmployeeGroupingService employeeGroupingService;
    private final EmployeeStdoutService employeeStdoutService;

    /**
     * {@inheritDoc}
     */
    @Override
    public void employeeCount(EmployeeDetailListResult employeeDetailListResult) {
        // 部門ごとに従業員をグループ分けし、部門ごとにまとめて従業員情報をログに出力する
        var groupedEmployeeMap = employeeGroupingService.groupingByDepartment(employeeDetailListResult);
        employeeStdoutService.stdout(groupedEmployeeMap);
    }
}

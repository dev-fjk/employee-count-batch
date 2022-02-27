package batch.count.employee.service;

import batch.count.employee.domain.service.EmployeeGroupingService;
import batch.count.employee.entity.result.EmployeeDetailListResult;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * 従業員のグルーピングを行うサービス
 */
@Service
public class EmployeeGroupingServiceImpl implements EmployeeGroupingService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<Integer, List<EmployeeDetailResult>> groupingByDepartment(EmployeeDetailListResult src) {
        return src.getEmployeeList().stream().collect(Collectors.groupingBy(EmployeeDetailResult::getDepartmentId));
    }
}

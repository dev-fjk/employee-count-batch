package batch.count.employee.service;

import batch.count.employee.domain.repository.EmployeeRepository;
import batch.count.employee.domain.service.EmployeeService;
import batch.count.employee.entity.result.EmployeeDetailListResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 従業員テーブル サービスクラス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailListResult fetchAll() {
        return null;
    }
}

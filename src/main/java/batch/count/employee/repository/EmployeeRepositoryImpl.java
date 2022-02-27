package batch.count.employee.repository;

import batch.count.employee.domain.factory.EmployeeFactory;
import batch.count.employee.domain.repository.EmployeeRepository;
import batch.count.employee.entity.EmployeeDetail;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import batch.count.employee.mapper.EmployeeMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 従業員テーブル リポジトリ
 */
@Slf4j
@Repository
@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeMapper employeeMapper;
    private final EmployeeFactory employeeFactory;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<EmployeeDetailResult> fetchAll(int offset, int limit) {
        final List<EmployeeDetail> detailList = employeeMapper.fetchDetailAll(offset, limit);
        return employeeFactory.factory(detailList);
    }
}

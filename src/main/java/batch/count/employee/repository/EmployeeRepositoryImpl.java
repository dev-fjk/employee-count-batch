package batch.count.employee.repository;

import batch.count.employee.domain.repository.EmployeeRepository;
import batch.count.employee.entity.result.EmployeeDetailListResult;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public List<EmployeeDetailListResult.EmployeeDetailResult> fetchAll(int offset, int limit) {
        return null;
    }
}

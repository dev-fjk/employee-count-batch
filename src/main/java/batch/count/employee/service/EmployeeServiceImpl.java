package batch.count.employee.service;

import batch.count.employee.domain.repository.EmployeeRepository;
import batch.count.employee.domain.service.EmployeeService;
import batch.count.employee.entity.result.EmployeeDetailListResult;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

/**
 * 従業員テーブル サービスクラス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    // 一回の取得件数
    private static final int FETCH_COUNT = 10;

    private final EmployeeRepository employeeRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeDetailListResult fetchAll() {
        return EmployeeDetailListResult.builder()
                .employeeList(this.fetchAllEmployeeList())
                .build();
    }

    /**
     * 全従業員情報のリストを取得する
     *
     * @return 全従業員情報のリスト
     */
    private List<EmployeeDetailResult> fetchAllEmployeeList() {

        int offset = 0;
        final List<EmployeeDetailResult> employeeDetailResultList = new ArrayList<>();
        while (true) {
            List<EmployeeDetailResult> tmpEmployeeList = employeeRepository.fetchAll(offset, FETCH_COUNT);
            if (CollectionUtils.isEmpty(tmpEmployeeList)) {
                break;
            }

            employeeDetailResultList.addAll(tmpEmployeeList);
            offset += FETCH_COUNT;
        }
        return employeeDetailResultList;
    }
}

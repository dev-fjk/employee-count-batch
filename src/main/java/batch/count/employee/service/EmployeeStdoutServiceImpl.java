package batch.count.employee.service;

import batch.count.employee.domain.service.EmployeeStdoutService;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 従業員情報の出力を行うサービス
 */
@Slf4j
@Service
public class EmployeeStdoutServiceImpl implements EmployeeStdoutService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void stdout(Map<Integer, List<EmployeeDetailResult>> employeeMap) {
        employeeMap.values().forEach(emp -> {
            this.stdoutDepartmentName(emp.get(0));
            this.stdoutEmployeeInfo(emp);
            log.info("================================================");
        });
    }

    /**
     * 部門名を出力する
     *
     * @param result 従業員情報
     */
    private void stdoutDepartmentName(EmployeeDetailResult result) {
        log.info("########## 部署名 {} ##########", result.getDepartmentName());
    }

    /**
     * 従業員情報を出力する
     *
     * @param resultList 従業員情報一覧
     */
    private void stdoutEmployeeInfo(List<EmployeeDetailResult> resultList) {
        resultList.forEach(emp ->
                log.info("社員ID: {}, 氏名 {} {}", emp.getId(), emp.getLastName(), emp.getFirstName())
        );
    }
}

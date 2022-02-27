package batch.count.employee.domain.service;

import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;
import java.util.Map;

/**
 * 従業員情報の出力を行うサービス
 */
public interface EmployeeStdoutService {

    void stdout(Map<Integer, List<EmployeeDetailResult>> employeeMap);

}

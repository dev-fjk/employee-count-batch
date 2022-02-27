package batch.count.employee.domain.service;

import batch.count.employee.entity.result.EmployeeDetailListResult;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;
import java.util.Map;

/**
 * 従業員のグルーピングを行うサービス
 */
public interface EmployeeGroupingService {

    /**
     * 部門毎に社員のグルーピングを行う
     *
     * @param src 社員詳細情報一覧
     * @return 部門IDと部門に所属する社員一覧のMap
     */
    Map<Integer, List<EmployeeDetailResult>> groupingByDepartment(EmployeeDetailListResult src);

}

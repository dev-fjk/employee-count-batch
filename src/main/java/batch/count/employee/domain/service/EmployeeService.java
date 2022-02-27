package batch.count.employee.domain.service;

import batch.count.employee.entity.result.EmployeeDetailListResult;

/**
 * 従業員テーブル サービスIF
 */
public interface EmployeeService {

    /**
     * 全従業員の詳細情報を取得する
     *
     * @return 全従業員の詳細情報取得結果
     */
    EmployeeDetailListResult fetchAll();
}

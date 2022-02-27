package batch.count.employee.domain.service;

import batch.count.employee.entity.result.EmployeeDetailListResult;

/**
 * 従業員集計処理の FacadeService
 */
public interface EmployeeCountFacadeService {

    /**
     * 従業員数の部門別の人数集計処理の制御を行う
     *
     * @param employeeDetailListResult 従業員情報一覧
     */
    void employeeCount(EmployeeDetailListResult employeeDetailListResult);

}

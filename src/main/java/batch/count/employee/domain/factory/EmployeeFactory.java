package batch.count.employee.domain.factory;

import batch.count.employee.entity.EmployeeDetail;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;

public interface EmployeeFactory {

    /**
     * 従業員詳細情報のEntity一覧から 取得結果一覧へ変換する
     *
     * @param employeeDetailList DBの従業員詳細情報のリスト
     * @return 従業員詳細情報取得結果のリスト
     */
    List<EmployeeDetailResult> factory(List<EmployeeDetail> employeeDetailList);

}

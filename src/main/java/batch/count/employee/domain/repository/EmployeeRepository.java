package batch.count.employee.domain.repository;

import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;

/**
 * 従業員テーブル リポジトリIF
 */
public interface EmployeeRepository {

    /**
     * 従業員情報一覧を取得する
     *
     * @param offset 取得開始位置
     * @param limit  取得数
     * @return 従業員詳細情報のリスト
     */
    List<EmployeeDetailResult> fetchAll(int offset, int limit);
}

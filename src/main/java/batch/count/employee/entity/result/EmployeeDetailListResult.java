package batch.count.employee.entity.result;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

/**
 * 社員詳細情報取得結果を保持するDto
 */
@Data
@Builder
public class EmployeeDetailListResult {

    private List<EmployeeDetailResult> employeeList;

    /**
     * 社員の詳細情報取得結果
     */
    @Data
    @Builder
    public static class EmployeeDetailResult {
        /**
         * 社員ID PK
         */
        private Long id;

        /**
         * 部門ID FK(Department.id)
         */
        private Integer departmentId;

        /**
         * 苗字
         */
        private String lastName;

        /**
         * 名前
         */
        private String firstName;
    }

    /**
     * 取得した社員の件数を返却する
     *
     * @return 社員数
     */
    public int getCount() {
        if (CollectionUtils.isEmpty(this.employeeList)) {
            return 0;
        }
        return this.employeeList.size();
    }
}

package batch.count.employee.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 社員テーブル 詳細情報
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EmployeeDetail extends Employee {

    /**
     * 部署名
     */
    private String departmentName;

}

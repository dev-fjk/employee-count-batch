package batch.count.employee.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * 従業員テーブル Entity
 */
@Data
public class Employee {

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

    /**
     * 作成日時
     */
    private LocalDateTime createdAt;

    /**
     * 作成者
     */
    private String createdBy;

    /**
     * 更新日時
     */
    private LocalDateTime updatedAt;

    /**
     * 更新者
     */
    private String updatedBy;
}
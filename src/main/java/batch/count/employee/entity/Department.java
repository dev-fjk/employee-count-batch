package batch.count.employee.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * 部門テーブル Entity
 */
@Data
public class Department {

    /**
     * 部門ID PK
     */
    private Integer id;

    /**
     * 部門名
     */
    private String name;

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

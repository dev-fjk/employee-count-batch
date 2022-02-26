package api.management.task.infrastructure.entity;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

/**
 * タスクユーザーテーブルEntity
 */
@Getter
@ToString
public class TaskUser {

    private long userId;

    private String loginId;

    private String name;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;
}

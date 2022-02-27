-- drop --
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;

-- create --
-- 部門テーブル
CREATE TABLE department
(
    id         INTEGER     not null comment '部門ID',
    name       varchar(64) not null comment '部門名',
    created_at timestamp   not null default current_timestamp comment '作成日時',
    created_by varchar(30) not null comment '作成者',
    updated_at timestamp   not null default current_timestamp comment '更新日時',
    updated_by varchar(30) not null comment '更新者',
    PRIMARY KEY (id)
);

create index idx_department_name on department (name);

-- 従業員テーブル
CREATE TABLE employee
(
    id            bigint      not null auto_increment comment '社員ID',
    department_id INTEGER     not null comment '部門ID',
    last_name     varchar(30) not null comment '苗字',
    first_name    varchar(30) not null comment '名前',
    created_at    timestamp   not null default current_timestamp comment '作成日時',
    created_by    varchar(30) not null comment '作成者',
    updated_at    timestamp   not null default current_timestamp comment '更新日時',
    updated_by    varchar(30) not null comment '更新者',
    PRIMARY KEY (id),
    FOREIGN KEY (department_id) REFERENCES department (id)
);

create index idx_employee_department_id on employee (department_id);
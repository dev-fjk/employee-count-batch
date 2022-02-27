-- 部署テーブル
insert into
    department (id, name, created_by, updated_by)
values
    (1, 'affair', 'admin', 'admin');
insert into
    department (id, name, created_by, updated_by)
values
    (2, 'human resources', 'admin', 'admin');
insert into
    department (id, name, created_by, updated_by)
values
    (3, 'accounting', 'admin', 'admin');
insert into
    department (id, name, created_by, updated_by)
values
    (4, 'sales', 'admin', 'admin');
insert into
    department (id, name, created_by, updated_by)
values
    (5, 'development', 'admin', 'admin');

-- 社員テーブル
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (1, 'affairs1', 'taro', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (1, 'affairs2', 'jiro', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (1, 'affairs3', 'saburo', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (2, 'human1', 'tester', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (2, 'human2', 'shell', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (3, 'accounting1', 'garigari', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (4, 'sales1', 'tatsuki', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (4, 'sales2', 'poul', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (5, 'develop1', 'atom', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (5, 'develop2', 'jimmy', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (5, 'develop3', 'ryu', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (5, 'develop4', 'ken', 'admin', 'admin');
insert into
    employee (department_id, last_name, first_name, created_by, updated_by)
values
    (5, 'igari', 'motchimotchi', 'admin', 'admin');
package batch.count.employee.factory;

import batch.count.employee.domain.factory.EmployeeFactory;
import batch.count.employee.entity.EmployeeDetail;
import batch.count.employee.entity.result.EmployeeDetailListResult.EmployeeDetailResult;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 * 従業員情報の型変換を行うfactory
 */
@Component
public class EmployeeFactoryImpl implements EmployeeFactory {

    /**
     * 従業員詳細情報のEntity一覧から 取得結果一覧へ変換する
     *
     * @param employeeDetailList DBの従業員詳細情報のリスト
     * @return 従業員詳細情報取得結果のリスト
     */
    @Override
    public List<EmployeeDetailResult> factory(List<EmployeeDetail> employeeDetailList) {
        return employeeDetailList.stream()
                .map(employeeDetail -> EmployeeDetailResult.builder()
                        .id(employeeDetail.getId())
                        .departmentId(employeeDetail.getDepartmentId())
                        .departmentName(employeeDetail.getDepartmentName())
                        .lastName(employeeDetail.getLastName())
                        .firstName(employeeDetail.getFirstName())
                        .build()
                ).collect(Collectors.toList());
    }
}

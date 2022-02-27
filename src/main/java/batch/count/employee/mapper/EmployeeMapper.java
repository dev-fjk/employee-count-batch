package batch.count.employee.mapper;

import batch.count.employee.entity.EmployeeDetail;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {

    /**
     * 従業員の詳細情報一覧を返却する
     *
     * @param offset 取得開始位置
     * @param limit  　取得上限数
     * @return {@link EmployeeDetail}
     */
    List<EmployeeDetail> fetchDetailAll(@Param("offset") int offset, @Param("limit") int limit);
}

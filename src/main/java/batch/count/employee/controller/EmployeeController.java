package batch.count.employee.controller;

import batch.count.employee.domain.service.EmployeeCountFacadeService;
import batch.count.employee.domain.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * 従業員情報 Controller
 */
@Slf4j
@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeCountFacadeService employeeCountFacadeService;

    /**
     * 部門別の従業員数を集計するジョブを実行する
     */
    public void employeeCountJob() {
        log.info("■■■■■ 従業員数集計ジョブ 処理開始 ■■■■■");

        // 従業員情報一覧を取得
        final var employeeDetailListResult = employeeService.fetchAll();
        log.info("##### 従業員情報取得処理が終了しました #####");
        log.info("##### 全従業員数 {} #####", employeeDetailListResult.getCount());

        employeeCountFacadeService.employeeCount(employeeDetailListResult);
        log.info("##### 従業員情報出力処理が終了しました #####");
        log.info("■■■■■ 従業員数集計ジョブ 処理終了 ■■■■■");
    }
}

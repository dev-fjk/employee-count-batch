package batch.count.employee;

import batch.count.employee.controller.EmployeeController;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * ジョブの実行を行うクラス
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class JobLauncher {

    private final EmployeeController employeeController;

    /**
     * バッチの実行を行う
     *
     * @param args コマンドライン引数
     */
    public void execute(List<String> args) {
        log.info("■■■■■ 従業員数集計バッチ 処理開始 ■■■■■");

        employeeController.employeeCountJob();

        log.info("■■■■■ 従業員数集計バッチ 処理終了 ■■■■■");
    }

}

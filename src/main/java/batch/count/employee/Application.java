package batch.count.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@RequiredArgsConstructor
@ConfigurationPropertiesScan
public class Application implements ApplicationRunner {

    private final JobLauncher jobLauncher;

    /**
     * root
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(Application.class, args)));
    }

    /**
     * Spring Boot App起動直後に実行されるRunner
     *
     * @param args コマンドライン引数
     */
    @Override
    public void run(ApplicationArguments args) {
        // バッチ処理の実行
        jobLauncher.execute(args.getNonOptionArgs());
    }
}

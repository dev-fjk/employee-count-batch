package batch.count.employee

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.DefaultApplicationArguments
import spock.lang.Specification

class ApplicationTest extends Specification {

    Application target
    def jobLauncher = Mock(JobLauncher)

    def setup() {
        target = new Application(jobLauncher)
    }

    def "動作テスト"() {
        given:
        ApplicationArguments applicationArguments = new DefaultApplicationArguments("test")
        when:
        target.run(applicationArguments)
        then:
        1 * jobLauncher.execute(applicationArguments.getNonOptionArgs())
    }
}

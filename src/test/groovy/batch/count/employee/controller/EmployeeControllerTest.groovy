package batch.count.employee.controller

import spock.lang.Specification

class EmployeeControllerTest extends Specification {

    EmployeeController target

    def setup() {
        target = new EmployeeController()
    }

    def "動作テスト"() {
        when:
        target.employeeCountJob()
        then:
        noExceptionThrown()
    }

}

package healthcheck.console

import net.sf.json.JSONObject
import spock.lang.*

class HealthcheckConsoleControllerSpec extends Specification {
    HealthcheckConsoleController controller = new HealthcheckConsoleController()
    def model = [:]
    def setup() {
        controller.healthcheckDataService = [getHealth: {uri ->
            ["QuoteEngineApplication":
                    ["status": "GREEN",
                            "message": "The database connection is open",
                            "timestamp": "2012-07-06 14:48:50"]
            ] as JSONObject
        }] as HealthcheckDataService
        controller.model = model
    }

    def 'should populate the model from the service response'() {
        when:
            controller.goGetIt()

        then:
            model.name == 'stub1'
            model.health == 'GREEN'
    }
}

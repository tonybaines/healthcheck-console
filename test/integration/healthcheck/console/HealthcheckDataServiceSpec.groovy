package healthcheck.console

import griffon.spock.IntegrationSpec

class HealthcheckDataServiceSpec extends IntegrationSpec {
    static final URL = "http://localhost:5000/healthcheck-console/healthcheckStub/"
    HealthcheckDataService service = new HealthcheckDataService()

    def 'should retrieve health data'() {
        expect:
        service.getHealth(URL).QuoteEngineApplication.status == 'GREEN'
    }
    def 'should retrieve statistics data'() {
        expect:
        service.getStatistics(URL).CustomerInventoryApplication.totalCompletedResponses == 59
    }
    def 'should retrieve informational data'() {
        expect:
        service.getInformation(URL).PricingFacadeApplication.componentProperties[0].'dbdeploy-changelog-number'.startsWith('Changelog revision 12 applied')
    }
}

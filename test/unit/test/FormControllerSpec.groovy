package test

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(FormController)
class FormControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test form"() {
        when:
        controller.index()

        then:
        response.text == 'Hello World! this is rajat learning grails'
    }
}
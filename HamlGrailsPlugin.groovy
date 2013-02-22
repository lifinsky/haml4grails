import org.springframework.core.io.FileSystemResource
import com.cadrlife.jhaml.grailsplugin.HamlGroovyPageResourceLoader

class HamlGrailsPlugin {
    // the plugin version
    def version = "0.4.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.8 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/",
        "web-app/"
    ]

    def author = "Ray Myers"
    def authorEmail = "ray.myers@gmail.com"
    def title = "haml"
    def description = '''\\
Haml support for grails, based on JHaml.

http://github.com/raymyers/haml4grails

http://github.com/raymyers/JHaml
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/haml"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {

    }

    def doWithDynamicMethods = { ctx ->

    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artifact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}

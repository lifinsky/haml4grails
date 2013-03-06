# haml4grails

Grails haml support, using [JHaml](http://www.github.com/raymyers/JHaml).

## Using

First add the following to the "plugins" section in your grails-app/config/BuildConfig.groovy:

    runtime ":haml:0.4.1"

Then add the following to your grails-app/config/spring/resources.groovy:

    groovyPageResourceLoader(com.cadrlife.jhaml.grailsplugin.HamlGroovyPageResourceLoader) {
        baseResource = "file:."
        pluginSettings = org.codehaus.groovy.grails.plugins.GrailsPluginUtils.getPluginBuildSettings()
	}

You can now have ".haml" files in your views directory. They will be converted to GSPs on request (if using grails run-app) or on war creation.

## Authors

[Ray Myers](http://cadrlife.com), with very special thanks to the implementers of the 
original Haml for Ruby, [Hampton Catlin](http://hamptoncatlin.com) and [Nathan Weizenbaum](http://nex-3.com).

This plugin is licensed under the GNU GPL version 3.0, with the exception of the included 
libraries, which are licensed as follows.

JHaml: GNU GPL 3.0

Google Guava: Apache 2.0

Apache Commons Lang: Apache 2.0

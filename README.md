Requirements
------------

* [SBT 0.10+](https://github.com/harrah/xsbt/wiki)

Installation
------------

Until this is published to a Maven repository, add the following lines to either ~/.sbt/plugins/project/PluginBuild.scala (user-specific) or project/plugins/project/PluginBuild.scala (project-specific):

    import sbt._
    
    object MyPlugins extends Build {
      lazy val root = Project("root", file(".")) dependsOn (junitXmlListener)
      lazy val junitXmlListener = uri("git://github.com/ijuma/junit_xml_listener.git#fe434773255b451a38e8d889536ebc260f4225ce")
    }

This will add the dependency to the plugin. The next step is to configure your build to output the XML. The following will output the XML in target/test-reports:

    testListeners <<= target.map(t => Seq(new eu.henkelmann.sbt.JUnitXmlTestsListener(t.getAbsolutePath)))

Note that the line as shown is enough in a *.sbt file. In *.scala files (full configuration), you must collect the result of the expression into the settings of all projects that should produce the XML output.

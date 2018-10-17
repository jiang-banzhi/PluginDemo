package com.banzhi.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project


public class PluginSecond implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("testTaskSecond") << {
            println("========================")
            println("hello gradle plugin second!")
            println("========================")
        }
    }
}
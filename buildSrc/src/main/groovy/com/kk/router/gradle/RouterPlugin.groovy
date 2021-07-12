package com.kk.router.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("I'm from RouterPlugin, apply from ${project.name}")
    }
}
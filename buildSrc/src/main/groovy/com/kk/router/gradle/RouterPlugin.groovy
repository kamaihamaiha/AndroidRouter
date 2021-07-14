package com.kk.router.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("I'm from RouterPlugin, apply from ${project.name}")

        // router 是随意起的名子
        project.getExtensions().create("router", RouterExtension)

        // gradle 配置阶段完成了
        project.afterEvaluate {
            RouterExtension extension = project["router"]
            println("用户设置的 wikiStr 路径为：${extension.wikiStr}")
        }
    }
}
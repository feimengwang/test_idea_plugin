package com.github.feimengwang.testideaplugin.services

import com.intellij.openapi.project.Project
import com.github.feimengwang.testideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

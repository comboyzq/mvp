package com.github.comboyzq.mvp.services

import com.intellij.openapi.project.Project
import com.github.comboyzq.mvp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

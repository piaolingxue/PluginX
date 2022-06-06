package com.github.piaolingxue.pluginx.services

import com.intellij.openapi.project.Project
import com.github.piaolingxue.pluginx.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

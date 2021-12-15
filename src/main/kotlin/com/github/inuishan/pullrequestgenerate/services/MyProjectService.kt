package com.github.inuishan.pullrequestgenerate.services

import com.intellij.openapi.project.Project
import com.github.inuishan.pullrequestgenerate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

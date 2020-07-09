package org.jetbrains.dokka.gradle

import org.gradle.api.Project
import org.jetbrains.dokka.DokkaVersion

internal val Project.dokkaDependencies get() = DokkaDependencies(this)

internal class DokkaDependencies(private val project: Project) {
    private fun fromModuleName(name: String) =
        project.dependencies.create("org.jetbrains.dokka:$name:${DokkaVersion.version}")

    val dokkaCore get() = fromModuleName("dokka-core")
    val dokkaBase get() = fromModuleName("dokka-base")
    val javadocPlugin get() = fromModuleName("javadoc-plugin")
    val gfmPlugin get() = fromModuleName("gfm-plugin")
    val jekyllPlugin get() = fromModuleName("jekyll-plugin")
}

rootProject.name = "ok-marketplace-202212"
include("m1l1-helloworld")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion
    }
}
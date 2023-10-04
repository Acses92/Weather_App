package ru.kravchenkoAnatoly.weatherApp

sealed class Modules(val root: String?, val name: String) {

    class Root(name: String): Modules(null, name) {
        companion object {
            val app = Root("app")
            val data = Root("data")
            val domain = Root("domain")
        }
    }

    class Presentation(name: String): Modules("presentation", name) {
        companion object {
            val mainFragment = Presentation("mainFragment")
            val detailFragment = Presentation("detailFragment")
            val settingsFragment = Presentation("settingFragment")
        }
    }

}
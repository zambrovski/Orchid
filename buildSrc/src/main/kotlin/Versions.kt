import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val com_vladsch_flexmark: String = "0.62.2"

    const val org_jetbrains_kotlin: String = "1.3.72" // available: "1.5.10" (target the first Orchid re-release for 1.4.32)

    const val com_openhtmltopdf: String = "1.0.8"

    const val org_junit_jupiter: String = "5.7.2"

    const val com_eden_kodiak: String = "0.5.1" // (artifact has new coordinates, requires Kotlin 1.4.32)

    const val org_nanohttpd: String = "2.3.1" // (future: replace with ktor CIO server)

    const val com_eden_groovydoc_runner: String = "0.2.4" // (remove legacy sourcedoc code with this dependency)

    const val com_eden_javadoc_runner: String = "0.2.4" // (remove legacy sourcedoc code with this dependency)

    const val com_eden_dokka_runner: String = "0.2.4" // (remove legacy sourcedoc code with this dependency)

    const val com_eden_common: String = "1.12.1" // available: "2.0.0" (artifact has new coordinates, requires Kotlin 1.4.32. Needs update to remove internal org.json and clog dependencies)

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0" // replace with Gradle 7 Dependency Catalogs (https://docs.gradle.org/7.0/userguide/platforms.html#sub:central-declaration-of-dependencies)

    const val codacy_coverage_reporter: String = "7.1.0" // (future: build Orchid plugin to read jacoco reports and generate badges itself, so we don't need to send data to Codacy)

    const val gradle_bintray_plugin: String = "1.8.5" // (remove, can't publish to Bintray anymore)

    const val hibernate_validator: String = "6.1.5.Final" // available: "7.0.1.Final"

    const val jython_standalone: String = "2.7.2"

    const val univocity_parsers: String = "2.9.1"

    const val hamcrest_library: String = "2.2"

    const val kotlinx_html_jvm: String = "0.7.1"

    const val validation_api: String = "2.0.1.Final"

    const val commons_lang3: String = "3.12.0"

    const val evo_inflector: String = "1.2.2"

    const val thumbnailator: String = "0.4.14"

    const val asciidoctorj: String = "2.3.0" // available: "2.5.1" (has deprecated APIs)

    const val commons_text: String = "1.9"

    const val javax_inject: String = "1"

    const val mockito_core: String = "3.3.3" // available: "3.10.0"

    const val strikt_core: String = "0.26.1" // available: "0.31.0" (requires Kotlin 1.4.32)

    const val classgraph: String = "4.8.47" // available: "4.8.106" (has deprecated APIs)

    const val commons_io: String = "2.9.0"

    const val snakeyaml: String = "1.28"

    const val javax_el: String = "3.0.1-b11"

    const val jaxb_api: String = "2.3.1"

    const val plantuml: String = "1.2021.7"

    const val pygments: String = "2.4.2" // available: "2.6.1" (has errors when running)

    const val clog4j: String = "2.0.7"

    const val okhttp: String = "4.7.2" // available: "4.9.1" (requires Kotlin 1.4.32)

    const val pebble: String = "3.1.5"

    const val toml4j: String = "0.7.2"

    const val guice: String = "5.0.1"

    const val jsass: String = "5.10.3" // available: "5.10.4" (has warnings when running)

    const val jsoup: String = "1.13.1"

    const val json: String = "20180813" // available: "20210307" (can't update until eden common dependency is updated)

    const val krow: String = "0.1.13"

    /**
     * Current version: "6.4.1"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "7.0.2"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)

package com.autonomousapps

const val ROOT_DIR = "dependency-analysis"

fun getVariantDirectory(variantName: String) = "$ROOT_DIR/$variantName"

fun getArtifactsPath(variantName: String) = "${getVariantDirectory(variantName)}/artifacts.json"

fun getArtifactsPrettyPath(variantName: String) = "${getVariantDirectory(variantName)}/artifacts-pretty.json"

fun getAllUsedClassesPath(variantName: String) = "${getVariantDirectory(variantName)}/all-used-classes.txt"

fun getAllDeclaredDepsPath(variantName: String) =
    "${getVariantDirectory(variantName)}/all-declared-dependencies.json"

fun getAllDeclaredDepsPrettyPath(variantName: String) =
    "${getVariantDirectory(variantName)}/all-declared-dependencies-pretty.json"

fun getUnusedDirectDependenciesPath(variantName: String) =
    "${getVariantDirectory(variantName)}/unused-direct-dependencies.json"

fun getUsedTransitiveDependenciesPath(variantName: String) =
    "${getVariantDirectory(variantName)}/used-transitive-dependencies.json"

fun getMisusedDependenciesHtmlPath(variantName: String) =
    "${getVariantDirectory(variantName)}/misused-dependencies.html"

fun getAbiAnalysisPath(variantName: String) = "${getVariantDirectory(variantName)}/abi.json"

fun getAbiDumpPath(variantName: String) = "${getVariantDirectory(variantName)}/abi-dump.txt"
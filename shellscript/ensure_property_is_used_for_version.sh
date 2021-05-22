#!/usr/bin/env bash
versionOfProject='<version>buildnumber-and-commithash</version>'
# shellcheck disable=SC2016
versionWithProperty='<version>${.*}</version>'
exit "$(grep '<version>'  pom.xml | grep -v "${versionOfProject}" | grep -vc "${versionWithProperty}" )"

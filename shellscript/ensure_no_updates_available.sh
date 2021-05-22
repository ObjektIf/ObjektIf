#!/usr/bin/env bash

mvnOutput=$(./mvnw versions:display-property-updates -B --no-transfer-progress)
echo "${mvnOutput}"
echo "${mvnOutput}" | grep 'All version properties are referencing the newest version available.'

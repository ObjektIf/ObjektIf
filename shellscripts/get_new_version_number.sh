#!/usr/bin/bash

git_version_tags=$(git tag -l "v*" )
removed_v=${git_version_tags//v/}
sorted_by_highest_on_top=$(echo "${removed_v}" | sort -r)
latestVersion=$( echo "${sorted_by_highest_on_top}" | head -n1)
bc <<< "${latestVersion:-0} + 1"

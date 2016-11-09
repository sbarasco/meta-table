DESCRIPTION = "RapidJSON is a JSON parser and generator for C++. It was inspired by RapidXml."

HOMEPAGE = "https://github.com/miloyip/rapidjson"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://license.txt;md5=cd8fb916014db94987ec260fd415a90d"

SRC_URI = "git://github.com/miloyip/rapidjson.git;branch=master"

SRCREV="bb84ff2ffe289bf7ac305d2d95172ec58fb63797"

PR="r1"

PV = "0.0.0+gitr${SRCREV}"

S="${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DRAPIDJSON_BUILD_TESTS=OFF"

FILES_${PN}-dev += "${libdir}/cmake"

ALLOW_EMPTY_${PN} = "1"
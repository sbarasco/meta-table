SUMMARY = "daemon for coffee table"
DESCRIPTION = "daemon for coffee table"
AUTHOR = "Sebastien Barascou"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9190f660105b9a56cdb272309bfd5491"

DEPENDS="fftw libevent pulseaudio rapidjson"

SRCREV = "0b73629a088eebd726580dcff5f2b271042d08e8"

SRC_URI = "git://github.com/sbarasco/coffee-table.git \
        file://tablectrl.service \
        "
S = "${WORKDIR}/git/rasp"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "tablectrl.service"

inherit autotools systemd


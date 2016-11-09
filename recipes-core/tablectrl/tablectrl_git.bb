SUMMARY = "daemon for coffee table"
DESCRIPTION = "daemon for coffee table"
AUTHOR = "Sebastien Barascou"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS="fftw libevent pulseaudio rapidjson xxd-native"

SRCREV = "d30413134ce58a14576181e3ba23402edbef0857"

SRC_URI = "git://github.com/sbarasco/coffee-table.git \
        file://tablectrl.service \
        "
S = "${WORKDIR}/git/rasp"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "tablectrl.service"

inherit autotools systemd pkgconfig

do_install_append() {
             install -d ${D}${systemd_system_unitdir}
             install -m 0644 ${WORKDIR}/tablectrl.service ${D}${systemd_system_unitdir}
}
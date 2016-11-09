SUMMARY = "Configuration file to set up Ethernet interface"
DESCRIPTION = "Used to configure an ethernet interface with systemd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
        file://COPYING \
        file://wired.network \
"
S = "${WORKDIR}"

FILES_${PN} = "${sysconfdir}/systemd/network/wired.network\
"


do_install () {

    install -d ${D}${sysconfdir}/systemd/network
    install -m 0755 ${WORKDIR}/wired.network ${D}${sysconfdir}/systemd/network
}



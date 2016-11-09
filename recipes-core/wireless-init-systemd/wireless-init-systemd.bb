SUMMARY = "Configuration file to set up Ethernet interface"
DESCRIPTION = "Used to configure an wlan0 interface with systemd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
        file://COPYING \
        file://wlan0.network \
        file://wpa_supplicant-wlan0.conf \
        file://wpa_supplicant@wlan0.service \
"
S = "${WORKDIR}"

# RDEPENDS = "wpa_supplicant"

inherit systemd

FILES_${PN} = "${sysconfdir}/systemd/network/wlan0.network \
            ${sysconfdir}/wpa_supplicant/wpa_supplicant-wlan0.conf \
            ${sysconfdir}/systemd/ \
            ${sysconfdir}/systemd/system/ \
            ${sysconfdir}/systemd/system/multi-user.target.wants/ \
            {sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service \
"


do_install () {
    install -d ${D}${sysconfdir}/systemd/network ${D}${sysconfdir}/wpa_supplicant ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
    install -m 0755 ${WORKDIR}/wlan0.network ${D}${sysconfdir}/systemd/network
    install -m 0755 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}${sysconfdir}/wpa_supplicant
    ln -sf ${systemd_unitdir}/system/wpa_supplicant@.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service
     install -m 0755 ${WORKDIR}/wpa_supplicant@wlan0.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service
}



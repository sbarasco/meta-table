LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://gpl3.txt;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/PaulStoffregen/teensy_loader_cli.git \
        file://0001-dont-strip.patch \
"
SRCREV = "30cc67cc12b50e373f05d1b302b5e53ccc9620bf"
DEPENDS= "libusb"

S="${WORKDIR}/git"

do_install () {
	install -m 0744 -d ${D}/${bindir}
	install -m 0744 ${B}/teensy_loader_cli ${D}${bindir}/teensy-loader
}

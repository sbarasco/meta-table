LICENSE = "vim"
LIC_FILES_CHKSUM = "file://../../runtime/doc/uganda.txt;md5=c74ec0ada9a68354f9461e81d3596f61"

SRC_URI = "git://github.com/vim/vim.git \
"
SRCREV = "2693ca21cee8a729d74682fd86a4818f2b050228"

BBCLASSEXTEND = "native nativesdk"

S="${WORKDIR}/git/src/xxd"

do_install () {
	install -m 0744 -d ${D}/${bindir}
	install -m 0744 ${B}/xxd ${D}${bindir}
}

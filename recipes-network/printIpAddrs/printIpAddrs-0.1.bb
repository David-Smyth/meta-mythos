#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Print IP addresses (IPv4 and IPv6) to console. Eventually, during boot."
SECTION = "network"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "file://printIpAddrs.c"

S = "${WORKDIR}"

do_compile() {
	     ${CC} printIpAddrs.c -o printIpAddrs
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 printIpAddrs ${D}${bindir}
}

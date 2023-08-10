SUMMARY = "Bitfiles and device-tree additions for running the default GnuRadio image."
DESCRIPTION = "Bitfiles and device-tree additions for running default GnuRadio image."
SECTION = "bsp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
        file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
        "

DTS_FILE = "dual-sync-cardf.dts"
PERSONALITY = "dual-sync-cardf"

FILESEXTRAPATHS:prepend := "${THISDIR}/bitfiles-dual-sync:"

SRC_URI = " \
    file://15eg/system.xsa \
    file://9eg/system.xsa \
    file://dual-sync-cardf.dts \
    file://carbon-transceiver-cardf-dualA-spi.dtsi \
    file://carbon-transceiver-cardf-dualB-spi.dtsi \
    file://carbon-cardf-i2c.dtsi \
"

include bitfiles.inc

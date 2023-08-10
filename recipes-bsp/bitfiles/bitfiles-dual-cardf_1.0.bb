SUMMARY = "Bitfiles and device-tree additions for running the default GnuRadio image."
DESCRIPTION = "Bitfiles and device-tree additions for running default GnuRadio image."
SECTION = "bsp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
        file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
        "

DTS_FILE = "dual-cardf.dts"
PERSONALITY = "dual-cardf"

FILESEXTRAPATHS:prepend := "${THISDIR}/bitfiles-dual:"

SRC_URI = " \
    file://9eg/system.xsa \
    file://15eg/system.xsa \
    file://dual-cardf.dts \
    file://carbon-transceiver-dualA-spi.dtsi \
    file://carbon-transceiver-dualB-spi.dtsi \
    file://carbon-cardf-i2c.dtsi \
"

include bitfiles.inc

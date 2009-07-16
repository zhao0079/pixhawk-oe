inherit native
require ti-xdctools.inc

SRC_URI	= "file://xdctools_setuplinux_3_15_00_50.bin"
BINFILE="xdctools_setuplinux_3_15_00_50.bin"

S = "${WORKDIR}/xdctools_3_10_03"

# Yes, the xdc stuff still breaks with a '.' in PWD
PV = "310"
PR = "r16"

do_stage() {
    install -d ${STAGING_DIR_NATIVE}/${PN}
    cp -pPrf ${S}/* ${STAGING_DIR_NATIVE}/${PN}
}

AUTOTOOLS_NATIVE_STAGE_INSTALL="1"


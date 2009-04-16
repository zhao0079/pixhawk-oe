DESCRIPTION = "libdc1394 is a library to provide userspace \
access to IEEE 1394 camera devices."
HOMEPAGE = "http://damien.douxchamps.net/ieee1394/libdc1394/"
SECTION = "libs"
LICENSE = "LGPL"

PR = "r0"

SRC_URI = "\
  ${SOURCEFORGE_MIRROR}/libdc1394/libdc1394-${PV}.tar.gz \
"
S = "${WORKDIR}/libdc1394-${PV}"

inherit autotools pkgconfig binconfig lib_package

PARALLEL_MAKE = ""
#EXTRA_OECONF = "--disable-build-docs"

export CXXFLAGS += "-lstdc++ -I${STAGING_INCDIR}"

LIBTOOL = "${HOST_SYS}-libtool"
EXTRA_OEMAKE = "'LIBTOOL=${LIBTOOL}'"

do_stage() {
	autotools_stage_all
}

PACKAGES =+ "libdc1394"
FILES_libdc1394 = "${libdir}/libdc1394*.so.*"

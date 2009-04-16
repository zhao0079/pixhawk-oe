DESCRIPTION = "Coriander is a user interface for \
IEEE 1394 based camera devices"
HOMEPAGE = "http://damien.douxchamps.net/ieee1394/coriander/"
SECTION = "gui"
LICENSE = "GPL"

PR = "r0"

SRC_URI = "\
  ${SOURCEFORGE_MIRROR}/coriander/coriander-${PV}.tar.gz \
"
S = "${WORKDIR}/coriander-${PV}"

inherit autotools pkgconfig binconfig

PARALLEL_MAKE = ""
#EXTRA_OECONF = "--disable-build-docs"

#export CXXFLAGS += "-lstdc++ -I${STAGING_INCDIR}"

#LIBTOOL = "${HOST_SYS}-libtool"
#EXTRA_OEMAKE = "'LIBTOOL=${LIBTOOL}'"

do_stage() {
	autotools_stage_all
}

PACKAGES =+ "coriander"
#FILES_libdc1394 = "${libdir}/libdc1394*.so.*"

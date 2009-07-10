# Copyright (C) 2005, Koninklijke Philips Electronics NV.  All Rights Reserved
# Released under the MIT license (see packages/COPYING)

DESCRIPTION = "A cross-platform, open-source make system"
HOMEPAGE = "http://www.cmake.org/"
LICENSE = "Berkeley-style license"
SECTION = "console/utils"
PR = "r1"

CMAKE_MAJOR_VERSION = "${@bb.data.getVar('PV',d,1).split('.')[0]}.${@bb.data.getVar('PV',d,1).split('.')[1]}"
SRC_URI = "http://pixhawk.ethz.ch/files/cmake-${PV}_precompiled.tar.gz"

S = "${WORKDIR}/cmake-${PV}"

do_configure() {
}

do_compile() {
}

do_install () {
	make install
}


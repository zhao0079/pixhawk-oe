DESCRIPTION = "PIXHAWK: Micro Air Vehicle Computer Vision Platform"
HOMEPAGE = "http://pixhawk.ethz.ch"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "GPLv3"

ARM_INSTRUCTION_SET = "arm"
 
PR = "r0"
 
DEPENDS = "opencv libdc1394"
 
SRC_URI = "https://svn.inf.ethz.ch/svn/pollefeys/pixhawk/trunk"
 
S = "${WORKDIR}/svn"
 
inherit distutils-base cmake pkgconfig lib_package
 

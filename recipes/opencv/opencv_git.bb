DESCRIPTION = "Opencv : The Open Computer Vision Library"
HOMEPAGE = "http://sourceforge.net/projects/opencvlibrary"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "GPLv2"

DEFAULT_PREFERENCE = "99"

ARM_INSTRUCTION_SET = "arm"
 
PR = "r6"
 
DEPENDS = "libtool gtk+ jpeg zlib libpng tiff glib-2.0 libv4l ffmpeg libdc1394"
 
SRCREV = "d380c89b87a99f1ffd5e436e73474e07c4cad758"
SRC_URI = "git://github.com/nzjrs/opencv.git;protocol=git;branch=dc1394"
PV = "1.1.0+git${SRCREV}"
 
S = "${WORKDIR}/git"
 
inherit distutils-base autotools pkgconfig lib_package
 
EXTRA_OECONF = " \
    --disable-debug \
    --with-gtk \
    --with-swig=no \
    --with-python=no \
    --with-quicktime=no \
    --with-dc1394v2=yes \
    --with-v4l=yes \
    --with-apps=yes \
"
 
export BUILD_SYS
export HOST_SYS
 
do_stage() {
  autotools_stage_all
}

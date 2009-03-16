DESCRIPTION = "Oxford's Active Vision Lab Vision Library"

PR = "r0"

DEPENDS = ""

SRC_URI = " \
  http://www.doc.ic.ac.uk/~ajd/Scene/Release/vw34.tar.gz \
"
inherit autotools

# VW34 does not use optimization by default
EXTRA_OECONF_overo = "-O4 -mtune=cortex-a8 -march=armv7-a -mfpu=neon -mfloat-abi=softfp -fno-math-errno -ffinite-math-only -fno-signed-zeros -fexpensive-optimizations -ftree-vectorize -fomit-frame-pointer"

# VW34 needs a special bootstrap shell script
do_configure_prepend () {
    ./bootstrap
}



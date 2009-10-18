# PIXHAWK desktop image
# Includes all packages and setting for the PIXHAWK system

require recipes/images/omap3-desktop-nand-image.bb

FEED_URIS += "pixhawk##http://pixhawk.ethz.ch/ipk"

IMAGE_INSTALL += " \
  opencv \
  opencv-dev \
  opencv-bin \
  gsl-dev \
  artoolkit-dev \
  task-native-sdk \
  pkgconfig \
  libdc1394 \
  grep \
  dropbear \
  git \
  ncurses-dev \
  boost-dev \
 "


export IMAGE_BASENAME = "pixhawk-desktop-image"



# PIXHAWK console image
# Includes all packages and settings for the PIXHAWK competition configuration

require recipes/images/omap3-console-image.bb

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
  nano \
  screen \
 "

export IMAGE_BASENAME = "pixhawk-competition-image"

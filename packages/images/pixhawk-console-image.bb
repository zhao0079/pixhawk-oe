# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require packages/images/omap3-console-image.bb

IMAGE_INSTALL += " \
   dsplink-apps \
   dsplink-module \
   ti-lpm-module \
   ti-cmemk-module \
   opencv-apps \
   opencv-samples \
   libusb \
   task-native-sdk \
   "

export IMAGE_BASENAME = "pixhawk-console-image"

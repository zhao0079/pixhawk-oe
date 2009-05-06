# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require recipes/images/omap3-desktop-image.bb

IMAGE_INSTALL += " \
   opencv-apps \
   opencv-samples \
   libusb \
   task-native-sdk \
   libdc1394 \
   "

export IMAGE_BASENAME = "pixhawk-desktop-image"

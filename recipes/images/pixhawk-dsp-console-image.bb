# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require pixhawk-console-image.bb

IMAGE_INSTALL += " \
   dsplink-module \
   dsplink-apps \
   ti-cmemk-module \
   "

export IMAGE_BASENAME = "pixhawk-dsp-console-image"

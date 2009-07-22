# PIXHAWK dsp-desktop image
# Includes all packages and settings for the PIXHAWK system
# including DSP support

require pixhawk-desktop-image.bb

IMAGE_INSTALL += " \
   ti-dsplink-module \
   ti-cmem-module \
   ti-codec-engine "


export IMAGE_BASENAME = "pixhawk-dsp-desktop-image"

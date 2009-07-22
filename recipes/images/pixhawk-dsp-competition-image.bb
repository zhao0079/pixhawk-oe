# PIXHAWK dsp-competition image 
# Includes all packages and setting for the PIXHAWK competition configuration
# including DSP support

require pixhawk-competition-image.bb

IMAGE_INSTALL += " \
   ti-dsplink-module \
   ti-cmem-module \
   ti-codec-engine "

export IMAGE_BASENAME = "pixhawk-dsp-competition-image"

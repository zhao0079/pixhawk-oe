# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require packages/images/omap3-console-image.bb

IMAGE_INSTALL += "dsplink"

export IMAGE_BASENAME = "pixhawk-console-image"

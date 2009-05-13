# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require recipes/images/pixhawk-console-image.bb
require recipes/images/omap3-desktop-image.bb

export IMAGE_BASENAME = "pixhawk-desktop-image"

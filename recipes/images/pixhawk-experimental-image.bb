# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

require pixhawk-desktop-image.bb

PREFERRED_PROVIDER_virtual/kernel = "linux-omap-pm"

IMAGE_INSTALL += " \
   dsplink-module \
   dsplink-apps \
   ti-cmemk-module \
   kernel-module-cpufreq-stats \
   kernel-module-cpufreq-userspace \
   "

export IMAGE_BASENAME = "pixhawk-experimental-image"

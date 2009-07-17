# PIXHAWK desktop image
# Includes all packages and setting for the PIXHAWK system

require pixhawk-console-image.bb

IMAGE_LINGUAS = "en-us"

ANGSTROM_EXTRA_INSTALL ?= ""
SPLASH ?= "psplash"
#SPLASH ?= "exquisite exquisite-themes exquisite-theme-angstrom"

E_CONFIG = " \
  e-wm-config-angstrom \
  e-wm-config-standard \
  e-wm-config-default \
  e-wm-config-scaleable \
"

E_MODULES = " \
  flame \
  news \
  places \
  rain \
"

APPS = " \
#  cheese \
  evince \
  exhibit \
  empathy \
  firefox \
#  gnome-mplayer \
  jaaa \
  midori \
  numptyphysics \
#  pidgin \
#  swfdec \
#  swfdec-mozilla \
  synergy \
  vnc \
  x11vnc \
  angstrom-x11vnc-xinit \
#  xmms \
  xterm \
"

IMAGE_INSTALL += " \
  ${APPS} \
  angstrom-x11-base-depends \
  angstrom-gpe-task-base \
  angstrom-gpe-task-settings \
  angstrom-zeroconf-audio \
  angstrom-gnome-icon-theme-enable \
  cups \
  e-wm \
  e-wm-sysactions \
  ${E_CONFIG} \
  ${E_MODULES} \
  hicolor-icon-theme \
  gnome-bluetooth \
  gnome-cups-manager \
  gnome-icon-theme \
  gnome-themes \
  gtk-printbackend-cups \
  mime-support \
  nautilus \
  ${SPLASH} \
  ${XSERVER} \
  xdg-utils \
  xlsfonts \
  xrefresh \
# Should be moved into a pixhawk-demo-image at a later point
#  libgles-omap3-demos \
 "

export IMAGE_BASENAME = "pixhawk-desktop-image"

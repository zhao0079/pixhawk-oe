# PIXHAWK console image
# Includes all packages and setting for the PIXHAWK system

inherit image

DEPENDS = "task-base"

IMAGE_EXTRA_INSTALL ?= ""

IMAGE_INSTALL += " \
  task-base-extended \
  task-proper-tools \
  u-boot-tools-env \
  alsa-utils \
  alsa-utils-alsactl \
  alsa-utils-alsamixer \
  alsa-utils-aplay \
  bash \
  bzip2 \
  devmem2 \
  dosfstools \
  e2fsprogs-mke2fs \
  fbgrab \
  fbset \
  fbset-modes \
  i2c-tools \
  ksymoops \
  mkfs-jffs2 \
  mtd-utils \
  nano \
  openssh-scp \
  openssh-ssh \
  openssh-server \
  procps \
  socat \
  strace \
  ${IMAGE_EXTRA_INSTALL} \
  libertas-sd-firmware \
  rt73-firmware \
  zd1211-firmware \
  opencv-dev \
  opencv-bin \
  libusb \
  task-native-sdk \
  libdc1394 \
  dhclient \
  grep \
 "

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"


export IMAGE_BASENAME = "pixhawk-console-image"

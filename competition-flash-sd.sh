#!/bin/sh

#
# This script flashes an image onto a connected SDHC card
#

# Copy the u-boot bootloader
sudo cp -f $OE_HOME/tmp/deploy/glibc/images/overo/u-boot-overo.bin /media/BOOT/u-boot.bin

# Copy the kernel image
sudo cp -f $OE_HOME/tmp/deploy/glibc/images/overo/uImage-overo.bin /media/BOOT/uImage

# Remove old files (if any)
sudo rm -rf /media/LINUX/* && sudo mkdir /media/LINUX/lost+found
# Flash the root file system
sudo tar xjf $OE_HOME/tmp/deploy/glibc/images/overo/pixhawk-competition-image-overo.tar.bz2 -C /media/LINUX


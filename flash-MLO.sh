#!/bin/sh

sudo umount /media/BOOT
sudo mkfs.msdos -F 32 /dev/sdb1 -n BOOT
sudo cp -f $OE_HOME/tmp/deploy/glibc/images/overo/x-load-overo.bin.ift /media/BOOT/MLO

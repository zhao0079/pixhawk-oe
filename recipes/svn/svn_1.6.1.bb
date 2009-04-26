DESCRIPTION = "Subversion client"
SECTION = "console/network"
PRIORITY = "optional"
# Unknown wether sqlite2 or 3, should be fixed
DEPENDS = "apr apr-util zlib sqlite sqlite3"
LICENSE = "GPL"

SRC_URI = "http://subversion.tigris.org/downloads/subversion-1.6.1.tar.bz2"

inherit autotools gettext

#EXTRA_OECONF = "ssapi=no"

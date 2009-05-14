DESCRIPTION = "Subversion client"
SECTION = "console/network"
PRIORITY = "optional"
# Unknown wether sqlite2 or 3, should be fixed
#DEPENDS = "libapr-1-dev libaprutil-1-dev libz-dev libsqlite-dev"
DEPENDS = "apr zlib sqlite"
LICENSE = "GPL"

SRC_URI = "http://subversion.tigris.org/downloads/subversion-1.6.1.tar.bz2"

inherit autotools gettext

#EXTRA_OECONF = "ssapi=no"

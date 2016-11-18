# Base this image on core-image-minimal
require recipes-core/images/core-image-minimal.bb

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += "ssh-server-dropbear read-only-rootfs"

# package-management

# Include modules in rootfs
IMAGE_INSTALL += " \
                   wpa-supplicant \
                   wireless-tools \
                   iw \
	           kernel-modules \
                   openssl \
                   wired-init-systemd \
                   wireless-init-systemd \
                   tablectrl \
                   linux-firmware \
                   crda \
                   teensy-loader \
	"

IMAGE_ROOTFS_EXTRA_SPACE = "65536"

inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P testpass root;"
EXTRA_IMAGE_FEATURES += "package-management"
hostname_pn-base-files = "coffee-table"
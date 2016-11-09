# Base this image on core-image-minimal
require recipes-core/images/core-image-minimal.bb

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += "ssh-server-dropbear"

# package-management

# Include modules in rootfs
IMAGE_INSTALL += " \
                   wpa-supplicant \
                   wireless-tools \
                   iw \
	           kernel-modules \
                   openssl \
                   wired-init-systemd \
                   tablectrl \
	"

IMAGE_ROOTFS_EXTRA_SPACE = "65536"
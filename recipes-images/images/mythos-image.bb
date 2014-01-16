DESCRIPTION = "\
    Linux Standard Base (LSB). \
    Ruby et al are being added."

IMAGE_FEATURES += "\
    dev-pkgs \
    dbg-pkgs \
    ssh-server-openssh \
    nfs-server \
    hwcodecs \
    package-management \
    tools-sdk \
    tools-debug \
    tools-profile \
    debug-tweaks"

IMAGE_INSTALL = "\
    ${CORE_IMAGE_BASE_INSTALL} \
    packagegroup-core-boot \
    packagegroup-base-extended \
    packagegroup-core-basic \
    packagegroup-core-lsb \
    packagegroup-core-tools-debug \
    rt-tests hwlatdetect \
    "

IMAGE_FSTYPES = "tar.bz2 ext3 sdcard"
KERNEL_IMAGETYPE = "uImage"

inherit core-image

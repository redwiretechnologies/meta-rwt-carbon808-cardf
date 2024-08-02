DISTRO_FEATURES += "wifi bluetooth"

CORE_IMAGE_EXTRA_INSTALL += "\
    bitfiles-default-cardf \
    bitfiles-dual-cardf \
    bitfiles-dual-chan-cardf \
    bitfiles-griio-cardf \
    bitfiles-dual-sync-cardf \
    linux-firmware-iwlwifi \
    linux-firmware-ibt \
    linux-firmware \
    aircrack-ng \
"

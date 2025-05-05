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
    python3-construct \
    python3-matplotlib \
    cryptsetup \
    python3-fastapi \
    python3-orjson \
    python3-flask-wtf \
    python3-pyserial \
    pciutils \
"

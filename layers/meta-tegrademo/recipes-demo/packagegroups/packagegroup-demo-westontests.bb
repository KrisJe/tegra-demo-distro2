DESCRIPTION = "Packagegroup for Tegra demo weston test applications"

LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = " \
    gstreamer-tests \
    l4t-graphics-demos-wayland \
    weston-examples \
"

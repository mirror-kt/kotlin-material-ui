package materialui.pickers.components.internal.responsive

import materialui.pickers.components.internal.desktop.DesktopWrapperProps
import materialui.pickers.components.internal.desktoppopper.DesktopPopperWrapperProps
import materialui.pickers.components.internal.modal.ModalWrapperProps

external interface ResponsiveWrapperProps : DesktopWrapperProps, DesktopPopperWrapperProps, ModalWrapperProps {
    var desktopModeMediaQuery: String?
}

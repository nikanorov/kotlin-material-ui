package materialui.pickers.components.clockview

import materialui.pickers.components.ExportedArrowSwitcherProps
import materialui.pickers.components.ExportedClockViewProps
import materialui.pickers.components.calendar.CalendarElementBuilder
import react.RBuilder
import react.RClass
import react.dom.WithClassName

@JsModule("@material-ui/pickers")
private external val ClockViewModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val ClockViewComponent: RClass<ClockViewProps> = ClockViewModule.ClockView

external interface ClockViewProps : ExportedClockViewProps, ExportedArrowSwitcherProps, WithClassName {
    var date: Any?
    var type: String?
    var onDateChange: ((dynamic, dynamic) -> Unit)?
    var onChange: ((dynamic, dynamic) -> Unit)?
    var getHoursClockNumberText: ((String) -> String)?
    var getMinutesClockNumberText: ((String) -> String)?
    var getSecondsClockNumberText: ((String) -> String)?
    var openNextView: (() -> Unit)?
    var openPreviousView: (() -> Unit)?
    var nextViewAvailable: Boolean?
    var previousViewAvailable: Boolean?
    var showViewSwitcher: Boolean?
}

fun RBuilder.clockView(className: String? = null, block: ClockViewElementBuilder.() -> Unit) =
        child(ClockViewElementBuilder(ClockViewComponent, className).apply(block).create())

package materialui.components.fade

import kotlinext.js.jsObject
import react.*
import materialui.reacttransiton.RTransition
import materialui.reacttransiton.RTransitionBuilder

class FadeElementBuilder internal constructor(
    private val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { },
    transition: RTransitionBuilder = RTransitionBuilder()
) : RBuilder(), RTransition by transition {
    init {
        transition.props = props
    }

    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
    var RProps.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { props.asDynamic()["style"] = value }
}
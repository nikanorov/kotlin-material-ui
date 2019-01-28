package components.appbar

import components.MaterialElementBuilder
import components.appbar.enums.AppBarColor
import components.appbar.enums.AppBarPosition
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class AppBarElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>
) : MaterialElementBuilder<T>(type, tag), AppBarAttributes {

    override var classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    override var color: AppBarColor
        get() = AppBarColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    override var position: AppBarPosition
        get() = AppBarPosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["position"])
        set(value) { setProp("position", value.toString()) }
}
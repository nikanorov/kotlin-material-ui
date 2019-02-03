package components.inputbase

import components.MaterialElementBuilder
import components.inputbase.enums.InputMargin
import components.inputbase.values.InputValue
import kotlinx.html.DIV
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.*

open class InputBaseElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.autoComplete: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoComplete"]
        set(value) { setProp("autoComplete", value) }
    var Tag.autoFocus: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoFocus"]
        set(value) { setProp("autoFocus", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.defaultValue: InputValue
        get() = InputValue.fromDynamic(props.asDynamic()["defaultValue"])
        set(value) { setProp("defaultValue", value.value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.endAdornment: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["endAdornment"]
        set(value) { setProp("endAdornment", value) }
    var Tag.error: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["error"]
        set(value) { setProp("error", value) }
    var Tag.fullWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullWidth"]
        set(value) { setProp("fullWidth", value) }
    var Tag.id: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["id"]
        set(value) { setProp("id", value) }
    var Tag.inputComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputComponent"]
        set(value) { setProp("inputComponent", value) }
    var Tag.inputProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputProps"]
        set(value) { setProp("inputProps", value) }
    var Tag.inputRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inputRef"]
        set(value) { setProp("inputRef", value) }
    var Tag.margin: InputMargin
        get() = InputMargin.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["margin"])
        set(value) { setProp("margin", value.toString()) }
    var Tag.muiFormControl: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["muiFormControl"]
        set(value) { setProp("muiFormControl", value) }
    var Tag.multiline: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["multiline"]
        set(value) { setProp("multiline", value) }
    var Tag.name: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["name"]
        set(value) { setProp("name", value) }
    var Tag.onEmpty: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEmpty"]
        set(value) { setProp("onEmpty", value) }
    var Tag.onFilled: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onFilled"]
        set(value) { setProp("onFilled", value) }
    var Tag.placeholder: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["placeholder"]
        set(value) { setProp("placeholder", value) }
    var Tag.readOnly: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["readOnly"]
        set(value) { setProp("readOnly", value) }
    var Tag.renderPrefix: (dynamic) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["renderPrefix"]
        set(value) { setProp("renderPrefix", value) }
    var Tag.required: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["required"]
        set(value) { setProp("required", value) }
    var Tag.rows: Int
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rows"]
        set(value) { setProp("rows", value) }
    var Tag.rowsMax: Int
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rowsMax"]
        set(value) { setProp("rowsMax", value) }
    var Tag.startAdornment: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["startAdornment"]
        set(value) { setProp("startAdornment", value) }
    var Tag.type: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["type"]
        set(value) { setProp("type", value) }
    var Tag.value: InputValue
        get() = InputValue.fromDynamic(props.asDynamic()["value"])
        set(value) { setProp("value", value.value) }
}
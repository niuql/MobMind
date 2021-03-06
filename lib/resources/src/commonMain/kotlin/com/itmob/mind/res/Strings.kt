package com.itmob.mind.res

interface Strings {
    val app_name: String
        get() = "MobMind"

    val menu_home: String
    val menu_file: String
    val menu_edit: String
    val menu_insert: String
    val menu_view: String
    val menu_tools: String
    val menu_help: String

    // File menu
    val new_map: String
    val new_map_from_template: String
    val new_encrypted_map: String
    val open_map: String
    val open_recent: String
    val close_current: String
    val close_all: String
    val close_other: String
    val print: String
    val exit: String

    // Edit menu


    // Insert menu
    val note: String
    val label: String
    val link: String
    val image: String
    val mark: String
    val attachment: String
    val video: String
    val audio: String

    val settings: String
    val supportLanguages: Array<String>
    val about: String
    val check_update: String
    val terms_of_service: String
    val privacy_policy: String
    val open_source_licenses: String

    val state404: String
    val state500: String

    val desc_home: String
        get() = menu_home
    val desc_settings: String
        get() = settings
    val desc_logo_icon: String
        get() = app_name
}

object StringsEn : Strings {
    override val menu_home = "Home"
    override val menu_file = "File"
    override val menu_edit = "Edit"
    override val menu_insert = "Insert"
    override val menu_view = "View"
    override val menu_tools = "Tools"
    override val menu_help = "Help"

    override val new_map = "New..."
    override val new_map_from_template = "New from Template..."
    override val new_encrypted_map = "New encrypted Map..."
    override val open_map = "Open..."
    override val open_recent = "Open Recent"
    override val close_current = "Close Current Map"
    override val close_all = "Close All Maps"
    override val close_other = "Close Other Maps"
    override val print = "Print"
    override val exit = "Exit"
    
    override val note = "note"
    override val label = "label"
    override val link = "link"
    override val image = "image"
    override val mark = "mark"
    override val attachment = "file"
    override val video = "video"
    override val audio = "audio"

    override val settings = "Settings"
    override val supportLanguages = arrayOf("English", "????????????", "????????????")
    override val about = "About"
    override val check_update = "Check for Update"
    override val terms_of_service = "Terms of service"
    override val privacy_policy = "Privacy policy"
    override val open_source_licenses ="Open source licenses"
    override val state404 = "404"
    override val state500 = "Something went wrong, try again in a few minutes. ??\\_(???)_/??"
}

object StringsZh : Strings {
    override val menu_home = "??????"
    override val menu_file = "??????"
    override val menu_edit = "??????"
    override val menu_insert = "??????"
    override val menu_view = "??????"
    override val menu_tools = "??????"
    override val menu_help = "??????"

    override val new_map = "??????..."
    override val new_map_from_template = "???????????????..."
    override val new_encrypted_map = "??????????????????..."
    override val open_map = "??????..."
    override val open_recent = "??????"
    override val close_current = "??????????????????"
    override val close_all = "??????????????????"
    override val close_other = "??????????????????"
    override val print = "??????"
    override val exit = "??????"
    
    override val note = "??????"
    override val label = "??????"
    override val link = "??????"
    override val image = "??????"
    override val mark = "??????"
    override val attachment = "??????"
    override val video = "??????"
    override val audio = "??????"

    override val settings = "??????"
    override val supportLanguages = arrayOf("????????????", "????????????", "English")
    override val about = "??????"
    override val check_update = "????????????"
    override val terms_of_service = StringsEn.terms_of_service
    override val privacy_policy = StringsEn.privacy_policy
    override val open_source_licenses = StringsEn.open_source_licenses
    override val state404 = StringsEn.state404
    override val state500 = StringsEn.state500
}

object StringsZhHk : Strings {
    override val menu_home = "??????"
    override val menu_file = "??????"
    override val menu_edit = "??????"
    override val menu_insert = "??????"
    override val menu_view = "??????"
    override val menu_tools = "??????"
    override val menu_help = "??????"

    override val new_map = "??????..."
    override val new_map_from_template = "???????????????..."
    override val new_encrypted_map = "??????????????????..."
    override val open_map = "??????..."
    override val open_recent = "??????"
    override val close_current = "??????????????????"
    override val close_all = "??????????????????"
    override val close_other = "??????????????????"
    override val print = "??????"
    override val exit = "??????"
    
    override val note = ""
    override val label = ""
    override val link = ""
    override val image = ""
    override val mark = ""
    override val attachment = ""
    override val video = ""
    override val audio = ""

    override val settings = "??????"
    override val supportLanguages = arrayOf("????????????", "????????????", "English")
    override val about = "??????"
    override val check_update = "????????????"
    override val terms_of_service = StringsEn.terms_of_service
    override val privacy_policy = StringsEn.privacy_policy
    override val open_source_licenses = StringsEn.open_source_licenses
    override val state404 = StringsEn.state404
    override val state500 = StringsEn.state500
}
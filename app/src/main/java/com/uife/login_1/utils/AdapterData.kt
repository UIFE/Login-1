package com.uife.login_1.utils

import com.uife.login_1.model.ViewPagerModel

object AdapterData {

    fun getLoginAdapterData(): List<ViewPagerModel> {
        return listOf(
            ViewPagerModel(title = "BRANDING", content = "Expound the actual teachings of the great" +
                    " explorer of the truth, the master-builder of human happiness. No one rejects, dislikes," +
                    " or avoids pleasure itself, because procure him."
                , image = "image_one"),
            ViewPagerModel(title = "PLAN OF WORK", content = "Expound the actual teachings of the great " +
                    "explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, " +
                    "or avoids pleasure itself, because procure him.", image = "image_two"),
            ViewPagerModel(title = "ILLUSTRATION", content = "Expound the actual teachings of the great" +
                    " explorer of the truth, the master-builder of human happiness. No one rejects, dislikes," +
                    " or avoids pleasure itself, because procure him.", image = "image_three")
        )
    }

}
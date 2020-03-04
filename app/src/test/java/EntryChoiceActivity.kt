package com.google.firebase.samples.apps.mlkit

import android.content.Intent
import com.google.android.gms.common.util.CollectionUtils.listOf
import com.patelheggere.mlkitimagelabeling.ChooserActivity

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return listOf(
                Choice(
                        "Java",
                        "Run the Firebase ML Kit quickstart written in Java.",
                        Intent(this,
                                ChooserActivity::class.java)),
                Choice(
                        "Kotlin",
                        "Run the Firebase ML Kit quickstart written in Kotlin.",
                        Intent(
                                this,
                                com.google.firebase.samples.apps.mlkit.kotlin.ChooserActivity::class.java))
        )
    }
}

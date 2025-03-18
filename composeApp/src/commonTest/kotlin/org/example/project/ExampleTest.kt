@file:OptIn(ExperimentalTestApi::class)

package org.example.project

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.printToLog
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class UiTests {

    @Test
    fun initial_screen_state() = runComposeUiTest {
        setContent {
            MaterialTheme {
                App()
            }
        }
        onRoot().printToLog("AppTest")
        onNodeWithText("Click me!").assertIsDisplayed()
        onNodeWithText("Click me!").performClick()
    }
}
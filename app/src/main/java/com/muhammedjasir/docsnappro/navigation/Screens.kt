package com.muhammedjasir.docsnappro.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.muhammedjasir.docsnappro.R

sealed class Screens(
    val route: String,
    @StringRes val resourceId: Int? = R.string.account,
    @DrawableRes val drawableId: Int? = R.drawable.account
) {
    object Welcome: Screens(Routes.WELCOME_SCREEN)
    object SignUp: Screens(Routes.SIGN_UP_SCREEN)
    object SignIn: Screens(Routes.SIGN_IN_SCREEN)
    object ForgotPassword: Screens(Routes.FORGOT_PASSWORD_SCREEN)
    object OTPValidation : Screens(Routes.OTP_SCREEN)
    object CreatePassword : Screens(Routes.CREATE_PASSWORD_SCREEN)
    object Home : Screens(Routes.HOME_SCREEN, R.string.home, R.drawable.home)
    object RecentFiles : Screens(Routes.RECENT_FILES_SCREEN, R.string.file,R.drawable.file)
    object Tools : Screens(Routes.TOOLS_SCREEN,R.string.tools,R.drawable.tools)
    object Account : Screens(Routes.ACCOUNT_SCREEN,R.string.account,R.drawable.account)
}
package com.muhammedjasir.docsnappro.navigation

sealed class Screens(val route: String) {
    object WelcomeScreen: Screens(Routes.WELCOME_SCREEN)
    object SignUpScreen: Screens(Routes.SIGN_UP_SCREEN)
    object SignInScreen: Screens(Routes.SIGN_IN_SCREEN)
    object ForgotPasswordScreen: Screens(Routes.FORGOT_PASSWORD_SCREEN)
    object OTPValidationScreen : Screens(Routes.OTP_SCREEN)
    object CreatePasswordScreen : Screens(Routes.CREATE_PASSWORD_SCREEN)
    object MainScreen : Screens(Routes.MAIN_SCREEN)
    object HomeScreen : Screens(Routes.HOME_SCREEN)
    object RecentFilesScreen : Screens(Routes.RECENT_FILES_SCREEN)
    object ToolsScreen : Screens(Routes.TOOLS_SCREEN)
    object AccountScreen : Screens(Routes.ACCOUNT_SCREEN)
}
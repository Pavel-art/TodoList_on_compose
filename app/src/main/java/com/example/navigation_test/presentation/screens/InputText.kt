package com.example.navigation_test.presentation.screensimport android.util.Logimport androidx.compose.foundation.text.KeyboardActionsimport androidx.compose.foundation.text.KeyboardOptionsimport androidx.compose.material.Iconimport androidx.compose.material.OutlinedTextFieldimport androidx.compose.material.Textimport androidx.compose.material.icons.Iconsimport androidx.compose.material.icons.filled.Warningimport androidx.compose.runtime.Composableimport androidx.compose.ui.ExperimentalComposeUiApiimport androidx.compose.ui.Modifierimport androidx.compose.ui.focus.FocusManagerimport androidx.compose.ui.graphics.Colorimport androidx.compose.ui.platform.LocalFocusManagerimport androidx.compose.ui.platform.LocalSoftwareKeyboardControllerimport androidx.compose.ui.text.input.ImeActionimport androidx.lifecycle.viewmodel.compose.viewModel@OptIn(ExperimentalComposeUiApi::class)@Composablefun InputText(    modifier: Modifier = Modifier,    label: String = "",    value: String,    onValueChange: (String) -> Unit,    placeHolder: String = "",    errorValidText: Boolean = false,    errorState: Boolean = false,) {    OutlinedTextField(        modifier = modifier,        label = {            Text(text = label)        },        isError = errorValidText,        value = value,        placeholder = { Text(text = placeHolder) },        onValueChange = onValueChange,        trailingIcon = {            if (errorState) {                trailingIconView()            }        },    )}private val trailingIconView = @Composable {    Icon(        Icons.Default.Warning,        contentDescription = "",        tint = Color.Red    )}
package com.aaleksiev.compose.material.components.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.ui.graphics.Color
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Background
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.ErrorContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.InverseOnSurface
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.InversePrimary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.InverseSurface
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnBackground
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnError
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnErrorContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnPrimary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnPrimaryContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnSecondary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnSecondaryContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnSurface
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnSurfaceVariant
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnTertiary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OnTertiaryContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Outline
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.OutlineVariant
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Primary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.PrimaryContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Scrim
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Secondary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.SecondaryContainer
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Surface
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.SurfaceTint
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.SurfaceVariant
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.Tertiary
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme.TertiaryContainer

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val appThemeColorScheme = remember(isDarkTheme) { AppThemeColorScheme(isDarkTheme) }
    CompositionLocalProvider(
        LocalMaterialColor provides appThemeColorScheme
    ) {
        MaterialTheme(
            colorScheme = appThemeColorScheme.appColorScheme,
            typography = AppTypography,
            content = content
        )
    }
}

interface MaterialColor {
    fun updateColor(colorSchemeToken: MaterialColorScheme, newColor: Color)
}

val LocalMaterialColor = compositionLocalOf<MaterialColor> { AppThemeColorScheme(false) }

@Immutable
private class AppThemeColorScheme(isDarkTheme: Boolean) : MaterialColor {
    var appColorScheme: ColorScheme by mutableStateOf(if (isDarkTheme) darkScheme else lightScheme)
        private set

    override fun updateColor(colorSchemeToken: MaterialColorScheme, newColor: Color) {
        val updatedScheme = when (colorSchemeToken) {
            is Primary -> appColorScheme.copy(primary = newColor)
            is OnPrimary -> appColorScheme.copy(onPrimary = newColor)
            is PrimaryContainer -> appColorScheme.copy(primaryContainer = newColor)
            is OnPrimaryContainer -> appColorScheme.copy(onPrimaryContainer = newColor)
            is InversePrimary -> appColorScheme.copy(inversePrimary = newColor)
            is Secondary -> appColorScheme.copy(secondary = newColor)
            is OnSecondary -> appColorScheme.copy(onSecondary = newColor)
            is SecondaryContainer -> appColorScheme.copy(secondaryContainer = newColor)
            is OnSecondaryContainer -> appColorScheme.copy(onSecondaryContainer = newColor)
            is Tertiary -> appColorScheme.copy(tertiary = newColor)
            is OnTertiary -> appColorScheme.copy(onTertiary = newColor)
            is TertiaryContainer -> appColorScheme.copy(tertiaryContainer = newColor)
            is OnTertiaryContainer -> appColorScheme.copy(onTertiaryContainer = newColor)
            is Background -> appColorScheme.copy(background = newColor)
            is OnBackground -> appColorScheme.copy(onBackground = newColor)
            is Surface -> appColorScheme.copy(surface = newColor)
            is OnSurface -> appColorScheme.copy(onSurface = newColor)
            is SurfaceVariant -> appColorScheme.copy(surfaceVariant = newColor)
            is OnSurfaceVariant -> appColorScheme.copy(onSurfaceVariant = newColor)
            is SurfaceTint -> appColorScheme.copy(surfaceTint = newColor)
            is InverseSurface -> appColorScheme.copy(inverseSurface = newColor)
            is InverseOnSurface -> appColorScheme.copy(inverseOnSurface = newColor)
            is MaterialColorScheme.Error -> appColorScheme.copy(error = newColor)
            is OnError -> appColorScheme.copy(onError = newColor)
            is ErrorContainer -> appColorScheme.copy(errorContainer = newColor)
            is OnErrorContainer -> appColorScheme.copy(onErrorContainer = newColor)
            is Outline -> appColorScheme.copy(outline = newColor)
            is OutlineVariant -> appColorScheme.copy(outlineVariant = newColor)
            is Scrim -> appColorScheme.copy(scrim = newColor)
        }

        Snapshot.withMutableSnapshot {
            appColorScheme = updatedScheme
        }
    }
}

sealed interface MaterialColorScheme {
    data object Primary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.primary
    }

    data object OnPrimary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onPrimary
    }

    data object PrimaryContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.primaryContainer
    }

    data object OnPrimaryContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onPrimaryContainer
    }

    data object InversePrimary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.inversePrimary
    }

    data object Secondary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.secondary
    }

    data object OnSecondary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onSecondary
    }

    data object SecondaryContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.secondaryContainer
    }

    data object OnSecondaryContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onSecondaryContainer
    }

    data object Tertiary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.tertiary
    }

    data object OnTertiary : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onTertiary
    }

    data object TertiaryContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.tertiaryContainer
    }

    data object OnTertiaryContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onTertiaryContainer
    }

    data object Background : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.background
    }

    data object OnBackground : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onBackground
    }

    data object Surface : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.surface
    }

    data object OnSurface : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onSurface
    }

    data object SurfaceVariant : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.surfaceVariant
    }

    data object OnSurfaceVariant : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onSurfaceVariant
    }

    data object SurfaceTint : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.surfaceTint
    }

    data object InverseSurface : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.inverseSurface
    }

    data object InverseOnSurface : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.inverseOnSurface
    }

    data object Error : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.error
    }

    data object OnError : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onError
    }

    data object ErrorContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.errorContainer
    }

    data object OnErrorContainer : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.onErrorContainer
    }

    data object Outline : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.outline
    }

    data object OutlineVariant : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.outlineVariant
    }

    data object Scrim : MaterialColorScheme {
        val color: Color
            @Composable
            get() = MaterialTheme.colorScheme.scrim
    }
}

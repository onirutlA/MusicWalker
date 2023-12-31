package com.onirutla.musicwalker.ui.screens.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.onirutla.musicwalker.R
import com.onirutla.musicwalker.core.media.playback_controller.PlayerState
import com.onirutla.musicwalker.domain.models.dummyMusic
import com.onirutla.musicwalker.ui.components.MusicItem
import com.onirutla.musicwalker.ui.components.MusicMiniPlayerCard
import com.onirutla.musicwalker.ui.screens.MusicPlayerUiState
import com.onirutla.musicwalker.ui.theme.MusicWalkerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    state: MainScreenState,
    playbackUiState: MusicPlayerUiState,
    onEvent: (MainScreenEvent) -> Unit,
    onUiEvent: (MainScreenUiEvent) -> Unit,
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) })
        },
        modifier = modifier
            .fillMaxSize()
            .systemBarsPadding()
            .navigationBarsPadding(),
        contentWindowInsets = WindowInsets(
            left = 8.dp,
            top = 8.dp,
            right = 8.dp,
            bottom = 8.dp,
        ),
    ) { windowInsetPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(windowInsetPadding)
        ) {
            if (state.isLoading == true) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }

            if (state.isLoading == false) {
                LazyColumn(
                    modifier = Modifier.align(Alignment.TopCenter),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(items = state.musics) {
                        MusicItem(
                            modifier = Modifier.clickable {
                                onEvent(MainScreenEvent.OnMusicClicked(it))
                                onEvent(MainScreenEvent.OnPlayMusic)
                            },
                            music = it
                        )
                    }
                }
            }

            if (playbackUiState.playerState != PlayerState.STOPPED) {
                MusicMiniPlayerCard(
                    modifier = Modifier
                        .clickable { onUiEvent(MainScreenUiEvent.OnNavigateToMusicPlayer) }
                        .align(Alignment.BottomCenter)
                        .padding(vertical = 16.dp, horizontal = 8.dp),
                    music = playbackUiState.currentMusic,
                    playerState = playbackUiState.playerState,
                    onResumeClicked = { onEvent(MainScreenEvent.OnResumeMusic) },
                    onPauseClicked = { onEvent(MainScreenEvent.OnPauseMusic) },
                )
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MusicWalkerTheme {
        MainScreen(
            state = MainScreenState(
                isLoading = false,
                musics = dummyMusic,
            ),
            onEvent = {},
            playbackUiState = MusicPlayerUiState(
                PlayerState.PLAYING,
                currentMusic = dummyMusic[0],
            ),
            onUiEvent = {}
        )
    }
}

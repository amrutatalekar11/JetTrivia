package com.fresher.jettrivia.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.fresher.jettrivia.component.Questions

@Composable
fun TriviaHome( viewModel: QuestionsViewModel = hiltViewModel()){
    Questions(viewModel)
}
/*
 * Copyright (C) 2014 Jorge Castillo Pérez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jorgecastilloprz.easymvp.di;

import com.github.jorgecastilloprz.easymvp.mvp.presenters.GameDetailsPresenter;
import com.github.jorgecastilloprz.easymvp.mvp.presenters.GameDetailsPresenterImpl;
import com.github.jorgecastilloprz.easymvp.mvp.presenters.GameListPresenter;
import com.github.jorgecastilloprz.easymvp.mvp.presenters.GameListPresenterImpl;
import com.github.jorgecastilloprz.easymvp.mvp.views.DetailsActivity;
import com.github.jorgecastilloprz.easymvp.mvp.views.GameListFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Satisfies presenter dependent classes with concrete presenter implementations
 *
 * @author Jorge Castillo Pérez
 */

@Module(
        injects = {GameListFragment.class, DetailsActivity.class},
        library = true, complete = false
)
public class PresenterModule {

    @Provides @Singleton GameListPresenter provideGameListPresenter(GameListPresenterImpl gameListPresenter) {
        return gameListPresenter;
    }
    
    @Provides @Singleton GameDetailsPresenter provideGameDetailsPresenter(GameDetailsPresenterImpl gameDetailsPresenter) {
        return gameDetailsPresenter;
    }
}

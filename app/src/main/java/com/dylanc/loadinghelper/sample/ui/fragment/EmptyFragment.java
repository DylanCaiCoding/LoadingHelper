/*
 * Copyright (c) 2019. Dylan Cai
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dylanc.loadinghelper.sample.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dylanc.loadinghelper.LoadingHelper;
import com.dylanc.loadinghelper.sample.databinding.LayoutContentBinding;
import com.dylanc.loadinghelper.sample.utils.HttpUtils;

/**
 * @author Dylan Cai
 */
@SuppressWarnings("FieldCanBeLocal")
public class EmptyFragment extends Fragment implements LoadingHelper.OnReloadListener {

  private LayoutContentBinding binding;
  private LoadingHelper loadingHelper;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    binding = LayoutContentBinding.inflate(inflater, container, false);
    loadingHelper = new LoadingHelper(binding.getRoot());
    loadingHelper.setOnReloadListener(this);
    return loadingHelper.getDecorView();
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    loadData();
  }

  private void loadData() {
    loadingHelper.showLoadingView();
    HttpUtils.requestSuccess(new HttpUtils.Callback() {
      @Override
      public void onSuccess() {
        loadingHelper.showEmptyView();
      }

      @Override
      public void onFailure() {
        loadingHelper.showErrorView();
      }
    });
  }

  @Override
  public void onReload() {
    loadingHelper.showLoadingView();
    HttpUtils.requestSuccess(new HttpUtils.Callback() {
      @Override
      public void onSuccess() {
        loadingHelper.showEmptyView();
      }

      @Override
      public void onFailure() {
        loadingHelper.showErrorView();
      }
    });
  }
}

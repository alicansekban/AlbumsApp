// Generated by Dagger (https://dagger.dev).
package com.alican.workapp.ui.main.albums_detail;

import com.alican.workapp.net.WorkApi;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlbumDetailViewModel_Factory implements Factory<AlbumDetailViewModel> {
  private final Provider<WorkApi> apiProvider;

  public AlbumDetailViewModel_Factory(Provider<WorkApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public AlbumDetailViewModel get() {
    return newInstance(apiProvider.get());
  }

  public static AlbumDetailViewModel_Factory create(Provider<WorkApi> apiProvider) {
    return new AlbumDetailViewModel_Factory(apiProvider);
  }

  public static AlbumDetailViewModel newInstance(WorkApi api) {
    return new AlbumDetailViewModel(api);
  }
}

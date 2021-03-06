// Generated by Dagger (https://dagger.dev).
package com.alican.workapp.ui.main.albums;

import com.alican.workapp.net.WorkApi;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlbumsViewModel_Factory implements Factory<AlbumsViewModel> {
  private final Provider<WorkApi> apiProvider;

  public AlbumsViewModel_Factory(Provider<WorkApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public AlbumsViewModel get() {
    return newInstance(apiProvider.get());
  }

  public static AlbumsViewModel_Factory create(Provider<WorkApi> apiProvider) {
    return new AlbumsViewModel_Factory(apiProvider);
  }

  public static AlbumsViewModel newInstance(WorkApi api) {
    return new AlbumsViewModel(api);
  }
}

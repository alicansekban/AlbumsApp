// Generated by Dagger (https://dagger.dev).
package com.alican.workapp.ui.main.albums_detail.photos;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PhotosAdapterViewModel_Factory implements Factory<PhotosAdapterViewModel> {
  @Override
  public PhotosAdapterViewModel get() {
    return newInstance();
  }

  public static PhotosAdapterViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PhotosAdapterViewModel newInstance() {
    return new PhotosAdapterViewModel();
  }

  private static final class InstanceHolder {
    private static final PhotosAdapterViewModel_Factory INSTANCE = new PhotosAdapterViewModel_Factory();
  }
}
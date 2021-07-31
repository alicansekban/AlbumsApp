// Generated by Dagger (https://dagger.dev).
package com.alican.workapp.di.modules;

import com.alican.workapp.net.WorkApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetModule_ProvideAPIFactory implements Factory<WorkApi> {
  @Override
  public WorkApi get() {
    return provideAPI();
  }

  public static NetModule_ProvideAPIFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static WorkApi provideAPI() {
    return Preconditions.checkNotNullFromProvides(NetModule.INSTANCE.provideAPI());
  }

  private static final class InstanceHolder {
    private static final NetModule_ProvideAPIFactory INSTANCE = new NetModule_ProvideAPIFactory();
  }
}
// Generated by data binding compiler. Do not edit!
package com.alican.workapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.alican.workapp.R;
import com.alican.workapp.ui.main.welcome.WelcomeViewModel;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityWelcomeBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnContinue;

  @NonNull
  public final TextView txtWelcome;

  @Bindable
  protected WelcomeViewModel mViewModel;

  protected ActivityWelcomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnContinue, TextView txtWelcome) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnContinue = btnContinue;
    this.txtWelcome = txtWelcome;
  }

  public abstract void setViewModel(@Nullable WelcomeViewModel viewModel);

  @Nullable
  public WelcomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_welcome, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityWelcomeBinding>inflateInternal(inflater, R.layout.activity_welcome, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_welcome, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityWelcomeBinding>inflateInternal(inflater, R.layout.activity_welcome, null, false, component);
  }

  public static ActivityWelcomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityWelcomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityWelcomeBinding)bind(component, view, R.layout.activity_welcome);
  }
}

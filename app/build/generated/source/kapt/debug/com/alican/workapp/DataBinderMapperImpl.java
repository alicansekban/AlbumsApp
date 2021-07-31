package com.alican.workapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alican.workapp.databinding.ActivityMainBindingImpl;
import com.alican.workapp.databinding.ActivityWelcomeBindingImpl;
import com.alican.workapp.databinding.FragmentAlbumsBindingImpl;
import com.alican.workapp.databinding.FragmentAlbumsDetailBindingImpl;
import com.alican.workapp.databinding.FragmentDialogProgressBindingImpl;
import com.alican.workapp.databinding.FragmentProfileBindingImpl;
import com.alican.workapp.databinding.ItemAlbumBindingImpl;
import com.alican.workapp.databinding.ItemCommentBindingImpl;
import com.alican.workapp.databinding.ItemPhotoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYWELCOME = 2;

  private static final int LAYOUT_FRAGMENTALBUMS = 3;

  private static final int LAYOUT_FRAGMENTALBUMSDETAIL = 4;

  private static final int LAYOUT_FRAGMENTDIALOGPROGRESS = 5;

  private static final int LAYOUT_FRAGMENTPROFILE = 6;

  private static final int LAYOUT_ITEMALBUM = 7;

  private static final int LAYOUT_ITEMCOMMENT = 8;

  private static final int LAYOUT_ITEMPHOTO = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.activity_welcome, LAYOUT_ACTIVITYWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.fragment_albums, LAYOUT_FRAGMENTALBUMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.fragment_albums_detail, LAYOUT_FRAGMENTALBUMSDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.fragment_dialog_progress, LAYOUT_FRAGMENTDIALOGPROGRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.item_album, LAYOUT_ITEMALBUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.item_comment, LAYOUT_ITEMCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alican.workapp.R.layout.item_photo, LAYOUT_ITEMPHOTO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWELCOME: {
          if ("layout/activity_welcome_0".equals(tag)) {
            return new ActivityWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALBUMS: {
          if ("layout/fragment_albums_0".equals(tag)) {
            return new FragmentAlbumsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_albums is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALBUMSDETAIL: {
          if ("layout/fragment_albums_detail_0".equals(tag)) {
            return new FragmentAlbumsDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_albums_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDIALOGPROGRESS: {
          if ("layout/fragment_dialog_progress_0".equals(tag)) {
            return new FragmentDialogProgressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dialog_progress is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMALBUM: {
          if ("layout/item_album_0".equals(tag)) {
            return new ItemAlbumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_album is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOMMENT: {
          if ("layout/item_comment_0".equals(tag)) {
            return new ItemCommentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_comment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPHOTO: {
          if ("layout/item_photo_0".equals(tag)) {
            return new ItemPhotoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_photo is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.alican.workapp.R.layout.activity_main);
      sKeys.put("layout/activity_welcome_0", com.alican.workapp.R.layout.activity_welcome);
      sKeys.put("layout/fragment_albums_0", com.alican.workapp.R.layout.fragment_albums);
      sKeys.put("layout/fragment_albums_detail_0", com.alican.workapp.R.layout.fragment_albums_detail);
      sKeys.put("layout/fragment_dialog_progress_0", com.alican.workapp.R.layout.fragment_dialog_progress);
      sKeys.put("layout/fragment_profile_0", com.alican.workapp.R.layout.fragment_profile);
      sKeys.put("layout/item_album_0", com.alican.workapp.R.layout.item_album);
      sKeys.put("layout/item_comment_0", com.alican.workapp.R.layout.item_comment);
      sKeys.put("layout/item_photo_0", com.alican.workapp.R.layout.item_photo);
    }
  }
}

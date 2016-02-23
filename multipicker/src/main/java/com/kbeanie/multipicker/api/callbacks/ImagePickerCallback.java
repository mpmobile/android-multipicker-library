package com.kbeanie.multipicker.api.callbacks;

import com.kbeanie.multipicker.api.entity.ChosenImage;

import java.util.List;

/**
 * Created by kbibek on 2/23/16.
 */
public interface ImagePickerCallback {
    void onImagesChosen(List<ChosenImage> images);
    void onError(String message);
}

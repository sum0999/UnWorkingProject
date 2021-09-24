package com.brand.unworkingproject.generated;

import java.util.Arrays;
import java.util.List;
import org.unimodules.core.interfaces.Package;

public class BasePackageList {
  public List<Package> getPackageList() {
    return Arrays.<Package>asList(
        new expo.modules.analytics.segment.SegmentPackage(),
        new expo.modules.camera.CameraPackage(),
        new expo.modules.constants.ConstantsPackage(),
        new expo.modules.documentpicker.DocumentPickerPackage(),
        new expo.modules.filesystem.FileSystemPackage(),
        new expo.modules.font.FontLoaderPackage(),
        new expo.modules.haptics.HapticsPackage(),
        new expo.modules.imageloader.ImageLoaderPackage(),
        new expo.modules.imagemanipulator.ImageManipulatorPackage(),
        new expo.modules.imagepicker.ImagePickerPackage(),
        new expo.modules.inapppurchases.InAppPurchasesPackage(),
        new expo.modules.lineargradient.LinearGradientPackage(),
        new expo.modules.localauthentication.LocalAuthenticationPackage(),
        new expo.modules.securestore.SecureStorePackage(),
        new expo.modules.sharing.SharingPackage(),
        new expo.modules.splashscreen.SplashScreenPackage(),
        new expo.modules.updates.UpdatesPackage()
    );
  }
}

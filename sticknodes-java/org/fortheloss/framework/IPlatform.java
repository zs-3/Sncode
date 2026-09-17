package org.fortheloss.framework;

/* loaded from: classes2.dex */
public interface IPlatform {
    void analyticsSendEvent(java.lang.String r1, java.lang.String r2);

    void analyticsSendSingle(java.lang.String r1);

    void analyticsSendValue(java.lang.String r1, java.lang.String r2, java.lang.Double r3);

    void analyticsSetUserID(java.lang.String r1);

    void androidEnableNotification(boolean r1);

    boolean androidHasStoragePermission();

    void androidRequestStoragePermission(org.fortheloss.framework.IAndroidStorageRequester r1);

    void displayInterstitialAd(org.fortheloss.framework.IAdListener r1);

    int emailStickfigureSubmission(java.lang.String[] r1, java.lang.String[] r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9);

    java.lang.String getExternalPath();

    java.lang.String getExternalPath(boolean r1);

    long getFreeStorageSpace();

    java.lang.String getOSVersion();

    org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder getPlatformMP4Encoder();

    org.fortheloss.framework.IPlatformMuxer getPlatformMuxer();

    org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder getPlatformPNGEncoder();

    int getStore();

    boolean iosCanUseMail();

    boolean isChromebook();

    boolean isDeniedAccessToPhotos();

    boolean isPro();

    void loadInterstitialAd();

    void logNonFatalException(java.lang.Throwable r1);

    void minigameDisplayLeaderboard();

    void minigameSubmitToLeaderboard(float r1);

    int mp3ToPCM(java.io.File r1, java.lang.String r2, int r3);

    void onAnimationScreenStart();

    void onRateClick();

    void onUnlockClick();

    void openURI(java.lang.String r1);

    boolean requestImage(org.fortheloss.framework.IImageRequester r1, int r2);

    void saveImageToGallery(java.lang.String r1, org.fortheloss.framework.ISaveMediaToGalleryDelegate r2);

    void saveVideoToGallery(java.lang.String r1, org.fortheloss.framework.ISaveMediaToGalleryDelegate r2);

    boolean sendFiles(java.lang.String[] r1);

    void setCrashlyticsKeyString(java.lang.String r1, java.lang.String r2);

    void setupKeyboard();

    void shareGif(java.lang.String r1);

    void shareMP4(java.lang.String r1);

    int wavToAAC(java.io.File r1, java.lang.String r2);

    void writeAndroidLogcat(com.badlogic.gdx.files.FileHandle r1);
}

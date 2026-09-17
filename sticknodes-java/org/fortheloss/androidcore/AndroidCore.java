package org.fortheloss.androidcore;

/* loaded from: classes2.dex */
public class AndroidCore extends com.badlogic.gdx.backends.android.AndroidApplication implements org.fortheloss.framework.IPlatform, org.fortheloss.framework.IAndroidStorageRequester {
    protected static final java.lang.String SN_DIR_GIF = null;
    protected static final java.lang.String SN_DIR_MP4 = null;
    protected static final java.lang.String SN_DIR_PNG = null;
    public static java.lang.Class<?> mainActivityClass;
    private java.lang.String _admobID;
    private org.fortheloss.androidcore.AdmobInterstitialHandler _admobInterstitialHandler;
    private org.fortheloss.framework.IAndroidStorageRequester _androidStorageRequesterRef;
    private java.lang.String _externalPath;
    private com.google.firebase.analytics.FirebaseAnalytics _firebaseAnalytics;
    private com.google.firebase.crashlytics.FirebaseCrashlytics _firebaseCrashlytics;
    private org.fortheloss.framework.IImageRequester _imageRequester;
    private boolean _isPro;
    private int _requestedImageQuality;
    private android.content.Intent _zipIntentToHandleAfterStoragePermissionRef;





    /* renamed from: -$$Nest$fget_imageRequester, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.IImageRequester m138$$Nest$fget_imageRequester(org.fortheloss.androidcore.AndroidCore r0) {
            org.fortheloss.framework.IImageRequester r0 = r0._imageRequester
            return r0
    }

    /* renamed from: -$$Nest$fget_requestedImageQuality, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m139$$Nest$fget_requestedImageQuality(org.fortheloss.androidcore.AndroidCore r0) {
            int r0 = r0._requestedImageQuality
            return r0
    }

    /* renamed from: -$$Nest$mflipBitmap, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.Bitmap m140$$Nest$mflipBitmap(org.fortheloss.androidcore.AndroidCore r0, android.graphics.Bitmap r1, boolean r2, boolean r3) {
            android.graphics.Bitmap r0 = r0.flipBitmap(r1, r2, r3)
            return r0
    }

    /* renamed from: -$$Nest$mrotateBitmap, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.graphics.Bitmap m141$$Nest$mrotateBitmap(org.fortheloss.androidcore.AndroidCore r0, android.graphics.Bitmap r1, float r2) {
            android.graphics.Bitmap r0 = r0.rotateBitmap(r1, r2)
            return r0
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = "StickNodesMP4"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.fortheloss.androidcore.AndroidCore.SN_DIR_MP4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "StickNodesGIF"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.fortheloss.androidcore.AndroidCore.SN_DIR_GIF = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "StickNodesPNG"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.fortheloss.androidcore.AndroidCore.SN_DIR_PNG = r0
            return
    }

    public AndroidCore() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isPro = r0
            r1._requestedImageQuality = r0
            r0 = 0
            r1._externalPath = r0
            return
    }

    private void actuallyBeginIntent(android.content.Intent r12) {
            r11 = this;
            if (r12 != 0) goto L6
            r11.pushImportToApp()
            return
        L6:
            android.net.Uri r6 = r12.getData()
            if (r6 != 0) goto L10
            r11.pushImportToApp()
            return
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            r7 = 0
            r8 = 1
            if (r0 < r1) goto L27
            r1 = 33
            if (r0 >= r1) goto L27
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r11, r2)
            if (r0 != 0) goto L25
            goto L27
        L25:
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            if (r0 != 0) goto L37
            java.lang.String[] r12 = new java.lang.String[]{r2}
            r0 = 103(0x67, float:1.44E-43)
            androidx.core.app.ActivityCompat.requestPermissions(r11, r12, r0)
            r11.pushImportToApp()
            return
        L37:
            java.lang.String r9 = r6.toString()
            java.lang.String r0 = "content://"
            boolean r0 = r9.startsWith(r0)
            r10 = 0
            if (r0 == 0) goto L99
            android.content.ContentResolver r0 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L71 java.lang.SecurityException -> L73
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L71 java.lang.SecurityException -> L73
            if (r0 == 0) goto L6a
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.SecurityException -> L68 java.lang.Throwable -> L91
            if (r1 == 0) goto L6a
            java.lang.String r1 = "_display_name"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.SecurityException -> L68 java.lang.Throwable -> L91
            if (r1 < 0) goto L66
            java.lang.String r10 = r0.getString(r1)     // Catch: java.lang.SecurityException -> L68 java.lang.Throwable -> L91
            goto L6a
        L66:
            r1 = 1
            goto L6b
        L68:
            r1 = move-exception
            goto L75
        L6a:
            r1 = 0
        L6b:
            if (r0 == 0) goto Lab
            r0.close()
            goto Lab
        L71:
            r12 = move-exception
            goto L93
        L73:
            r1 = move-exception
            r0 = r10
        L75:
            java.lang.String r2 = "intent_1_uristr"
            r11.setCrashlyticsKeyString(r2, r9)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "intent_1_flags"
            int r3 = r12.getFlags()     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L91
            r11.setCrashlyticsKeyString(r2, r3)     // Catch: java.lang.Throwable -> L91
            r11.logNonFatalException(r1)     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            r1 = 1
            goto Lab
        L91:
            r12 = move-exception
            r10 = r0
        L93:
            if (r10 == 0) goto L98
            r10.close()
        L98:
            throw r12
        L99:
            java.lang.String r0 = "file://"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto Laa
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            java.lang.String r10 = r0.getName()
        Laa:
            r1 = 0
        Lab:
            if (r1 != r8) goto Lb1
            r11.pushImportToApp()
            return
        Lb1:
            if (r10 != 0) goto Lb6
            java.lang.String r0 = "zip"
            goto Lba
        Lb6:
            java.lang.String r0 = r11.getFileExtension(r10)
        Lba:
            java.lang.String r1 = "nodes"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lc4
            r0 = 2
            goto Lf5
        Lc4:
            java.lang.String r1 = "stk"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Lce
            r0 = 4
            goto Lf5
        Lce:
            java.lang.String r1 = "stknds"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Ld8
            r0 = 1
            goto Lf5
        Ld8:
            java.lang.String r1 = "nodemc"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto Le2
            r0 = 3
            goto Lf5
        Le2:
            boolean r1 = r11._isPro
            if (r1 == 0) goto Lf0
            java.lang.String r1 = "mp3"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lf0
            r0 = 5
            goto Lf5
        Lf0:
            if (r10 != 0) goto Lf4
            java.lang.String r10 = "temp_zip_file.zip"
        Lf4:
            r0 = 0
        Lf5:
            java.lang.String r1 = "UTF-8"
            java.lang.String r10 = java.net.URLDecoder.decode(r10, r1)     // Catch: java.lang.Exception -> Lfb
        Lfb:
            android.content.ContentResolver r1 = r11.getContentResolver()     // Catch: java.lang.Exception -> L1f1
            java.io.InputStream r12 = r1.openInputStream(r6)     // Catch: java.lang.Exception -> L1f1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getExternalPath()
            r1.append(r2)
            java.lang.String r2 = "temp/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L126
            r2.mkdirs()
        L126:
            java.io.File r3 = new java.io.File
            r3.<init>(r2, r10)
            boolean r2 = r3.exists()
            if (r2 != 0) goto L13c
            r3.createNewFile()     // Catch: java.io.IOException -> L135
            goto L13c
        L135:
            r2 = move-exception
            r11.logNonFatalException(r2)
            r2.printStackTrace()
        L13c:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L1e3
            r2.<init>(r3)     // Catch: java.io.FileNotFoundException -> L1e3
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]
        L145:
            int r5 = r12.read(r4)     // Catch: java.lang.Throwable -> L1c9 java.io.IOException -> L1cb
            r6 = -1
            if (r5 == r6) goto L150
            r2.write(r4, r7, r5)     // Catch: java.lang.Throwable -> L1c9 java.io.IOException -> L1cb
            goto L145
        L150:
            org.jcodec.common.io.IOUtils.closeQuietly(r12)
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            if (r0 != 0) goto L1ad
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "unzipped_"
            r12.append(r0)
            double r4 = java.lang.Math.random()
            r9 = 4681608292164698112(0x40f869f000000000, double:99999.0)
            double r4 = r4 * r9
            int r0 = (int) r4
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "/"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r12)
            boolean r1 = r0.exists()
            if (r1 != r8) goto L198
            r0.delete()
        L198:
            r0.mkdirs()
            int r12 = r11.extractFromZIP(r3, r12)
            if (r12 != r8) goto L1a9
            java.io.File r12 = r0.file()
            r11.pushImportToApp(r7, r12)
            goto L1c8
        L1a9:
            r11.pushImportToApp()
            goto L1c8
        L1ad:
            boolean r12 = r3.exists()
            if (r12 != r8) goto L1c5
            java.lang.String r12 = r3.getAbsolutePath()
            java.io.File r12 = r11.moveFileToProperDirectory(r0, r12)
            if (r12 != 0) goto L1c1
            r11.pushImportToApp()
            goto L1c8
        L1c1:
            r11.pushImportToApp(r0, r12)
            goto L1c8
        L1c5:
            r11.pushImportToApp()
        L1c8:
            return
        L1c9:
            r0 = move-exception
            goto L1dc
        L1cb:
            r0 = move-exception
            r11.logNonFatalException(r0)     // Catch: java.lang.Throwable -> L1c9
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1c9
            r11.pushImportToApp()     // Catch: java.lang.Throwable -> L1c9
            org.jcodec.common.io.IOUtils.closeQuietly(r12)
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            return
        L1dc:
            org.jcodec.common.io.IOUtils.closeQuietly(r12)
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            throw r0
        L1e3:
            r0 = move-exception
            r11.logNonFatalException(r0)
            r0.printStackTrace()
            org.jcodec.common.io.IOUtils.closeQuietly(r12)
            r11.pushImportToApp()
            return
        L1f1:
            r0 = move-exception
            java.lang.String r1 = "intent_2_uristr"
            r11.setCrashlyticsKeyString(r1, r9)
            int r12 = r12.getFlags()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "intent_2_flags"
            r11.setCrashlyticsKeyString(r1, r12)
            r11.logNonFatalException(r0)
            r0.printStackTrace()
            r11.pushImportToApp()
            return
    }

    private void beginZipIntent(android.content.Intent r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = r2.androidHasStoragePermission()
            r1 = 1
            if (r0 != r1) goto Le
            r2.actuallyBeginIntent(r3)
            goto L13
        Le:
            r2.androidRequestStoragePermission(r2)
            r2._zipIntentToHandleAfterStoragePermissionRef = r3
        L13:
            return
    }

    private void checkIntent(android.content.Intent r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.net.Uri r0 = r2.getData()
            if (r0 == 0) goto Lb
            r1.beginZipIntent(r2)
        Lb:
            return
    }

    private int extractFromZIP(java.io.File r11, java.lang.String r12) {
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.io.IOException -> L10d
            r1 = 24
            if (r0 < r1) goto Le
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L10d
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.io.IOException -> L10d
            r0.<init>(r11, r1)     // Catch: java.io.IOException -> L10d
            goto L13
        Le:
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L10d
            r0.<init>(r11)     // Catch: java.io.IOException -> L10d
        L13:
            java.util.Enumeration r11 = r0.entries()
        L17:
            boolean r1 = r11.hasMoreElements()
            r2 = 1
            if (r1 != r2) goto L109
            java.lang.Object r1 = r11.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = r10.stripExtension(r3)
            java.lang.String r3 = r10.getFileExtension(r3)
            java.lang.String r5 = "nodes"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 != 0) goto L61
            java.lang.String r5 = "stk"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 != 0) goto L61
            java.lang.String r5 = "nodemc"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 != 0) goto L61
            java.lang.String r5 = "stknds"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 != 0) goto L61
            org.fortheloss.framework.IPlatform r5 = org.fortheloss.sticknodes.App.platform
            boolean r5 = r5.isPro()
            if (r5 == 0) goto L61
            java.lang.String r5 = "mp3"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 != 0) goto L61
            goto L17
        L61:
            r5 = 47
            r6 = 95
            java.lang.String r4 = r4.replace(r5, r6)
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r4)
            java.lang.String r7 = "."
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r6)
            java.io.File r5 = r5.file()
            r6 = 0
            r7 = 0
        L8c:
            boolean r8 = r5.exists()
            if (r8 != r2) goto Lbd
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            r8.append(r4)
            java.lang.String r9 = " ("
            r8.append(r9)
            int r7 = r7 + r2
            r8.append(r7)
            java.lang.String r9 = ")."
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r8)
            java.io.File r5 = r5.file()
            goto L8c
        Lbd:
            java.io.InputStream r1 = r0.getInputStream(r1)     // Catch: java.io.IOException -> L100
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lf4
            r2.<init>(r5)     // Catch: java.io.IOException -> Lf4
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]
        Lca:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Ldf
            r5 = -1
            if (r4 == r5) goto Ld5
            r2.write(r3, r6, r4)     // Catch: java.lang.Throwable -> Ldd java.io.IOException -> Ldf
            goto Lca
        Ld5:
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            goto L17
        Ldd:
            r11 = move-exception
            goto Led
        Ldf:
            r11 = move-exception
            r10.logNonFatalException(r11)     // Catch: java.lang.Throwable -> Ldd
            r11.printStackTrace()     // Catch: java.lang.Throwable -> Ldd
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            return r6
        Led:
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            org.jcodec.common.io.IOUtils.closeQuietly(r2)
            throw r11
        Lf4:
            r2 = move-exception
            r10.logNonFatalException(r2)
            r2.printStackTrace()
            org.jcodec.common.io.IOUtils.closeQuietly(r1)
            goto L17
        L100:
            r1 = move-exception
            r10.logNonFatalException(r1)
            r1.printStackTrace()
            goto L17
        L109:
            org.jcodec.common.io.IOUtils.closeQuietly(r0)
            return r2
        L10d:
            r11 = move-exception
            r10.logNonFatalException(r11)
            r11.printStackTrace()
            r11 = 2
            return r11
    }

    private android.graphics.Bitmap flipBitmap(android.graphics.Bitmap r8, boolean r9, boolean r10) {
            r7 = this;
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto Le
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L10
        Le:
            r9 = 1065353216(0x3f800000, float:1.0)
        L10:
            if (r10 == 0) goto L13
            goto L15
        L13:
            r0 = 1065353216(0x3f800000, float:1.0)
        L15:
            r5.preScale(r9, r0)
            r1 = 0
            r2 = 0
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r6 = 1
            r0 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    private void goToStore() {
            r1 = this;
            r0 = 0
            r1.goToStore(r0)
            return
    }

    private void goToStore(boolean r5) {
            r4 = this;
            boolean r0 = r4._isPro
            if (r0 != 0) goto L9
            if (r5 == 0) goto L7
            goto L9
        L7:
            r5 = 0
            goto La
        L9:
            r5 = 1
        La:
            if (r5 == 0) goto Lf
            java.lang.String r5 = "org.fortheloss.sticknodespro"
            goto L11
        Lf:
            java.lang.String r5 = "org.fortheloss.sticknodes"
        L11:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            int r2 = r4.getStore()
            r3 = 2
            if (r2 != r3) goto L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "amzn://apps/android?p="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            goto L50
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "market://details?id="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
        L50:
            r4.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L54
            goto L76
        L54:
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L72
            r2.<init>()     // Catch: android.content.ActivityNotFoundException -> L72
            java.lang.String r3 = "https://play.google.com/store/apps/details?id="
            r2.append(r3)     // Catch: android.content.ActivityNotFoundException -> L72
            r2.append(r5)     // Catch: android.content.ActivityNotFoundException -> L72
            java.lang.String r5 = r2.toString()     // Catch: android.content.ActivityNotFoundException -> L72
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: android.content.ActivityNotFoundException -> L72
            r0.<init>(r1, r5)     // Catch: android.content.ActivityNotFoundException -> L72
            r4.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L72
            goto L76
        L72:
            r5 = move-exception
            r4.logNonFatalException(r5)
        L76:
            return
    }

    private java.io.File moveFileToProperDirectory(int r6, java.lang.String r7) {
            r5 = this;
            r0 = 1
            r1 = 2
            if (r6 == r1) goto L55
            r1 = 4
            if (r6 != r1) goto L8
            goto L55
        L8:
            r1 = 3
            if (r6 != r1) goto L21
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r5.getExternalPath()
            r6.append(r1)
            java.lang.String r1 = "movieclips/"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto L6a
        L21:
            if (r6 != r0) goto L39
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r5.getExternalPath()
            r6.append(r1)
            java.lang.String r1 = "projects/"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto L6a
        L39:
            r1 = 5
            if (r6 != r1) goto L52
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r5.getExternalPath()
            r6.append(r1)
            java.lang.String r1 = "sounds/"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto L6a
        L52:
            java.lang.String r6 = ""
            goto L6a
        L55:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r5.getExternalPath()
            r6.append(r1)
            java.lang.String r1 = "stickfigures/"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
        L6a:
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L78
            r1.mkdirs()
        L78:
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r7 = r1.absolute(r7)
            java.lang.String r1 = r7.nameWithoutExtension()
            java.lang.String r2 = r7.extension()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = "."
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
        L9a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r4 = r4.absolute(r3)
            boolean r4 = r4.exists()
            if (r4 == 0) goto Ld5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = " ("
            r3.append(r4)
            int r4 = r0 + 1
            r3.append(r0)
            java.lang.String r0 = ")."
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0 = r4
            goto L9a
        Ld5:
            com.badlogic.gdx.Files r6 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r6 = r6.absolute(r3)
            r7.moveTo(r6)
            java.io.File r6 = r6.file()
            return r6
    }

    private void pushImportToApp() {
            r2 = this;
            r0 = -1
            r1 = 0
            r2.pushImportToApp(r0, r1)
            return
    }

    private void pushImportToApp(int r3, java.io.File r4) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.androidcore.AndroidCore$4 r1 = new org.fortheloss.androidcore.AndroidCore$4
            r1.<init>(r2, r3, r4)
            r0.<init>(r1)
            r0.start()
            return
    }

    private android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap r8, float r9) {
            r7 = this;
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postRotate(r9)
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            r1 = 0
            r2 = 0
            r6 = 1
            r0 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    private void startNotificationService() {
            r6 = this;
            boolean r0 = r6._isPro
            if (r0 == 0) goto L7
            java.lang.String r1 = "SN Pro Service"
            goto L9
        L7:
            java.lang.String r1 = "SN Service"
        L9:
            if (r0 == 0) goto Le
            java.lang.String r0 = "Stick Nodes Pro"
            goto L10
        Le:
            java.lang.String r0 = "Stick Nodes"
        L10:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<org.fortheloss.androidcore.SNForegroundService> r3 = org.fortheloss.androidcore.SNForegroundService.class
            r2.<init>(r6, r3)
            java.lang.String r3 = "INTENT_CHANNEL_ID"
            java.lang.String r4 = "sn_foreground_channel"
            r2.putExtra(r3, r4)
            java.lang.String r3 = "INTENT_CHANNEL_NAME"
            r2.putExtra(r3, r1)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "serviceTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r5, r3)
            java.lang.String r5 = "INTENT_TITLE"
            r2.putExtra(r5, r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.String r0 = "serviceText"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r1)
            java.lang.String r1 = "INTENT_TEXT"
            r2.putExtra(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L4d
            r6.startForegroundService(r2)
            goto L50
        L4d:
            r6.startService(r2)
        L50:
            return
    }

    private java.lang.String stripExtension(java.lang.String r3) {
            r2 = this;
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto Le
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            goto L10
        Le:
            java.lang.String r3 = ""
        L10:
            return r3
    }

    private java.lang.String substring(java.lang.String r2, int r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            int r0 = r2.length()
            if (r0 <= r3) goto Lf
            r0 = 0
            int r3 = r3 + (-1)
            java.lang.String r2 = r2.substring(r0, r3)
        Lf:
            return r2
    }

    @Override // org.fortheloss.framework.IPlatform
    public void analyticsSendEvent(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 40
            java.lang.String r4 = r3.substring(r4, r0)
            r1 = 46
            r2 = 95
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r5 = r3.substring(r5, r0)
            java.lang.String r5 = r5.replace(r1, r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "item_name"
            r0.putString(r1, r5)
            com.google.firebase.analytics.FirebaseAnalytics r5 = r3._firebaseAnalytics
            if (r5 == 0) goto L27
            r5.logEvent(r4, r0)
        L27:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void analyticsSendSingle(java.lang.String r3) {
            r2 = this;
            r0 = 40
            java.lang.String r3 = r2.substring(r3, r0)
            r0 = 46
            r1 = 95
            java.lang.String r3 = r3.replace(r0, r1)
            com.google.firebase.analytics.FirebaseAnalytics r0 = r2._firebaseAnalytics
            if (r0 == 0) goto L1c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.firebase.analytics.FirebaseAnalytics r1 = r2._firebaseAnalytics
            r1.logEvent(r3, r0)
        L1c:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void analyticsSendValue(java.lang.String r4, java.lang.String r5, java.lang.Double r6) {
            r3 = this;
            r0 = 40
            java.lang.String r4 = r3.substring(r4, r0)
            r1 = 46
            r2 = 95
            java.lang.String r4 = r4.replace(r1, r2)
            java.lang.String r5 = r3.substring(r5, r0)
            java.lang.String r5 = r5.replace(r1, r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "item_name"
            r0.putString(r1, r5)
            double r5 = r6.doubleValue()
            java.lang.String r1 = "value"
            r0.putDouble(r1, r5)
            com.google.firebase.analytics.FirebaseAnalytics r5 = r3._firebaseAnalytics
            if (r5 == 0) goto L30
            r5.logEvent(r4, r0)
        L30:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void analyticsSetUserID(java.lang.String r2) {
            r1 = this;
            com.google.firebase.analytics.FirebaseAnalytics r0 = r1._firebaseAnalytics
            if (r0 == 0) goto L7
            r0.setUserId(r2)
        L7:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = r1._firebaseCrashlytics
            if (r0 == 0) goto Le
            r0.setUserId(r2)
        Le:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void androidEnableNotification(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r2 < r0) goto L19
            java.lang.String r2 = "android.permission.POST_NOTIFICATIONS"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r2)
            if (r0 == 0) goto L19
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r0 = 101(0x65, float:1.42E-43)
            androidx.core.app.ActivityCompat.requestPermissions(r1, r2, r0)
        L19:
            r1.startNotificationService()
        L1c:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean androidHasStoragePermission() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L8
            return r1
        L8:
            r2 = 23
            if (r0 < r2) goto L16
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r3, r0)
            if (r0 != 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    @Override // org.fortheloss.framework.IPlatform
    public void androidRequestStoragePermission(org.fortheloss.framework.IAndroidStorageRequester r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L7
            return
        L7:
            r1 = 23
            if (r0 < r1) goto L1e
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r2, r0)
            if (r1 == 0) goto L1e
            r2._androidStorageRequesterRef = r3
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r0 = 102(0x66, float:1.43E-43)
            androidx.core.app.ActivityCompat.requestPermissions(r2, r3, r0)
        L1e:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void displayInterstitialAd(org.fortheloss.framework.IAdListener r2) {
            r1 = this;
            org.fortheloss.androidcore.AdmobInterstitialHandler r0 = r1._admobInterstitialHandler
            if (r0 == 0) goto L8
            r0.showAd(r2)
            goto Lb
        L8:
            r2.onAdClosed()
        Lb:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public int emailStickfigureSubmission(java.lang.String[] r25, java.lang.String[] r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r27
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            int r8 = r0.length
            r9 = 3
            if (r8 > 0) goto L15
            return r9
        L15:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "pack_"
            r8.append(r10)
            int r10 = r0.length
            r8.append(r10)
            java.lang.String r10 = "files_"
            r8.append(r10)
            java.util.Locale r10 = java.util.Locale.US
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            double r13 = java.lang.Math.random()
            r15 = 4726483295817170944(0x4197d783fc000000, double:9.9999999E7)
            double r13 = r13 * r15
            int r13 = (int) r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 0
            r12[r14] = r13
            java.lang.String r13 = "%08d"
            java.lang.String r10 = java.lang.String.format(r10, r13, r12)
            r8.append(r10)
            java.lang.String r10 = ".zip"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            int r10 = r0.length
            if (r10 <= r11) goto L92
            r10 = r26
            java.io.File r0 = org.fortheloss.sticknodes.App.zipFiles(r8, r0, r10)     // Catch: java.lang.Exception -> L89
            java.lang.String r8 = r28.trim()
            int r10 = r8.length()
            r12 = 5
            if (r10 < r12) goto L77
            int r10 = r8.length()
            int r10 = r10 - r12
            java.lang.String r10 = r8.substring(r10)
            java.lang.String r12 = " pack"
            boolean r10 = r10.equalsIgnoreCase(r12)
            if (r10 != 0) goto Lde
        L77:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r8 = " Pack"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            goto Lde
        L89:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            r1.logNonFatalException(r2)
            return r9
        L92:
            java.io.File r8 = new java.io.File
            r10 = r0[r14]
            r8.<init>(r10)
            r0 = r0[r14]
            java.lang.String r0 = r1.getFileExtension(r0)
            java.lang.String r10 = "nodemc"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto Ldb
            java.lang.String r0 = r28.trim()
            int r10 = r0.length()
            r12 = 10
            if (r10 < r12) goto Lc4
            int r10 = r0.length()
            int r10 = r10 - r12
            java.lang.String r10 = r0.substring(r10)
            java.lang.String r12 = " movieclip"
            boolean r10 = r10.equalsIgnoreCase(r12)
            if (r10 != 0) goto Ld5
        Lc4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " Movieclip"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
        Ld5:
            r23 = r8
            r8 = r0
            r0 = r23
            goto Lde
        Ldb:
            r0 = r8
            r8 = r28
        Lde:
            if (r0 != 0) goto Le1
            return r9
        Le1:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L105
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            android.content.Context r12 = r24.getApplicationContext()
            java.lang.String r12 = r12.getPackageName()
            r10.append(r12)
            java.lang.String r12 = ".provider"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r1, r10, r0)
            goto L109
        L105:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L109:
            r10 = 35
            java.lang.String r12 = ""
            if (r5 == 0) goto L12e
            int r13 = r31.length()
            if (r13 <= r11) goto L12e
            char r13 = r5.charAt(r14)
            if (r13 != r10) goto L11c
            goto L12f
        L11c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "#"
            r13.append(r15)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            goto L12f
        L12e:
            r5 = r12
        L12f:
            java.lang.String r13 = " "
            java.lang.String r15 = " #"
            if (r6 == 0) goto L168
            int r10 = r32.length()
            if (r10 <= r11) goto L168
            char r10 = r6.charAt(r14)
            r14 = 35
            if (r10 != r14) goto L156
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r13)
            r10.append(r6)
            java.lang.String r5 = r10.toString()
            goto L168
        L156:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r15)
            r10.append(r6)
            java.lang.String r5 = r10.toString()
        L168:
            if (r7 == 0) goto L19e
            int r6 = r33.length()
            if (r6 <= r11) goto L19e
            r6 = 0
            char r6 = r7.charAt(r6)
            r10 = 35
            if (r6 != r10) goto L18c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r13)
            r6.append(r7)
            java.lang.String r5 = r6.toString()
            goto L19e
        L18c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r15)
            r6.append(r7)
            java.lang.String r5 = r6.toString()
        L19e:
            boolean r6 = r1._isPro
            if (r6 == 0) goto L1a5
            java.lang.String r6 = "PRO"
            goto L1a7
        L1a5:
            java.lang.String r6 = "FREE"
        L1a7:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.SEND"
            r7.<init>(r10)
            boolean r10 = r24.isAmazonKindle()
            java.lang.String r13 = "4.2.5"
            java.lang.String r14 = ") Android app version "
            java.lang.String r15 = "(This submission was sent from the Stick Nodes ("
            java.lang.String r11 = "Stickfigure description: "
            r25 = r12
            java.lang.String r12 = "Category: "
            java.lang.String r1 = "Stickfigure name: "
            r26 = r0
            java.lang.String r0 = "Author name: "
            r28 = r9
            java.lang.String r9 = "android.intent.extra.TEXT"
            r31 = r9
            java.lang.String r9 = "Stickfigure Submission: "
            r32 = r13
            java.lang.String r13 = "android.intent.extra.SUBJECT"
            java.lang.String r17 = "submit@sticknodes.com"
            r33 = r14
            java.lang.String r14 = "android.intent.extra.EMAIL"
            r18 = r6
            r6 = 1
            if (r10 != r6) goto L2b2
            java.lang.String r6 = "\n"
            java.lang.String r10 = "text/html"
            r7.setType(r10)
            java.lang.String[] r10 = new java.lang.String[]{r17}
            r7.putExtra(r14, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r8)
            java.lang.String r9 = r10.toString()
            r7.putExtra(r13, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r2)
            r9.append(r6)
            r9.append(r1)
            r9.append(r8)
            r9.append(r6)
            r9.append(r12)
            r9.append(r3)
            r9.append(r6)
            r9.append(r11)
            r9.append(r6)
            r9.append(r6)
            r9.append(r4)
            r9.append(r6)
            r9.append(r6)
            int r0 = r5.length()
            if (r0 <= 0) goto L246
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r6)
            r0.append(r6)
            java.lang.String r12 = r0.toString()
            goto L248
        L246:
            r12 = r25
        L248:
            r9.append(r12)
            r9.append(r15)
            r6 = r18
            r9.append(r6)
            r10 = r33
            r9.append(r10)
            r0 = r32
            r9.append(r0)
            java.lang.String r0 = ". Build: "
            r9.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r9.append(r0)
            java.lang.String r0 = " SDK: "
            r9.append(r0)
            r0 = r28
            r9.append(r0)
            java.lang.String r0 = ")"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = "\\r\\n|\\r|\\n"
            java.lang.String r2 = "<br>"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "<html><body>"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "</body></html>"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r1 = r31
            r7.putExtra(r1, r0)
            r0 = 1
            r7.addFlags(r0)
            r1 = 2
            r7.addFlags(r1)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r1 = r26
            r7.putExtra(r0, r1)
            goto L377
        L2b2:
            r20 = r26
            r19 = r28
            r22 = r31
            r21 = r32
            r10 = r33
            r6 = r18
            java.lang.String r18 = "line.separator"
            java.lang.String r10 = java.lang.System.getProperty(r18)
            r18 = r6
            java.lang.String r6 = "text/message"
            r7.setType(r6)
            java.lang.String[] r6 = new java.lang.String[]{r17}
            r7.putExtra(r14, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.putExtra(r13, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r2)
            r6.append(r10)
            r6.append(r1)
            r6.append(r8)
            r6.append(r10)
            r6.append(r12)
            r6.append(r3)
            r6.append(r10)
            r6.append(r11)
            r6.append(r10)
            r6.append(r10)
            r6.append(r4)
            r6.append(r10)
            r6.append(r10)
            int r0 = r5.length()
            if (r0 <= 0) goto L32f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r10)
            r0.append(r10)
            java.lang.String r12 = r0.toString()
            goto L331
        L32f:
            r12 = r25
        L331:
            r6.append(r12)
            r6.append(r15)
            r0 = r18
            r6.append(r0)
            r0 = r33
            r6.append(r0)
            r0 = r21
            r6.append(r0)
            java.lang.String r0 = ". Build: "
            r6.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r6.append(r0)
            java.lang.String r0 = " SDK: "
            r6.append(r0)
            r0 = r19
            r6.append(r0)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r1 = r22
            r7.putExtra(r1, r0)
            r0 = 1
            r7.addFlags(r0)
            r1 = 2
            r7.addFlags(r1)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r1 = r20
            r7.putExtra(r0, r1)
        L377:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L39b
            r0.<init>()     // Catch: android.content.ActivityNotFoundException -> L39b
            java.lang.String r1 = "emailSubmission"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: android.content.ActivityNotFoundException -> L39b
            r0.append(r1)     // Catch: android.content.ActivityNotFoundException -> L39b
            java.lang.String r1 = "..."
            r0.append(r1)     // Catch: android.content.ActivityNotFoundException -> L39b
            java.lang.String r0 = r0.toString()     // Catch: android.content.ActivityNotFoundException -> L39b
            android.content.Intent r0 = android.content.Intent.createChooser(r7, r0)     // Catch: android.content.ActivityNotFoundException -> L39b
            r1 = r24
            r1.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L399
            r0 = 1
            return r0
        L399:
            r0 = move-exception
            goto L39e
        L39b:
            r0 = move-exception
            r1 = r24
        L39e:
            r1.logNonFatalException(r0)
            r2 = 2
            return r2
    }

    @Override // org.fortheloss.framework.IPlatform
    public java.lang.String getExternalPath() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getExternalPath(r0)
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public java.lang.String getExternalPath(boolean r4) {
            r3 = this;
            if (r4 != 0) goto L9
            com.badlogic.gdx.Files r4 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = r4.getExternalStoragePath()
            return r4
        L9:
            java.lang.String r4 = r3._externalPath
            if (r4 == 0) goto Le
            return r4
        Le:
            java.lang.String r4 = java.io.File.separator
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            int r1 = r0.length()
            int r1 = r1 + (-1)
            java.lang.String r1 = r0.substring(r1)
            java.lang.String r2 = "\\"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4b
            int r1 = r0.length()
            int r1 = r1 + (-1)
            java.lang.String r1 = r0.substring(r1)
            java.lang.String r2 = "/"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
        L4b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "Stick Nodes"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3._externalPath = r4
            return r4
    }

    protected java.lang.String getFileExtension(java.lang.String r2) {
            r1 = this;
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            if (r0 <= 0) goto Lf
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            goto L11
        Lf:
            java.lang.String r2 = ""
        L11:
            return r2
    }

    protected java.lang.String getFileNameWithoutExtension(java.lang.String r3) {
            r2 = this;
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            if (r0 <= 0) goto Le
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            goto L10
        Le:
            java.lang.String r3 = ""
        L10:
            return r3
    }

    @Override // org.fortheloss.framework.IPlatform
    public long getFreeStorageSpace() {
            r2 = this;
            long r0 = org.fortheloss.androidcore.StorageInfo.getAvailableExternalMemorySize()
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public java.lang.String getOSVersion() {
            r1 = this;
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder getPlatformMP4Encoder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public org.fortheloss.framework.IPlatformMuxer getPlatformMuxer() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder getPlatformPNGEncoder() {
            r1 = this;
            org.fortheloss.androidcore.AndroidPNGEncoder r0 = new org.fortheloss.androidcore.AndroidPNGEncoder
            r0.<init>(r1)
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public int getStore() {
            r2 = this;
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = r2.getPackageName()
            java.lang.String r0 = r0.getInstallerPackageName(r1)
            if (r0 == 0) goto L18
            java.lang.String r1 = "com.amazon.venezia"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r0 = 2
            return r0
        L18:
            r0 = 1
            return r0
    }

    protected void initPlatform(boolean r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "device_arch"
            java.lang.String r1 = "android_emulator"
            java.lang.String r2 = "true"
            java.lang.String r3 = "false"
            java.lang.String r4 = "android_rooted"
            java.lang.String r5 = "unknown"
            java.lang.Class r6 = r7.getClass()
            org.fortheloss.androidcore.AndroidCore.mainActivityClass = r6
            r7._isPro = r8
            r7._admobID = r9
            com.google.firebase.analytics.FirebaseAnalytics r8 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r7)
            r7._firebaseAnalytics = r8
            com.google.firebase.crashlytics.FirebaseCrashlytics r8 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance()
            r7._firebaseCrashlytics = r8
            org.fortheloss.androidcore.AdmobInterstitialHandler r8 = new org.fortheloss.androidcore.AdmobInterstitialHandler
            r8.<init>(r7)
            r7._admobInterstitialHandler = r8
            boolean r8 = com.google.firebase.crashlytics.internal.common.CommonUtils.isRooted()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L31
            r8 = r2
            goto L32
        L31:
            r8 = r3
        L32:
            r7.setCrashlyticsKeyString(r4, r8)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r7.setCrashlyticsKeyString(r4, r5)
        L39:
            boolean r8 = com.google.firebase.crashlytics.internal.common.CommonUtils.isEmulator()     // Catch: java.lang.Throwable -> L45
            if (r8 == 0) goto L40
            goto L41
        L40:
            r2 = r3
        L41:
            r7.setCrashlyticsKeyString(r1, r2)     // Catch: java.lang.Throwable -> L45
            goto L48
        L45:
            r7.setCrashlyticsKeyString(r1, r5)
        L48:
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = "os.arch"
            java.lang.String r9 = java.lang.System.getProperty(r9)     // Catch: java.lang.Throwable -> L54
            r8.setCrashlyticsKeyString(r0, r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r7.setCrashlyticsKeyString(r0, r5)
        L57:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean iosCanUseMail() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isAmazonKindle() {
            r2 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Amazon"
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean isChromebook() {
            r2 = this;
            java.lang.String r0 = android.os.Build.DEVICE
            if (r0 == 0) goto Le
            java.lang.String r1 = ".+_cheets|cheets_.+"
            boolean r0 = r0.matches(r1)
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean isDeniedAccessToPhotos() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean isPro() {
            r1 = this;
            boolean r0 = r1._isPro
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public void loadInterstitialAd() {
            r2 = this;
            org.fortheloss.androidcore.AdmobInterstitialHandler r0 = r2._admobInterstitialHandler
            if (r0 == 0) goto L9
            java.lang.String r1 = r2._admobID
            r0.loadAd(r1)
        L9:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void logNonFatalException(java.lang.Throwable r2) {
            r1 = this;
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = r1._firebaseCrashlytics
            if (r0 == 0) goto L7
            r0.recordException(r2)
        L7:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void minigameDisplayLeaderboard() {
            r0 = this;
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void minigameSubmitToLeaderboard(float r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public int mp3ToPCM(java.io.File r1, java.lang.String r2, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidApplication, android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            org.fortheloss.framework.IImageRequester r0 = r1._imageRequester
            if (r0 == 0) goto L2b
            r0 = -1
            if (r3 != r0) goto L2b
            if (r4 == 0) goto L2b
            android.net.Uri r3 = r4.getData()
            if (r3 != 0) goto L13
            goto L2b
        L13:
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            org.fortheloss.androidcore.AndroidCore$2 r0 = new org.fortheloss.androidcore.AndroidCore$2
            r0.<init>(r1)
            r3.postRunnable(r0)
            java.lang.Thread r3 = new java.lang.Thread
            org.fortheloss.androidcore.AndroidCore$3 r0 = new org.fortheloss.androidcore.AndroidCore$3
            r0.<init>(r1, r4, r2)
            r3.<init>(r0)
            r3.start()
            goto L35
        L2b:
            com.badlogic.gdx.Application r2 = com.badlogic.gdx.Gdx.app
            org.fortheloss.androidcore.AndroidCore$1 r3 = new org.fortheloss.androidcore.AndroidCore$1
            r3.<init>(r1)
            r2.postRunnable(r3)
        L35:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void onAnimationScreenStart() {
            r0 = this;
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.checkIntent(r1)
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void onRateClick() {
            r0 = this;
            r0.goToStore()
            return
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r5, java.lang.String[] r6, int[] r7) {
            r4 = this;
            super.onRequestPermissionsResult(r5, r6, r7)
            r0 = 1
            r1 = 0
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L25
            int r5 = r6.length
            int r5 = r5 - r0
        Lb:
            if (r5 < 0) goto L1f
            r2 = r6[r5]
            java.lang.String r3 = "android.permission.POST_NOTIFICATIONS"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L1c
            r2 = r7[r5]
            if (r2 != 0) goto L1c
            r1 = 1
        L1c:
            int r5 = r5 + (-1)
            goto Lb
        L1f:
            if (r1 == 0) goto L3e
            r4.startNotificationService()
            goto L3e
        L25:
            r6 = 102(0x66, float:1.43E-43)
            if (r5 != r6) goto L3e
            org.fortheloss.framework.IAndroidStorageRequester r5 = r4._androidStorageRequesterRef
            if (r5 == 0) goto L3e
            int r6 = r7.length
            if (r6 <= 0) goto L38
            r6 = r7[r1]
            if (r6 != 0) goto L38
            r5.onStoragePermissionResult(r0)
            goto L3b
        L38:
            r5.onStoragePermissionResult(r1)
        L3b:
            r5 = 0
            r4._androidStorageRequesterRef = r5
        L3e:
            return
    }

    @Override // org.fortheloss.framework.IAndroidStorageRequester
    public void onStoragePermissionResult(boolean r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L8
            android.content.Intent r2 = r1._zipIntentToHandleAfterStoragePermissionRef
            r1.actuallyBeginIntent(r2)
        L8:
            r2 = 0
            r1._zipIntentToHandleAfterStoragePermissionRef = r2
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void onUnlockClick() {
            r1 = this;
            r0 = 1
            r1.goToStore(r0)
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void openURI(java.lang.String r2) {
            r1 = this;
            com.badlogic.gdx.Net r0 = com.badlogic.gdx.Gdx.f1net
            r0.openURI(r2)
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean requestImage(org.fortheloss.framework.IImageRequester r2, int r3) {
            r1 = this;
            r1._imageRequester = r2
            r1._requestedImageQuality = r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "image/*"
            r2.setType(r3)
            java.lang.String r3 = "android.intent.action.GET_CONTENT"
            r2.setAction(r3)
            java.lang.String r3 = "android.intent.extra.LOCAL_ONLY"
            r0 = 1
            r2.putExtra(r3, r0)
            java.lang.String r3 = "chooseImage"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)     // Catch: android.content.ActivityNotFoundException -> L27
            android.content.Intent r2 = android.content.Intent.createChooser(r2, r3)     // Catch: android.content.ActivityNotFoundException -> L27
            r1.startActivityForResult(r2, r0)     // Catch: android.content.ActivityNotFoundException -> L27
            return r0
        L27:
            r2 = move-exception
            r2.printStackTrace()
            r1.logNonFatalException(r2)
            org.fortheloss.framework.IImageRequester r2 = r1._imageRequester
            if (r2 == 0) goto L36
            r3 = 0
            r2.setRequestedImagePixmap(r3)
        L36:
            r2 = 0
            return r2
    }

    @Override // org.fortheloss.framework.IPlatform
    public void saveImageToGallery(java.lang.String r18, org.fortheloss.framework.ISaveMediaToGalleryDelegate r19) {
            r17 = this;
            r1 = r17
            r2 = r19
            java.lang.String r0 = org.fortheloss.androidcore.AndroidCore.SN_DIR_GIF
            java.lang.String r3 = r17.getFileExtension(r18)
            java.lang.String r4 = "png"
            boolean r3 = r3.equalsIgnoreCase(r4)
            r5 = 0
            if (r3 == 0) goto L19
            java.lang.String r0 = org.fortheloss.androidcore.AndroidCore.SN_DIR_PNG
            r3 = 2
            java.lang.String r6 = "image/png"
            goto L1c
        L19:
            java.lang.String r6 = "image/gif"
            r3 = 0
        L1c:
            java.io.File r7 = new java.io.File
            r8 = r18
            r7.<init>(r8)
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = r1.getFileNameWithoutExtension(r8)
            java.lang.String r10 = r1.getFileExtension(r8)
            boolean r4 = r10.equalsIgnoreCase(r4)
            java.lang.String r11 = "."
            java.lang.String r12 = "-"
            r13 = 1
            if (r4 != r13) goto L93
            r4 = 95
            int r4 = r8.lastIndexOf(r4)
            if (r4 <= 0) goto L73
            r14 = 46
            int r14 = r8.lastIndexOf(r14)
            if (r14 <= 0) goto L73
            java.lang.String r15 = r8.substring(r5, r4)
            java.lang.String r4 = r8.substring(r4, r14)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            r8.append(r12)
            long r14 = java.lang.System.currentTimeMillis()
            r8.append(r14)
            r8.append(r4)
            r8.append(r11)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r4 = 1
            goto L74
        L73:
            r4 = 0
        L74:
            if (r4 != 0) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r12)
            long r8 = java.lang.System.currentTimeMillis()
            r4.append(r8)
            r4.append(r11)
            r4.append(r10)
            java.lang.String r8 = r4.toString()
            goto Laf
        L93:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r12)
            long r8 = java.lang.System.currentTimeMillis()
            r4.append(r8)
            r4.append(r11)
            r4.append(r10)
            java.lang.String r8 = r4.toString()
        Laf:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r12 = "date_added"
            java.lang.String r14 = "mime_type"
            java.lang.String r15 = "_display_name"
            java.lang.String r5 = "title"
            r13 = 29
            if (r9 < r13) goto Lef
            java.lang.String r13 = "relative_path"
            r4.put(r13, r0)
            r4.put(r5, r8)
            r4.put(r15, r8)
            r4.put(r14, r6)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 / r10
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.put(r12, r0)
            java.lang.String r0 = "external_primary"
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.getContentUri(r0)
            android.content.ContentResolver r5 = r17.getContentResolver()
            android.net.Uri r0 = r5.insert(r0, r4)
            r5 = r0
            r10 = 0
            goto L143
        Lef:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.io.File r16 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r10 = r16.getAbsolutePath()
            r13.append(r10)
            java.lang.String r10 = java.io.File.separator
            r13.append(r10)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            java.io.File r10 = new java.io.File
            r10.<init>(r0)
            r10.mkdirs()
            java.io.File r10 = new java.io.File
            r10.<init>(r0, r8)
            r4.put(r5, r8)
            r4.put(r15, r8)
            r4.put(r14, r6)
            long r5 = java.lang.System.currentTimeMillis()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r13
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.put(r12, r0)
            java.lang.String r0 = r10.getAbsolutePath()
            java.lang.String r5 = "_data"
            r4.put(r5, r0)
            android.content.ContentResolver r0 = r17.getContentResolver()
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r0 = r0.insert(r5, r4)
            r5 = r0
        L143:
            java.lang.String r6 = "is_pending"
            r8 = 29
            if (r9 < r8) goto L15e
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "datetaken"
            r4.put(r8, r0)
            r8 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.put(r6, r0)
        L15e:
            android.content.ContentResolver r0 = r17.getContentResolver()     // Catch: java.lang.Exception -> L18f
            java.lang.String r8 = "w"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r5, r8)     // Catch: java.lang.Exception -> L18f
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L18f
            java.io.FileDescriptor r9 = r0.getFileDescriptor()     // Catch: java.lang.Exception -> L18f
            r8.<init>(r9)     // Catch: java.lang.Exception -> L18f
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L18f
            r9.<init>(r7)     // Catch: java.lang.Exception -> L18f
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Exception -> L18f
        L17a:
            int r12 = r9.read(r11)     // Catch: java.lang.Exception -> L18f
            if (r12 <= 0) goto L185
            r13 = 0
            r8.write(r11, r13, r12)     // Catch: java.lang.Exception -> L18f
            goto L17a
        L185:
            r8.close()     // Catch: java.lang.Exception -> L18f
            r9.close()     // Catch: java.lang.Exception -> L18f
            r0.close()     // Catch: java.lang.Exception -> L18f
            goto L193
        L18f:
            r0 = move-exception
            r0.printStackTrace()
        L193:
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r0 < r8) goto L1ac
            r4.clear()
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.put(r6, r8)
            android.content.ContentResolver r6 = r17.getContentResolver()
            r8 = 0
            r6.update(r5, r4, r8, r8)
        L1ac:
            r7.delete()
            if (r2 == 0) goto L1b4
            r2.success(r3)
        L1b4:
            r2 = 29
            if (r0 >= r2) goto L1cf
            if (r10 == 0) goto L1cf
            boolean r0 = r10.exists()
            r2 = 1
            if (r0 != r2) goto L1cf
            android.content.Intent r0 = new android.content.Intent
            android.net.Uri r2 = android.net.Uri.fromFile(r10)
            java.lang.String r3 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r0.<init>(r3, r2)
            r1.sendBroadcast(r0)
        L1cf:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void saveVideoToGallery(java.lang.String r1, org.fortheloss.framework.ISaveMediaToGalleryDelegate r2) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public boolean sendFiles(java.lang.String[] r14) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L18d
            int r1 = r14.length
            if (r1 > 0) goto L8
            goto L18d
        L8:
            java.lang.String r1 = "line.separator"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            boolean r2 = r13._isPro
            if (r2 == 0) goto L15
            java.lang.String r2 = "PRO"
            goto L17
        L15:
            java.lang.String r2 = "FREE"
        L17:
            int r3 = r14.length
            r4 = 5
            r5 = 1
            if (r3 == r5) goto L22
            int r3 = r14.length
            if (r3 <= r4) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            if (r3 == 0) goto L2d
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.SEND"
            r3.<init>(r6)
            goto L34
        L2d:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.SEND_MULTIPLE"
            r3.<init>(r6)
        L34:
            java.lang.String r6 = "text/message"
            r3.setType(r6)
            java.lang.String r6 = "android.intent.extra.SUBJECT"
            java.lang.String r7 = "Stick Nodes Files"
            r3.putExtra(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Here are some file(s)!"
            r6.append(r7)
            r6.append(r1)
            r6.append(r1)
            java.lang.String r1 = "(This email was sent from the Stick Nodes ("
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = ") Android app version "
            r6.append(r1)
            java.lang.String r1 = "4.2.5"
            r6.append(r1)
            java.lang.String r1 = ".)"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "android.intent.extra.TEXT"
            r3.putExtra(r2, r1)
            r3.addFlags(r5)
            r1 = 2
            r3.addFlags(r1)
            int r1 = r14.length
            java.lang.String r2 = "android.intent.extra.STREAM"
            java.lang.String r6 = ".provider"
            r7 = 23
            if (r1 <= r4) goto Lf4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "sending_"
            r1.append(r4)
            int r4 = r14.length
            r1.append(r4)
            java.lang.String r4 = "_files_"
            r1.append(r4)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r5]
            double r9 = java.lang.Math.random()
            r11 = 4726483295817170944(0x4197d783fc000000, double:9.9999999E7)
            double r9 = r9 * r11
            int r9 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r0] = r9
            java.lang.String r9 = "%08d"
            java.lang.String r4 = java.lang.String.format(r4, r9, r8)
            r1.append(r4)
            java.lang.String r4 = ".zip"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = 0
            java.io.File r14 = org.fortheloss.sticknodes.App.zipFiles(r1, r14, r4)     // Catch: java.io.IOException -> Lec
            if (r14 != 0) goto Lc3
            return r0
        Lc3:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r7) goto Le3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r4 = r13.getApplicationContext()
            java.lang.String r4 = r4.getPackageName()
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.net.Uri r14 = androidx.core.content.FileProvider.getUriForFile(r13, r1, r14)
            goto Le7
        Le3:
            android.net.Uri r14 = android.net.Uri.fromFile(r14)
        Le7:
            r3.putExtra(r2, r14)
            goto L16a
        Lec:
            r14 = move-exception
            r14.printStackTrace()
            r13.logNonFatalException(r14)
            return r0
        Lf4:
            int r1 = r14.length
            if (r1 != r5) goto L126
            java.io.File r1 = new java.io.File
            r14 = r14[r0]
            r1.<init>(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r7) goto L11e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            android.content.Context r4 = r13.getApplicationContext()
            java.lang.String r4 = r4.getPackageName()
            r14.append(r4)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            android.net.Uri r14 = androidx.core.content.FileProvider.getUriForFile(r13, r14, r1)
            goto L122
        L11e:
            android.net.Uri r14 = android.net.Uri.fromFile(r1)
        L122:
            r3.putExtra(r2, r14)
            goto L16a
        L126:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r14.length
            r8 = 0
        L12d:
            if (r8 >= r4) goto L167
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r7) goto L156
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r10 = r13.getApplicationContext()
            java.lang.String r10 = r10.getPackageName()
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.io.File r10 = new java.io.File
            r11 = r14[r8]
            r10.<init>(r11)
            android.net.Uri r9 = androidx.core.content.FileProvider.getUriForFile(r13, r9, r10)
            goto L161
        L156:
            java.io.File r9 = new java.io.File
            r10 = r14[r8]
            r9.<init>(r10)
            android.net.Uri r9 = android.net.Uri.fromFile(r9)
        L161:
            r1.add(r9)
            int r8 = r8 + 1
            goto L12d
        L167:
            r3.putParcelableArrayListExtra(r2, r1)
        L16a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L189
            r14.<init>()     // Catch: android.content.ActivityNotFoundException -> L189
            java.lang.String r1 = "emailFiles"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)     // Catch: android.content.ActivityNotFoundException -> L189
            r14.append(r1)     // Catch: android.content.ActivityNotFoundException -> L189
            java.lang.String r1 = "..."
            r14.append(r1)     // Catch: android.content.ActivityNotFoundException -> L189
            java.lang.String r14 = r14.toString()     // Catch: android.content.ActivityNotFoundException -> L189
            android.content.Intent r14 = android.content.Intent.createChooser(r3, r14)     // Catch: android.content.ActivityNotFoundException -> L189
            r13.startActivity(r14)     // Catch: android.content.ActivityNotFoundException -> L189
            return r5
        L189:
            r14 = move-exception
            r13.logNonFatalException(r14)
        L18d:
            return r0
    }

    @Override // org.fortheloss.framework.IPlatform
    public void setCrashlyticsKeyString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = r1._firebaseCrashlytics
            if (r0 == 0) goto L7
            r0.setCustomKey(r2, r3)
        L7:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void setupKeyboard() {
            r0 = this;
            return
    }

    protected void setupLibGDXApp() {
            r2 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
            r0.<init>()
            r1 = 0
            r0.useAccelerometer = r1
            r0.useCompass = r1
            r1 = 1
            r0.useImmersiveMode = r1
            r0.useWakelock = r1
            org.fortheloss.sticknodes.App r1 = new org.fortheloss.sticknodes.App
            r1.<init>(r2)
            r2.initialize(r1, r0)
            android.content.Intent r0 = r2.getIntent()
            r2.checkIntent(r0)
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void shareGif(java.lang.String r5) {
            r4 = this;
            boolean r0 = r4._isPro
            if (r0 == 0) goto L7
            java.lang.String r0 = "Stick Nodes Pro"
            goto L9
        L7:
            java.lang.String r0 = "Stick Nodes"
        L9:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r5 < r2) goto L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r2 = r4.getApplicationContext()
            java.lang.String r2 = r2.getPackageName()
            r5.append(r2)
            java.lang.String r2 = ".provider"
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = androidx.core.content.FileProvider.getUriForFile(r4, r5, r1)
            goto L36
        L32:
            android.net.Uri r5 = android.net.Uri.fromFile(r1)
        L36:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.SEND"
            r2.<init>(r3)
            java.lang.String r3 = "image/gif"
            r2.setType(r3)
            r3 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " GIF"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "android.intent.extra.SUBJECT"
            r2.putExtra(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "My #StickNodes #animation, \""
            r0.append(r3)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "\", made on Android!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putExtra(r0, r5)
            java.lang.String r5 = "Choose a sharing option"
            android.content.Intent r5 = android.content.Intent.createChooser(r2, r5)     // Catch: android.content.ActivityNotFoundException -> L8b
            r4.startActivity(r5)     // Catch: android.content.ActivityNotFoundException -> L8b
            goto L8f
        L8b:
            r5 = move-exception
            r4.logNonFatalException(r5)
        L8f:
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public void shareMP4(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // org.fortheloss.framework.IPlatform
    public int wavToAAC(java.io.File r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // org.fortheloss.framework.IPlatform
    public void writeAndroidLogcat(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "logcat -d"
            java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Exception -> L13
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Exception -> L13
            r1 = 0
            r3.write(r0, r1)     // Catch: java.lang.Exception -> L13
            goto L1e
        L13:
            r3 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Failed to get logcat"
            r0.println(r1)
            r3.printStackTrace()
        L1e:
            return
    }
}

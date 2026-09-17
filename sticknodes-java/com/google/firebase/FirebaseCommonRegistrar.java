package com.google.firebase;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static /* synthetic */ java.lang.String $r8$lambda$4z_FoKjSmKejlSwMYYMZeC7LsMo(android.content.Context r0) {
            java.lang.String r0 = lambda$getComponents$3(r0)
            return r0
    }

    /* renamed from: $r8$lambda$5K-XEd3fUx19CnAZSAZ0M1s9qGg, reason: not valid java name */
    public static /* synthetic */ java.lang.String m37$r8$lambda$5KXEd3fUx19CnAZSAZ0M1s9qGg(android.content.Context r0) {
            java.lang.String r0 = lambda$getComponents$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$lmqwsm474glUdjxQuX0286DJQr0(android.content.Context r0) {
            java.lang.String r0 = lambda$getComponents$1(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$sUt18gVyvEV5RL6q8HJBhUltbQU(android.content.Context r0) {
            java.lang.String r0 = lambda$getComponents$2(r0)
            return r0
    }

    public FirebaseCommonRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ java.lang.String lambda$getComponents$0(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            if (r0 == 0) goto Ld
            int r0 = r0.targetSdkVersion
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Ld:
            java.lang.String r0 = ""
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$getComponents$1(android.content.Context r2) {
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            if (r2 == 0) goto L13
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L13
            int r2 = r2.minSdkVersion
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L13:
            java.lang.String r2 = ""
            return r2
    }

    private static /* synthetic */ java.lang.String lambda$getComponents$2(android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            java.lang.String r2 = "android.hardware.type.television"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L11
            java.lang.String r3 = "tv"
            return r3
        L11:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            java.lang.String r2 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L20
            java.lang.String r3 = "watch"
            return r3
        L20:
            r1 = 23
            if (r0 < r1) goto L33
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            java.lang.String r2 = "android.hardware.type.automotive"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 == 0) goto L33
            java.lang.String r3 = "auto"
            return r3
        L33:
            r1 = 26
            if (r0 < r1) goto L46
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r3 = r3.hasSystemFeature(r0)
            if (r3 == 0) goto L46
            java.lang.String r3 = "embedded"
            return r3
        L46:
            java.lang.String r3 = ""
            return r3
    }

    private static /* synthetic */ java.lang.String lambda$getComponents$3(android.content.Context r1) {
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r1 = r0.getInstallerPackageName(r1)
            if (r1 == 0) goto L13
            java.lang.String r1 = safeValue(r1)
            goto L15
        L13:
            java.lang.String r1 = ""
        L15:
            return r1
    }

    private static java.lang.String safeValue(java.lang.String r2) {
            r0 = 32
            r1 = 95
            java.lang.String r2 = r2.replace(r0, r1)
            r0 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.DefaultUserAgentPublisher.component()
            r0.add(r1)
            com.google.firebase.components.Component r1 = com.google.firebase.heartbeatinfo.DefaultHeartBeatController.component()
            r0.add(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "fire-android"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r0.add(r1)
            java.lang.String r1 = "fire-core"
            java.lang.String r2 = "21.0.0"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r1, r2)
            r0.add(r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r1 = safeValue(r1)
            java.lang.String r2 = "device-name"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r0.add(r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r1 = safeValue(r1)
            java.lang.String r2 = "device-model"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r0.add(r1)
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r1 = safeValue(r1)
            java.lang.String r2 = "device-brand"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r0.add(r1)
            com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda1 r1 = com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda1.INSTANCE
            java.lang.String r2 = "android-target-sdk"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(r2, r1)
            r0.add(r1)
            com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda2 r1 = com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda2.INSTANCE
            java.lang.String r2 = "android-min-sdk"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(r2, r1)
            r0.add(r1)
            com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda3 r1 = com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda3.INSTANCE
            java.lang.String r2 = "android-platform"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(r2, r1)
            r0.add(r1)
            com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda0 r1 = com.google.firebase.FirebaseCommonRegistrar$$ExternalSyntheticLambda0.INSTANCE
            java.lang.String r2 = "android-installer"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.fromContext(r2, r1)
            r0.add(r1)
            java.lang.String r1 = com.google.firebase.platforminfo.KotlinDetector.detectVersion()
            if (r1 == 0) goto L95
            java.lang.String r2 = "kotlin"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r0.add(r1)
        L95:
            return r0
    }
}

package com.google.firebase.crashlytics.internal;

/* loaded from: classes2.dex */
public class DevelopmentPlatformProvider {
    private final android.content.Context context;
    private com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform developmentPlatform;

    /* renamed from: com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private class DevelopmentPlatform {
        private final java.lang.String developmentPlatform;
        private final java.lang.String developmentPlatformVersion;
        final /* synthetic */ com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider this$0;

        private DevelopmentPlatform(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r4) {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                android.content.Context r0 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.access$300(r4)
                java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
                java.lang.String r2 = "string"
                int r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.getResourcesIdentifier(r0, r1, r2)
                if (r0 == 0) goto L3e
                java.lang.String r1 = "Unity"
                r3.developmentPlatform = r1
                android.content.Context r4 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.access$300(r4)
                android.content.res.Resources r4 = r4.getResources()
                java.lang.String r4 = r4.getString(r0)
                r3.developmentPlatformVersion = r4
                com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unity Editor version is: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.v(r4)
                return
            L3e:
                java.lang.String r0 = "flutter_assets/NOTICES.Z"
                boolean r4 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.access$400(r4, r0)
                r0 = 0
                if (r4 == 0) goto L57
                java.lang.String r4 = "Flutter"
                r3.developmentPlatform = r4
                r3.developmentPlatformVersion = r0
                com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()
                java.lang.String r0 = "Development platform is: Flutter"
                r4.v(r0)
                return
            L57:
                r3.developmentPlatform = r0
                r3.developmentPlatformVersion = r0
                return
        }

        /* synthetic */ DevelopmentPlatform(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r1, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ java.lang.String access$000(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform r0) {
                java.lang.String r0 = r0.developmentPlatform
                return r0
        }

        static /* synthetic */ java.lang.String access$100(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform r0) {
                java.lang.String r0 = r0.developmentPlatformVersion
                return r0
        }
    }

    public DevelopmentPlatformProvider(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r1 = 0
            r0.developmentPlatform = r1
            return
    }

    static /* synthetic */ android.content.Context access$300(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r0) {
            android.content.Context r0 = r0.context
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider r0, java.lang.String r1) {
            boolean r0 = r0.assetFileExists(r1)
            return r0
    }

    private boolean assetFileExists(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.res.AssetManager r0 = r0.getAssets()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.content.Context r0 = r2.context     // Catch: java.io.IOException -> L1b
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L1b
            java.io.InputStream r3 = r0.open(r3)     // Catch: java.io.IOException -> L1b
            r0 = 1
            if (r3 == 0) goto L1a
            r3.close()     // Catch: java.io.IOException -> L1b
        L1a:
            return r0
        L1b:
            return r1
    }

    private com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform initDevelopmentPlatform() {
            r2 = this;
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform r0 = r2.developmentPlatform
            if (r0 != 0) goto Lc
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform r0 = new com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform
            r1 = 0
            r0.<init>(r2, r1)
            r2.developmentPlatform = r0
        Lc:
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform r0 = r2.developmentPlatform
            return r0
    }

    public java.lang.String getDevelopmentPlatform() {
            r1 = this;
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform r0 = r1.initDevelopmentPlatform()
            java.lang.String r0 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform.access$000(r0)
            return r0
    }

    public java.lang.String getDevelopmentPlatformVersion() {
            r1 = this;
            com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform r0 = r1.initDevelopmentPlatform()
            java.lang.String r0 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.DevelopmentPlatform.access$100(r0)
            return r0
    }
}

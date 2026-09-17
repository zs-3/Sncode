package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes2.dex */
enum SettingsCacheBehavior extends java.lang.Enum<com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior> {
    private static final /* synthetic */ com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] $VALUES = null;
    public static final com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior IGNORE_CACHE_EXPIRATION = null;
    public static final com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior SKIP_CACHE_LOOKUP = null;
    public static final com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior USE_CACHE = null;

    private static /* synthetic */ com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] $values() {
            r0 = 3
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] r0 = new com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[r0]
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.USE_CACHE
            r2 = 0
            r0[r2] = r1
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP
            r2 = 1
            r0[r2] = r1
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r0 = new com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior
            java.lang.String r1 = "USE_CACHE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.USE_CACHE = r0
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r0 = new com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior
            java.lang.String r1 = "SKIP_CACHE_LOOKUP"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP = r0
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r0 = new com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior
            java.lang.String r1 = "IGNORE_CACHE_EXPIRATION"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION = r0
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] r0 = $values()
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.$VALUES = r0
            return
    }

    SettingsCacheBehavior(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior valueOf(java.lang.String r1) {
            java.lang.Class<com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior> r0 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = (com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior) r1
            return r1
    }

    public static com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] values() {
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] r0 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[] r0 = (com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior[]) r0
            return r0
    }
}

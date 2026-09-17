package com.google.android.gms.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public class AppSetIdInfo {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final java.lang.String zza;
    private final int zzb;

    /* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public AppSetIdInfo(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public int getScope() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbcd {
    private final android.content.Context zza;

    public zzbcd(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Context can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    public final boolean zza(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = "Intent can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r3 = r0.queryIntentActivities(r3, r1)
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L18
            r3 = 1
            return r3
        L18:
            return r1
    }

    public final boolean zzb() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.INSERT"
            r0.<init>(r1)
            java.lang.String r1 = "vnd.android.cursor.dir/event"
            android.content.Intent r0 = r0.setType(r1)
            boolean r0 = r2.zza(r0)
            return r0
    }

    public final boolean zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcc r0 = new com.google.android.gms.internal.ads.zzbcc
            r0.<init>()
            android.content.Context r1 = r2.zza
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.zzcd.zza(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L23
            android.content.Context r0 = r2.zza
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L23
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzari implements com.google.android.gms.internal.ads.zzaqx {
    final /* synthetic */ android.content.Context zza;
    private java.io.File zzb;

    zzari(android.content.Context r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r1 = 0
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    public final java.io.File zza() {
            r3 = this;
            java.io.File r0 = r3.zzb
            if (r0 != 0) goto L13
            android.content.Context r0 = r3.zza
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r2 = "volley"
            r1.<init>(r0, r2)
            r3.zzb = r1
        L13:
            java.io.File r0 = r3.zzb
            return r0
    }
}

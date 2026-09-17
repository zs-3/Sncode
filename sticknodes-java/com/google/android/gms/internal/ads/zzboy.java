package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzboy implements com.google.android.gms.internal.ads.zzbkl {
    private final com.google.android.gms.internal.ads.zzcas zza;

    public zzboy(com.google.android.gms.internal.ads.zzboz r1, com.google.android.gms.internal.ads.zzcas r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zza(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            com.google.android.gms.internal.ads.zzcas r3 = r2.zza     // Catch: java.lang.IllegalStateException -> L17
            com.google.android.gms.internal.ads.zzboc r0 = new com.google.android.gms.internal.ads.zzboc     // Catch: java.lang.IllegalStateException -> L17
            r0.<init>()     // Catch: java.lang.IllegalStateException -> L17
            r3.zzd(r0)     // Catch: java.lang.IllegalStateException -> L17
            return
        Ld:
            com.google.android.gms.internal.ads.zzcas r0 = r2.zza     // Catch: java.lang.IllegalStateException -> L17
            com.google.android.gms.internal.ads.zzboc r1 = new com.google.android.gms.internal.ads.zzboc     // Catch: java.lang.IllegalStateException -> L17
            r1.<init>(r3)     // Catch: java.lang.IllegalStateException -> L17
            r0.zzd(r1)     // Catch: java.lang.IllegalStateException -> L17
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(org.json.JSONObject r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza     // Catch: org.json.JSONException -> L6 java.lang.IllegalStateException -> Lc
            r0.zzc(r2)     // Catch: org.json.JSONException -> L6 java.lang.IllegalStateException -> Lc
            return
        L6:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzcas r0 = r1.zza
            r0.zzd(r2)
        Lc:
            return
    }
}

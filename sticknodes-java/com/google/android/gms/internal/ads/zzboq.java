package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzboq implements com.google.android.gms.internal.ads.zzbkl {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbor zza;
    private final com.google.android.gms.internal.ads.zzbnt zzb;
    private final com.google.android.gms.internal.ads.zzcas zzc;

    public zzboq(com.google.android.gms.internal.ads.zzbor r1, com.google.android.gms.internal.ads.zzbnt r2, com.google.android.gms.internal.ads.zzcas r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zza(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            com.google.android.gms.internal.ads.zzcas r3 = r2.zzc     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            com.google.android.gms.internal.ads.zzboc r0 = new com.google.android.gms.internal.ads.zzboc     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            r3.zzd(r0)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            goto L1f
        Ld:
            com.google.android.gms.internal.ads.zzcas r0 = r2.zzc     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            com.google.android.gms.internal.ads.zzboc r1 = new com.google.android.gms.internal.ads.zzboc     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1f
            goto L1f
        L18:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzbnt r0 = r2.zzb
            r0.zzb()
            throw r3
        L1f:
            com.google.android.gms.internal.ads.zzbnt r3 = r2.zzb
            r3.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(org.json.JSONObject r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcas r0 = r2.zzc     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12 java.lang.IllegalStateException -> L1f
            com.google.android.gms.internal.ads.zzbor r1 = r2.zza     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12 java.lang.IllegalStateException -> L1f
            com.google.android.gms.internal.ads.zzbof r1 = com.google.android.gms.internal.ads.zzbor.zzc(r1)     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12 java.lang.IllegalStateException -> L1f
            java.lang.Object r3 = r1.zza(r3)     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12 java.lang.IllegalStateException -> L1f
            r0.zzc(r3)     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12 java.lang.IllegalStateException -> L1f
            goto L1f
        L10:
            r3 = move-exception
            goto L19
        L12:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcas r0 = r2.zzc     // Catch: java.lang.Throwable -> L10
            r0.zzd(r3)     // Catch: java.lang.Throwable -> L10
            goto L1f
        L19:
            com.google.android.gms.internal.ads.zzbnt r0 = r2.zzb
            r0.zzb()
            throw r3
        L1f:
            com.google.android.gms.internal.ads.zzbnt r3 = r2.zzb
            r3.zzb()
            return
    }
}

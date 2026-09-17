package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzekz implements com.google.android.gms.internal.ads.zzegm {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzdru zzb;

    public zzekz(com.google.android.gms.internal.ads.zzdru r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final com.google.android.gms.internal.ads.zzegn zza(java.lang.String r3, org.json.JSONObject r4) throws com.google.android.gms.internal.ads.zzfhj {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zza     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzegn r0 = (com.google.android.gms.internal.ads.zzegn) r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            com.google.android.gms.internal.ads.zzdru r0 = r2.zzb     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzfia r4 = r0.zzc(r3, r4)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzegn r0 = new com.google.android.gms.internal.ads.zzegn     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzeih r1 = new com.google.android.gms.internal.ads.zzeih     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            r0.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L22
            java.util.Map r4 = r2.zza     // Catch: java.lang.Throwable -> L22
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return r0
        L22:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }
}

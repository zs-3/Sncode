package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzbdi {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzbdk zzb;

    public zzbdi(com.google.android.gms.internal.ads.zzbdk r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zza = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzbdk zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbdk r0 = r1.zzb
            return r0
    }

    public final void zzb(java.lang.String r2, com.google.android.gms.internal.ads.zzbdh r3) {
            r1 = this;
            java.util.Map r0 = r1.zza
            r0.put(r2, r3)
            return
    }

    public final void zzc(java.lang.String r3, java.lang.String r4, long r5) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.ads.zzbdh r4 = (com.google.android.gms.internal.ads.zzbdh) r4
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            if (r4 == 0) goto L15
            com.google.android.gms.internal.ads.zzbdk r1 = r2.zzb
            r1.zze(r4, r5, r0)
        L15:
            java.util.Map r4 = r2.zza
            com.google.android.gms.internal.ads.zzbdh r0 = new com.google.android.gms.internal.ads.zzbdh
            r1 = 0
            r0.<init>(r5, r1, r1)
            r4.put(r3, r0)
            return
    }
}

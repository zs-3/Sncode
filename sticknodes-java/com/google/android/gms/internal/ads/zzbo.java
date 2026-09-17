package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzbo extends java.io.IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbo(java.lang.String r1, java.lang.Throwable r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zza = r3
            r0.zzb = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzbo zza(java.lang.String r2, java.lang.Throwable r3) {
            com.google.android.gms.internal.ads.zzbo r0 = new com.google.android.gms.internal.ads.zzbo
            r1 = 1
            r0.<init>(r2, r3, r1, r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzbo zzb(java.lang.String r3, java.lang.Throwable r4) {
            com.google.android.gms.internal.ads.zzbo r0 = new com.google.android.gms.internal.ads.zzbo
            r1 = 1
            r2 = 0
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzbo zzc(java.lang.String r4) {
            com.google.android.gms.internal.ads.zzbo r0 = new com.google.android.gms.internal.ads.zzbo
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r2 = this;
            java.lang.String r0 = super.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "{contentIsMalformed="
            r1.append(r0)
            boolean r0 = r2.zza
            r1.append(r0)
            java.lang.String r0 = ", dataType="
            r1.append(r0)
            int r0 = r2.zzb
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}

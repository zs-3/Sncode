package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfxu {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzfxs zzb;
    private com.google.android.gms.internal.ads.zzfxs zzc;

    /* synthetic */ zzfxu(java.lang.String r1, com.google.android.gms.internal.ads.zzfxt r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzfxs r2 = new com.google.android.gms.internal.ads.zzfxs
            r2.<init>()
            r0.zzb = r2
            r0.zzc = r2
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            java.lang.String r1 = r6.zza
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            com.google.android.gms.internal.ads.zzfxs r1 = r6.zzb
            com.google.android.gms.internal.ads.zzfxs r1 = r1.zzb
            java.lang.String r2 = ""
        L17:
            if (r1 == 0) goto L46
            java.lang.Object r3 = r1.zza
            r0.append(r2)
            if (r3 == 0) goto L3e
            java.lang.Class r2 = r3.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L3e
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = java.util.Arrays.deepToString(r4)
            int r4 = r3.length()
            int r4 = r4 + (-1)
            r0.append(r3, r2, r4)
            goto L41
        L3e:
            r0.append(r3)
        L41:
            com.google.android.gms.internal.ads.zzfxs r1 = r1.zzb
            java.lang.String r2 = ", "
            goto L17
        L46:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfxu zza(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfxs r0 = new com.google.android.gms.internal.ads.zzfxs
            r0.<init>()
            com.google.android.gms.internal.ads.zzfxs r1 = r2.zzc
            r1.zzb = r0
            r2.zzc = r0
            r0.zza = r3
            return r2
    }
}

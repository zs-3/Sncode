package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzpd {
    public static final com.google.android.gms.internal.ads.zzpd zza = null;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    static {
            com.google.android.gms.internal.ads.zzpb r0 = new com.google.android.gms.internal.ads.zzpb
            r0.<init>()
            com.google.android.gms.internal.ads.zzpd r0 = r0.zzd()
            com.google.android.gms.internal.ads.zzpd.zza = r0
            return
    }

    /* synthetic */ zzpd(com.google.android.gms.internal.ads.zzpb r1, com.google.android.gms.internal.ads.zzpc r2) {
            r0 = this;
            r0.<init>()
            boolean r2 = com.google.android.gms.internal.ads.zzpb.zze(r1)
            r0.zzb = r2
            boolean r2 = com.google.android.gms.internal.ads.zzpb.zzf(r1)
            r0.zzc = r2
            boolean r1 = com.google.android.gms.internal.ads.zzpb.zzg(r1)
            r0.zzd = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<com.google.android.gms.internal.ads.zzpd> r2 = com.google.android.gms.internal.ads.zzpd.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            com.google.android.gms.internal.ads.zzpd r5 = (com.google.android.gms.internal.ads.zzpd) r5
            boolean r2 = r4.zzb
            boolean r3 = r5.zzb
            if (r2 != r3) goto L25
            boolean r2 = r4.zzc
            boolean r3 = r5.zzc
            if (r2 != r3) goto L25
            boolean r2 = r4.zzd
            boolean r5 = r5.zzd
            if (r2 != r5) goto L25
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.zzb
            boolean r1 = r2.zzc
            int r0 = r0 << 2
            int r1 = r1 + r1
            int r0 = r0 + r1
            boolean r1 = r2.zzd
            int r0 = r0 + r1
            return r0
    }
}

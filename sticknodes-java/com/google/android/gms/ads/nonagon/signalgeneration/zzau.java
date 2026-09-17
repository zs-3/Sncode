package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzau {
    private final java.lang.String zza;

    /* synthetic */ zzau(com.google.android.gms.ads.nonagon.signalgeneration.zzas r1, com.google.android.gms.ads.nonagon.signalgeneration.zzat r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzas.zzc(r1)
            r0.zza = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza zza() {
            r5 = this;
            java.lang.String r0 = r5.zza
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 3
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r4) goto L47
            if (r0 == r3) goto L44
            if (r0 == r2) goto L41
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zza
            return r0
        L41:
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzh
            return r0
        L44:
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzg
            return r0
        L47:
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzd
            return r0
        L4a:
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzb
            return r0
    }

    public final java.lang.String zzb() {
            r2 = this;
            java.lang.String r0 = r2.zza
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
    }

    public final java.util.Set zzc() {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = r3.zza
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r0.add(r1)
            return r0
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzqg {
    private final android.content.Context zza;
    private java.lang.Boolean zzb;

    public zzqg() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    public zzqg(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzpd zza(com.google.android.gms.internal.ads.zzaf r5, com.google.android.gms.internal.ads.zzh r6) {
            r4 = this;
            java.util.Objects.requireNonNull(r5)
            java.util.Objects.requireNonNull(r6)
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto L97
            int r1 = r5.zzC
            r2 = -1
            if (r1 != r2) goto L13
            goto L97
        L13:
            android.content.Context r1 = r4.zza
            java.lang.Boolean r2 = r4.zzb
            if (r2 == 0) goto L1e
            boolean r1 = r2.booleanValue()
            goto L52
        L1e:
            if (r1 == 0) goto L48
            java.lang.String r2 = "audio"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            if (r1 == 0) goto L43
            java.lang.String r2 = "offloadVariableRateSupported"
            java.lang.String r1 = r1.getParameters(r2)
            r2 = 0
            if (r1 == 0) goto L3c
            java.lang.String r3 = "offloadVariableRateSupported=1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
            r2 = 1
        L3c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r4.zzb = r1
            goto L4c
        L43:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.zzb = r1
            goto L4c
        L48:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.zzb = r1
        L4c:
            java.lang.Boolean r1 = r4.zzb
            boolean r1 = r1.booleanValue()
        L52:
            java.lang.String r2 = r5.zzn
            java.util.Objects.requireNonNull(r2)
            java.lang.String r3 = r5.zzj
            int r2 = com.google.android.gms.internal.ads.zzbn.zza(r2, r3)
            if (r2 == 0) goto L94
            int r3 = com.google.android.gms.internal.ads.zzeu.zzg(r2)
            if (r0 >= r3) goto L66
            goto L94
        L66:
            int r3 = r5.zzB
            int r3 = com.google.android.gms.internal.ads.zzeu.zzh(r3)
            if (r3 != 0) goto L71
            com.google.android.gms.internal.ads.zzpd r5 = com.google.android.gms.internal.ads.zzpd.zza
            return r5
        L71:
            int r5 = r5.zzC     // Catch: java.lang.IllegalArgumentException -> L91
            android.media.AudioFormat r5 = com.google.android.gms.internal.ads.zzeu.zzw(r5, r3, r2)     // Catch: java.lang.IllegalArgumentException -> L91
            r2 = 31
            if (r0 < r2) goto L86
            com.google.android.gms.internal.ads.zzf r6 = r6.zza()
            android.media.AudioAttributes r6 = r6.zza
            com.google.android.gms.internal.ads.zzpd r5 = com.google.android.gms.internal.ads.zzqf.zza(r5, r6, r1)
            return r5
        L86:
            com.google.android.gms.internal.ads.zzf r6 = r6.zza()
            android.media.AudioAttributes r6 = r6.zza
            com.google.android.gms.internal.ads.zzpd r5 = com.google.android.gms.internal.ads.zzqe.zza(r5, r6, r1)
            return r5
        L91:
            com.google.android.gms.internal.ads.zzpd r5 = com.google.android.gms.internal.ads.zzpd.zza
            return r5
        L94:
            com.google.android.gms.internal.ads.zzpd r5 = com.google.android.gms.internal.ads.zzpd.zza
            return r5
        L97:
            com.google.android.gms.internal.ads.zzpd r5 = com.google.android.gms.internal.ads.zzpd.zza
            return r5
    }
}

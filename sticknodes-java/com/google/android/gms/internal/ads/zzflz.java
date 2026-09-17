package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzflz {
    public static void zza(com.google.common.util.concurrent.ListenableFuture r1, com.google.android.gms.internal.ads.zzfma r2, com.google.android.gms.internal.ads.zzflp r3) {
            r0 = 0
            zzg(r1, r2, r3, r0)
            return
    }

    public static void zzb(com.google.common.util.concurrent.ListenableFuture r1, com.google.android.gms.internal.ads.zzfma r2, com.google.android.gms.internal.ads.zzflp r3) {
            r0 = 1
            zzg(r1, r2, r3, r0)
            return
    }

    public static void zzc(com.google.common.util.concurrent.ListenableFuture r1, com.google.android.gms.internal.ads.zzfma r2, com.google.android.gms.internal.ads.zzflp r3) {
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzgff r1 = com.google.android.gms.internal.ads.zzgff.zzu(r1)
            com.google.android.gms.internal.ads.zzfly r0 = new com.google.android.gms.internal.ads.zzfly
            r0.<init>(r2, r3)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r1, r0, r2)
            return
    }

    public static void zzd(com.google.common.util.concurrent.ListenableFuture r1, com.google.android.gms.internal.ads.zzflp r2) {
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzgff r1 = com.google.android.gms.internal.ads.zzgff.zzu(r1)
            com.google.android.gms.internal.ads.zzflw r0 = new com.google.android.gms.internal.ads.zzflw
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r1, r0, r2)
            return
    }

    public static boolean zze(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzir
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = java.util.regex.Pattern.matches(r0, r2)
            return r2
    }

    public static int zzf(com.google.android.gms.internal.ads.zzfhc r1) {
            int r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(r1)
            int r1 = r1 + (-1)
            if (r1 == 0) goto Le
            r0 = 1
            if (r1 == r0) goto Le
            r1 = 23
            return r1
        Le:
            r1 = 7
            return r1
    }

    private static void zzg(com.google.common.util.concurrent.ListenableFuture r1, com.google.android.gms.internal.ads.zzfma r2, com.google.android.gms.internal.ads.zzflp r3, boolean r4) {
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzgff r1 = com.google.android.gms.internal.ads.zzgff.zzu(r1)
            com.google.android.gms.internal.ads.zzflx r0 = new com.google.android.gms.internal.ads.zzflx
            r0.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r1, r0, r2)
            return
    }
}

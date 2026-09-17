package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class zzbeb {
    private final java.lang.String zza;
    private final java.lang.Object zzb;
    private final int zzc;

    protected zzbeb(java.lang.String r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzbeb zza(java.lang.String r1, double r2) {
            com.google.android.gms.internal.ads.zzbeb r0 = new com.google.android.gms.internal.ads.zzbeb
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r3 = 3
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzbeb zzb(java.lang.String r1, long r2) {
            com.google.android.gms.internal.ads.zzbeb r0 = new com.google.android.gms.internal.ads.zzbeb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzbeb zzc(java.lang.String r2, java.lang.String r3) {
            com.google.android.gms.internal.ads.zzbeb r2 = new com.google.android.gms.internal.ads.zzbeb
            java.lang.String r3 = "gad:dynamite_module:experiment_id"
            java.lang.String r0 = ""
            r1 = 4
            r2.<init>(r3, r0, r1)
            return r2
    }

    public static com.google.android.gms.internal.ads.zzbeb zzd(java.lang.String r2, boolean r3) {
            com.google.android.gms.internal.ads.zzbeb r0 = new com.google.android.gms.internal.ads.zzbeb
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public final java.lang.Object zze() {
            r4 = this;
            com.google.android.gms.internal.ads.zzbfg r0 = com.google.android.gms.internal.ads.zzbfi.zza()
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzbfh r0 = com.google.android.gms.internal.ads.zzbfi.zzb()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzbfh r0 = com.google.android.gms.internal.ads.zzbfi.zzb()
            r0.zza()
        L13:
            java.lang.Object r0 = r4.zzb
            return r0
        L16:
            int r1 = r4.zzc
            int r1 = r1 + (-1)
            if (r1 == 0) goto L4b
            r2 = 1
            if (r1 == r2) goto L3c
            r2 = 2
            if (r1 == r2) goto L2d
            java.lang.String r1 = r4.zza
            java.lang.Object r2 = r4.zzb
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = r0.zzd(r1, r2)
            return r0
        L2d:
            java.lang.String r1 = r4.zza
            java.lang.Object r2 = r4.zzb
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            java.lang.Double r0 = r0.zzb(r1, r2)
            return r0
        L3c:
            java.lang.String r1 = r4.zza
            java.lang.Object r2 = r4.zzb
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Long r0 = r0.zzc(r1, r2)
            return r0
        L4b:
            java.lang.String r1 = r4.zza
            java.lang.Object r2 = r4.zzb
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Boolean r0 = r0.zza(r1, r2)
            return r0
    }
}

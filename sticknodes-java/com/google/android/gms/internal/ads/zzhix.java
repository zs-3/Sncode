package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhix implements com.google.android.gms.internal.ads.zzhir {
    private static final java.lang.Object zza = null;
    private volatile com.google.android.gms.internal.ads.zzhir zzb;
    private volatile java.lang.Object zzc;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzhix.zza = r0
            return
    }

    private zzhix(com.google.android.gms.internal.ads.zzhir r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzhix.zza
            r1.zzc = r0
            r1.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzhir zza(com.google.android.gms.internal.ads.zzhir r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzhix
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzhih
            if (r0 == 0) goto L9
            goto Lf
        L9:
            com.google.android.gms.internal.ads.zzhix r0 = new com.google.android.gms.internal.ads.zzhix
            r0.<init>(r1)
            return r0
        Lf:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final java.lang.Object zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzhix.zza
            if (r0 != r1) goto L16
            com.google.android.gms.internal.ads.zzhir r0 = r2.zzb
            if (r0 != 0) goto Ld
            java.lang.Object r0 = r2.zzc
            goto L16
        Ld:
            java.lang.Object r0 = r0.zzb()
            r2.zzc = r0
            r1 = 0
            r2.zzb = r1
        L16:
            return r0
    }
}

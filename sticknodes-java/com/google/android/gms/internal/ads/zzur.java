package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzur extends com.google.android.gms.internal.ads.zzum {
    public static final java.lang.Object zzc = null;
    private final java.lang.Object zzd;
    private final java.lang.Object zze;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzur.zzc = r0
            return
    }

    private zzur(com.google.android.gms.internal.ads.zzcc r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>(r1)
            r0.zzd = r2
            r0.zze = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzur zzq(com.google.android.gms.internal.ads.zzbc r3) {
            com.google.android.gms.internal.ads.zzur r0 = new com.google.android.gms.internal.ads.zzur
            com.google.android.gms.internal.ads.zzus r1 = new com.google.android.gms.internal.ads.zzus
            r1.<init>(r3)
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzcb.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzur.zzc
            r0.<init>(r1, r3, r2)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzur zzr(com.google.android.gms.internal.ads.zzcc r1, java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.ads.zzur r0 = new com.google.android.gms.internal.ads.zzur
            r0.<init>(r1, r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzs(com.google.android.gms.internal.ads.zzur r0) {
            java.lang.Object r0 = r0.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final int zza(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzur.zzc
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r1.zze
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            com.google.android.gms.internal.ads.zzcc r0 = r1.zzb
            int r2 = r0.zza(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzca zzd(int r2, com.google.android.gms.internal.ads.zzca r3, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r1.zzb
            r0.zzd(r2, r3, r4)
            java.lang.Object r2 = r3.zzb
            java.lang.Object r0 = r1.zze
            boolean r2 = java.util.Objects.equals(r2, r0)
            if (r2 == 0) goto L15
            if (r4 == 0) goto L15
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzur.zzc
            r3.zzb = r2
        L15:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzcb zze(int r2, com.google.android.gms.internal.ads.zzcb r3, long r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r1.zzb
            r0.zze(r2, r3, r4)
            java.lang.Object r2 = r3.zzb
            java.lang.Object r4 = r1.zzd
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L13
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzcb.zza
            r3.zzb = r2
        L13:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzum, com.google.android.gms.internal.ads.zzcc
    public final java.lang.Object zzf(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r1.zzb
            java.lang.Object r2 = r0.zzf(r2)
            java.lang.Object r0 = r1.zze
            boolean r0 = java.util.Objects.equals(r2, r0)
            if (r0 == 0) goto L10
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzur.zzc
        L10:
            return r2
    }

    public final com.google.android.gms.internal.ads.zzur zzp(com.google.android.gms.internal.ads.zzcc r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzd
            java.lang.Object r1 = r3.zze
            com.google.android.gms.internal.ads.zzur r2 = new com.google.android.gms.internal.ads.zzur
            r2.<init>(r4, r0, r1)
            return r2
    }
}

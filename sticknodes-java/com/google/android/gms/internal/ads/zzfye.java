package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfye extends com.google.android.gms.internal.ads.zzfxx {
    private final java.lang.Object zza;

    zzfye(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzfye
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzfye r2 = (com.google.android.gms.internal.ads.zzfye) r2
            java.lang.Object r0 = r1.zza
            java.lang.Object r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            int r0 = r0.hashCode()
            r1 = 1502476572(0x598df91c, float:4.9952338E15)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Optional.of("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final com.google.android.gms.internal.ads.zzfxx zza(com.google.android.gms.internal.ads.zzfxq r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            com.google.android.gms.internal.ads.zzfye r1 = new com.google.android.gms.internal.ads.zzfye
            java.lang.Object r3 = r3.apply(r0)
            java.lang.String r0 = "the Function passed to Optional.transform() must not return null."
            com.google.android.gms.internal.ads.zzfxz.zzc(r3, r0)
            r1.<init>(r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final java.lang.Object zzb(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.zza
            return r1
    }
}

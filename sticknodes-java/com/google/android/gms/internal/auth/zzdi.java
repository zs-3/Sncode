package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdi extends com.google.android.gms.internal.auth.zzdh {
    private final java.lang.Object zza;

    zzdi(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.auth.zzdi
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.auth.zzdi r2 = (com.google.android.gms.internal.auth.zzdi) r2
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

    @Override // com.google.android.gms.internal.auth.zzdh
    public final java.lang.Object zza() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
            r1 = this;
            r0 = 1
            return r0
    }
}

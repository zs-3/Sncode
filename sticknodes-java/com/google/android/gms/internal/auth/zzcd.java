package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzcd extends com.google.android.gms.internal.auth.zzda {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.auth.zzdj zzb;

    zzcd(android.content.Context r1, com.google.android.gms.internal.auth.zzdj r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.auth.zzda
            r2 = 0
            if (r1 == 0) goto L24
            com.google.android.gms.internal.auth.zzda r5 = (com.google.android.gms.internal.auth.zzda) r5
            android.content.Context r1 = r4.zza
            android.content.Context r3 = r5.zza()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            com.google.android.gms.internal.auth.zzdj r1 = r4.zzb
            com.google.android.gms.internal.auth.zzdj r5 = r5.zzb()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            return r0
        L24:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.content.Context r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            com.google.android.gms.internal.auth.zzdj r2 = r3.zzb
            int r2 = r2.hashCode()
            int r0 = r0 * r1
            r0 = r0 ^ r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            android.content.Context r0 = r4.zza
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.auth.zzdj r1 = r4.zzb
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FlagsContext{context="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", hermeticFileOverrides="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final android.content.Context zza() {
            r1 = this;
            android.content.Context r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzda
    final com.google.android.gms.internal.auth.zzdj zzb() {
            r1 = this;
            com.google.android.gms.internal.auth.zzdj r0 = r1.zzb
            return r0
    }
}
